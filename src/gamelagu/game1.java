/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelagu;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Random;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author windows
 */
public class game1 extends javax.swing.JFrame {

    int nyawa1 = 3;
    int acuhan = 0, skoring;
    public int acak;
    public String jawaban[] = {
        "anang ardiansyah",
        "aziz sattar",
        "benny korda",
        "helen sparingga",
        "ibu sud",
        "nurseha",
        "rinto",
        "sambas mangundikarta",
        "sunan giri",
        "sunan kalijaga"};
    public String tampung;
    public static int skored = 0;
//    public int tampung_detik = 15;
    public byte nomer = 0;
    InputStream music;

    public ImageIcon[] Matriks() {
        ImageIcon[] matriks = new ImageIcon[10];
        for (int i = 0; i < matriks.length; i++) {
            matriks[i] = new ImageIcon(getClass().getResource("/gbr/Penciptalagu/" + i + ".jpg"));
        }
//        cek_skor cek_skor = new cek_skor(skor);
//        Skor Skor = new Skor(skor);
        return matriks;
    }

    public ImageIcon[] soal = Matriks();

    public void random() {
        nomer++;
        Random rand = new Random();
        do {
            acak = rand.nextInt(10);
        } while (jawaban[acak].equals("0"));
        jawaban[acak] = "0";
        tampil_soal.setIcon(soal[acak]);
//        tampung_detik = 15;

    }

    public void searching() {

        for (int i = 0; i < jawaban.length; i++) {
            if (jawaban[i].equalsIgnoreCase(tampung)) {
                if (tampung.equalsIgnoreCase(jawaban[acak])) {
                    skoring += 10;
                }
                Masukkanjawaban.setText("");
            }
        }

    }
//    public Timer waktu;
//    int sisa = 15;

