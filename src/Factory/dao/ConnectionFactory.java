package Factory.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daniel S
 */
public class ConnectionFactory {
    
    public static Connection getConnection() throws SQLException {
        Connection cone =  DriverManager.getConnection("jdbc:derby://localhost:1527/Dados", "Paciente", "hospital"); 
        return cone;
        
    }
   
}
    
