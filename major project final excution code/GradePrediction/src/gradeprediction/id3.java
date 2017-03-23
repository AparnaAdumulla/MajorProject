package gradeprediction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class id3 extends javax.swing.JFrame {

    Connection con;
    Statement st, st1, st2, st3, st4;

    public id3() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradeprediction", "root", "");
            st = con.createStatement();
            st1 = con.createStatement();
            st2 = con.createStatement();
            st3 = con.createStatement();
            st3.executeUpdate("truncate table id3");

            st4 = con.createStatement();
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bayesian");
        setMinimumSize(new java.awt.Dimension(707, 536));
        getContentPane().setLayout(null);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Set-02d-june.gif"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(520, 420, 230, 90);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Poor Richard", 1, 20)); // NOI18N
        jLabel2.setText("Grade Prediction");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 20, 780, 60);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("P(X/Y)");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 40, 90, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 80, 360, 250);

        jTabbedPane1.addTab("P(X/Y)", jPanel1);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("P(X) and P(Y)");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(60, 40, 130, 30);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(60, 100, 350, 240);

        jTabbedPane1.addTab("P(X)P(Y)", jPanel3);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setText("P(X/Y).P(X)P(Y)");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(40, 50, 120, 30);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(40, 100, 370, 220);

        jTabbedPane1.addTab("", jPanel4);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(30, 120, 470, 390);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Light-Blue-Planet-Powerpoint-Backgrounds-1000x750.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 710, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        calculation c = new calculation();
        c.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            //            jTextArea3.append("Cluster1\tCluster2\tCluster3\n");

            int i = 0;
            int j = 1, cc = 0, ccc = 0;
            int[] a = new int[10];

            ResultSet rs = st.executeQuery("select distinct(Timetaken) from id32");
            while (rs.next()) {
                int s = rs.getInt(1);
                System.out.println();
                ResultSet r = st1.executeQuery("select distinct(Grade) from id31");
                while (r.next()) {
                    int s1 = r.getInt(1);
                    ResultSet r1 = st2.executeQuery("select count(*) from id31 where Timetaken<=" + s + " and Grade=" + s1+"");
                    while (r1.next()) {
                        int count = r1.getInt(1);
                        //  jTextArea1.append(count + "\t");
                        ResultSet rr = st4.executeQuery("select * from id32 where Grade=" + s+"");
                        while (rr.next()) {
                            cc = rr.getInt(4);
                        }
                        ResultSet rr1 = st4.executeQuery("select * from id31 where cluster1=" + s1+"");
                        while (rr1.next()) {
                            ccc = rr1.getInt(3);
                        }
                        int v = count * ccc;
                        int v1 = v / cc;
                        jTextArea3.append(v1 + "\n");
                    }
                    //                    jTextArea3.append("\t");
                }
                //                jTextArea3.append("\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            st.executeUpdate("TRUNCATE TABLE id31");
            st.executeUpdate("TRUNCATE TABLE id32");
            int s =0;
            int s1 =0;
            int tid31=0,gid31=0,t1id31=0,g1id31=0;
            String fid31=null,eid31=null,f1id31=null,e1id31=null;
            int cnt = 0;
            jTextArea2.append("P(B)\n*******\n");
            ResultSet rs = st.executeQuery("select avg(Grade) from cluster1");
            while (rs.next()) {
                s = rs.getInt(1);
                System.out.println("cluster2"+s);
                ResultSet r = st1.executeQuery("select Firstname,Emailaddress,Timetaken,Grade from cluster1 where Grade>="+s+"");
                while (r.next()) {
                    fid31 = r.getString(1);
                    System.out.println(fid31);
                    eid31 = r.getString(2);
                    System.out.println(eid31);
                    tid31=r.getInt(3);
                    System.out.println(tid31);
                    gid31=r.getInt(4);
                    System.out.println(gid31);
                    jTextArea2.append(fid31 + "\t");
                    jTextArea2.append(eid31 + "\t");
                    jTextArea2.append(tid31 + "\t");
                    jTextArea2.append(gid31 + "\n");
                  
                    st2.executeUpdate("insert into id31 values('" + fid31 + "','" + eid31 + "'," + tid31 + ","+gid31+ ")");

                }
                 jTextArea2.append("\n");
                String c = String.valueOf(cnt);
            }
            jTextArea2.append("\nP(A)\n*******\n");
            int dec = 20;
            ResultSet rs1 = st.executeQuery("select avg(TimeTaken) from cluster1");
            while (rs1.next()) {
                s1 = rs1.getInt(1);
                System.out.println("avgtime="+s1);
                ResultSet r = st1.executeQuery("select Firstname,Emailaddress,Timetaken,Grade from cluster1 where Timetaken<=" + s1 + "");
                while (r.next()) {
                    f1id31 = r.getString(1);
                    System.out.println("pa"+f1id31);
                    e1id31 = r.getString(2);
                    System.out.println("pa"+e1id31);
                    t1id31=r.getInt(3);
                    System.out.println("pa"+t1id31);
                    g1id31=r.getInt(4);
                    System.out.println("pa"+g1id31);
                    jTextArea2.append(f1id31 + "\t");
                    jTextArea2.append(e1id31 + "\t");
                    jTextArea2.append(t1id31 + "\t");
                    jTextArea2.append(g1id31 + "\t");
                    st2.executeUpdate("insert into id32 values('" + f1id31 + "','" + e1id31 + "'," + t1id31 + ","+g1id31+ ")");

                }
                String c = String.valueOf(cnt);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int i = 0;
            int j = 1;
            int s1,t1=0,g1=0;
            String f1=null,e1=null;
            jTextArea1.append("\n*******\n");
            int[] a = new int[10];
            st.executeUpdate("TRUNCATE TABLE id3");
            ResultSet rs = st.executeQuery("select avg(Timetaken) from cluster1");
            while (rs.next()) {
                int s = rs.getInt(1);
                System.out.println(s);
                jTextArea1.append(s + "\n");
                ResultSet r = st1.executeQuery("select avg(Grade) from cluster1");
                while (r.next()) {
                    s1 = r.getInt(1);
                    jTextArea1.append(s1 + "\t");
                    ResultSet r1 = st2.executeQuery("select Firstname,Emailaddress,Timetaken,Grade from cluster1 where Timetaken<=" + s + " and Grade>" + s1);
                    while (r1.next()) {
                        f1 = r1.getString(1);
                        e1 = r1.getString(2);
                        t1=r1.getInt(3);
                        g1=r1.getInt(4);
                        jTextArea1.append(f1 + "\t");
                        jTextArea1.append(e1 + "\t");
                        jTextArea1.append(t1 + "\t");
                        jTextArea1.append(g1 + "\t");
                    }

                    jTextArea1.append("\n");
                }
                st2.executeUpdate("insert into id3 values('" + f1 + "','" + e1 + "'," + t1 + ","+g1+ ")");
                j++;
                i = 0;

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(id3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(id3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(id3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(id3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new id3().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
