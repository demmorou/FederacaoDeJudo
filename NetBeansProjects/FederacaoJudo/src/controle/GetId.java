package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author deusimar
 */
public class GetId {
    
    public int getIDPEssoa(String cpf) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int i = 0;
        
        try {
            stmt = con.prepareStatement("SELECT Id_pessoa FROM pessoa WHERE cpf='"+cpf+"'");
            rs = stmt.executeQuery();

            while (rs.next()){
                i = rs.getInt("Id_pessoa");
            }
        } catch (SQLException ex) {
            return -1;
        }

        return i;
    }
    
    public int getIDAcademia(String name_academia) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int i = 0;
        
        try {
            stmt = con.prepareStatement("SELECT Id_academia, nome_academia FROM academia WHERE nome_academia = '"+name_academia+"'");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                if(rs.getString("nome_academia").equals(name_academia)){
                    i = rs.getInt("Id_academia");
                }
            }
        } catch (SQLException ex) {
            return -1;
        }

        return i;
    }

}
