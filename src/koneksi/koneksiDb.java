
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksiDb {
    Connection dbConn;
    
    public static Connection dbConn() {
        try {
            Connection dbConn = DriverManager.getConnection("jdbc:mysql://localhost/gudang", "root", "");
            
            return dbConn;
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            
            return null;
        }
    }
}
