import java.util.*;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.*;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Srinath.U
 */
public class Forgot extends javax.swing.JFrame {
    int randomcode;

    /**
     * Creates new form Forgot
     */
    public Forgot() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEMAIL = new javax.swing.JTextField();
        sendEMAIL = new javax.swing.JButton();
        txtOTP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Forgot PIN Code");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("Enter the E-Mail ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("Enter the OTP:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        txtEMAIL.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtEMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEMAILActionPerformed(evt);
            }
        });
        getContentPane().add(txtEMAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 290, -1));

        sendEMAIL.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sendEMAIL.setText("Send");
        sendEMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendEMAILActionPerformed(evt);
            }
        });
        getContentPane().add(sendEMAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, -1, -1));

        txtOTP.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOTPActionPerformed(evt);
            }
        });
        getContentPane().add(txtOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 280, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Verify");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("Go back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 570, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sky.jpeg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEMAILActionPerformed

    private void txtOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOTPActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        ATM atm=new ATM();
        atm.show();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /*dispose();
        ResetCode rs=new ResetCode();
        rs.show();*/
        /*if(Integer.parseInt(txtOTP.getText())==OTP)
        {
            JOptionPane.showMessageDialog(null,"Verified Successfully");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"OTP is Wrong");
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sendEMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendEMAILActionPerformed
        // TODO add your handling code here:
        /*try{
        Random rand = new Random();
        randomcode=rand.nextInt(999999);
        String host = "smtp.gmail.com";
        String user = "abc@gmail.com"; // Use your email
        String pass = "xxxxxxxxxxx"; // Use  your pass
        String to = txtEMAIL.getText();
        String subject = "Reseting code";
        String message = "your reset code is "+randomcode;
        boolean sessionDebug = false;
        Properties pros = System.getProperties();
        pros.put("mail.smtp.starttls.enable","true");
        pros.put("mail.smtp.host", "host");
        pros.put("mail.smtp.port", "587");
        pros.put("mail.smtp.auth", "true");
        pros.put("mail.smtp.starttls.required", "true");
        java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        Session mailSession = Session.getDefaultInstance(pros, null);
        mailSession.setDebug(sessionDebug);
        Message msg = new MimeMessage(mailSession);
        msg.setFrom(new InternetAddress(user));
        InternetAddress [] address = {new InternetAddress(to)};
        msg.setRecipients(Message.RecipientType.TO, address);
        msg.setSubject(subject);
        msg.setText(message);
        Transport transport = mailSession.getTransport("smtp");
        transport.connect(host, user, pass);
        transport.sendMessage(msg, msg.getAllRecipients());
        transport.close();
        JOptionPane.showMessageDialog(null,"code has been send to the email");
       }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex);
        }*/
        try{
        Random rand = new Random();
        randomcode=rand.nextInt(999999);
        String host = "smtp.gmail.com";
        String user = "karmukilan.venkat2021@gmail.com";
        String pass = "nduqrqsqpmyopyga";
        String to = txtEMAIL.getText();
        String subject = "Reseting code";
        String message = "your reset code is "+randomcode;
        boolean sessionDebug = false;
        Properties pros = System.getProperties();
        pros.put("mail.smtp.starttls.enable","true");
        pros.put("mail.smtp.host", "host");
        pros.put("mail.smtp.port", "587");
        pros.put("mail.smtp.auth", "true");
        pros.put("mail.smtp.starttls.required", "true");
       // java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        Session mailSession = Session.getDefaultInstance(pros, null);
        mailSession.setDebug(sessionDebug);
        Message msg = new MimeMessage(mailSession);
        msg.setFrom(new InternetAddress(user));
        InternetAddress [] address = {new InternetAddress(to)};
        msg.setRecipients(Message.RecipientType.TO, address);
        msg.setSubject(subject);
        msg.setText(message);
        Transport transport = mailSession.getTransport("smtp");
        transport.connect(host, user, pass);
        transport.sendMessage(msg, msg.getAllRecipients());
        transport.close();
        JOptionPane.showMessageDialog(null,"code has been send to the email");
        
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex);
        } 
    }//GEN-LAST:event_sendEMAILActionPerformed

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
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton sendEMAIL;
    private javax.swing.JTextField txtEMAIL;
    private javax.swing.JTextField txtOTP;
    // End of variables declaration//GEN-END:variables
}
