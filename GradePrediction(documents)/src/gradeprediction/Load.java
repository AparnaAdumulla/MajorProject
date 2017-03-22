package gradeprediction;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Load extends javax.swing.JFrame {
    Statement st;
ResultSet rs;
    public static String s = Title.s;
    String name;
    Connection con;
    public static double[] x=new double[100];
public static ArrayList feature=new ArrayList();
public static double sum1;

public static double[] y=new double[100];
public static double[] x2=new double[100];
public static double[] y2=new double[100];
    public Load() {
        initComponents();
        try {
              Class.forName("com.mysql.jdbc.Driver");
              con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gradeprediction", "root", "");
        st=con.createStatement();
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dataset");
        setBackground(new java.awt.Color(102, 0, 255));
        setMinimumSize(new java.awt.Dimension(762, 548));
        setPreferredSize(new java.awt.Dimension(762, 548));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 20)); // NOI18N
        jLabel1.setText("Bayesian Networks ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 700, 70);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dataset", 0, 0, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kpdf1.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(440, 30, 50, 50);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dbbackup_icon1.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(70, 20, 60, 60);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setOpaque(false);
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 110, 550, 310);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Set-02d-june.gif"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(600, 350, 91, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("LoadinDatabase");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 80, 90, 14);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("View");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(450, 80, 26, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 80, 690, 440);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Light-Blue-Planet-Powerpoint-Backgrounds-1000x750.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 760, 550);

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gradeprediction", "root", "");
            Statement stmt1 = con.createStatement();
            stmt1.executeUpdate("truncate table dataset");
            BufferedReader br1 = new BufferedReader(new FileReader(new File(s)));
            String str1;
            Statement stmt3 = con.createStatement();
//            stmt3.executeUpdate("TRUNCATE TABLE `datset`");
            Statement stmt = con.createStatement();
            while ((str1 = br1.readLine()) != null) {
                System.out.println(str1);
                StringTokenizer st1 = new StringTokenizer(str1, ",");
                while (st1.hasMoreTokens()) {
                    String s1  = st1.nextToken();
                    String s2  = st1.nextToken();
                    String s3  = st1.nextToken();
                    String s4  = st1.nextToken();
                    String s5  = st1.nextToken();
                    String s6  = st1.nextToken();
                    String s7  = st1.nextToken();
                    String s8  = st1.nextToken();
                    int s9  = Integer.parseInt(st1.nextToken());
                    int s10 = Integer.parseInt(st1.nextToken());
                    
                    stmt.executeUpdate("INSERT INTO `gradeprediction`.`dataset` VALUES ('" + s1 + "', '" + s2 + "', '" + s3 + "', '" + s4 + "', '" + s5 + "', '" + s6 + "','" + s7 + "','" + s8 + "'," + s9 + "," + s10 +  ")");
                    System.out.println("inserted");
                }
            }
            JOptionPane.showMessageDialog(null, "Datum are Loaded into Database");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        
        try {
            String s2[] = new String[1000] ;
            int j = 0;
            int r = 0;
            String k = "dataset";
           
            
            javax.swing.table.DefaultTableModel t = new javax.swing.table.DefaultTableModel();
            jTable1.setModel(t);
            //jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            for (int i = 0; i <= 1100; i++) {
                t.insertRow(i, new Object[]{""});
            }
            String ss = "SHOW COLUMNS FROM `" + k + "`";
            rs = st.executeQuery(ss);
            while (rs.next()) {
                t.addColumn(rs.getString(1));
            }
            String s1 = "SELECT * FROM  `" + k + "`";
            rs = st.executeQuery(s1);
            while (rs.next()) {
                for (int i1 = 0; i1 < 9; i1++) {
                    s2[i1] = rs.getString(i1 + 1);
                    t.setValueAt(s2[i1], r, j++);
                }
                r++;
                j = 0;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      clustering c=new clustering();
      c.setVisible(true);
    }                                        

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
            java.util.logging.Logger.getLogger(Load.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Load.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Load.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Load.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Load().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration
}
