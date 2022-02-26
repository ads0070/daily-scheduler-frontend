/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShowSchedule;

import Change_Leave.Change_Leave;
import LoadData.LoadSchedule;
import TODO.AddTodo;
import TODO.ModifyTodo;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
public class showTodo extends javax.swing.JFrame {
    
    private String username;
    private String[][] arr;
    private int num;
    
    public showTodo() {
        initComponents();
    }
    
    public showTodo(String username) {
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
        String todoData = "";
        DefaultTableModel table = (DefaultTableModel) taskTable.getModel();
        table.setNumRows(0);
        
        LoadSchedule load = new LoadSchedule();
            try {
                todoData = load.sendGet("http://localhost:8080/api/todos");
            } catch (Exception ex) {
                Logger.getLogger(showImportance.class.getName()).log(Level.SEVERE, null, ex);
            }
            JSONParser jsonParser = new JSONParser();
            JSONArray todoArray = null;
            
            try {
                todoArray = (JSONArray) jsonParser.parse(todoData);
            } catch (ParseException ex) {
                Logger.getLogger(showImportance.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            num = todoArray.size();
            arr = new String[2][num];
            
            for (int i = 0; i < num; i++) {
                JSONObject object = (JSONObject) todoArray.get(i);
                String id = object.get("id").toString();
                String title = object.get("title").toString();
                String memo = object.get("memo").toString();
                String importance = object.get("importance").toString();
                String topFixed = object.get("topFixed").toString();
                Boolean done = Boolean.parseBoolean(object.get("done").toString());
                
                arr[0][i] = id;
                arr[1][i] = title;
                
                if (topFixed.equals("true")) {
                    table.insertRow(0, new Object[]{
                        title,
                        importance,
                        memo,
                        done
                    });
                } else {
                    table.insertRow(table.getRowCount(), new Object[]{
                            title,
                            importance,
                            memo,
                            done
                    });
                }
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
        jScrollPane5 = new javax.swing.JScrollPane();
        taskTable = new javax.swing.JTable();
        addTodoButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ImportantP = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        nameLabel = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        profile = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        TaskPanel = new javax.swing.JPanel();
        TaskLabel = new javax.swing.JLabel();
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

        taskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Title", "Importance", "Memo", "Finish"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(taskTable);

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

        modifyButton.setText("modifyTodo");
        modifyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifyButtonMouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(150, 180, 208));
        jLabel20.setText("Todo");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(addTodoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modifyButton)
                        .addGap(13, 13, 13)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(878, Short.MAX_VALUE)))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modifyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addTodoButton)
                        .addComponent(updateButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel20)
                    .addContainerGap(470, Short.MAX_VALUE)))
        );

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 0, 1100, 530));

        jPanel1.setBackground(new java.awt.Color(65, 65, 85));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImportantP.setBackground(new java.awt.Color(89, 89, 112));
        ImportantP.setForeground(new java.awt.Color(89, 89, 112));
        ImportantP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImportantPMouseClicked(evt);
            }
        });
        ImportantP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(235, 246, 228));
        jLabel9.setText("     Important");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        ImportantP.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 180, -1));

        jPanel1.add(ImportantP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 290, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 260, 10));

        nameLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(245, 246, 228));
        nameLabel.setText("jLabel1");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jButton11.setText("c");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 50, 40));
        jPanel1.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 120));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 260, 10));

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
        TaskLabel.setText("     Task");
        TaskLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaskLabelMouseClicked(evt);
            }
        });
        TaskPanel.add(TaskLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 80, -1));

        jPanel1.add(TaskPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 290, 40));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 100, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 291, 534));

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
    
    private void ImportantPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImportantPMouseClicked
        // TODO add your handling code here:
        setColor(ImportantP);

        showImportance tdi = new showImportance(username);
        tdi.setVisible(true);
        tdi.pack();
        tdi.setLocationRelativeTo(null);
        tdi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ImportantPMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        setColor(ImportantP);

        showImportance tdi = new showImportance(username);
        tdi.setVisible(true);
        tdi.pack();
        tdi.setLocationRelativeTo(null);
        tdi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        // TODO add your handling code here:
        Change_Leave cl = new Change_Leave(username);
        cl.setVisible(true);
        cl.pack();
        cl.setLocationRelativeTo(null);
        cl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_jButton11MouseClicked

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

    private void addTodoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTodoButtonMouseClicked
        // TODO add your handling code here:
        AddTodo addTodo = new AddTodo();
        addTodo.setVisible(true);
        addTodo.pack();
        addTodo.setLocationRelativeTo(null);
        addTodo.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_addTodoButtonMouseClicked

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        try {
            // TODO add your handling code here:
            load();
        } catch (java.text.ParseException ex) {
            Logger.getLogger(showImportance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonMouseClicked

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

    private void modifyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifyButtonMouseClicked
        // TODO add your handling code here:
        if (arr==null) {
            JOptionPane.showMessageDialog(null, "update 버튼을 눌러 정보를 갱신해주세요!");
        } else {
            ModifyTodo mt = new ModifyTodo(arr, num);
            mt.setVisible(true);
            mt.pack();
            mt.setLocationRelativeTo(null);
            mt.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_modifyButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showTodo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ImportantP;
    private javax.swing.JLabel TaskLabel;
    private javax.swing.JPanel TaskPanel;
    private javax.swing.JButton addTodoButton;
    private javax.swing.JMenu background;
    private javax.swing.JMenuItem gray;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton modifyButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JMenuItem orange_soda;
    private java.awt.Panel panel2;
    private javax.swing.JMenuItem pansy_cosmos;
    private javax.swing.JLabel profile;
    private javax.swing.JMenuItem purple;
    private javax.swing.JMenuItem red;
    private javax.swing.JTable taskTable;
    private javax.swing.JMenuItem tinker_bell_green;
    private javax.swing.JButton updateButton;
    private javax.swing.JMenuItem white;
    // End of variables declaration//GEN-END:variables
}