    public game1() {
        initComponents();
        skoring = 0;
        this.setLocationRelativeTo(this);
//        waktu = new Timer(1000, this);//inisialisasi waktu mencapai 1000ms, akan melakukan actionPeformed
//        waktu.start();
        random();
    }

//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == waktu) {
//            this.time.setText(String.valueOf(sisa));
//            sisa--;
//            if (sisa == -1) {
//                random();
//                sisa = 15;
//
//            }
//        }
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Masukkanjawaban = new javax.swing.JTextField();
        check = new javax.swing.JButton();
        tampil_soal = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        nilaiskor = new javax.swing.JLabel();
        nyawa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Masukkanjawaban, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 460, 30));

        check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gbr/button check1.png"))); // NOI18N
        check.setBorderPainted(false);
        check.setContentAreaFilled(false);
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        getContentPane().add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 160, 30));
        getContentPane().add(tampil_soal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 440, 170));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gbr/back1.png"))); // NOI18N
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 40));

        jButton1.setText("skip");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        nilaiskor.setText("Skor: 0");
        getContentPane().add(nilaiskor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 160, 30));

        nyawa.setText("Nyawa: 3");
        getContentPane().add(nyawa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 24, 160, 20));

        jLabel1.setFont(new java.awt.Font("Stencil Std", 1, 24)); // NOI18N
        jLabel1.setText("TEBAK SIAPA NAMA PENCIPTA DIBAWAH INI?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 600, 30));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gbr/Interface/Desain icon/main.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 420));

        setBounds(300, 170, 677, 456);
    }// </editor-fold>//GEN-END:initComponents

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        tampung = Masukkanjawaban.getText();
        searching();
        if (nomer == 10) {

            JOptionPane.showMessageDialog(this, "Permainan anda selesai");
            JOptionPane.showMessageDialog(this, "Nama Anda: " + MenuNama.Nama);
            JOptionPane.showMessageDialog(this, "Nilai anda " + skoring);
//            new cek_skor(skored).setVisible(true);
//            new Skor(skor).setVisible(true);
//            new Main().setVisible(true);
              new MenuAwal().setVisible(true);
//            waktu.stop();
            this.dispose();
        } else {

            if (tampung.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Jawaban Tidak Boleh Kosong", "WARNING", JOptionPane.INFORMATION_MESSAGE);
            } else if (tampung.length() > 25) {
                JOptionPane.showMessageDialog(this, "Jawaban Terlalu Panjang", "WARNING", JOptionPane.WARNING_MESSAGE);
            } else if (tampung.length() < 2) {
                JOptionPane.showMessageDialog(this, "Jawaban Terlalu Pendek", "WARNING", JOptionPane.WARNING_MESSAGE);
            } else if (tampung.equalsIgnoreCase(jawaban[0])) {
                JOptionPane.showMessageDialog(this, "Jawaban Kamu Benar", "BENAR", JOptionPane.INFORMATION_MESSAGE);
                random();
                skoring += 10;
                this.nyawa.setText("Nyawa :" + nyawa1);
                this.nilaiskor.setText("Nilai : " + skoring);
            } else if (tampung.equalsIgnoreCase(jawaban[1])) {
                JOptionPane.showMessageDialog(this, "Jawaban Kamu Benar", "BENAR", JOptionPane.INFORMATION_MESSAGE);
                random();
                skoring += 10;
                this.nyawa.setText("Nyawa :" + nyawa1);
                this.nilaiskor.setText("Nilai : " + skoring);
            } else if (tampung.equalsIgnoreCase(jawaban[2])) {
                JOptionPane.showMessageDialog(this, "Jawaban Kamu Benar", "BENAR", JOptionPane.INFORMATION_MESSAGE);
                random();
                skoring += 10;
                this.nyawa.setText("Nyawa :" + nyawa1);
                this.nilaiskor.setText("Nilai : " + skoring);
            } else if (tampung.equalsIgnoreCase(jawaban[3])) {
                JOptionPane.showMessageDialog(this, "Jawaban Kamu Benar", "BENAR", JOptionPane.INFORMATION_MESSAGE);
                random();
                skoring += 10;
                this.nyawa.setText("Nyawa :" + nyawa1);
                this.nilaiskor.setText("Nilai : " + skoring);
            } else if (tampung.equalsIgnoreCase(jawaban[4])) {
                JOptionPane.showMessageDialog(this, "Jawaban Kamu Benar", "BENAR", JOptionPane.INFORMATION_MESSAGE);
                random();
                skoring += 10;
                this.nyawa.setText("Nyawa :" + nyawa1);
                this.nilaiskor.setText("Nilai : " + skoring);
            } else if (tampung.equalsIgnoreCase(jawaban[5])) {
                JOptionPane.showMessageDialog(this, "Jawaban Kamu Benar", "BENAR", JOptionPane.INFORMATION_MESSAGE);
                random();
                skoring += 10;
                this.nyawa.setText("Nyawa :" + nyawa1);
                this.nilaiskor.setText("Nilai : " + skoring);
            } else if (tampung.equalsIgnoreCase(jawaban[6])) {
                JOptionPane.showMessageDialog(this, "Jawaban Kamu Benar", "BENAR", JOptionPane.INFORMATION_MESSAGE);
                random();
                skoring += 10;
                this.nyawa.setText("Nyawa :" + nyawa1);
                this.nilaiskor.setText("Nilai : " + skoring);
            } else if (tampung.equalsIgnoreCase(jawaban[7])) {
                JOptionPane.showMessageDialog(this, "Jawaban Kamu Benar", "BENAR", JOptionPane.INFORMATION_MESSAGE);
                random();
                skoring += 10;
                this.nyawa.setText("Nyawa :" + nyawa1);
                this.nilaiskor.setText("Nilai : " + skoring);
            } else if (tampung.equalsIgnoreCase(jawaban[8])) {
                JOptionPane.showMessageDialog(this, "Jawaban Kamu Benar", "BENAR", JOptionPane.INFORMATION_MESSAGE);
                random();
                skoring += 10;
                this.nyawa.setText("Nyawa :" + nyawa1);
                this.nilaiskor.setText("Nilai : " + skoring);
            } else if (tampung.equalsIgnoreCase(jawaban[9])) {
                JOptionPane.showMessageDialog(this, "Jawaban Kamu Benar", "BENAR", JOptionPane.INFORMATION_MESSAGE);
                random();
                skoring += 10;
                this.nyawa.setText("Nyawa :" + nyawa1);
                this.nilaiskor.setText("Nilai : " + skoring);
            } else {
//                sisa = 15;
                this.nyawa.setText("Nyawa :" + nyawa1);
                this.nilaiskor.setText("Nilai : " + skoring);
                JOptionPane.showMessageDialog(this, "Jawaban Kamu Salah", "WARNING", JOptionPane.INFORMATION_MESSAGE);
//                skoring -= 5;
                nyawa1 -= 1;
                if (nyawa1 == -1) {
                    JOptionPane.showMessageDialog(this, "Permainan anda selesai");
                    JOptionPane.showMessageDialog(this, "Nama Anda" + MenuNama.Nama);
                    JOptionPane.showMessageDialog(this, "Nilai anda " + skoring);
                    new cek_skor(skored).setVisible(true);

//                    new MenuAwal().setVisible(true);
                    dispose();
                }
//                random();
                Masukkanjawaban.setText("");

            }
        }
    }//GEN-LAST:event_checkActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new MenuAwal().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        sisa = 15;
        if (nomer == 10) {
//            waktu.stop();
//            new Skor(skor).setVisible(true);
//            new Skor(skor).setVisible(true);
//            new Main().setVisible(true);
            JOptionPane.showMessageDialog(this, "Permainan anda selesai");
            JOptionPane.showMessageDialog(this, "Nama Anda: " + MenuNama.Nama);
            JOptionPane.showMessageDialog(this, "Nilai anda " + skoring);
//            new cek_skor(skored).setVisible(true);
            new MenuAwal().setVisible(true);
            this.dispose();
        } else {
            random();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Masukkanjawaban;
    private javax.swing.JButton back;
    private javax.swing.JLabel bg;
    private javax.swing.JButton check;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nilaiskor;
    private javax.swing.JLabel nyawa;
    private javax.swing.JLabel tampil_soal;
    // End of variables declaration//GEN-END:variables
}
