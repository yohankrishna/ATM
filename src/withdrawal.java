
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Srinath.U
 */
public class withdrawal extends javax.swing.JFrame {

    /**
     * Creates new form withdrawal
     */
    public withdrawal() {
        initComponents();
    }
    
    String AccMyNum,Name,bal;
    int balance;
    public withdrawal(String AccNum,String Named,String bln) {
    initComponents();
    AccMyNum = AccNum;
    Name=Named;
    accDisplay.setText(AccMyNum);
    nameDisplay.setText(Name);
    balance = Integer.parseInt(bln);
    bal=bln;
    counterlabel.setText("02:00");
    Timer();
    timer.start();
    }

Timer timer;
int second=0,minute=2;
String ddSecond, ddMinute;
DecimalFormat dFormat=new DecimalFormat("00");
public void Timer()
    {
        timer =new Timer(1000,new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                second--;
                ddSecond=dFormat.format(second);
                ddMinute=dFormat.format(minute);
                counterlabel.setText(ddMinute+" : "+ddSecond);
                if(second==-1)
                {
                    second=59;
                    minute--;
                    counterlabel.setText(ddMinute+" : "+ddSecond);
                }
                if(minute==0 && second==0)
                {
                    timer.stop();
                    JOptionPane.showMessageDialog(null,"Session Timed Out!!!");
                    dispose();
                    ATM t=new ATM();
                    t.setVisible(true);
                }
            }
        });
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        withdrawtf = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        nameDisplay = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        accDisplay = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        counterlabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Choose the Amount to Withdraw");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("₹1000");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("₹5000");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("₹2000");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 100, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setText("₹10000");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("Enter other Amount");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, -1, -1));

        withdrawtf.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        getContentPane().add(withdrawtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 180, -1));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton5.setText("Withdraw");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, -1, -1));

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setText("Go back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 580, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 255));
        jLabel9.setText("Name:- ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        nameDisplay.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        nameDisplay.setToolTipText("");
        getContentPane().add(nameDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 260, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 255));
        jLabel8.setText("Account Number:- ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        accDisplay.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        accDisplay.setToolTipText("");
        getContentPane().add(accDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 260, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timer50.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 100, -1, 50));

        counterlabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        getContentPane().add(counterlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 100, 90, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sky.jpeg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Transaction t=new Transaction(AccMyNum,Name);
        t.show();
        dispose();
        timer.stop();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
      int amount = Integer.parseInt(withdrawtf.getText());
      if(amount >=50000)
      {
          JOptionPane.showMessageDialog(null,"Amount is greater than 50000");
          JOptionPane.showMessageDialog(null,"Logout to try again");
          this.setVisible(false);
          ATM atm = new ATM();
          atm.setVisible(true);
      }
      else if(amount <=50)
      {
          JOptionPane.showMessageDialog(null,"Amount is too low to withdraw");
          JOptionPane.showMessageDialog(null,"Logout to try again");
          this.setVisible(false);
          ATM atm = new ATM();
          atm.setVisible(true);
      }
      else if(withdrawtf.getText().isEmpty() || withdrawtf.getText().equals(0))
        {
            JOptionPane.showMessageDialog(null,"Enter a Valid Amount");
        }
      else if(amount>balance)
      {
          JOptionPane.showMessageDialog(null,"Insufficient Balance");
      }
        else
        {
            try
            {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signup","root","root");
                Statement ps=con.createStatement();
                int deposit;
                String qry="SELECT * FROM data where AccountNumber= ' " + AccMyNum + " ' ";
                ResultSet rs  = ps.executeQuery(qry);
                if(rs.next())
                {
                    //int balance=rs.getInt("Balance");
                    int temp = balance - amount ;
                    String strSQL = "UPDATE data set Balance = ' " + (temp) + " ' where AccountNumber= ' "+ AccMyNum + " ' ";
                    int rowsEffected = ps.executeUpdate(strSQL);
                    if(rowsEffected == 0)
                    {
                        JOptionPane.showMessageDialog(null,"Amount not Withdrawed");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Amount Withdrawed Successfully");
                        withdrawtf.setText("");
                        Transaction t=new Transaction(AccMyNum,Name);
                        t.setVisible(true);
                        dispose();
                        timer.stop();
                    }
                }
                con.close();
                ps.close();
                rs.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        withdrawtf.setText("1000");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        withdrawtf.setText("2000");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        withdrawtf.setText("5000");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        withdrawtf.setText("10000");
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withdrawal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accDisplay;
    private javax.swing.JLabel counterlabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nameDisplay;
    private javax.swing.JTextField withdrawtf;
    // End of variables declaration//GEN-END:variables
}
