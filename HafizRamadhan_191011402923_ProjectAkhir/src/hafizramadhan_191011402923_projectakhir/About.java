/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hafizramadhan_191011402923_projectakhir;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author mdm
 */
public class About extends javax.swing.JFrame {

    /**
     * Creates new form About
     */
    public About() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation (
                (screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HafizRamadhan_PanelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        HafizRamadhan_MenuFile = new javax.swing.JMenu();
        HafizRamadhan_Menu = new javax.swing.JMenu();
        HafizRamadhan_MenuKelolaDataSiswa = new javax.swing.JMenuItem();
        HafizRamadhan_MenuKelolaDataGuru = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        HafizRamadhan_MenuCelToFah = new javax.swing.JMenuItem();
        HafizRamadhan_MenuKalkulator = new javax.swing.JMenuItem();
        HafizRamadhan_MenuPenilaianMahasiswa = new javax.swing.JMenuItem();
        HafizRamadhan_MenuPerjumlahanDuaAngka = new javax.swing.JMenuItem();
        HafizRamadhan_MenuBukuTelepon = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HafizRamadhan_PanelHome.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Hafiz Ramadhan - 191011402923");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("About");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Belajar Bersama merupakan plaltform digital guna mendukung terciptanya 6000 talenta muda digital Indonesia");

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\belajarbersamakecil.jpg")); // NOI18N

        javax.swing.GroupLayout HafizRamadhan_PanelHomeLayout = new javax.swing.GroupLayout(HafizRamadhan_PanelHome);
        HafizRamadhan_PanelHome.setLayout(HafizRamadhan_PanelHomeLayout);
        HafizRamadhan_PanelHomeLayout.setHorizontalGroup(
            HafizRamadhan_PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HafizRamadhan_PanelHomeLayout.createSequentialGroup()
                .addGroup(HafizRamadhan_PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HafizRamadhan_PanelHomeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(HafizRamadhan_PanelHomeLayout.createSequentialGroup()
                        .addGroup(HafizRamadhan_PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HafizRamadhan_PanelHomeLayout.createSequentialGroup()
                                .addGap(264, 264, 264)
                                .addComponent(jLabel2))
                            .addGroup(HafizRamadhan_PanelHomeLayout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(jLabel1))
                            .addGroup(HafizRamadhan_PanelHomeLayout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        HafizRamadhan_PanelHomeLayout.setVerticalGroup(
            HafizRamadhan_PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HafizRamadhan_PanelHomeLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        HafizRamadhan_MenuFile.setText("File");
        jMenuBar1.add(HafizRamadhan_MenuFile);

        HafizRamadhan_Menu.setText("Menu");

        HafizRamadhan_MenuKelolaDataSiswa.setText("Kelola Data Siswa");
        HafizRamadhan_MenuKelolaDataSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HafizRamadhan_MenuKelolaDataSiswaActionPerformed(evt);
            }
        });
        HafizRamadhan_Menu.add(HafizRamadhan_MenuKelolaDataSiswa);

        HafizRamadhan_MenuKelolaDataGuru.setText("Kelola Data Guru");
        HafizRamadhan_MenuKelolaDataGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HafizRamadhan_MenuKelolaDataGuruActionPerformed(evt);
            }
        });
        HafizRamadhan_Menu.add(HafizRamadhan_MenuKelolaDataGuru);

        jMenuBar1.add(HafizRamadhan_Menu);

        jMenu1.setText("Other Apps");

