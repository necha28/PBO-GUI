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
public class Latihan1 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan
     */
    public Latihan1() {
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

        FORMULIR = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PROSES = new javax.swing.JButton();
        p = new javax.swing.JLabel();
        y = new javax.swing.JLabel();
        o = new javax.swing.JLabel();
        alamat1 = new javax.swing.JTextField();
        Nama1 = new javax.swing.JTextField();
        Kelas1 = new javax.swing.JTextField();
        Alamat1 = new javax.swing.JTextField();
        nama1 = new javax.swing.JTextField();
        kelas1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        FORMULIR.setText("FORMULIR");
        getContentPane().add(FORMULIR);
        FORMULIR.setBounds(170, 30, 60, 14);

        jLabel2.setText("NAMA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 220, 60, 30);

        jLabel3.setText("KELAS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 260, 40, 30);

        jLabel4.setText("ALAMAT");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 300, 50, 30);

        PROSES.setText("PROSES");
        PROSES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROSESActionPerformed(evt);
            }
        });
        getContentPane().add(PROSES);
        PROSES.setBounds(150, 190, 90, 20);

        p.setText("NAMA");
        getContentPane().add(p);
        p.setBounds(50, 60, 60, 30);

        y.setText("KELAS");
        getContentPane().add(y);
        y.setBounds(50, 100, 50, 30);

        o.setText("ALAMAT");
        getContentPane().add(o);
        o.setBounds(50, 140, 60, 30);

        alamat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamat1ActionPerformed(evt);
            }
        });
        getContentPane().add(alamat1);
        alamat1.setBounds(110, 300, 170, 30);

        Nama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama1ActionPerformed(evt);
            }
        });
        getContentPane().add(Nama1);
        Nama1.setBounds(110, 60, 170, 30);

        Kelas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kelas1ActionPerformed(evt);
            }
        });
        getContentPane().add(Kelas1);
        Kelas1.setBounds(110, 100, 170, 30);

        Alamat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alamat1ActionPerformed(evt);
            }
        });
        getContentPane().add(Alamat1);
        Alamat1.setBounds(110, 140, 170, 30);

        nama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama1ActionPerformed(evt);
            }
        });
        getContentPane().add(nama1);
        nama1.setBounds(110, 220, 170, 30);

        kelas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelas1ActionPerformed(evt);
            }
        });
        getContentPane().add(kelas1);
        kelas1.setBounds(110, 260, 170, 30);

        setBounds(0, 0, 416, 399);
    }// </editor-fold>//GEN-END:initComponents

    private void alamat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamat1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_alamat1ActionPerformed

    private void Nama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama1ActionPerformed

    private void Kelas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kelas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Kelas1ActionPerformed

    private void Alamat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alamat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alamat1ActionPerformed

    private void nama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama1ActionPerformed

    private void kelas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelas1ActionPerformed

    private void PROSESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROSESActionPerformed
        // TODO add your handling code here:
        String nama = Nama1.getText();
        nama1.setText(nama);
        String kelas = Kelas1.getText();
        kelas1.setText (kelas);
        String alamat = Alamat1.getText();
        alamat1.setText (alamat);
    }//GEN-LAST:event_PROSESActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat1;
    private javax.swing.JLabel FORMULIR;
    private javax.swing.JTextField Kelas1;
    private javax.swing.JTextField Nama1;
    private javax.swing.JButton PROSES;
    private javax.swing.JTextField alamat1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField kelas1;
    private javax.swing.JTextField nama1;
    private javax.swing.JLabel o;
    private javax.swing.JLabel p;
    private javax.swing.JLabel y;
    // End of variables declaration//GEN-END:variables
}