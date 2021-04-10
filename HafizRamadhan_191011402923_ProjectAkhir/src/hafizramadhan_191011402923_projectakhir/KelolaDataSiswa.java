/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hafizramadhan_191011402923_projectakhir;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mdm
 */
public class KelolaDataSiswa extends javax.swing.JFrame {
    private Connection conn;
    private Statement stat;
    private ResultSet res;
    private String t;
    private DefaultTableModel dtm;
    private String TableSiswa = "hafizramadhan_siswa";
    /**
     * Creates new form KelolaDataSiswa
     */
    public KelolaDataSiswa() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation (
                (screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2
        );
        koneksi();
        initDataTable();
    }
    
    private void koneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/inputdatasiswahafizramadhan", "root", "");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void bersih(){
        HafizRamadhan_NamaLengkap.setText("");
        HafizRamadhan_JenisKelamin.setSelectedIndex(-1);
        HafizRamadhan_Alamat.setText("");
    }
    
    private void initDataTable(){
        DefaultTableModel t = new DefaultTableModel();
        t.addColumn("id");
        t.addColumn("Nama");
        t.addColumn("Jenis Kelamin");
        t.addColumn("Alamat");
        
        HafizRamadhan_TableSiswa.setModel(t);
        try {
            res = conn.createStatement().executeQuery("SELECT * FROM "+TableSiswa+" ");
            while(res.next()){
                t.addRow(new Object[]{
                    res.getString("id"),
                    res.getString("name"),
                    res.getString("gender"),
                    res.getString("address"),
                });
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HafizRamadhan_NamaLengkap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        HafizRamadhan_JenisKelamin = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        HafizRamadhan_Alamat = new javax.swing.JTextField();
        HafizRamadhan_Simpan = new javax.swing.JButton();
        HafizRamadhan_BackToHome = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        HafizRamadhan_Clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        HafizRamadhan_TableSiswa = new javax.swing.JTable();
        HafizRamadhan_Refresh = new javax.swing.JButton();
        HafizRamadhan_ID = new javax.swing.JTextField();
        HafizRamadhan_SearchButton = new javax.swing.JButton();
        HafizRamadhan_Edit = new javax.swing.JButton();
        HafizRamadhan_Delete = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Kelola Data Siswa");

        jLabel2.setText("Nama Lengkap");

        jLabel4.setText("Jenis Kelamin");

        HafizRamadhan_JenisKelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Laki-laki", "Perempuan" }));
        HafizRamadhan_JenisKelamin.setSelectedIndex(-1);

        jLabel5.setText("Alamat");

        HafizRamadhan_Simpan.setText("Save");
        HafizRamadhan_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HafizRamadhan_SimpanActionPerformed(evt);
            }
        });

        HafizRamadhan_BackToHome.setText("Home");
        HafizRamadhan_BackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HafizRamadhan_BackToHomeActionPerformed(evt);
            }
        });

        jLabel6.setText("Hafiz Ramadhan - 191011402923");

        HafizRamadhan_Clear.setText("Clear");
        HafizRamadhan_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HafizRamadhan_ClearActionPerformed(evt);
            }
        });

        HafizRamadhan_TableSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(HafizRamadhan_TableSiswa);

        HafizRamadhan_Refresh.setText("Refresh");
        HafizRamadhan_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HafizRamadhan_RefreshActionPerformed(evt);
            }
        });

        HafizRamadhan_SearchButton.setText("Search");
        HafizRamadhan_SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HafizRamadhan_SearchButtonActionPerformed(evt);
            }
        });

        HafizRamadhan_Edit.setText("Edit");
        HafizRamadhan_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HafizRamadhan_EditActionPerformed(evt);
            }
        });

        HafizRamadhan_Delete.setText("Delete");
        HafizRamadhan_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HafizRamadhan_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HafizRamadhan_Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(HafizRamadhan_BackToHome, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HafizRamadhan_Simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(HafizRamadhan_NamaLengkap)
                            .addComponent(HafizRamadhan_JenisKelamin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HafizRamadhan_Alamat)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(HafizRamadhan_ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HafizRamadhan_SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HafizRamadhan_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HafizRamadhan_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(HafizRamadhan_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HafizRamadhan_NamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(HafizRamadhan_JenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(HafizRamadhan_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HafizRamadhan_Simpan)
                            .addComponent(HafizRamadhan_BackToHome)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HafizRamadhan_Refresh)
                            .addComponent(HafizRamadhan_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HafizRamadhan_SearchButton)
                            .addComponent(HafizRamadhan_Edit))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HafizRamadhan_Clear)
                    .addComponent(HafizRamadhan_Delete))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HafizRamadhan_BackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HafizRamadhan_BackToHomeActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true); dispose();
    }//GEN-LAST:event_HafizRamadhan_BackToHomeActionPerformed

    private void HafizRamadhan_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HafizRamadhan_SimpanActionPerformed
        // TODO add your handling code here:
        String NamaLengkap = HafizRamadhan_NamaLengkap.getText();
        String Alamat = HafizRamadhan_Alamat.getText();
        try {
            conn.createStatement().executeUpdate("insert into hafizramadhan_siswa (name, gender, address) values("
                + "'" + NamaLengkap + "',"
                + "'" + HafizRamadhan_JenisKelamin.getSelectedItem() + "',"
                + "'" + Alamat + "')");
            JOptionPane.showMessageDialog(null, "Berhasil menyimpan data!");
            initDataTable();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Kesalahan: " + e);
        }
    }//GEN-LAST:event_HafizRamadhan_SimpanActionPerformed

    private void HafizRamadhan_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HafizRamadhan_ClearActionPerformed
        // TODO add your handling code here:
        HafizRamadhan_NamaLengkap.setText(""); HafizRamadhan_NamaLengkap.requestFocus();
        HafizRamadhan_JenisKelamin.setSelectedIndex(-1);
        HafizRamadhan_Alamat.setText("");
    }//GEN-LAST:event_HafizRamadhan_ClearActionPerformed

    private void HafizRamadhan_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HafizRamadhan_RefreshActionPerformed
        // TODO add your handling code here:
        initDataTable();
    }//GEN-LAST:event_HafizRamadhan_RefreshActionPerformed

    private void HafizRamadhan_SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HafizRamadhan_SearchButtonActionPerformed
        // TODO add your handling code here:
        try {
            res = conn.createStatement().executeQuery("SELECT * FROM "+TableSiswa+" WHERE id = '"+HafizRamadhan_ID.getText()+"'");
            while (res.next()){
                HafizRamadhan_NamaLengkap.setText(res.getString("name"));
                HafizRamadhan_Alamat.setText(res.getString("address"));
                HafizRamadhan_JenisKelamin.setSelectedItem(res.getString("gender"));
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_HafizRamadhan_SearchButtonActionPerformed

    private void HafizRamadhan_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HafizRamadhan_EditActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah kamu yakin ingin mengupdate data ini ?", "Confirmation" , JOptionPane.YES_NO_OPTION);
        if (confirm == 0){
            PreparedStatement st;
            try {
                String sql = "UPDATE "+TableSiswa+" SET name = ?, gender = ?, address = ? WHERE id ='"+HafizRamadhan_ID.getText()+"' ";
                st = conn.prepareStatement(sql);
                st.setString(1, HafizRamadhan_NamaLengkap.getText());
                st.setString(2, HafizRamadhan_JenisKelamin.getSelectedItem().toString());
                st.setString(3, (String) HafizRamadhan_Alamat.getText());
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
                initDataTable();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Data gagal diupdate, karena: " + ex);
            }
        }
    }//GEN-LAST:event_HafizRamadhan_EditActionPerformed

    private void HafizRamadhan_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HafizRamadhan_DeleteActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah kamu yakin ingin menghapus data ini ?", "Confirmation" , JOptionPane.YES_NO_OPTION);
        if (confirm == 0){
            PreparedStatement st;
            try {
                String sql = "DELETE FROM "+TableSiswa+" WHERE id ='"+HafizRamadhan_ID.getText()+"' ";
                st = conn.prepareStatement(sql);
                st.execute();
                JOptionPane.showMessageDialog(null, "Data berhasil menghapus data");
                initDataTable();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Data gagal menghapus data, karena: " + ex);
            }
        }
    }//GEN-LAST:event_HafizRamadhan_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(KelolaDataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaDataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaDataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaDataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelolaDataSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HafizRamadhan_Alamat;
    private javax.swing.JButton HafizRamadhan_BackToHome;
    private javax.swing.JButton HafizRamadhan_Clear;
    private javax.swing.JButton HafizRamadhan_Delete;
    private javax.swing.JButton HafizRamadhan_Edit;
    private javax.swing.JTextField HafizRamadhan_ID;
    private javax.swing.JComboBox HafizRamadhan_JenisKelamin;
    private javax.swing.JTextField HafizRamadhan_NamaLengkap;
    private javax.swing.JButton HafizRamadhan_Refresh;
    private javax.swing.JButton HafizRamadhan_SearchButton;
    private javax.swing.JButton HafizRamadhan_Simpan;
    private javax.swing.JTable HafizRamadhan_TableSiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}