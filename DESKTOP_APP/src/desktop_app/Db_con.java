package desktop_app;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Main
 */
public class Db_con {
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname  = "admin_info";
    private static Integer portnumber  = 3306;
    private static String password = "";//3543
    
    public static java.sql.Connection getConnection(){
        java.sql.Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            cnx = datasource.getConnection();
            System.out.println("Connected Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(Db_con.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection Failed");
        }
        
        
        return cnx;
    }
}

/*
NOTES FOR SERVER ACCESS:
CURRENTLY SET FOR STATIC IP 192.168.0.101
       //maybe port listening also at localhost idk 127.0.0.0

REMOTE ACCESS CREDENTIALS ARE
mysql -u remote_user -h 192.168.0.101 -P 3306 -p
pass: password

replace 192.168.0.101 with 127.0.0.0 for testing

localhost = ""
192.168.0.101 = 3543

CHANGE LISTENING IP
479  netstat -tuln | grep 3306
480  sudo nano /opt/lampp/etc/my.cnf
reboot after

*/