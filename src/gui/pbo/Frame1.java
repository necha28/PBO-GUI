/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.pbo;

/**
 *
 * @author necha
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
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
        Nama1 = new javax.swing.JLabel();
        Absen1 = new javax.swing.JLabel();
        Kelas1 = new javax.swing.JLabel();
        Jurusan1 = new javax.swing.JLabel();
        Alamat1 = new javax.swing.JLabel();
        Alamat = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        Kelas = new javax.swing.JComboBox();
        rdb1 = new javax.swing.JRadioButton();
        rdb2 = new javax.swing.JRadioButton();
        Absen = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Biodata");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 30, 60, 20);

        Nama1.setText("Nama");
        getContentPane().add(Nama1);
        Nama1.setBounds(50, 70, 80, 30);

        Absen1.setText("Absen");
        getContentPane().add(Absen1);
        Absen1.setBounds(50, 110, 80, 30);

        Kelas1.setText("Kelas");
        getContentPane().add(Kelas1);
        Kelas1.setBounds(50, 150, 80, 30);

        Jurusan1.setText("Jurusan");
        getContentPane().add(Jurusan1);
        Jurusan1.setBounds(50, 190, 70, 20);

        Alamat1.setText("Alamat");
        getContentPane().add(Alamat1);
        Alamat1.setBounds(50, 220, 80, 30);
        getContentPane().add(Alamat);
        Alamat.setBounds(130, 220, 160, 30);
        getContentPane().add(Nama);
        Nama.setBounds(130, 70, 160, 30);

        Kelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "X RPL 1", "X RPL 2", "X RPL 3", "X RPL 4", "X RPL 5", "X RPL 6", "X RPL 7" }));
        getContentPane().add(Kelas);
        Kelas.setBounds(130, 150, 160, 30);

        rdb1.setText("RPL");
        rdb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb1ActionPerformed(evt);
            }
        });
        getContentPane().add(rdb1);
        rdb1.setBounds(130, 190, 60, 23);

        rdb2.setText("TKJ");
        getContentPane().add(rdb2);
        rdb2.setBounds(190, 190, 60, 23);
        getContentPane().add(Absen);
        Absen.setBounds(130, 110, 160, 30);

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 280, 73, 23);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(220, 280, 70, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\necha\\Pictures\\Saved Pictures\\sally.line.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 270, 140, 100);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 270);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 280, 370);

        setBounds(0, 0, 416, 404);
    }// </editor-fold>//GEN-END:initComponents

    private void rdb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String nama = Nama.getText();
    String absen = Absen.getText();
    String kelas = Kelas.getSelectedItem().toString();
    String jurusan = "";
    String alamat = Alamat.getText();
    
    if (rdb1.isSelected())
        jurusan ="RPL";
    else if (rdb2.isSelected())
        jurusan ="TKJ";
    else
        
    if (Kelas.getSelectedItem()== "X RPL 1"){
    }
    if (Kelas.getSelectedItem()== "X RPL 2"){
    }
    if (Kelas.getSelectedItem()== "X RPL 3"){
    }
    if (Kelas.getSelectedItem()== "X RPL 4"){
    }
    if (Kelas.getSelectedItem()== "X RPL 5"){
    }
    if (Kelas.getSelectedItem()== "X RPL 6"){
    }
    if (Kelas.getSelectedItem()== "X RPL 7"){
    }
    
    new Frame2(nama, absen, kelas, jurusan, alamat).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JLabel Absen1;
    private javax.swing.JTextField Alamat;
    private javax.swing.JLabel Alamat1;
    private javax.swing.JLabel Jurusan1;
    private javax.swing.JComboBox Kelas;
    private javax.swing.JLabel Kelas1;
    private javax.swing.JTextField Nama;
    private javax.swing.JLabel Nama1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rdb1;
    private javax.swing.JRadioButton rdb2;
    // End of variables declaration//GEN-END:variables
}
