/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.information.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MWK
 */
public class deadline extends javax.swing.JFrame {

    /**
     * Creates new form deadline
     */
    public deadline() {
        initComponents();
        this.setSize(394,200);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        year = new javax.swing.JTextField();
        month = new javax.swing.JTextField();
        day = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        year.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        year.setForeground(new java.awt.Color(0, 0, 102));
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 66, 43, -1));

        month.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        month.setForeground(new java.awt.Color(0, 0, 102));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });
        getContentPane().add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 66, 43, -1));

        day.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        day.setForeground(new java.awt.Color(0, 0, 102));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });
        getContentPane().add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 66, 72, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Year :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Month :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Day :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 69, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Update the Deadline ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 11, 195, -1));

        back.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        back.setForeground(new java.awt.Color(0, 0, 102));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/icons 16x16/iconfinder_Go_forward_132792.png"))); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 100, 20));

        update.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        update.setForeground(new java.awt.Color(51, 0, 102));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/icons 16x16/iconfinder_Sync_132655.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 130, 110, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/lap.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthActionPerformed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    Admin_loOgo K = new Admin_loOgo();
        K.setVisible(true);
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int y= Integer.parseInt(year.getText());
        int m= Integer.parseInt(month.getText());
        int d=Integer.parseInt(day.getText());
        
        Calendar myCal = Calendar.getInstance();
        myCal.set(y, m-1, d, 0, 0,0);
        Date DeadLine=myCal.getTime();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url ="jdbc:sqlserver://localhost:1433;databaseName=test;user=sa;password=01098581649rod";    
            Connection con =DriverManager.getConnection(url);
            String query1 ="UPDATE date SET deadline=?"; 
            PreparedStatement pst1 = con.prepareStatement(query1);
            pst1.setObject(1,DeadLine);
            pst1.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deadline is updated");
            Admin_loOgo K = new Admin_loOgo();
            K.setVisible(true);
            setVisible(false);
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(deadline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deadline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deadline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deadline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deadline().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField day;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField month;
    private javax.swing.JButton update;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}