        HafizRamadhan_MenuCelToFah.setText("Celcius To Fahrenhiet");
        HafizRamadhan_MenuCelToFah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HafizRamadhan_MenuCelToFahActionPerformed(evt);
            }
        });
        jMenu1.add(HafizRamadhan_MenuCelToFah);

        HafizRamadhan_MenuKalkulator.setText("Kalkulator");
        HafizRamadhan_MenuKalkulator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HafizRamadhan_MenuKalkulatorActionPerformed(evt);
            }
        });
        jMenu1.add(HafizRamadhan_MenuKalkulator);

        HafizRamadhan_MenuPenilaianMahasiswa.setText("Penilian Mahasiswa");
        HafizRamadhan_MenuPenilaianMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HafizRamadhan_MenuPenilaianMahasiswaActionPerformed(evt);
            }
        });
        jMenu1.add(HafizRamadhan_MenuPenilaianMahasiswa);

        HafizRamadhan_MenuPerjumlahanDuaAngka.setText("Perjumlahan Dua Angka");
        HafizRamadhan_MenuPerjumlahanDuaAngka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HafizRamadhan_MenuPerjumlahanDuaAngkaActionPerformed(evt);
            }
        });
        jMenu1.add(HafizRamadhan_MenuPerjumlahanDuaAngka);

        HafizRamadhan_MenuBukuTelepon.setText("Aplikasi Buku Telepon");
        HafizRamadhan_MenuBukuTelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HafizRamadhan_MenuBukuTeleponActionPerformed(evt);
            }
        });
        jMenu1.add(HafizRamadhan_MenuBukuTelepon);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("YouTube");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Exit");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HafizRamadhan_PanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HafizRamadhan_PanelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HafizRamadhan_MenuKelolaDataSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HafizRamadhan_MenuKelolaDataSiswaActionPerformed
        // TODO add your handling code here:
        new KelolaDataSiswa().setVisible(true); dispose();
    }//GEN-LAST:event_HafizRamadhan_MenuKelolaDataSiswaActionPerformed

    private void HafizRamadhan_MenuKelolaDataGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HafizRamadhan_MenuKelolaDataGuruActionPerformed
        // TODO add your handling code here:
        new KelolaDataGuru().setVisible(true); dispose();
    }//GEN-LAST:event_HafizRamadhan_MenuKelolaDataGuruActionPerformed

    private void HafizRamadhan_MenuCelToFahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HafizRamadhan_MenuCelToFahActionPerformed
        // TODO add your handling code here:
        new CelciusToFahrenhiet().setVisible(true); dispose();
    }//GEN-LAST:event_HafizRamadhan_MenuCelToFahActionPerformed

    private void HafizRamadhan_MenuKalkulatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HafizRamadhan_MenuKalkulatorActionPerformed
        // TODO add your handling code here:
        new Kalkulator().setVisible(true); dispose();
    }//GEN-LAST:event_HafizRamadhan_MenuKalkulatorActionPerformed

    private void HafizRamadhan_MenuPenilaianMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HafizRamadhan_MenuPenilaianMahasiswaActionPerformed
        // TODO add your handling code here:
        new Penilaian().setVisible(true); dispose();
    }//GEN-LAST:event_HafizRamadhan_MenuPenilaianMahasiswaActionPerformed

    private void HafizRamadhan_MenuPerjumlahanDuaAngkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HafizRamadhan_MenuPerjumlahanDuaAngkaActionPerformed
        // TODO add your handling code here:
        new PerjumlahanDuaAngka().setVisible(true); dispose();
    }//GEN-LAST:event_HafizRamadhan_MenuPerjumlahanDuaAngkaActionPerformed

    private void HafizRamadhan_MenuBukuTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HafizRamadhan_MenuBukuTeleponActionPerformed
        // TODO add your handling code here:
        new AplikasiBukuTelepon().setVisible(true); dispose();
    }//GEN-LAST:event_HafizRamadhan_MenuBukuTeleponActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        new About().setVisible(true); dispose();
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        new YouTube().setVisible(true); dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah kamu yakin keluar dari Aplikasi ?", "Confirmation" , JOptionPane.YES_NO_OPTION);
        if (confirm == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenu4MouseClicked

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
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu HafizRamadhan_Menu;
    private javax.swing.JMenuItem HafizRamadhan_MenuBukuTelepon;
    private javax.swing.JMenuItem HafizRamadhan_MenuCelToFah;
    private javax.swing.JMenu HafizRamadhan_MenuFile;
    private javax.swing.JMenuItem HafizRamadhan_MenuKalkulator;
    private javax.swing.JMenuItem HafizRamadhan_MenuKelolaDataGuru;
    private javax.swing.JMenuItem HafizRamadhan_MenuKelolaDataSiswa;
    private javax.swing.JMenuItem HafizRamadhan_MenuPenilaianMahasiswa;
    private javax.swing.JMenuItem HafizRamadhan_MenuPerjumlahanDuaAngka;
    private javax.swing.JPanel HafizRamadhan_PanelHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}