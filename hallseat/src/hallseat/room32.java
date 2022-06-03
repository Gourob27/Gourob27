/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hallseat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aristo_NPC
 */
public class room32 extends javax.swing.JFrame {

    /**
     * Creates new form room32
     */
     Connection getCon=null;

    /**
     * Creates new form room1
     */
    public room32() {
        initComponents();
        getCon= ConnectionProvider.getCon();
        table_update();
        
    }
    
    PreparedStatement ps;
    ResultSet rs ;
    private void table_update()
    {
       
            int c;
            try {
               
                 ps = getCon.prepareStatement("SELECT * FROM `room32`");
                 ResultSet rs = (ResultSet) ps.executeQuery();
                 
                 ResultSetMetaData rsd = rs.getMetaData();
                 c = rsd.getColumnCount();
                 
                 DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
                 d.setRowCount(0);
                                 
                 while(rs.next())
                 {
                     Vector v2 = new Vector(); 
                     for(int i=1; i<=c; i++)
                     {
                        v2.add(rs.getString("sid"));
                         v2.add(rs.getString("sname"));
                         v2.add(rs.getString("dept"));
                         v2.add(rs.getString("batch"));
                         v2.add(rs.getString("bed"));
                         v2.add(rs.getString("status"));
                         
                        
                     }             
                     d.addRow(v2);
                     
                 }
        } catch (SQLException ex) {
            Logger.getLogger(ManageRoom.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel3 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtbed = new javax.swing.JTextField();
        txtbatch = new javax.swing.JTextField();
        txtdept = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("BED:");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatusActionPerformed(evt);
            }
        });
        getContentPane().add(txtstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 120, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("S.id:");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 70, 40));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 120, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 100, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.id", "S.name", "Dept", "Batch", "Bed", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 480, 440));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("STATUS:");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 108, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/room 302.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 321, 553));

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(844, 35, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setText("BED:");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 70, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setText("Batch:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 90, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setText("Dept:");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 80, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setText("S.name:");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 110, 40));

        txtbed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbedActionPerformed(evt);
            }
        });
        getContentPane().add(txtbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 120, 40));

        txtbatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbatchActionPerformed(evt);
            }
        });
        getContentPane().add(txtbatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 120, 40));

        txtdept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdeptActionPerformed(evt);
            }
        });
        getContentPane().add(txtdept, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 120, 40));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 120, 40));

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 100, 30));

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatusActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new floor3().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       String Sid = txtid.getText();
        String Sname = txtname.getText();
        String Dept = txtdept.getText();
        String Batch = txtbatch.getText();
        String BED = txtbed.getText();
        String STATUS = txtstatus.getText();
int test = Integer.parseInt(BED);
        if(test<1 || test>6){
        JOptionPane.showMessageDialog(null, "Please Enter a number between 1 to 6");
        }
        else{
      
        try {
           // Connection Con = ConnectionProvider.getCon();
            ps = getCon.prepareStatement("INSERT INTO `room32`(`sid`, `sname`, `dept`, `batch`, `bed`, `status`) VALUES (?,?,?,?,?,?)");
            ps.setString(1, Sid);
            ps.setString(2, Sname);
            ps.setString(3, Dept);
            ps.setString(4, Batch);
            ps.setString(5, BED);
            ps.setString(6, STATUS);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Insert");
           // tableDetails();
           table_update();
            txtid.setText("");
            txtname.setText("");
            txtdept.setText("");
            txtbatch.setText("");
            txtbed.setText("");
            txtstatus.setText("");            
            table_update();
           txtid.requestFocus();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Already Booked");
        }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtbedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbedActionPerformed

    private void txtbatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbatchActionPerformed

    private void txtdeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdeptActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
     int selectedIndex=jTable1.getSelectedRow();
     
        txtid.setText(d.getValueAt(selectedIndex, 0).toString());
        txtname.setText(d.getValueAt(selectedIndex, 1).toString());
        txtdept.setText(d.getValueAt(selectedIndex, 2).toString());
        txtbatch.setText(d.getValueAt(selectedIndex, 3).toString());
        txtbed.setText(d.getValueAt(selectedIndex, 4).toString());
        txtstatus.setText(d.getValueAt(selectedIndex,5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String Sid = txtid.getText();
        String Sname = txtname.getText();
        String Dept = txtdept.getText();
        String Batch = txtbatch.getText();
        String BED = txtbed.getText();
        String STATUS = txtstatus.getText();
        int test = Integer.parseInt(BED);
        
      
        try {
           // Connection Con = ConnectionProvider.getCon();
             ps = getCon.prepareStatement("UPDATE `room32` SET `sid`=?,`sname`=?,`dept`=?,`batch`=?,`bed`=?,`status`=? WHERE `sid`=?");
            ps.setString(1, Sid);
            ps.setString(2, Sname);
            ps.setString(3, Dept);
            ps.setString(4, Batch);
            ps.setString(5, BED);
            ps.setString(6, STATUS);
            ps.setString(7, Sid);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Update");
           // tableDetails();
           table_update();
            txtid.setText("");
            txtname.setText("");
            txtdept.setText("");
            txtbatch.setText("");
            txtbed.setText("");
            txtstatus.setText("");
             
      
            table_update();
           txtid.requestFocus();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
     int selectedIndex=jTable1.getSelectedRow();
     
     String Sid = txtid.getText();
        String Sname = txtname.getText();
        String Dept = txtdept.getText();
        String Batch = txtbatch.getText();
        String BED = txtbed.getText();
        String STATUS = txtstatus.getText();
       
        
        try {
           // Connection Con = ConnectionProvider.getCon();
             ps = getCon.prepareStatement("DELETE FROM `room32` WHERE `sid`=?");
             ps.setString(1, Sid);
           
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Delete");
           // tableDetails();
           table_update();
//            
//      
            table_update();
            txtname.requestFocus();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(room32.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(room32.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(room32.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(room32.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new room32().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbatch;
    private javax.swing.JTextField txtbed;
    private javax.swing.JTextField txtdept;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtstatus;
    // End of variables declaration//GEN-END:variables
}
