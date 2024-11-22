
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.Document;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class appCatatanHarian extends javax.swing.JFrame {
    private ArrayList<Catatan> daftarCatatan = new ArrayList<>();
    private DefaultListModel<Catatan> listModel ;
    /**
     * Creates new form appCatatanHarian
     */
    public appCatatanHarian() {
  
        initComponents();
        listModel = new DefaultListModel<>(); // Initialize the list model
        listCatatan.setModel(listModel); 
        resetField();
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
        JudulText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaKonten = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listCatatan = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tanggalText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Judul :");

        JudulText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JudulTextActionPerformed(evt);
            }
        });

        areaKonten.setColumns(20);
        areaKonten.setRows(5);
        jScrollPane1.setViewportView(areaKonten);

        jLabel2.setText("Tulis Catatan :");

        jScrollPane2.setViewportView(listCatatan);

        jButton1.setText("tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ubah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("export txt");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("import txt");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("export csv");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("import csv");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("keluar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel3.setText("tulis tanggal  hari ini :");

        tanggalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(JudulText))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tanggalText, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(147, 147, 147)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7)))
                        .addGap(0, 17, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(JudulText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel2)))))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tanggalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JudulTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JudulTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JudulTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         tambahCatatan();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ubahCatatan();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        hapusCatatan();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        eksporKeFileTxt();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        imporDariFileTxt();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        eksporKeFileCsv();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        imporDariFileCsv();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tanggalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalTextActionPerformed
    private void tambahCatatan() {
                String judul = JudulText.getText();
            String konten = areaKonten.getText();
            String tanggal = tanggalText.getText();

            if (judul.isEmpty() || konten.isEmpty() || tanggal.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Judul, konten, dan tanggal harus diisi!");
                return;
            }

            if (!isValidDate(tanggal)) {
                JOptionPane.showMessageDialog(this, "Format tanggal salah. Gunakan format dd-MM-yyyy.");
                return;
    }

                Catatan baru = new Catatan(judul, konten, tanggal);
                listModel.addElement(baru);
                daftarCatatan.add(baru);
                resetField();
    }
  private void ubahCatatan() {
                int index = listCatatan.getSelectedIndex();
           if (index != -1) {
               Catatan catatan = daftarCatatan.get(index);
               String tanggal = tanggalText.getText();

               if (!isValidDate(tanggal)) {
                   JOptionPane.showMessageDialog(this, "Format tanggal salah. Gunakan format dd-MM-yyyy.");
                   return;
               }

               catatan.setJudul(JudulText.getText());
               catatan.setKonten(areaKonten.getText());
               catatan.setTanggal(tanggal);
               listModel.set(index, catatan);
               JOptionPane.showMessageDialog(this, "Catatan berhasil diubah!");
           } else {
               JOptionPane.showMessageDialog(this, "Pilih catatan yang ingin diubah!");
           }
    }
  private void hapusCatatan() {
        int index = listCatatan.getSelectedIndex();
        if (index != -1) {
            listModel.remove(index);
            daftarCatatan.remove(index);
            resetField();
        } else {
            JOptionPane.showMessageDialog(this, "Pilih catatan yang ingin dihapus!");
        }
    }
   private void eksporKeFileTxt() {
        if (daftarCatatan.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tidak ada catatan untuk diekspor!");
            return;
        }

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Pilih lokasi untuk menyimpan file");
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile() + ".txt"))) {
                for (Catatan catatan : daftarCatatan) {
                    writer.write("Judul: " + catatan.getJudul() + "\n");
                    writer.write("Tanggal: " + catatan.getTanggal() + "\n");
                    writer.write("Konten: " + catatan.getKonten() + "\n");
                    writer.write("=========================================\n");
                }
                JOptionPane.showMessageDialog(this, "Catatan berhasil diekspor ke file .txt!");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menulis file: " + e.getMessage());
            }
        }
    }
   private void imporDariFileTxt() {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Pilih file .txt untuk diimpor");
    int userSelection = fileChooser.showOpenDialog(this);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        try (Scanner scanner = new Scanner(fileChooser.getSelectedFile())) {
            while (scanner.hasNextLine()) {
                String judul = scanner.nextLine().replace("Judul: ", "");
                String tanggal = scanner.nextLine().replace("Tanggal: ", "");
                String konten = scanner.nextLine().replace("Konten: ", "");
                scanner.nextLine(); // Abaikan garis pemisah
                Catatan catatan = new Catatan(judul, konten, tanggal);
                listModel.addElement(catatan);
                daftarCatatan.add(catatan);
            }
            JOptionPane.showMessageDialog(this, "Data berhasil diimpor dari file .txt!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}
   private void eksporKeFileCsv() {
    if (daftarCatatan.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Tidak ada catatan untuk diekspor!");
        return;
    }

    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Pilih lokasi untuk menyimpan file");
    int userSelection = fileChooser.showSaveDialog(this);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile() + ".csv"))) {
            writer.write("Judul,Tanggal,Konten\n");
            for (Catatan catatan : daftarCatatan) {
                writer.write(catatan.getJudul() + "," + catatan.getTanggal() + "," + catatan.getKonten() + "\n");
            }
            JOptionPane.showMessageDialog(this, "Catatan berhasil diekspor ke file .csv!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menulis file: " + e.getMessage());
        }
    }
}
   private void imporDariFileCsv() {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Pilih file .csv untuk diimpor");
    int userSelection = fileChooser.showOpenDialog(this);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        try (Scanner scanner = new Scanner(fileChooser.getSelectedFile())) {
            scanner.nextLine(); // Abaikan header
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                Catatan catatan = new Catatan(data[0], data[2], data[1]);
                listModel.addElement(catatan);
                daftarCatatan.add(catatan);
            }
            JOptionPane.showMessageDialog(this, "Data berhasil diimpor dari file .csv!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}
  private void tampilkanCatatan() {
            int index = listCatatan.getSelectedIndex();
         if (index != -1) {
             Catatan terpilih = daftarCatatan.get(index);
             JudulText.setText(terpilih.getJudul());
             areaKonten.setText(terpilih.getKonten());
             tanggalText.setText(terpilih.getTanggal());
         }
    }
  
  private void resetField() {
            JudulText.setText("");
            areaKonten.setText("");
            tanggalText.setText("");
    }
    private boolean isToday(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date).equals(sdf.format(new Date()));
    }
   private boolean isValidDate(String date) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    sdf.setLenient(false);
    try {
        sdf.parse(date);
        return true;
    } catch (Exception e) {
        return false;
    }
}
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
            java.util.logging.Logger.getLogger(appCatatanHarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appCatatanHarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appCatatanHarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appCatatanHarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appCatatanHarian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JudulText;
    private javax.swing.JTextArea areaKonten;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listCatatan;
    private javax.swing.JTextField tanggalText;
    // End of variables declaration//GEN-END:variables
}
