package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pessoa;

/**
 *
 * @author deusimar
 */
public class Update {
    
    public boolean updateAluno(Pessoa p){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE pessoa SET nome_completo = ?, nome_mae = ?, nome_pai = ?, graduacao_atual = ?, curriculun = ?, data_outorga = ?, telefone = ?, peso = ?, idade = ?, cat_div = ? WHERE Id_pessoa = ?");
            
            stmt.setString(1, p.getNomeCompleto());
            stmt.setString(2, p.getNomeMae());
            stmt.setString(3, p.getNomePai());
            stmt.setString(4, p.getGraduacaoAtual());
            stmt.setString(5, p.getCurriculun());
            stmt.setString(6, p.getDataOutorga());
            stmt.setString(7, p.getTelefone());
            stmt.setFloat(8, p.getPeso());
            stmt.setInt(9, p.getIdade());
            stmt.setString(10, p.getCatDiv());
            stmt.setInt(11, p.getIdpessoa());
            
            stmt.executeUpdate();
                    
        } catch (SQLException ex){
            System.out.println(ex);
            return false;
        }
        
        return true;
    }
}