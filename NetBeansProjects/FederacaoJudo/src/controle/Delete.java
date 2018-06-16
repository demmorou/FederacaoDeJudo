package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author deusimar
 */
public class Delete {
    
    public boolean deleteAcademia(int id){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM academia WHERE Id_academia = "+id);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
        
        return true;
    }
}
