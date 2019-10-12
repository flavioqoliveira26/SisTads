
package model;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
    
    Connection con;
    
    public Connection getConnection(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SisTads","root","root");
        }
        catch (Exception e) {
        
        }
        
        return con;
    }
    
}
