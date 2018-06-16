package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Academia;
import modelo.Pessoa;

/**
 *
 * @author deusimar
 */
public class Update {
    
    public boolean verificaID(int id) throws SQLException{
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean b = false;
        
        stmt = con.prepareStatement("SELECT Id_pessoa FROM pessoa where Id_pessoa = "+id);
        rs = stmt.executeQuery();
        
        while(rs.next()){
            b = true;
        }
        
        return b;
    }
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
    
    public boolean updateAcademia(Academia a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE academia SET estado = ?, cidade = ?, bairro = ?, rua = ?, numero = ?, nome_academia = ?, cep = ? WHERE Id_academia = ?");
            stmt.setString(1, a.getEstado());
            stmt.setString(2, a.getCidade());
            stmt.setString(3, a.getBairro());
            stmt.setString(4, a.getRua());
            stmt.setInt(5, a.getNumero());
            stmt.setString(6, a.getNomeAcademia());
            stmt.setString(7, a.getCep());
            stmt.setInt(8, a.getIdacademia());
            
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
        
        return true;
    }
}