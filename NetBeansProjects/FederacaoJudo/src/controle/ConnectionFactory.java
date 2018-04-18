/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
    
    ResultSet rs = null;
    private static Statement stmt = null;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://192.168.2.107:3306/db_judo";
    private static final String USER = "root";
    private static final String SENHA = "12345";
    
    public static Connection getConnection(){
        
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, "root", "12345");
        } catch (Exception ex) {
            throw new RuntimeException("Erro na conexão!", ex);
        }
    }
    
    public static void closeConection(Connection con){
        
        
            try {
                if(con!=null){
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    public static void closeConection(Connection con, PreparedStatement stmt){
        
        closeConection(con);
        
            try {
                if(stmt!=null){
                    stmt.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    public static void closeConection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        closeConection(con, stmt);
        
            try {
                if(rs!=null){
                    rs.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
     
}

