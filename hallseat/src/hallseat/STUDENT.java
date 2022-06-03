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
import javax.swing.table.TableModel;

/**
 *
 * @author Aristo_NPC
 */
public class STUDENT extends javax.swing.JFrame {
    Connection getCon=null;

    /**
     * Creates new form STUDENT
     */
   
    public STUDENT() {
        initComponents();
        getCon= ConnectionProvider.getCon();
        table_update();
        //Connect();
    }
    PreparedStatement ps;
    private void table_update()
    {
       
            int c;
            try {
               
                 ps = getCon.prepareStatement("SELECT * FROM `student`");
                 ResultSet rs = ps.executeQuery();
                 
                 ResultSetMetaData rsd = rs.getMetaData();
                 c = rsd.getColumnCount();
                 
                 DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
                 d.setRowCount(0);
                                 
                 while(rs.next())
                 {
                     Vector v2 = new Vector(); 
                     for(int i=1; i<=c; i++)
                     {
                        
                         v2.add(rs.getString("S_NAME"));
                         v2.add(rs.getString("S_ID"));
                         v2.add(rs.getString("S_MOB"));
                         v2.add(rs.getString("S_EMAIL"));
                         v2.add(rs.getString("F_NAME"));
                         v2.add(rs.getString("F_MOB"));
                         v2.add(rs.getString("M_NAME"));
                         v2.add(rs.getString("M_MOB"));
                         v2.add(rs.getString("P_ADD"));
                         v2.add(rs.getString("BLOOD"));
                         v2.add(rs.getString("DEPT"));
                         v2.add(rs.getString("BATCH"));
                         v2.add(rs.getString("FLOOR"));
                         v2.add(rs.getString("ROOM"));
                         v2.add(rs.getString("BED"));
                         
                        
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtbed = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtmob = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtfname = new javax.swing.JTextField();
        txtfmob = new javax.swing.JTextField();
        txtmname = new javax.swing.JTextField();
        txtmmob = new javax.swing.JTextField();
        txtadd = new javax.swing.JTextField();
        txtgroup = new javax.swing.JTextField();
        txtdept = new javax.swing.JTextField();
        txtbatch = new javax.swing.JTextField();
        txtfloor = new javax.swing.JTextField();
        txtroom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("STUDENT_ID:");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 180, 37));

        jLabel2.setBackground(new java.awt.Color(255, 255, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("STUDENT_MOBILE:");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 240, 37));

        jLabel3.setBackground(new java.awt.Color(255, 255, 204));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setText("ROOM:");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 100, 37));

        jLabel4.setBackground(new java.awt.Color(255, 255, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setText("STUDENT_NAME:");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 220, 37));

