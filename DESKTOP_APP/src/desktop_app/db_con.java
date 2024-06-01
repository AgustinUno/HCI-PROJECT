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
public class db_con {
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname  = "admin_info";
    private static Integer portnumber  = 3306;
    private static String password = "";
    
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
            Logger.getLogger(db_con.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection Failed");
        }
        
        
        return cnx;
    }
}
