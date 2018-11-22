package gamelagu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class cek_skor extends javax.swing.JFrame {

    Koneksi connec = new Koneksi();
    ResultSet rs = null;
    Statement st;
    Connection conn;
    public static int transfer_skor;
    public static String transfer_nama;
    public static int penampung_skor[] = tampung_skor.penampung_skor;
    public static String penampung_nama[] = tampung_skor.penampung_nama;

    public cek_skor(int skor) {
        initComponents();
        transfer_nama = MenuNama.Nama;//transfer nama
        transfer_skor = game1.skored;//transfer skor
        sorting_deskending();//sorting skor
        score.setText(String.valueOf(skor));//untuk menampilkan skor
        score2.setText(String.valueOf(game1.skored));
        nama.setText(MenuNama.Nama);// untuk menampilkan nama

//        String isi = "INSERT INTO `skor`(`no`, `nama`, `skor`) VALUES (null,'" + nama + "','" + "')";
        String isi = "INSERT INTO `user` (`ID`, `Nama`) VALUES (null,'" + nama.getText() + "' )";
        try {
            st = connec.getKoneksi().createStatement();
            st.execute(isi);
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Kesalahan : " + e, "Bug!", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void sorting_deskending() {

        if (transfer_skor > penampung_skor[4]) {
            penampung_skor[4] = transfer_skor;
            penampung_nama[4] = transfer_nama;
            int temp = 0;
            String Temp;
            for (int i = 0; i < penampung_skor.length - 1; i++) {
                for (int j = 0; j < penampung_skor.length - i - 1; j++) {
                    if (penampung_skor[j + 1] > penampung_skor[j]) {
                        temp = penampung_skor[j];
                        Temp = penampung_nama[j];
                        penampung_skor[j] = penampung_skor[j + 1];
                        penampung_nama[j] = penampung_nama[j + 1];
                        penampung_skor[j + 1] = temp;
                        penampung_nama[j + 1] = Temp;
                    }
                }
            }
        }
    }// untuk sorting skor bublesort

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        nama = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        score2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gbr/back1.png"))); // NOI18N
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 40));

        nama.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        nama.setText("NAMA : ");
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 460, 90));

        score.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        score.setText("SKOR : ");
        getContentPane().add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 470, 100));

        score2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        score2.setText("SKOR : ");
        getContentPane().add(score2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 470, 100));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gbr/Interface/Desain icon/main.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new MenuAwal().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(cek_skor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cek_skor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cek_skor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cek_skor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new cek_skor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel score;
    private javax.swing.JLabel score2;
    // End of variables declaration//GEN-END:variables
}
