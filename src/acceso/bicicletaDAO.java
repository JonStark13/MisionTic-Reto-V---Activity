/**
 *
 * @author dafpa
 */ 
package acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Bicicleta;

public class bicicletaDAO {
    
    // CREATE
    public static boolean createCicla(Connection conn, Bicicleta bicicleta){
        int filasAfectadas = 0;
        String sql = "INSERT INTO bicicleta(bic_id, bic_marco) VALUES "
                + "(?, ?)";
        
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, bicicleta.getBicId());
            statement.setString(2, bicicleta.getBicMarco());
            filasAfectadas = statement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("ERROR SQL CREACION");
            ex.printStackTrace();
        }
        if(filasAfectadas>0){
            return true; 
        }else{
            return false;
        }
}
    //UPDATE
        public static boolean updateCicla(Connection conn, Bicicleta bicicleta){
            int filasAfectadas = 0;
            String sql = "UPDATE bicicleta SET bic_marco=? WHERE bic_id=?" ;
            
            try {
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, bicicleta.getBicMarco());
                statement.setInt(2, bicicleta.getBicId());
                filasAfectadas = statement.executeUpdate();
                
            } catch (SQLException ex) {
             System.out.println("ERROR SQL ACTUALIZACION");
             ex.printStackTrace();
        }
        
        if(filasAfectadas>0){
            return true; 
        }else{
            return false;
        }
        }
        
    // DELETE
        public static boolean deleteCicla(Connection conn, int id){
            int filasAfectadas = 0;
            String sql = "DELETE FROM bicicleta WHERE bic_id=?";
            
            try {
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setInt(1, id);
                filasAfectadas = statement.executeUpdate();
                
            } catch (SQLException ex) {
             System.out.println("ERROR SQL ELIMINAR");
             ex.printStackTrace();
            }
             
            if(filasAfectadas>0){
                return true; 
            }else{
                return false;}
            }
        
        // READ
        public static ArrayList<Bicicleta> readCicla(Connection conn){
            ArrayList<Bicicleta> listaCicla = new ArrayList<>();
            
            try {
                String sql = "SELECT bic_id, bic_marco FROM bicicleta";
                PreparedStatement statement = conn.prepareStatement(sql);
                ResultSet resultado = statement.executeQuery();
                
                while(resultado.next()){
                    int id = resultado.getInt(1);
                    String marco= resultado.getString(2);
                    
                    Bicicleta bicicleta = new Bicicleta(id, marco);
                    listaCicla.add(bicicleta);
                }
            } catch (SQLException ex) {
             System.out.println("ERROR SQL CONSULTA");
             ex.printStackTrace();
        }
        return listaCicla;
        }
}
