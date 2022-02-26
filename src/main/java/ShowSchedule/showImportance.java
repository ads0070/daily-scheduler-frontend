/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShowSchedule;

import Change_Leave.Change_Leave;
import TASK.AddTask;
import LoadData.LoadSchedule;
import TODO.AddTodo;
import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author audfb
 */
public class showImportance extends javax.swing.JFrame {
    
    private String username;
		
    public showImportance() {
        initComponents();
    }
    
    public showImportance(String username) {
        initComponents();
        this.username = username;
        nameLabel.setText(username);
        loadImage();
    }
    
    public void loadImage() {
        String path = "";
        LoadSchedule load = new LoadSchedule();
        try {
            path = load.sendGet("http://localhost:8080/fileDownload/"+username);
        } catch (Exception ex) {
            profile.setText("No Profile");
            //Logger.getLogger(showImportance.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon icon = new ImageIcon(path);
        profile.setIcon(icon);
    }
    
    public void load() throws java.text.ParseException {
        String taskData = "";
        String todoData = "";
                
        DefaultTableModel table = (DefaultTableModel) jTable4.getModel();
        table.setNumRows(0);
        
        LoadSchedule load = new LoadSchedule();
        try {
            taskData = load.sendGet("http://localhost:8080/api/tasks");
        } catch (Exception ex) {
            Logger.getLogger(showImportance.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            todoData = load.sendGet("http://localhost:8080/api/todos");
        } catch (Exception ex) {
            Logger.getLogger(showImportance.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JSONParser jsonParser = new JSONParser();
        JSONArray taskArray = null;
        JSONArray todoArray = null;
        try {
            taskArray = (JSONArray) jsonParser.parse(taskData);
        } catch (ParseException ex) {
            Logger.getLogger(showImportance.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            todoArray = (JSONArray) jsonParser.parse(todoData);
        } catch (ParseException ex) {
            Logger.getLogger(showImportance.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int num = taskArray.size() + todoArray.size();
        String[] data = new String[num];
        String[] topData = new String[num];
        
        for (int i = 0; i < taskArray.size(); i++) {
            JSONObject object = (JSONObject) taskArray.get(i);
            String id = object.get("id").toString();
            String title = object.get("title").toString();
            String memo = object.get("memo").toString();
            String importance = object.get("importance").toString();
            String beginDate = object.get("beginDate").toString();
            String endDate = object.get("endDate").toString();
            String save = importance +",false," +"Task,"+title+","+"memo";
            
            data[i] = save;
        }
        
        int j = taskArray.size();
        int count = 0;
        
        for (int i = 0; i < todoArray.size(); i++) {
            JSONObject object = (JSONObject) todoArray.get(i);
            String id = object.get("id").toString();
            String title = object.get("title").toString();
            String memo = object.get("memo").toString();
            String importance = object.get("importance").toString();
            String topFixed = object.get("topFixed").toString();
            String done = object.get("done").toString();
            String save = importance+","+topFixed+","+"Todo,"+title+","+"memo";
            
            if (topFixed.contains("true")) {
                topData[count] = save;
                count += 1;
            } else {
                data[j] = save;
                j += 1;
            }
        }
        
        if (count > 0) {
            topData = Arrays.stream(topData)
                     .filter(s -> (s != null && s.length() > 0))
                     .toArray(String[]::new); 
            Arrays.sort(topData,Collections.reverseOrder());
        }
        if (j > 0) {
            data = Arrays.stream(data)
                     .filter(s -> (s != null && s.length() > 0))
                     .toArray(String[]::new); 
            Arrays.sort(data,Collections.reverseOrder());
        }
        
        
        for (int k=0; k <count; k++) {
            String[] result = topData[k].split(",");
            table.insertRow(table.getRowCount(), new Object[]{
                Boolean.parseBoolean(result[1]),
                result[0],
                result[2],
                result[3],
                result[4]
                    
            });
        }
        
        for (int k=0; k <j; k++) {
            String[] result = data[k].split(",");
            table.insertRow(table.getRowCount(), new Object[]{
                false,
                result[0],
                result[2],
                result[3],
                result[4]
                    
            });
        }
            
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new java.awt.Panel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable(){
        };
        addTaskButton = new javax.swing.JButton();
        addTodoButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TaskP = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nameLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        profile = new javax.swing.JLabel();
        TaskPanel = new javax.swing.JPanel();
        TaskLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        background = new javax.swing.JMenu();
        gray = new javax.swing.JMenuItem();
        white = new javax.swing.JMenuItem();
        pansy_cosmos = new javax.swing.JMenuItem();
        tinker_bell_green = new javax.swing.JMenuItem();
        purple = new javax.swing.JMenuItem();
        orange_soda = new javax.swing.JMenuItem();
        red = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(245, 246, 228));

        jLabel19.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(150, 180, 208));
        jLabel19.setText("Important");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null,null,  null, null, null}
            },
            new String [] {
                "TopFixed", "importance", "Title", "Kind", "Memo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable4.setEnabled(false);
        jScrollPane2.setViewportView(jTable4);

        addTaskButton.setText("addTask");
        addTaskButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addTaskButtonMouseClicked(evt);
            }
        });
        addTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTaskButtonActionPerformed(evt);
            }
        });

        addTodoButton.setText("addTodo");
        addTodoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addTodoButtonMouseClicked(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.setToolTipText("");
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1177, Short.MAX_VALUE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(addTaskButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addTodoButton)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addTodoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateButton))
                        .addGap(4, 4, 4)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(65, 65, 85));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TaskP.setBackground(new java.awt.Color(89, 89, 112));
        TaskP.setForeground(new java.awt.Color(89, 89, 112));
        TaskP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaskPMouseClicked(evt);
            }
        });
        TaskP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(235, 246, 228));
        jLabel13.setText("     Todo");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        TaskP.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 100, -1));

        jPanel1.add(TaskP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 270, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 240, 10));

        nameLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(245, 246, 228));
        nameLabel.setText("jLabel1");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jButton2.setText("c");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 50, 40));

        profile.setText("profile");
        jPanel1.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 120));

        TaskPanel.setBackground(new java.awt.Color(89, 89, 112));
        TaskPanel.setForeground(new java.awt.Color(89, 89, 112));
        TaskPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaskPanelMouseClicked(evt);
            }
        });
        TaskPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TaskLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        TaskLabel.setForeground(new java.awt.Color(235, 246, 228));
        TaskLabel.setText("Task");
        TaskLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaskLabelMouseClicked(evt);
            }
        });
        TaskPanel.add(TaskLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 100, -1));

        jPanel1.add(TaskPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 270, 40));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 100, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 240, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        background.setText("Background Color");
        background.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backgroundActionPerformed(evt);
            }
        });

        gray.setText("gray");
        gray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grayActionPerformed(evt);
            }
        });
        background.add(gray);

        white.setText("white");
        white.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteActionPerformed(evt);
            }
        });
        background.add(white);

        pansy_cosmos.setText("pansy cosmos");
        pansy_cosmos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pansy_cosmosActionPerformed(evt);
            }
        });
        background.add(pansy_cosmos);

        tinker_bell_green.setText("tinker bell green");
        tinker_bell_green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinker_bell_greenActionPerformed(evt);
            }
        });
        background.add(tinker_bell_green);

        purple.setText("purple");
        purple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purpleActionPerformed(evt);
            }
        });
        background.add(purple);

        orange_soda.setText("orange soda");
        orange_soda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orange_sodaActionPerformed(evt);
            }
        });
        background.add(orange_soda);

        red.setText("red");
        red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redActionPerformed(evt);
            }
        });
        background.add(red);

        jMenuBar1.add(background);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void setColor(JPanel panel){
        panel.setBackground(new Color(65, 65, 85));
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(89, 89, 112));
    }
    
    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        setColor(TaskP);

        showTodo tdt = new showTodo(username);
        tdt.setVisible(true);
        tdt.pack();
        tdt.setLocationRelativeTo(null);
        tdt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        
        Change_Leave cl = new Change_Leave(username);
        cl.setVisible(true);
        cl.pack();
        cl.setLocationRelativeTo(null);
        cl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_jButton2MouseClicked

    private void grayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grayActionPerformed
        // TODO add your handling code here:
        panel2.setBackground(new Color(195, 193, 194));
    }//GEN-LAST:event_grayActionPerformed

    private void whiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteActionPerformed
        // TODO add your handling code here:
        panel2.setBackground(new Color(254, 254, 255));
    }//GEN-LAST:event_whiteActionPerformed

    private void pansy_cosmosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pansy_cosmosActionPerformed
        // TODO add your handling code here:
        panel2.setBackground(new Color(245, 208, 221));
    }//GEN-LAST:event_pansy_cosmosActionPerformed

    private void tinker_bell_greenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinker_bell_greenActionPerformed
        // TODO add your handling code here:
        panel2.setBackground(new Color(191, 218, 131));
    }//GEN-LAST:event_tinker_bell_greenActionPerformed

    private void purpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purpleActionPerformed
        // TODO add your handling code here:
        panel2.setBackground(new Color(153, 108, 209));
    }//GEN-LAST:event_purpleActionPerformed

    private void orange_sodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orange_sodaActionPerformed
        // TODO add your handling code here:
        panel2.setBackground(new Color(249, 194, 112));
    }//GEN-LAST:event_orange_sodaActionPerformed

    private void redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redActionPerformed
        // TODO add your handling code here:
        panel2.setBackground(new Color(224, 106, 78));
    }//GEN-LAST:event_redActionPerformed

    private void backgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backgroundActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_backgroundActionPerformed

    private void TaskPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaskPMouseClicked
        // TODO add your handling code here:
        setColor(TaskP);

        showTodo tdt = new showTodo(username);
        tdt.setVisible(true);
        tdt.pack();
        tdt.setLocationRelativeTo(null);
        tdt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_TaskPMouseClicked

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        
        try {
            load();
        } catch (java.text.ParseException ex) {
            Logger.getLogger(showImportance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonMouseClicked

    private void addTodoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTodoButtonMouseClicked
        // TODO add your handling code here:
        AddTodo addTodo = new AddTodo();
        addTodo.setVisible(true);
        addTodo.pack();
        addTodo.setLocationRelativeTo(null);
        addTodo.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_addTodoButtonMouseClicked

    private void addTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTaskButtonActionPerformed
        // TODO add your handling code here:
        AddTask addTask = new AddTask();
        addTask.setVisible(true);
        addTask.pack();
        addTask.setLocationRelativeTo(null);
        addTask.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_addTaskButtonActionPerformed

    private void addTaskButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTaskButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addTaskButtonMouseClicked

    private void TaskLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaskLabelMouseClicked
        // TODO add your handling code here:
        showTask td = new showTask(username);
        td.setVisible(true);
        td.pack();
        td.setLocationRelativeTo(null);
        td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_TaskLabelMouseClicked

    private void TaskPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaskPanelMouseClicked
        // TODO add your handling code here:
        showTask td = new showTask(username);
        td.setVisible(true);
        td.pack();
        td.setLocationRelativeTo(null);
        td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_TaskPanelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showImportance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TaskLabel;
    private javax.swing.JPanel TaskP;
    private javax.swing.JPanel TaskPanel;
    private javax.swing.JButton addTaskButton;
    private javax.swing.JButton addTodoButton;
    private javax.swing.JMenu background;
    private javax.swing.JMenuItem gray;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JMenuItem orange_soda;
    private java.awt.Panel panel2;
    private javax.swing.JMenuItem pansy_cosmos;
    private javax.swing.JLabel profile;
    private javax.swing.JMenuItem purple;
    private javax.swing.JMenuItem red;
    private javax.swing.JMenuItem tinker_bell_green;
    private javax.swing.JButton updateButton;
    private javax.swing.JMenuItem white;
    // End of variables declaration//GEN-END:variables
}
