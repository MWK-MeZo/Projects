/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.information.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author MWK
 */
public class the_login extends javax.swing.JFrame {

    /**
     * Creates new form the_login
     */
    public the_login() {
        initComponents();
        buttonGroup1.add(admin);
        buttonGroup1.add(student);
        this.setSize(291,336);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        register = new javax.swing.JButton();
        login_button = new javax.swing.JButton();
        admin = new javax.swing.JRadioButton();
        student = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        emptyuser = new javax.swing.JLabel();
        emptypassword = new javax.swing.JLabel();
        username = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        register.setBackground(new java.awt.Color(0, 0, 204));
        register.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        login_button.setBackground(new java.awt.Color(0, 0, 204));
        login_button.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        login_button.setForeground(new java.awt.Color(255, 255, 255));
        login_button.setText("Login");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 84, -1));

        admin.setBackground(new java.awt.Color(255, 255, 255));
        admin.setText("   Admin");
        jPanel1.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        student.setBackground(new java.awt.Color(255, 255, 255));
        student.setText("  Student ");
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });
        jPanel1.add(student, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Password   :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Username  :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("  Login");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 240, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 240, 20));

        password.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 102));
        password.setBorder(null);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 240, 20));
        jPanel1.add(emptyuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 240, 20));
        jPanel1.add(emptypassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 190, 230, 20));

        username.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        username.setForeground(new java.awt.Color(0, 0, 102));
        username.setBorder(null);
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 240, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        if(username.getText().trim().isEmpty() &&password.getText().trim().isEmpty())
        {
            emptyuser.setText("Username is Empty");
            emptypassword.setText("Password is Empty");
        }
        else if (username.getText().trim().isEmpty())
            emptyuser.setText("Username is Empty");
        else if (password.getText().trim().isEmpty())
            emptypassword.setText("Password is Empty");
        else 
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url ="jdbc:sqlserver://localhost:1433;databaseName=test;user=sa;password=01098581649rod";
            Connection con =DriverManager.getConnection(url);
            if(student.isSelected())
            {
                String sql="Select * from login0 where username =? and password=?";
                PreparedStatement pst=con.prepareStatement(sql);               
                pst.setString(1,username.getText());
                pst.setString(2,password.getText());
                ResultSet rs=pst.executeQuery();
                String sql2="Select * from login0 where username =? ";
                PreparedStatement pst2=con.prepareStatement(sql2);               
                pst2.setString(1,username.getText());
                ResultSet rs2=pst2.executeQuery();
                
                if(rs.next())
                {
                    
                    //Complete Information
                    String sql1="Select * from stdinfo where username =?";
                    PreparedStatement pst1=con.prepareStatement(sql1);               
                    pst1.setString(1,username.getText());
                    ResultSet rs1=pst1.executeQuery();
                    if(!rs1.next())
                    {
                    S_I_S_login v = new  S_I_S_login();
                    v.setUP(username.getText());
                    v.setVisible(true);
                    setVisible(false);
                    }
                    else{
                        modifiy b= new modifiy();
                       b.setUP(username.getText());
                        b.setVisible(true);
                        setVisible(false);
                        
                    }
                    
                }
                else  if(rs2.next())
                {
                    JOptionPane.showMessageDialog(null,"  Wrong Password!");                    
                                        
                }
                else{ 
                    int i=JOptionPane.showConfirmDialog(null, "Oh You Haven't Registered ,Just Click Ok to Regist", "Message", JOptionPane.PLAIN_MESSAGE);
                    if(i==0){
                    register_login regist = new register_login();
                    regist.setVisible(true);
                    setVisible(false);
                    }
                }

           
            }
            else if(admin.isSelected())
            {
                String sql="Select * from admin where admin =? and password=?";
                PreparedStatement pst=con.prepareStatement(sql);               
                pst.setString(1,username.getText());
                pst.setString(2,password.getText());
                ResultSet rs=pst.executeQuery();
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(null,"  Welcome Sir");
                    Admin_loOgo f =new Admin_loOgo();
                     f.setVisible(true);
                    setVisible(false);
                }
                else 
                JOptionPane.showMessageDialog(null,"  Isn't Authorized");
            }
            
            else 
            {
                JOptionPane.showMessageDialog(null,"Please Complete The Sigin in !");                    
                                    
            }
         }
         catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
        }

     
    }//GEN-LAST:event_login_buttonActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        emptypassword.setText("");
    }//GEN-LAST:event_passwordKeyReleased

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
            register_login field = new register_login();
            field.setVisible(true);
            setVisible(false);
            // TODO add your handling code here:
    }//GEN-LAST:event_registerActionPerformed

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
            java.util.logging.Logger.getLogger(the_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(the_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(the_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(the_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new the_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton admin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel emptypassword;
    private javax.swing.JLabel emptyuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton login_button;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register;
    private javax.swing.JRadioButton student;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

   
}
