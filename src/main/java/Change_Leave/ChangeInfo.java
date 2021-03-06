/* 회원가입
 */
package Change_Leave;

import Login.LogIn;
import Login.Register;
import Login.User;
import Login.UserService;
import Profile.ProfileService;
import ShowSchedule.showTask;
import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 영
 */
public class ChangeInfo extends javax.swing.JFrame {
    
    private String username;
    /**
     * Creates new form Registe
     */
    public ChangeInfo() {
        initComponents();
    }
    
    public ChangeInfo(String username) {
        initComponents();
        this.username = username;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        confirm_password = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        last_name = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        e_mail = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        first_name = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        phone_number = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BackTD = new javax.swing.JLabel();
        Submit1 = new javax.swing.JPanel();
        Submit2 = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(65, 65, 85));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(150, 180, 208));
        jSeparator2.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 250, 10));

        confirm_password.setBackground(new java.awt.Color(65, 65, 85));
        confirm_password.setForeground(new java.awt.Color(204, 204, 204));
        confirm_password.setText("jPasswordField1");
        confirm_password.setBorder(null);
        confirm_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirm_passwordFocusGained(evt);
            }
        });
        jPanel3.add(confirm_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 250, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(150, 180, 208));
        jLabel11.setText("E-Mail");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 170, 40));

        jSeparator5.setForeground(new java.awt.Color(150, 180, 208));
        jSeparator5.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, 130, 10));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(150, 180, 208));
        jLabel7.setText("Profile Picture");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 130, 40));

        last_name.setBackground(new java.awt.Color(65, 65, 85));
        last_name.setFont(new java.awt.Font("굴림", 1, 12)); // NOI18N
        last_name.setForeground(new java.awt.Color(204, 204, 204));
        last_name.setText("Enter Your Last Name");
        last_name.setBorder(null);
        last_name.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        last_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                last_nameMouseClicked(evt);
            }
        });
        last_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_nameActionPerformed(evt);
            }
        });
        jPanel3.add(last_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 160, 30));

        jSeparator6.setForeground(new java.awt.Color(150, 180, 208));
        jSeparator6.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 160, 10));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(150, 180, 208));
        jLabel12.setText("First Name");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, 40));

        e_mail.setBackground(new java.awt.Color(65, 65, 85));
        e_mail.setFont(new java.awt.Font("굴림", 1, 12)); // NOI18N
        e_mail.setForeground(new java.awt.Color(204, 204, 204));
        e_mail.setText("Enter Your E-mail");
        e_mail.setBorder(null);
        e_mail.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        e_mail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e_mailMouseClicked(evt);
            }
        });
        e_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_mailActionPerformed(evt);
            }
        });
        jPanel3.add(e_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 190, 30));

        jSeparator7.setForeground(new java.awt.Color(150, 180, 208));
        jSeparator7.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, 10));

        jSeparator8.setForeground(new java.awt.Color(150, 180, 208));
        jSeparator8.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 250, 10));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(150, 180, 208));
        jLabel13.setText("Confirm Password");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 170, 40));

        first_name.setBackground(new java.awt.Color(65, 65, 85));
        first_name.setFont(new java.awt.Font("굴림", 1, 12)); // NOI18N
        first_name.setForeground(new java.awt.Color(204, 204, 204));
        first_name.setText("Enter Your First Name");
        first_name.setBorder(null);
        first_name.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        first_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                first_nameMouseClicked(evt);
            }
        });
        first_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_nameActionPerformed(evt);
            }
        });
        jPanel3.add(first_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, 30));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(150, 180, 208));
        jLabel14.setText("Phone Number");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 170, 40));

        phone_number.setBackground(new java.awt.Color(65, 65, 85));
        phone_number.setFont(new java.awt.Font("굴림", 1, 12)); // NOI18N
        phone_number.setForeground(new java.awt.Color(204, 204, 204));
        phone_number.setText("Enter Your Phone Number");
        phone_number.setBorder(null);
        phone_number.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        phone_number.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phone_numberMouseClicked(evt);
            }
        });
        phone_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_numberActionPerformed(evt);
            }
        });
        jPanel3.add(phone_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 190, 30));

        jSeparator9.setForeground(new java.awt.Color(150, 180, 208));
        jSeparator9.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 220, 10));

        jSeparator10.setForeground(new java.awt.Color(150, 180, 208));
        jSeparator10.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 250, 10));

        password.setBackground(new java.awt.Color(65, 65, 85));
        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setText("jPasswordField1");
        password.setBorder(null);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
        });
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 200, 30));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(150, 180, 208));
        jLabel15.setText("Password");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 170, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(150, 180, 208));
        jLabel9.setText("Last Name");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 170, 40));

        upload.setText("upload");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        jPanel3.add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(150, 180, 208));
        jLabel3.setText("Change your Information");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 490, 50));

        BackTD.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        BackTD.setForeground(new java.awt.Color(150, 180, 208));
        BackTD.setText("Back TODO");
        BackTD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackTDMouseClicked(evt);
            }
        });
        jPanel3.add(BackTD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 130, 40));

        Submit1.setBackground(new java.awt.Color(245, 246, 228));
        Submit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Submit1MouseClicked(evt);
            }
        });
        Submit1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Submit2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Submit2.setForeground(new java.awt.Color(150, 180, 208));
        Submit2.setText("Submit");
        Submit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Submit2MouseClicked(evt);
            }
        });
        Submit1.add(Submit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 70, 40));

        jPanel3.add(Submit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 130, 40));

        profile.setText("profile");
        jPanel3.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 270, 170));

        jPanel1.setBackground(new java.awt.Color(245, 246, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(150, 180, 208));
        jLabel2.setText("Daily Scheduler");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 290, 60));

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(150, 180, 208));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 240, 210));

        jSeparator1.setForeground(new java.awt.Color(150, 180, 208));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 190, 10));

        jSeparator3.setForeground(new java.awt.Color(150, 180, 208));
        jSeparator3.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 230, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirm_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirm_passwordFocusGained
        // TODO add your handling code here:
        confirm_password.setText("");
    }//GEN-LAST:event_confirm_passwordFocusGained

    private void last_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_last_nameMouseClicked
        // TODO add your handling code here:
        last_name.setText("");
    }//GEN-LAST:event_last_nameMouseClicked

    private void last_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_last_nameActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_last_nameActionPerformed

    private void e_mailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e_mailMouseClicked
        // TODO add your handling code here:
        e_mail.setText("");
    }//GEN-LAST:event_e_mailMouseClicked

    private void e_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e_mailActionPerformed

    private void first_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_first_nameMouseClicked
        // TODO add your handling code here:
        first_name.setText("");  
    }//GEN-LAST:event_first_nameMouseClicked

    private void first_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_nameActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_first_nameActionPerformed

    private void phone_numberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phone_numberMouseClicked
        // TODO add your handling code here:
        phone_number.setText("");    
    }//GEN-LAST:event_phone_numberMouseClicked

    private void phone_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_numberActionPerformed
        // TODO add your handling code here:     
    }//GEN-LAST:event_phone_numberActionPerformed

    private void BackTDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackTDMouseClicked

    }//GEN-LAST:event_BackTDMouseClicked

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        
        //txt_filename.setText(filename);
        Image getAbsoluteFath = null;
        ImageIcon icon = new ImageIcon(filename);
        Image image;
       // image = icon.getImage().getScaledInstance(profile.getWidth(), profile.getHeight(), profile.SCALE_SMOOTH);
        profile.setIcon(icon);
    }//GEN-LAST:event_uploadActionPerformed

    private void Submit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Submit2MouseClicked
        // TODO add your handling code here:
        String id = "";
        
        User user = User.builder()
                .password(password.getText()) 
                .firstName(first_name.getText())
                .lastName(last_name.getText())
                .phoneNumber(phone_number.getText())
                .eMail(e_mail.getText())
                .build();
        
        UserService service = new UserService(user);
        
        try {
            id = service.sendGet("http://localhost:8080/users/find/"+username);
        } catch (Exception ex) {
            Logger.getLogger(ChangeInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        String status = "";
        String path = id.substring(1,id.length()-1);
        
        try {
            status = service.sendPost("http://localhost:8080/users/patch/userInfo/"+path);
        } catch (Exception ex) {
            Logger.getLogger(ChangeInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(status.equals("ok")) {
            JOptionPane.showMessageDialog(null, "정보가 변경되었습니다.");
            showTask td = new showTask(username);
                
            td.setVisible(true);
            td.pack();
            td.setLocationRelativeTo(null);
            td.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
      
        
        
    }//GEN-LAST:event_Submit2MouseClicked

    private void Submit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Submit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Submit1MouseClicked

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        // TODO add your handling code here:
        password.setText("");
    }//GEN-LAST:event_passwordFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackTD;
    private javax.swing.JPanel Submit1;
    private javax.swing.JLabel Submit2;
    private javax.swing.JPasswordField confirm_password;
    private javax.swing.JTextField e_mail;
    private javax.swing.JTextField first_name;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField last_name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone_number;
    private javax.swing.JLabel profile;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}