/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.pbo;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author necha
 */
public class Lat2 extends javax.swing.JFrame {

    /**
     * Creates new form Lat2
     */
    public Lat2() {
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
        nama = new javax.swing.JLabel();
        kelas = new javax.swing.JLabel();
        alamat = new javax.swing.JLabel();
        sekolah = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cbox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Sekolah = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        Alamat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Tabel Biodata");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 20, 90, 30);

        nama.setText("Nama");
        getContentPane().add(nama);
        nama.setBounds(60, 70, 70, 30);

        kelas.setText("Kelas");
        getContentPane().add(kelas);
        kelas.setBounds(60, 120, 70, 20);

        alamat.setText("Alamat");
        getContentPane().add(alamat);
        alamat.setBounds(60, 160, 70, 30);

        sekolah.setText("Sekolah");
        getContentPane().add(sekolah);
        sekolah.setBounds(60, 210, 70, 30);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 260, 60, 23);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(250, 260, 60, 23);

        cbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XI RPL 1", "XI RPL 2", "XI RPL 3", "XI RPL 4", "XI RPL 5", "XI RPL 6" }));
        getContentPane().add(cbox);
        cbox.setBounds(130, 120, 140, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Kelas", "Alamat", "Sekolah"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 310, 390, 130);
        getContentPane().add(Sekolah);
        Sekolah.setBounds(130, 210, 180, 30);
        getContentPane().add(Nama);
        Nama.setBounds(130, 70, 180, 30);
        getContentPane().add(Alamat);
        Alamat.setBounds(130, 160, 180, 30);

        setBounds(0, 0, 461, 502);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String nama = Nama.getText();
    String kelas = cbox.getSelectedItem().toString();
    String alamat = Alamat.getText();
    String sekolah = Sekolah.getText();
    //untuk combobox
    if (cbox.getSelectedItem()== "XI RPL 1"){
    }if (cbox.getSelectedItem()== "XI RPL 2"){
    }if (cbox.getSelectedItem()== "XI RPL 3"){    
    }if (cbox.getSelectedItem()== "XI RPL 4"){
    }if (cbox.getSelectedItem()== "XI RPL 5"){
    }if (cbox.getSelectedItem()== "XI RPL 6");
    //untuk tabel
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.addRow(new Object[]{Nama.getText(),
    cbox.getSelectedItem(),Alamat.getText(),
    Sekolah.getText()});
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
            java.util.logging.Logger.getLogger(Lat2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lat2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lat2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lat2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lat2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Sekolah;
    private javax.swing.JLabel alamat;
    private javax.swing.JComboBox cbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel kelas;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel sekolah;
    // End of variables declaration//GEN-END:variables
}
