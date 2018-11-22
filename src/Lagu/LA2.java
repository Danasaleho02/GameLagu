//
//import com.sun.istack.internal.logging.Logger;
package Lagu;

import com.sun.istack.internal.logging.Logger;
import gamelagu.MenuAwal;
import gamelagu.MenuKategori;
import gamelagu.game1;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class LA2 extends javax.swing.JFrame {

    public static int indexScore;

    boolean cek = false;
    public static int nilainya = 0;
    String LaguAnak[] = {"Naik Naik ke Puncak Gunung"};
    

    int nyawa1 = 3;
    String jawab;
    String kata[];
    int acuhan = 0, skor;
    String nama;

    public void pilihan(int Kategori, int Tingkatan) {

      

    }

    public void nama(String namanya) {
        nama = namanya;
        this.name.setText(nama);
    }

    public LA2() {
        initComponents();

    }

    public void acak(int x) {
        char awal[] = kata[x].toCharArray();
        for (int i = 0; i < awal.length; i++) {
            for (int j = 0; j < awal.length - 1; j++) {
                if (awal[j] > awal[j + 1]) {
                    char temp = awal[j];
                    awal[j] = awal[j + 1];
                    awal[j + 1] = temp;
                }
            }
        }
        this.check.setEnabled(true);
        this.jawaban.requestFocus(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selanjutnya = new javax.swing.JButton();
        check = new javax.swing.JButton();
        jawaban = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();
        lbla = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        kategori = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        nilai = new javax.swing.JLabel();
        nyawa = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lagu2 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selanjutnya.setText("next");
        selanjutnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selanjutnyaActionPerformed(evt);
            }
        });
        getContentPane().add(selanjutnya, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

        check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gbr/button check1.png"))); // NOI18N
        check.setBorderPainted(false);
        check.setContentAreaFilled(false);
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        getContentPane().add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 140, 30));

        jawaban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jawabanActionPerformed(evt);
            }
        });
        getContentPane().add(jawaban, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 460, 30));

        hasil.setColumns(20);
        hasil.setRows(5);
        jScrollPane1.setViewportView(hasil);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 170, 60));

        lbla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gbr/sound logo.png"))); // NOI18N
        lbla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblaMouseClicked(evt);
            }
        });
        getContentPane().add(lbla, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gbr/soal tebaklagu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 210, 80));
        getContentPane().add(kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 30));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 190, 30));

        nilai.setText("nilai      : 0");
        getContentPane().add(nilai, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 90, 30));

        nyawa.setText("nyawa : 3");
        getContentPane().add(nyawa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 80, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gbr/back1.png"))); // NOI18N
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 222, 310, 10));

        lagu2.setText("Lagu 2");
        lagu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lagu2ActionPerformed(evt);
            }
        });
        getContentPane().add(lagu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 70, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gbr/Interface/Desain icon/main.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 420));

        setBounds(300, 170, 685, 460);
    }// </editor-fold>//GEN-END:initComponents

    private void jawabanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jawabanActionPerformed

    }//GEN-LAST:event_jawabanActionPerformed

    private void selanjutnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selanjutnyaActionPerformed
        acuhan++;
//
//        this.jawaban.setEditable(true);
//        this.jawaban.setText(null);
//        this.hasil.setText(null);
        JOptionPane.showMessageDialog(this, "Nilai anda " + skor);
        new game1().setVisible(true);
        dispose();
    }//GEN-LAST:event_selanjutnyaActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        jawab = jawaban.getText();
        if (jawab.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Jawaban tidak boleh kosong", "WARNING", JOptionPane.INFORMATION_MESSAGE);
            jawaban.requestFocus();
        } else if (jawab.length() > 40) {
            JOptionPane.showMessageDialog(this, "Jawaban Terlalu Panjang", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else if (jawab.length() < 2) {
            JOptionPane.showMessageDialog(this, "Jawaban Terlalu Pendek", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else if (jawab.equalsIgnoreCase(LaguAnak[0])) {
            JOptionPane.showMessageDialog(this, "Jawaban Kamu Benar", "BENAR", JOptionPane.INFORMATION_MESSAGE);
            skor += 10;
            
            this.nyawa.setText("Nyawa :" + nyawa1);
            this.nilai.setText("Nilai : " + skor);
            JOptionPane.showMessageDialog(this, "Nilai Kamu adalah 20", "BENAR", JOptionPane.INFORMATION_MESSAGE);
            new LA3().setVisible(true);
            dispose();
        } else {
//            skor -= 5;
            JOptionPane.showMessageDialog(this, "Jawaban Kamu Salah", "SALAH", JOptionPane.INFORMATION_MESSAGE);
            this.nyawa.setText("Nyawa :" + LA1.nyawa1);
            nyawa1 -= 1;
            if (nyawa1 == -1) {
                JOptionPane.showMessageDialog(this, "Nyawa Kamu sudah habis", "GAME OVER", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(this, "Nilai anda " + skor);
                new MenuAwal().setVisible(true);
                dispose();
                
            }
            this.hasil.setText("Jawaban Kamu Salah");
            this.nilai.setText("Nilai : " + skor);
        }

        if (acuhan == kata.length) {
            //this.selanjutnya.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Nilai anda " + skor);
            this.dispose();
        } else {
            this.selanjutnya.setEnabled(true);
        }
        this.check.setEnabled(false);
        this.jawaban.setEditable(false);

    }//GEN-LAST:event_checkActionPerformed

    private void lblaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblaMouseClicked

    }//GEN-LAST:event_lblaMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new MenuKategori().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void lagu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lagu2ActionPerformed
        InputStream music;
        this.lagu2.setEnabled(true);
        try {
            JFXPanel j = new JFXPanel();
            String uri = new File("src\\music\\A2.mp3").toURI().toString();
            new MediaPlayer(new Media(uri)).play();

//            music = new FileInputStream(new File("src\\music\\Perahu Layar.wav"));
//            AudioStream audios = new AudioStream(music);
//            AudioPlayer.player.start(audios);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
    }//GEN-LAST:event_lagu2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LA2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel bg;
    private javax.swing.JButton check;
    private javax.swing.JTextArea hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jawaban;
    private javax.swing.JLabel kategori;
    private javax.swing.JButton lagu2;
    private javax.swing.JLabel lbla;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nilai;
    private javax.swing.JLabel nyawa;
    private javax.swing.JButton selanjutnya;
    // End of variables declaration//GEN-END:variables

}
