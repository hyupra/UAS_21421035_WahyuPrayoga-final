/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tabledark;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hard
 */
public class koneksi {
        private static Connection KoneksiDatabase;
    public static Connection koneksikeDB() throws SQLException {
        try{
            String DB ="jdbc:mysql://localhost/uas_perpustakaan";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
       KoneksiDatabase = (Connection) DriverManager.getConnection(DB, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tidak ada koneksi", "Eror",
            JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return KoneksiDatabase;
    }
    
    
}

