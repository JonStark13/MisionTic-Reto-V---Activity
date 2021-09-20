/**
 *
 * @author dafpa
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectionDB {
    
    public static Connection conectarBD(){
        String dbURL = "jdbc:mysql://localhost:3306/retoiv";
        String username = "root";
        String password = "EsJuana0322(";
        
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);             
        if(conn!=null){
            System.out.println("CONECTADO");
        }
        return conn;
        }catch(SQLException ex){
             ex.printStackTrace();
        }
        return null;
    }
    
    
}
