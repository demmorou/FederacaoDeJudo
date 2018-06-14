package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deusimar
 */
public class Delete {
    
    public boolean deleteAcademia(int id){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null, st = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM academia WHERE Id_academia = "+id);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return true;
    }
}
