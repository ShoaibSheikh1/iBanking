/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibanking;

import java.sql.*;
import javax.swing.JOptionPane;
public class Transfer extends javax.swing.JFrame {

   Connection con;
   Statement st;
    ResultSet rs;
    int total;
    int acn;
    int totalbalance;
    int totalcredit;
    int grandtotal;
    int crdtaccnt;
    public Transfer() {
        initComponents();
        connect();
    }
void connect()
{
    try
    {
    Class.forName("com.mysql.jdbc.Driver");
    }
    catch(ClassNotFoundException cf)
    {
        JOptionPane.showMessageDialog(null,"Driver not loaded");
    }
    try
    {
        con=DriverManager.getConnection("jdbc:mysql://localhost/ibanking","root","");
        st=con.createStatement();
    }
    catch(SQLException sql)
    {
        JOptionPane.showMessageDialog(null,"connection not done");
    }
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtaccountno = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        txtdebitaccount = new javax.swing.JTextField();
        txtcurrentbalance = new javax.swing.JTextField();
        txttransferamount = new javax.swing.JTextField();
        txtcreditaccount = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        btntotal = new javax.swing.JButton();
        btntransfer = new javax.swing.JButton();
        txtcredittotal = new javax.swing.JTextField();
        btnshow = new javax.swing.JButton();
        txtnewamount = new javax.swing.JTextField();
        btnlogout = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 48)); // NOI18N
        jLabel1.setText("iBANKING");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TRANSFER AMOUNT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Fax", 1, 24), new java.awt.Color(255, 51, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel2.setText("ACCOUNT NO");

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel3.setText("NAME");

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel4.setText("DEBIT ACCOUNT");

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel5.setText("CURRENT BALANCE");

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel6.setText("TRANSFER AMOUNT");

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel7.setText("CREDIT ACCOUNT");

        txtaccountno.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N

        btnsearch.setBackground(new java.awt.Color(153, 153, 0));
        btnsearch.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        btnsearch.setText("<<<SEARCH");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        txtname.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N

        txtdebitaccount.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N

        txtcurrentbalance.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N

        txttransferamount.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        txttransferamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttransferamountActionPerformed(evt);
            }
        });

        btntotal.setBackground(new java.awt.Color(153, 153, 0));
        btntotal.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        btntotal.setText("TOTAL");
        btntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalActionPerformed(evt);
            }
        });

        btntransfer.setBackground(new java.awt.Color(153, 153, 0));
        btntransfer.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        btntransfer.setText("TRANSFER");
        btntransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransferActionPerformed(evt);
            }
        });

        btnshow.setBackground(new java.awt.Color(153, 153, 0));
        btnshow.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnshow.setText("SHOW");
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });

        btnlogout.setBackground(new java.awt.Color(153, 153, 0));
        btnlogout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnlogout.setText("LOG OUT");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(153, 153, 0));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtaccountno, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(txtname)
                            .addComponent(txtdebitaccount)
                            .addComponent(txtcurrentbalance)
                            .addComponent(txttransferamount)
                            .addComponent(txtcreditaccount))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(btnsearch))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txttotal)
                                    .addComponent(txtcredittotal, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btntotal)
                                    .addComponent(btnshow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtnewamount, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(68, 68, 68))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                        .addComponent(btntransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtaccountno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdebitaccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcurrentbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttransferamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntotal))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtcreditaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcredittotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnewamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnshow, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlogout)
                    .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(736, 736, 736))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
       String obj=txtaccountno.getText();
        acn=Integer.parseInt(obj);
       try
       {
         rs=st.executeQuery("select * from accountdetails where accountno="+acn);
         rs.next();
         txtname.setText(rs.getString("name"));
         txtdebitaccount.setText(""+rs.getInt("accountno"));
         txtcurrentbalance.setText(""+rs.getInt("balance"));
         JOptionPane.showMessageDialog(null,"searching");
       }
       catch(SQLException sql)
       {
           JOptionPane.showMessageDialog(null,"not searching"+sql);
       }
          
    }//GEN-LAST:event_btnsearchActionPerformed

    
   void transferdebit()
    {
        String obj5=txtdebitaccount.getText();
        int dacn=Integer.parseInt(obj5);
        String obj6=txtcurrentbalance.getText();
        int crnbal=Integer.parseInt(obj6);
        String obj7=txttransferamount.getText();
        int tamt=Integer.parseInt(obj7);
        totalbalance=crnbal-tamt;
        try
        {
            st.executeUpdate("update accountdetails set balance="+ totalbalance +" where accountno="+dacn);
               JOptionPane.showMessageDialog(null,"amount debited");
                   
        }
        catch(SQLException sql)
        {
           JOptionPane.showMessageDialog(null,"amount not debited"+sql);
        }
    }
   void transfercredit()
   {
       try
       {
           st.executeUpdate("update accountdetails set balance="+ grandtotal+" where accountno="+crdtaccnt);
           JOptionPane.showMessageDialog(null,"amount transfered successfully");
       }
       catch(SQLException sql)
       {
           JOptionPane.showMessageDialog(null,"amount not transfered"+sql);
           
       }
   }

    
    private void btntransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransferActionPerformed
    transferdebit();
   transfercredit();
        
        
    }//GEN-LAST:event_btntransferActionPerformed

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed
       
        String obj3=txtcurrentbalance.getText();
        int crbal=Integer.parseInt(obj3);
        String obj4=txttransferamount.getText();
        int amnt=Integer.parseInt(obj4);
        if(crbal>=amnt)
        {
        total=crbal-amnt;
        txttotal.setText(""+total);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"not sufficient balance" );
        }
       
        
    }//GEN-LAST:event_btntotalActionPerformed

    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed
     String obj11=txttransferamount.getText();
     int trasferamt=Integer.parseInt(obj11);
     String obj12=txtcreditaccount.getText();
      crdtaccnt=Integer.parseInt(obj12);
    
     try
     {
        rs=st.executeQuery("select * from accountdetails where accountno="+crdtaccnt);
        rs.next();
        txtcredittotal.setText(""+rs.getInt("balance"));
        String obj13=txtcredittotal.getText();
        int ss=Integer.parseInt(obj13);
        grandtotal=trasferamt+ss;
        txtnewamount.setText(""+grandtotal);
        JOptionPane.showMessageDialog(null,"working");
     }
     catch(SQLException sql)
     {
         JOptionPane.showMessageDialog(null,"not working"+sql);
     }
     




        
    }//GEN-LAST:event_btnshowActionPerformed

    private void txttransferamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttransferamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttransferamountActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        Login l=new Login();
        l.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        CustomerData cd=new CustomerData();
        cd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnshow;
    private javax.swing.JButton btntotal;
    private javax.swing.JButton btntransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtaccountno;
    private javax.swing.JTextField txtcreditaccount;
    private javax.swing.JTextField txtcredittotal;
    private javax.swing.JTextField txtcurrentbalance;
    private javax.swing.JTextField txtdebitaccount;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnewamount;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txttransferamount;
    // End of variables declaration//GEN-END:variables
}
