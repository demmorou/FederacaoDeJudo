/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.Academia;
import modelo.Aluno;
import modelo.ModeloTabela;
import modelo.Pessoa;
import modelo.Professor;
import modelo.User;
import visao.MenuBuscar;

/**
 *
 * @author deusimar
 */
public class DAO {

    public void createUser(User a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO user (Id_user,usuario,senha,nome)VALUES(?,?,?,?)");
            stmt.setInt(1, 0);
            stmt.setString(2, a.getUsuario());
            stmt.setString(3, a.getSenha());
            stmt.setString(4, a.getNome());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ ex);
        }finally{
            ConnectionFactory.closeConection(con, stmt);
        }
    
    }
    
    public boolean createAcademia (Academia a){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO academia (Id_academia,estado,cidade,bairro,rua,numero,nome_academia,cep)VALUES(?,?,?,?,?,?,?,?)");
            stmt.setInt(1, 0);
            stmt.setString(2, a.getEstado());
            stmt.setString(3, a.getCidade());
            stmt.setString(4, a.getBairro());
            stmt.setString(5, a.getRua());
            stmt.setInt(6, a.getNumero());
            stmt.setString(7, a.getNomeAcademia());
            stmt.setString(8, a.getCep());
            
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            return false;
        }finally{
            ConnectionFactory.closeConection(con, stmt);
        }
        
        return true;
    }
    
    public boolean createAluno(Aluno a){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO aluno (Id_aluno,Id_pessoaFK,Id_academiaFK)VALUES(?,?,?)");
            stmt.setInt(1, 0);
            stmt.setInt(2, a.getIdpessoaFK().getIdpessoa());
            stmt.setInt(3, a.getIdacademiaFK().getIdacademia());
            
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            return false;
        }finally{
            ConnectionFactory.closeConection(con, stmt);
        }
        return true;
    }
    
    public void ExcluirAluno(int id){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null, st = null;
        
        try {
            stmt = con.prepareStatement("delete from aluno where Id_pessoaFK = "+id+"");
            stmt.executeUpdate();
            
            st = con.prepareStatement("delete from pessoa where Id_pessoa = "+id+"");
            st.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Operação Realizada Com Sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Na Exclusão! Tente Novamente!\nERROR "+ex);
        }
    }
    
    public void createProfessor(Professor p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO professor (Id_professor,locais_de_trabalho,vinculo_com_academia,CREF,Id_pessoaFK,Id_academiaFK)VALUES(?,?,?,?,?,?)");
            stmt.setInt(1, 0);
            stmt.setString(2, p.getLocaisDeTrabalho());
            stmt.setString(3, p.getVinculoComAcademia());
            stmt.setInt(4, p.getCref());
            stmt.setInt(5, p.getIdpessoaFK().getIdpessoa());
            stmt.setInt(6, p.getIdacademiaFK().getIdacademia());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados do Professor Salvos Com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ ex);
        }finally{
            ConnectionFactory.closeConection(con, stmt);
        }
        
    }
    
    public boolean createPessoa(Pessoa p){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO pessoa (Id_pessoa,nome_completo,nome_mae,nome_pai,graduacao_atual,curriculun,foto3x4,cpf,data_outorga,telefone,peso,sexo,idade,status_pag,cat_div)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            stmt.setInt(1, 0);
            stmt.setString(2, p.getNomeCompleto());
            stmt.setString(3, p.getNomeMae());
            stmt.setString(4, p.getNomePai());
            stmt.setString(5, p.getGraduacaoAtual());
            stmt.setString(6, p.getCurriculun());
            stmt.setString(7, p.getFoto3x4());
            stmt.setString(8, p.getCpf());
            stmt.setString(9, p.getDataOutorga());
            stmt.setString(10, p.getTelefone());
            stmt.setFloat(11, p.getPeso());
            stmt.setString(12, p.getSexo());
            stmt.setInt(13, p.getIdade());
            stmt.setInt(14, 0);
            stmt.setString(15, p.getCatDiv());
            
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            return false;
        }finally{
            ConnectionFactory.closeConection(con, stmt);
        }
        
        return true;
    }
    
    public ResultSet BuscarNomePessoaAluno(String busca){
        
        ResultSet rs = null;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        int cont = 0;
        
        try {
            //select pessoa.nome_completo from (select aluno.Id_pessoaFK as id from (select * from academia where academia.nome_academia="Academia Sol") as acad inner join aluno on aluno.Id_academiaFK = acad.Id_academia) as alu inner join pessoa on pessoa.Id_pessoa = alu.id;
            stmt = con.prepareStatement("select pessoa.* from pessoa inner join aluno where pessoa.nome_completo = '"+busca+"' and pessoa.Id_pessoa = aluno.Id_pessoaFK");
            rs = stmt.executeQuery();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MenuBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    public void AlterarStatus(int id){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("update pessoa set status_pag = "+1+" where Id_pessoa = "+id+"");
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Feito Com Sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(MenuBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void AlterarDadosAluno(int id){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
    }
    
    public String BuscaNomeAcademia(int id) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String nome = null;
        try {
            stmt = con.prepareStatement("select nome_academia from academia inner join pessoa where pessoa.Id_pessoa = "+id+"");
            rs = stmt.executeQuery();
            
            while(rs.next())
                nome = rs.getString("nome_academia");
            
        } catch (SQLException ex) {
            Logger.getLogger(MenuBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }

        return nome;
    }
    
}
