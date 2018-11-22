/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelagu;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author windows
 */
public class Database {

    Koneksi connec = new Koneksi();
    Statement stm;
    ResultSet rs;

    public DefaultTableModel lihatTabel() {
        String getContent = "SELECT `Nama`, `skor` FROM `skor` ORDER BY skor DESC LIMIT 10";
        Object header[] = {"Nama", "Skor"};
        DefaultTableModel TableData = new DefaultTableModel(null, header) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        try {
            stm = connec.getKoneksi().createStatement();
            rs = stm.executeQuery(getContent);
            while (rs.next()) {
                String Data[] = {rs.getString(1), rs.getString(2)};
                TableData.addRow(Data);
            }
            rs.close();
            stm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Kesalahan : " + e, "Bug!", JOptionPane.INFORMATION_MESSAGE);
        } finally {
            return TableData;
        }
    }

    public void isiTable(JTextField nama) {
        String isi = "INSERT INTO `skor`(`no`, `nama`, `skor`) VALUES (null,'" + nama + "','" + "')";
        try {
            stm = connec.getKoneksi().createStatement();
            stm.execute(isi);
            stm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Kesalahan : " + e, "Bug!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    
}
