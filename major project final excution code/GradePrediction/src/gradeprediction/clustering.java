

package gradeprediction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.io.*;


public class clustering extends javax.swing.JFrame {
     Connection con;
    Statement st, st1, st2, st3, st4,st11,st12;

   
    public clustering() {
        initComponents();
          try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradeprediction", "root", "");
            st = con.createStatement();
            st1 = con.createStatement();
            st2 = con.createStatement();
            st11 = con.createStatement();
            st12 = con.createStatement();
            st3 = con.createStatement();
            st3.executeUpdate("truncate table cluster1");
            st4 = con.createStatement();
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clustering");
        setMinimumSize(new java.awt.Dimension(711, 490));
        getContentPane().setLayout(null);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Set-02d-june.gif"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(580, 410, 90, 50);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cummulation", 0, 0, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("K-Means Clustering");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 40, 170, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kpdf1.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(400, 90, 90, 60);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 390, 250);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Show");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(430, 80, 29, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(100, 80, 500, 360);

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 20)); // NOI18N
        jLabel1.setText("Grade Prediction Clustering");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 780, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Light-Blue-Planet-Powerpoint-Backgrounds-1000x750.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 710, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {

            String b,a;
            //String c, f;
            int d;
            int g,h,e;
            String str = null;
            String c = null, f = null;
            ResultSet rs = st.executeQuery("select Firstname,EmailAddress,Timetaken,Grade from dataset where Timetaken<"+30+" And Grade>"+15+"");
            while (rs.next()) {
               a = rs.getString(1);
                b = rs.getString(2);
                g = rs.getInt(3);
                h = rs.getInt(4);
               // c = rs.getString(3);
                //d = rs.getInt(4);
                //e = rs.getInt(5);
                //f = rs.getString(6);
                //g=rs.getString(7);
                if (g<30&&h>15) {
                    str = "cluster1";  
                    //ResultSet rs1 = st.executeQuery("select Firstname,EmailAddress from dataset where Timetaken<"+30+" And Grade>"+15+"");
                    
         //   while (rs1.next()) {
             //     c = rs1.getString(1);
               //     f = rs1.getString(2);
                 //   System.out.println(c);
                   // System.out.println(f);
            
                    String que = "INSERT INTO `gradeprediction`.`cluster1` VALUES ('" +a + "', '" + b + "',"+ g + ", " + h + ")";
                st11.executeUpdate(que); 
           // }
                }
            }
         }
                catch (Exception e) {
            System.out.println(e);
        }
                try {
                    String a1=null,b1=null,str;
                    int g1,h1;
                ResultSet rs1 = st.executeQuery("select Firstname,EmailAddress,Timetaken,Grade from dataset where Timetaken>"+30+" And Grade<"+15+"");
            while (rs1.next()) {
               a1 = rs1.getString(1);
                b1 = rs1.getString(2);
                g1 = rs1.getInt(3);
                h1 = rs1.getInt(4);
               // c = rs.getString(3);
                //d = rs.getInt(4);
                //e = rs.getInt(5);
                //f = rs.getString(6);
                //g=rs.getString(7);
                if (g1>30&&h1<15) {
                    str = "cluster2";  
                    //ResultSet rs1 = st.executeQuery("select Firstname,EmailAddress from dataset where Timetaken<"+30+" And Grade>"+15+"");
                    
         //   while (rs1.next()) {
             //     c = rs1.getString(1);
               //     f = rs1.getString(2);
                 //   System.out.println(c);
                   // System.out.println(f);
            
                    String que1 = "INSERT INTO `gradeprediction`.`cluster2` VALUES ('" + a1 + "', '" + b1 + "',"+ g1 + ", " + h1 + ")";
                st11.executeUpdate(que1); 
           // }
                }
                 //else if (g>30&&h<15) {
                    //str = "cluster2"; 
                  //  ResultSet rs2 = st.executeQuery("select Firstname,EmailAddress from dataset where Timetaken>"+30+" And Grade<"+15+"");
                    
            //while (rs2.next()) {
              //    c = rs2.getString(1);
                //    f = rs2.getString(2);
            
                  //  String que1 = "INSERT INTO `gradeprediction`.`cluster2` VALUES ('" + c + "', '" + f + "',"+ g + ", " + h + ")";
                //st12.executeUpdate(que1);
                 
                
            }
//            for (int i = 1; i < 7; i++) {
//                String s = "cluster" + i;
//            }
//            rs = st.executeQuery("select n,v,l,d,i,e,defects from datset");
//            while (rs.next()) {
//                String a = rs.getString(1);
//                b = rs.getString(2);
//                c = rs.getString(3);
//                d = rs.getInt(4);
//                e = rs.getInt(5);
//                f = rs.getString(6);
//                
//              g=rs.getString(7);
//                if (g.equals("true")) {
//                    str = "cluster1";   
//                } else if (g.equals("false")) {
//                    str = "cluster2"; 
//                }  
//                String que = "INSERT INTO `softwareengineering`.`clustering` (`n`, `v`, `l`, `d`, `i`,`e`) VALUES ('" + a + "', '" + b + "', '" + c + "', '" + f + "', '" + g + "', '" + str + "')";
//                st1.executeUpdate(que);
//            }      
//            rs = st.executeQuery("select n,v,l,d,i,e from datset");
//            while (rs.next()) {
//                String a = rs.getString(1);
//                b = rs.getString(2);
//                c = rs.getString(3);
//                d = rs.getInt(4);
//                e = rs.getInt(5);
//                f = rs.getString(6);
//                
//                if (e <=10) {
//                    str = "cluster1";                 
//                } else if (e >= 10) {
//                    str = "cluster2";                   
//                } else {
//                    str = "cluster3";                  
//                }
//
//                String que = "INSERT INTO `softwareengineering`.`clustering` (`n`, `v`, `l`, `d`,`i`,`e`) VALUES ('" + a + "', '" + b + "', '" + c + "', '" + f + "', '" + e + "', '" + str + "')";
//                st1.executeUpdate(que);
//            }
            JOptionPane.showMessageDialog(this, "Datum are Clustered");
            }
         catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try {
             javax.swing.table.DefaultTableModel t = new javax.swing.table.DefaultTableModel();
            //jTextArea1.setModel(t);
            ResultSet rs1 = st2.executeQuery("Show columns FROM `cluster1`");
            while (rs1.next()) {
                String s = rs1.getString(1);
                jTextArea1.append(s + "\t");
            }
            jTextArea1.append("\n*******************************************************************************\n");
            ResultSet rs = st1.executeQuery("select * from cluster1");
            while (rs.next()) {
                jTextArea1.append(rs.getString(1) + "\t");
                jTextArea1.append(rs.getString(2) + "\t");
                jTextArea1.append(rs.getInt(3) + "\t");
                jTextArea1.append(rs.getInt(4) + "\n");
                //jTextArea1.append(rs.getString(5) + "\t");
                //jTextArea1.append(rs.getString(6) + "\n");

            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         id3 b = new id3();
        b.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(clustering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clustering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clustering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clustering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clustering().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
