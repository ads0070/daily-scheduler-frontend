//비밀번호 찾기

package Login;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author 영
 */

public class FindPassword extends javax.swing.JFrame {

    /**
     * Creates new form MainLogin
     */
    public FindPassword() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        user_name = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        confirm_password = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(65, 65, 85));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 246, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(150, 180, 208));
        jLabel2.setText("Daily Scheduler");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 290, 60));

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(150, 180, 208));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 240, 210));

        jSeparator1.setForeground(new java.awt.Color(150, 180, 208));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 190, 10));

        jSeparator3.setForeground(new java.awt.Color(150, 180, 208));
        jSeparator3.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 230, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 600));

        jPanel3.setBackground(new java.awt.Color(65, 65, 85));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(150, 180, 208));
        jLabel3.setText("Forgot the Password?");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 380, 50));

        jSeparator4.setForeground(new java.awt.Color(150, 180, 208));
        jSeparator4.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 360, 10));

        user_name.setBackground(new java.awt.Color(65, 65, 85));
        user_name.setFont(new java.awt.Font("굴림", 1, 12)); // NOI18N
        user_name.setForeground(new java.awt.Color(204, 204, 204));
        user_name.setText("Enter your Username");
        user_name.setBorder(null);
        user_name.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        user_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_nameMouseClicked(evt);
            }
        });
        user_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_nameActionPerformed(evt);
            }
        });
        jPanel3.add(user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 360, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(150, 180, 208));
        jLabel11.setText("Back to Log In");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 170, 50));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(150, 180, 208));
        jLabel6.setText("Username");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 170, 40));

        jSeparator6.setForeground(new java.awt.Color(150, 180, 208));
        jSeparator6.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 140, 10));

        jSeparator2.setForeground(new java.awt.Color(150, 180, 208));
        jSeparator2.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 250, 10));

        confirm_password.setBackground(new java.awt.Color(65, 65, 85));
        confirm_password.setForeground(new java.awt.Color(204, 204, 204));
        confirm_password.setText("jPasswordField1");
        confirm_password.setBorder(null);
        confirm_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirm_passwordFocusGained(evt);
            }
        });
        jPanel3.add(confirm_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 250, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(150, 180, 208));
        jLabel13.setText("Confirm Password");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 170, 40));

        jSeparator10.setForeground(new java.awt.Color(150, 180, 208));
        jSeparator10.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 250, 10));

        password.setBackground(new java.awt.Color(65, 65, 85));
        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setText("jPasswordField1");
        password.setBorder(null);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
        });
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 200, 30));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(150, 180, 208));
        jLabel15.setText("New Password");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 170, 40));

        resetButton.setText("Reset");
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
        });
        jPanel3.add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 100, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -10, 910, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_nameMouseClicked
        // TODO add your handling code here:
        user_name.setText("");
    }//GEN-LAST:event_user_nameMouseClicked

    private void user_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_nameActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        LogIn lg = new LogIn();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void confirm_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirm_passwordFocusGained
        // TODO add your handling code here:
        confirm_password.setText("");
    }//GEN-LAST:event_confirm_passwordFocusGained

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        // TODO add your handling code here:
        password.setText("");
    }//GEN-LAST:event_passwordFocusGained

    private void resetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseClicked
        // TODO add your handling code here:
        String id = "";
        
        User user = User.builder()
            .password(password.getText())
            .build();
        
        UserService service = new UserService(user);
        try {
            id = service.sendGet("http://localhost:8080/users/find/"+user_name.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "오류 발생");
            //Logger.getLogger(FindPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
        String path = id.substring(1,id.length()-1);
        String status = "";
        try {
            status = service.sendPost("http://localhost:8080/users/patch/"+path);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "오류 발생");
            //Logger.getLogger(FindPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (status.equals("ok")) {
            JOptionPane.showMessageDialog(null, "비밀번호가 변경되었습니다.");
            LogIn lg = new LogIn();
            lg.setVisible(true);//창을 화면에 나타내는 지 유무
            lg.pack();//윈도우의 사이즈를 맞추기
            lg.setLocationRelativeTo(null);//화면 정중앙에 프레임 위치 띄우기
            lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//메인 프레임을 닫을 때 프로그램도 닫는 것
            this.dispose();
        }
        
    }//GEN-LAST:event_resetButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FindPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindPassword().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirm_password;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField user_name;
    // End of variables declaration//GEN-END:variables
}