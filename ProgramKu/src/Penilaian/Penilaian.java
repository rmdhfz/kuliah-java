/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Penilaian;

/**
 *
 * @author mdm
 */
public class Penilaian extends javax.swing.JFrame {

    /**
     * Creates new form Penilaian
     */
    public Penilaian() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LabelNamaLengkap = new javax.swing.JLabel();
        NamaLengkap = new javax.swing.JTextField();
        LabelUTS = new javax.swing.JLabel();
        NilaiUTS = new javax.swing.JTextField();
        LabelNilaiTugasMandiri = new javax.swing.JLabel();
        NilaiTugasMandiri = new javax.swing.JTextField();
        LabelNilaiTugasMandiri1 = new javax.swing.JLabel();
        NilaiUAS = new javax.swing.JTextField();
        ButtonHitung = new javax.swing.JButton();
        ButtonBersih = new javax.swing.JButton();
        ButtonSimpan = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        HasilNamaLengkap = new javax.swing.JLabel();
        HasilNilaiRataRata = new javax.swing.JLabel();
        HasilGrade = new javax.swing.JLabel();
        HasilKeterangan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PENILAIAN MAHASISWA");

        LabelNamaLengkap.setText("Nama Lengkap");

        LabelUTS.setText("Nilai UTS");

        NilaiUTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NilaiUTSActionPerformed(evt);
            }
        });

        LabelNilaiTugasMandiri.setText("Nilai Tugas Mandiri");

        NilaiTugasMandiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NilaiTugasMandiriActionPerformed(evt);
            }
        });

        LabelNilaiTugasMandiri1.setText("Nilai UAS");

        NilaiUAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NilaiUASActionPerformed(evt);
            }
        });

        ButtonHitung.setText("Hitung");
        ButtonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHitungActionPerformed(evt);
            }
        });

        ButtonBersih.setText("Bersih");
        ButtonBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBersihActionPerformed(evt);
            }
        });

        ButtonSimpan.setText("Simpan");
        ButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSimpanActionPerformed(evt);
            }
        });

        jButton1.setText("Kembali");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNamaLengkap)
                            .addComponent(LabelUTS)
                            .addComponent(LabelNilaiTugasMandiri)
                            .addComponent(LabelNilaiTugasMandiri1)
                            .addComponent(jButton1))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonBersih)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonHitung)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonSimpan))
                            .addComponent(NamaLengkap, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NilaiUTS, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NilaiTugasMandiri)
                            .addComponent(NilaiUAS))))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNamaLengkap)
                    .addComponent(NamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUTS)
                    .addComponent(NilaiUTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NilaiTugasMandiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNilaiTugasMandiri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NilaiUAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNilaiTugasMandiri1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonHitung)
                    .addComponent(ButtonBersih)
                    .addComponent(ButtonSimpan)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Hasil Perhitungan");

        HasilNamaLengkap.setText("Nama Lengkap");

        HasilNilaiRataRata.setText("Nilai Rata-rata");

        HasilGrade.setText("Grade");

        HasilKeterangan.setText("Keterangan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HasilNamaLengkap)
                            .addComponent(HasilNilaiRataRata)
                            .addComponent(HasilGrade)
                            .addComponent(HasilKeterangan)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(HasilNamaLengkap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HasilNilaiRataRata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HasilGrade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HasilKeterangan)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NilaiUTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NilaiUTSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NilaiUTSActionPerformed

    private void NilaiTugasMandiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NilaiTugasMandiriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NilaiTugasMandiriActionPerformed

    private void NilaiUASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NilaiUASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NilaiUASActionPerformed

    private void ButtonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHitungActionPerformed

        String Nama_Lengkap = NamaLengkap.getText();
        Double Nilai_UTS = Double.parseDouble(NilaiUTS.getText());
        Double Nilai_Tugas_Mandiri = Double.parseDouble(NilaiTugasMandiri.getText());
        Double Nilai_UAS = Double.parseDouble(NilaiUAS.getText());
        Double Nilai_Rata_Rata = Nilai_UTS + Nilai_Tugas_Mandiri + Nilai_UAS / 3;
        
        HasilNamaLengkap.setText("Nama Lengkap: " + Nama_Lengkap);
        HasilNilaiRataRata.setText("Nilai Rata-rata: " + Double.toString(Nilai_Rata_Rata));
        
        String Grade, Keterangan;
        if (Nilai_Rata_Rata >= 80){
            Grade = "A";
            Keterangan = "Selamat "+ Nama_Lengkap +", anda lulus dengan sangat baik!";
        }else if(Nilai_Rata_Rata >= 70){
            Grade = "B";
            Keterangan = "Selamat "+ Nama_Lengkap +", anda lulus dengan baik!";
        }else if(Nilai_Rata_Rata >= 60){
            Grade = "C";
            Keterangan = "Selamat "+ Nama_Lengkap +", anda lulus dengan cukup baik";
        }else if(Nilai_Rata_Rata >= 50){
            Grade = "D";
            Keterangan = "Maaf "+ Nama_Lengkap +", nilai anda belum memenuhi syarat kelulusan.";
        }else{
            Grade = "E";
            Keterangan = "Maaf "+ Nama_Lengkap +", anda tidak lulus dan harus mengulang";
        }
        HasilGrade.setText("Grade: " + Grade);
        HasilKeterangan.setText("Keterangan: " + Keterangan);
    }//GEN-LAST:event_ButtonHitungActionPerformed

    private void ButtonBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBersihActionPerformed
       NamaLengkap.setText(""); NamaLengkap.requestFocus();
       NilaiUTS.setText("");
       NilaiTugasMandiri.setText("");
       NilaiUAS.setText("");
       HasilNamaLengkap.setText("Nama Lengkap: ");
       HasilNilaiRataRata.setText("Nilai Rata-rata: ");
       HasilGrade.setText("Grade: ");
       HasilKeterangan.setText("Keterangan: ");
    }//GEN-LAST:event_ButtonBersihActionPerformed

    private void ButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSimpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(Penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penilaian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBersih;
    private javax.swing.JButton ButtonHitung;
    private javax.swing.JButton ButtonSimpan;
    private javax.swing.JLabel HasilGrade;
    private javax.swing.JLabel HasilKeterangan;
    private javax.swing.JLabel HasilNamaLengkap;
    private javax.swing.JLabel HasilNilaiRataRata;
    private javax.swing.JLabel LabelNamaLengkap;
    private javax.swing.JLabel LabelNilaiTugasMandiri;
    private javax.swing.JLabel LabelNilaiTugasMandiri1;
    private javax.swing.JLabel LabelUTS;
    private javax.swing.JTextField NamaLengkap;
    private javax.swing.JTextField NilaiTugasMandiri;
    private javax.swing.JTextField NilaiUAS;
    private javax.swing.JTextField NilaiUTS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
