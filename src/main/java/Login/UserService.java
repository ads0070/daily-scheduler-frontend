package Login;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import org.json.simple.JSONObject;
import java.net.HttpURLConnection;

public class UserService {
    
    private final String USER_AGENT = "Mozilla/5.0";
    
    User newUser;
    public UserService(User user) {
        newUser = user;
    }

    public UserService() {
    }
    
    public String sendGet(String targetUrl) throws Exception {

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
        
        if (response == null) {
            return ""+HttpResult;
        }
        
        return response.toString();
    }
    
    public String sendPost(String address) throws Exception {

	String url= address;
        URL object=new URL(url);

        HttpURLConnection con = (HttpURLConnection) object.openConnection();
        con.setDoOutput(true);
        con.setDoInput(true);
        con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestMethod("POST");

        JSONObject cred   = new JSONObject();

        cred.put("username", newUser.getUsername());
        cred.put("password", newUser.getPassword());
        cred.put("firstName", newUser.getFirstName());
        cred.put("lastName", newUser.getLastName());
        cred.put("phoneNumber", newUser.getPhoneNumber());
        cred.put("eMail", newUser.geteMail());

        OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
        wr.write(cred.toString());
        wr.flush();
        
        StringBuilder sb = new StringBuilder();  
        String status = "";
        int HttpResult = con.getResponseCode(); 
        if (HttpResult == HttpURLConnection.HTTP_OK) {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"));
            String line = null;  
            while ((line = br.readLine()) != null) {  
                sb.append(line + "\n");  
            }
            br.close();
            if (sb.toString().contains("true")) {
                status = "true";
            }
            else {
                status = "ok";
            }
        } else {
            //System.out.println(con.getResponseMessage());  
        }
        return status;
    }
    
}
