package gradeprediction;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class calculation extends javax.swing.JFrame {

    ResultSet rs;
    Statement st, st1, st2, st3, st4;
    Connection con;
    double[] ss = new double[100];
    double a, b, c, d, sum;
    double re;
    double[] res = new double[100];
    double[] res1 = new double[100];
    double tot = 0;
    double[] ent = new double[1000];

    public calculation() {
        initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gradeprediction", "root", "");
            st = con.createStatement();
            st1 = con.createStatement();
            st2 = con.createStatement();
            st3 = con.createStatement();
            st4 = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculation");
        setMinimumSize(new java.awt.Dimension(749, 541));
        getContentPane().setLayout(null);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Set-02d-june.gif"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(650, 450, 91, 50);

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 20)); // NOI18N
        jLabel1.setText("Grade");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 780, 50);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Matrices", 0, 0, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel6.setOpaque(false);
        jPanel6.setLayout(null);

      //  jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
      //  jButton1.setText("Matrix");
        //jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);
        jButton1.setBounds(50, 30, 70, 23);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel6.add(jScrollPane1);
        jScrollPane1.setBounds(50, 60, 290, 160);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(30, 50, 420, 250);

      //  jTabbedPane1.addTab("MRE", jPanel1);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("Information");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(40, 20, 100, 23);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(40, 60, 520, 250);

        jTabbedPane1.addTab("MMRE", jPanel2);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setText("Entropy");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(20, 20, 80, 20);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(20, 60, 520, 240);

        jTabbedPane1.addTab("MdMRE", jPanel3);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setText("Gain");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(30, 20, 60, 23);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jPanel4.add(jScrollPane4);
        jScrollPane4.setBounds(30, 50, 540, 260);

        jTabbedPane1.addTab("pred(K)", jPanel4);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(null);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton5.setText("Classify");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5);
        jButton5.setBounds(30, 20, 80, 23);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jPanel5.add(jScrollPane5);
        jScrollPane5.setBounds(30, 60, 530, 240);

        jTabbedPane1.addTab("Classify", jPanel5);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(60, 80, 600, 420);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Light-Blue-Planet-Powerpoint-Backgrounds-1000x750.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 750, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String[] col = new String[100];
            int i = 0,aa=0,s1=0;
            int j = 1;
            jTextArea1.append("");
            String f1=null,e1=null;
            int g1=0,t1=0;
            int[] a = new int[10];
            st.executeUpdate("TRUNCATE TABLE classify");
            //ResultSet rs = st.executeQuery("select * from id31");
            //ResultSetMetaData rmd = rs.getMetaData();
            //for (int k = 1; k <= rmd.getColumnCount(); k++) {
              //  col[k] = rmd.getColumnName(k);
               // System.out.println(col[k]);
            //}
            //for (int k = 1; k < rmd.getColumnCount() - 1; k++) {
               ResultSet rrr = st4.executeQuery("select avg(Grade) from id31");
                while (rrr.next()) {
                    aa = rrr.getInt(1);
                    jTextArea1.append(aa + "\n");
                
                    ResultSet r = st1.executeQuery("select avg(Timetaken) from id32");
                    while (r.next()) {
                        s1 = r.getInt(1);
                        System.out.println("s1="+s1);
                    
                     
                        ResultSet r111 = st2.executeQuery("select id32.Firstname,id32.Emailaddress,id32.Timetaken,id32.Grade from id31,id32 where id32.Timetaken<=" + s1 + " and id31.Grade>=" + aa + "");
                        while (r111.next()) {
                            f1=r111.getString("id32.Firstname");
                            e1=r111.getString("id32.Emailaddress");
                            t1=r111.getInt("id32.Timetaken");
                            g1=r111.getInt("id32.Grade");
                            
           
                             jTextArea1.append("\n");
                        }
                                     st2.executeUpdate("insert into classify values('" + f1 + "','" + e1 + "'," + t1 + ","+g1+ ")");
                    }
                    j++;
                    i = 0;
                   
                    
                    }
                
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int i = 1;
            jTextArea2.append("Firstname\tEmailId\tTimetaken\tGrade\n");
            ResultSet rs = st.executeQuery("select * from classify");
            while (rs.next()) {
                jTextArea2.append(rs.getString(1) + "\t");
                jTextArea2.append(rs.getString(2) + "\t");
                jTextArea2.append(rs.getInt(3) + "\t");
                jTextArea2.append(rs.getInt(4) + "\t");    
                a = rs.getInt(3);
                b = rs.getInt(4);
//                c = rs.getInt(5);
                sum = a + b;
                double a1 = a / sum;
                double b1 = b / sum;
//                double c1 = c / sum;
                System.out.println(a1);
//                re = -(a1 * Math.log10(a1)) - (b1 * Math.log10(b1)) - (c1 * (Math.log10(c1)));
                re = -(a1 * Math.log10(a1)) - (b1 * Math.log10(b1));
                System.out.println(re);
                res[i] = re;
                jTextArea2.append(+ re + "\n");
                i++;

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {

            double as = 0;
            int i = 0, j = 0;
            double s = 0;
            ResultSet rs = st.executeQuery("select avg(Grade) from classify");
            while (rs.next()) {
                int aa = rs.getInt(1);
                ResultSet ress = st2.executeQuery("select avg(TimeTaken) from classify ");
                while (ress.next()) {
                    int s1 = ress.getInt(1);
                    ResultSet r = st1.executeQuery("select * from classify where TimeTaken<=" + s1 + "");
                    while (r.next()) {
                        a = r.getInt(3);
                        b = r.getInt(4);
                       // c = r.getInt(5);
                        s = s + a + b;
                    }
                }
                ss[i] = s;
                System.out.println(s);
                i++;
                s = 0;
            }
            i = 0;
            jTextArea3.append("Entrophy Values\n");
            rs = st.executeQuery("select avg(Grade) from classify");
            while (rs.next()) {
                int aa = rs.getInt(1);
                ResultSet ress = st2.executeQuery("select avg(TimeTaken) from classify");
                while (ress.next()) {
                    int s1 = ress.getInt(1);
                    ResultSet r = st1.executeQuery("select * from classify where Timetaken=" + s1+ "");
                    while (r.next()) {
                        a = r.getInt(3);
                        b = r.getInt(4);
                        //c = r.getInt(5);
                        //s = a + b + c;
                    }
                    double so = s / ss[i];
                    as = as + so * res[j];
                    j++;
                }
                ent[i] = as;
                jTextArea3.append(ent[i] + "\n");
                as = 0;
                i++;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            int i = 0;
            ResultSet rr = st1.executeQuery("select avg(Grade) from classify");
            while (rr.next()) {
                String aa = rr.getString(1);
                System.out.println(aa);
                ResultSet rs = st.executeQuery("select sum(Timetaken),sum(Grade) from classify where Grade=" + aa + "");
                while (rs.next()) {
                    a = rs.getInt(1);
                    double a1 = a / sum;
                    double b1 = b / sum;
                    b = rs.getInt(2);
//                    c = rs.getInt(3);
                    sum = a + b;
                    double c1 = a + b / sum;
                    System.out.println(a1);
                    re = (a1 * Math.log10(a1)) - (b1 * Math.log10(b1)) - (c1 * (Math.log10(c1)));
                    System.out.println(re);
                    res1[i] = re;
                    // jTextArea2.append(a + "\t" + b + "\t" + c + "\t" + re + "\n");
                    i++;
                }
                System.out.println(a + "," + b + "," + c);
            }
            for (int j = 0; j < 3; j++) {
                double result = res1[j] - ent[j];
                double result1 = Math.abs(result);
                jTextArea4.append(result1 + "\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            rs = st1.executeQuery("select * from classify");
            while (rs.next()) {
                String a = rs.getString(1);
                String b = rs.getString(2);
                int c = rs.getInt(3);
                int d = rs.getInt(4);
                jTextArea5.append(a +"\t"+ b+ "\t"+ c+"\t"  + d + "\n");

            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
//        predictrate e = new predictrate();
  //      e.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    // End of variables declaration//GEN-END:variables
}
