package TODO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.JSONObject;

public class TodoService {
    
    private final String USER_AGENT = "Mozilla/5.0";
    
    public TodoService() { }
    
    Todo newTodo;
    TodoService(Todo todo) {
        newTodo = todo;
    }
    
    public int sendGet(String targetUrl) throws Exception {

        URL url = new URL(targetUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET"); // optional default is GET
        con.setRequestProperty("User-Agent", USER_AGENT); // add request header
        
        int HttpResult = con.getResponseCode(); 
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        return HttpResult;
    }
    
    public int sendPost(String address) throws Exception {

	String url= address;
        URL object=new URL(url);

        HttpURLConnection con = (HttpURLConnection) object.openConnection();
        con.setDoOutput(true);
        con.setDoInput(true);
        con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestMethod("POST");

        JSONObject cred   = new JSONObject();

        cred.put("title", newTodo.getTitle());
        cred.put("memo", newTodo.getMemo());
        cred.put("importance", newTodo.getImportance());
        cred.put("topFixed", newTodo.getTopFixed());
        cred.put("done", newTodo.getDone());

        OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
        wr.write(cred.toString());
        wr.flush();
        
        //display what returns the POST request
        StringBuilder sb = new StringBuilder();  
        int HttpResult = con.getResponseCode(); 
        if (HttpResult == HttpURLConnection.HTTP_OK) {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"));
            String line = null;  
            while ((line = br.readLine()) != null) {  
                sb.append(line + "\n");  
            }
            br.close();
            System.out.println("" + sb.toString());
        } else {
            //System.out.println(con.getResponseMessage());  
        }
        return HttpResult;
    }
    
    
    
}
