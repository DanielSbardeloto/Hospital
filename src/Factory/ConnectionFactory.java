/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daniel S
 */
public class ConnectionFactory {
    
    public static Connection getConnection() throws SQLException {
        Connection cone = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/Banco"); 
        return cone;
        
    }
   
}
    
