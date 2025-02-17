
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
public class confrimfund extends javax.swing.JFrame {

    /**
     * Creates new form confrimfund
     */
    public confrimfund() {
        initComponents();
    }
    
    String AccMyNum,Name,dob,edu,occ,phno,add,send,sendN;
    int sbal,rbal;
    public confrimfund(String Acc2,String Nam, String db, String ed,String oc, String pno,String ad,String acc1,String nam2,int bal) {
        initComponents();
        send=acc1;
        sendN=nam2;
        AccMyNum=Acc2;
        acDisp.setText(AccMyNum);
        Name=Nam;
        nameDisp.setText(Name);
        dob=db;
        dobDisp.setText(dob);
        edu=ed;
        eduDisp.setText(edu);
        occ=oc;
        occDisp.setText(occ);
        phno=pno;
        phnoDisp.setText(phno);
        add=ad;
        addDisp.setText(add);
        rbal=bal;
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
        jLabel3 = new javax.swing.JLabel();
        nameDisp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dobDisp = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        phnoDisp = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addDisp = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        acDisp = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        eduDisp = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        occDisp = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        counterlabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Confirm the Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("Name: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, 30));

        nameDisp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(nameDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 200, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 255));
        jLabel4.setText("DOB:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, 30));

        dobDisp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(dobDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 330, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 255));
        jLabel9.setText("Phone Number:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, 30));

        phnoDisp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(phnoDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 200, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setText("Address:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, 30));

        addDisp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(addDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 700, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 255));
        jLabel6.setText("Account Number:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, -1, 30));

        acDisp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(acDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, 200, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 255));
        jLabel7.setText("Education:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, -1, 30));

        eduDisp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(eduDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 280, 200, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 255));
        jLabel8.setText("Occupation:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, -1, 30));

        occDisp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(occDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 320, 200, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timer50.png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 100, -1, 50));

        counterlabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        getContentPane().add(counterlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 100, 90, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sky.jpeg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signup","root","root");
            Statement st=con.createStatement();
            String sql="SELECT * FROM signup.data WHERE AccountNumber= ' "+ AccMyNum +" ' ";
            ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                fundtransfer ft=new fundtransfer(sendN,send,Name,AccMyNum,rs.getInt(9));
                ft.setVisible(true);
                dispose();
                timer.stop();
            }
            con.close();
            st.close();
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(confrimfund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(confrimfund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(confrimfund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(confrimfund.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new confrimfund().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acDisp;
    private javax.swing.JLabel addDisp;
    private javax.swing.JLabel counterlabel;
    private javax.swing.JLabel dobDisp;
    private javax.swing.JLabel eduDisp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nameDisp;
    private javax.swing.JLabel occDisp;
    private javax.swing.JLabel phnoDisp;
    // End of variables declaration//GEN-END:variables
}