        jLabel5.setBackground(new java.awt.Color(255, 255, 204));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setText("FATHER'S_NAME:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 230, 37));

        jLabel6.setBackground(new java.awt.Color(255, 255, 204));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel6.setText("FATHER'S_PHONE:");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 230, 37));

        jLabel7.setBackground(new java.awt.Color(255, 255, 204));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel7.setText("MOTHER'S_NAME:");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 230, 37));

        jLabel9.setBackground(new java.awt.Color(255, 255, 204));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel9.setText("MOTHER'S_PHONE:");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 380, 240, 37));

        jLabel10.setBackground(new java.awt.Color(255, 255, 204));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel10.setText("PERMANENT_ADDRESS:");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 290, 37));

        jLabel11.setBackground(new java.awt.Color(255, 255, 204));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel11.setText("BLOOD_GROUP:");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 240, 37));

        jLabel12.setBackground(new java.awt.Color(255, 255, 204));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel12.setText("STUDENT_EMAIL:");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 230, 37));

        jLabel13.setBackground(new java.awt.Color(255, 255, 204));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel13.setText("DEPARTMENT:");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 190, 37));

        jLabel14.setBackground(new java.awt.Color(255, 255, 204));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel14.setText("BATCH:");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 120, 37));

        jLabel15.setBackground(new java.awt.Color(255, 255, 204));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel15.setText("FLOOR:");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 120, 37));

        jLabel17.setBackground(new java.awt.Color(255, 255, 204));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel17.setText("BED:");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 80, 37));

        txtbed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbedActionPerformed(evt);
            }
        });
        getContentPane().add(txtbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 220, 40));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 220, 40));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 220, 40));

        txtmob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobActionPerformed(evt);
            }
        });
        getContentPane().add(txtmob, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 220, 40));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 220, 40));

        txtfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 220, 40));

        txtfmob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfmobActionPerformed(evt);
            }
        });
        getContentPane().add(txtfmob, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 220, 40));

        txtmname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 220, 40));

        txtmmob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmmobActionPerformed(evt);
            }
        });
        getContentPane().add(txtmmob, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 220, 40));

        txtadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddActionPerformed(evt);
            }
        });
        getContentPane().add(txtadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 220, 40));

        txtgroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgroupActionPerformed(evt);
            }
        });
        getContentPane().add(txtgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 220, 40));

        txtdept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdeptActionPerformed(evt);
            }
        });
        getContentPane().add(txtdept, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 220, 40));

        txtbatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbatchActionPerformed(evt);
            }
        });
        getContentPane().add(txtbatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 220, 40));

        txtfloor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfloorActionPerformed(evt);
            }
        });
        getContentPane().add(txtfloor, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 220, 40));

        txtroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtroomActionPerformed(evt);
            }
        });
        getContentPane().add(txtroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 220, 40));

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S_NAME", "S_ID", "S_MOB", "S_EMAIL", "F_NAME", "F_MOB", "M_NAME", "M_MOB", "P_ADD", "BLOOD", "DEPT", "BATCH", "FLOOR", "ROOM", "BED"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 1460, 530));

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 30, -1, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, -1, -1));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, -1, -1));

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 390, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbedActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtmobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfnameActionPerformed

    private void txtfmobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfmobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfmobActionPerformed

    private void txtmnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmnameActionPerformed

    private void txtmmobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmmobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmmobActionPerformed

    private void txtaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddActionPerformed

    private void txtgroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgroupActionPerformed

    private void txtdeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdeptActionPerformed

    private void txtbatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbatchActionPerformed

    private void txtfloorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfloorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfloorActionPerformed

    private void txtroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtroomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtroomActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String sname = txtname.getText();
        String sid = txtid.getText();
        String smob = txtmob.getText();
        String semail = txtemail.getText();
        String fname = txtfname.getText();
        String fmob = txtfmob.getText();
        String mname = txtmname.getText();
        String mmob = txtmmob.getText();
        String add = txtadd.getText();
        String bgroup = txtgroup.getText();
        String dept = txtdept.getText();
        String batch = txtbatch.getText();
        String floor = txtfloor.getText();
        String room = txtroom.getText();
        String bed = txtbed.getText();
       
        
        try {
           // Connection Con = ConnectionProvider.getCon();
             ps = getCon.prepareStatement("INSERT INTO `student`(`S_NAME`, `S_ID`, `S_MOB`, `S_EMAIL`, `F_NAME`, `F_MOB`, `M_NAME`, `M_MOB`, `P_ADD`, `BLOOD`, `DEPT`, `BATCH`, `FLOOR`, `ROOM`, `BED`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, sname);
            ps.setString(2, sid);
            ps.setString(3, smob);
            ps.setString(4, semail);
           ps.setString(5, fname);
           ps.setString(6, fmob);
           ps.setString(7, mname);
           ps.setString(8, mmob);
           ps.setString(9, add);
           ps.setString(10, bgroup);
           ps.setString(11, dept);
           ps.setString(12, batch);
           ps.setString(13, floor);
           ps.setString(14, room);
           ps.setString(15, bed);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Update");
           // tableDetails();
           table_update();
            txtname.setText("");
            txtid.setText("");
            txtmob.setText("");
            txtemail.setText("");
            txtfname.setText("");
            txtfmob.setText("");
            txtmname.setText("");
            txtmmob.setText("");
            txtadd.setText("");
            txtgroup.setText("");
            txtdept.setText("");
            txtbatch.setText("");
            txtfloor.setText("");
            txtroom.setText("");
            txtbed.setText("");
      
            table_update();
            txtname.requestFocus();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
     int selectedIndex=jTable1.getSelectedRow();
        
        txtname.setText(d.getValueAt(selectedIndex,0).toString());
        txtid.setText(d.getValueAt(selectedIndex,1).toString());
        txtmob.setText(d.getValueAt(selectedIndex,2).toString());
        txtemail.setText(d.getValueAt(selectedIndex,3).toString());
        txtfname.setText(d.getValueAt(selectedIndex,4).toString());
        txtfmob.setText(d.getValueAt(selectedIndex,5).toString());
        txtmname.setText(d.getValueAt(selectedIndex,6).toString());
        txtmmob.setText(d.getValueAt(selectedIndex,7).toString());
        txtadd.setText(d.getValueAt(selectedIndex,8).toString());
        txtgroup.setText(d.getValueAt(selectedIndex,9).toString());
        txtdept.setText(d.getValueAt(selectedIndex,10).toString());
        txtbatch.setText(d.getValueAt(selectedIndex,11).toString());
        txtfloor.setText(d.getValueAt(selectedIndex,12).toString());
        txtroom.setText(d.getValueAt(selectedIndex,13).toString());
        txtbed.setText(d.getValueAt(selectedIndex,14).toString());

        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         new home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
     int selectedIndex=jTable1.getSelectedRow();
     
     String sname = txtname.getText();
        String sid = txtid.getText();
        String smob = txtmob.getText();
        String semail = txtemail.getText();
        String fname = txtfname.getText();
        String fmob = txtfmob.getText();
        String mname = txtmname.getText();
        String mmob = txtmmob.getText();
        String add = txtadd.getText();
        String bgroup = txtgroup.getText();
        String dept = txtdept.getText();
        String batch = txtbatch.getText();
        String floor = txtfloor.getText();
        String room = txtroom.getText();
        String bed = txtbed.getText();
       
        
        try {
           // Connection Con = ConnectionProvider.getCon();
             ps = getCon.prepareStatement("UPDATE `student` SET `S_NAME`=?,`S_ID`=?,`S_MOB`=?,`S_EMAIL`=?,`F_NAME`=?,`F_MOB`=?,`M_NAME`=?,`M_MOB`=?,`P_ADD`=?,`BLOOD`=?,`DEPT`=?,`BATCH`=?,`FLOOR`=?,`ROOM`=?,`BED`=? WHERE S_ID=?");
            ps.setString(1, sname);
            ps.setString(2, sid);
            ps.setString(3, smob);
            ps.setString(4, semail);
           ps.setString(5, fname);
           ps.setString(6, fmob);
           ps.setString(7, mname);
           ps.setString(8, mmob);
           ps.setString(9, add);
           ps.setString(10, bgroup);
           ps.setString(11, dept);
           ps.setString(12, batch);
           ps.setString(13, floor);
           ps.setString(14, room);
           ps.setString(15, bed);
           ps.setString(16, sid);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Update");
           // tableDetails();
           table_update();
            txtname.setText("");
            txtid.setText("");
            txtmob.setText("");
            txtemail.setText("");
            txtfname.setText("");
            txtfmob.setText("");
            txtmname.setText("");
            txtmmob.setText("");
            txtadd.setText("");
            txtgroup.setText("");
            txtdept.setText("");
            txtbatch.setText("");
            txtfloor.setText("");
            txtroom.setText("");
            txtbed.setText("");
      
            table_update();
            txtname.requestFocus();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
     
     
     
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
         DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
     int selectedIndex=jTable1.getSelectedRow();
     
     String sname = txtname.getText();
        String sid = txtid.getText();
        String smob = txtmob.getText();
        String semail = txtemail.getText();
        String fname = txtfname.getText();
        String fmob = txtfmob.getText();
        String mname = txtmname.getText();
        String mmob = txtmmob.getText();
        String add = txtadd.getText();
        String bgroup = txtgroup.getText();
        String dept = txtdept.getText();
        String batch = txtbatch.getText();
        String floor = txtfloor.getText();
        String room = txtroom.getText();
        String bed = txtbed.getText();
       
        
        try {
           // Connection Con = ConnectionProvider.getCon();
             ps = getCon.prepareStatement("DELETE FROM `student` WHERE `S_ID`=?");
             ps.setString(1, sid);
           
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Delete");
           // tableDetails();
           table_update();
//            txtname.setText("");
//            txtid.setText("");
//            txtmob.setText("");
//            txtemail.setText("");
//            txtfname.setText("");
//            txtfmob.setText("");
//            txtmname.setText("");
//            txtmmob.setText("");
//            txtadd.setText("");
//            txtgroup.setText("");
//            txtdept.setText("");
//            txtbatch.setText("");
//            txtfloor.setText("");
//            txtroom.setText("");
//            txtbed.setText("");
//      
            table_update();
            txtname.requestFocus();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
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
            java.util.logging.Logger.getLogger(STUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(STUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(STUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(STUDENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new STUDENT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtbatch;
    private javax.swing.JTextField txtbed;
    private javax.swing.JTextField txtdept;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfloor;
    private javax.swing.JTextField txtfmob;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtgroup;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmmob;
    private javax.swing.JTextField txtmname;
    private javax.swing.JTextField txtmob;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtroom;
    // End of variables declaration//GEN-END:variables

    
}
