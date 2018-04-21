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
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Academia;
import modelo.Aluno;
import modelo.Pessoa;
import modelo.Professor;
import modelo.User;

/**
 *
 * @author deusimar
 */
public class DAO {
    public String data(){
        
        java.util.Date agora = new java.util.Date();
        SimpleDateFormat formata = new SimpleDateFormat();
        
        return formata.format(agora);
    }
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
    
    public void createAcademia (Academia a){
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
            JOptionPane.showMessageDialog(null, "Dados da Academia Salvos Com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar Dados da Academia"+ ex);
        }finally{
            ConnectionFactory.closeConection(con, stmt);
        }
    }
    
    public void createAluno(Aluno a){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO aluno (Id_aluno,Id_pessoaFK,Id_academiaFK)VALUES(?,?,?)");
            stmt.setInt(1, 0);
            stmt.setInt(2, a.getIdpessoaFK().getIdpessoa());
            stmt.setInt(3, a.getIdacademiaFK().getIdacademia());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ ex);
        }finally{
            ConnectionFactory.closeConection(con, stmt);
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
    
    public void createPessoa(Pessoa p){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO pessoa (Id_pessoa,nome_completo,nome_mae,nome_pai,graduacao_atual,curriculun,foto3x4,cpf,data_outorga,telefone,peso,sexo,idade)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
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
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar "+ ex);
        }finally{
            ConnectionFactory.closeConection(con, stmt);
        }
        
    }
    
}
