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
            stmt = con.prepareStatement("INSERT INTO academia (Id_academia,estado,cep,cidade,bairro,rua,numero,nome_academia)VALUES(?,?,?,?,?,?,?,?)");
            stmt.setInt(1, 0);
            stmt.setString(2, a.getEstado());
            stmt.setInt(3, a.getCep());
            stmt.setString(4, a.getCidade());
            stmt.setString(5, a.getBairro());
            stmt.setString(6, a.getRua());
            stmt.setInt(7, a.getNumero());
            stmt.setString(8, a.getNomeAcademia());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ ex);
        }finally{
            ConnectionFactory.closeConection(con, stmt);
        }
    }
    
    public void createAluno(Aluno a){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        Pessoa p = new Pessoa();
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
    
    public void createPessoa(Pessoa p){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO pessoa (Id_pessoa,nome_completo,nome_mae,nome_pai,telefone,graduacao_atual,curriculun,foto3x4,cpf,data_outorga)VALUES(?,?,?,?,?,?,?,?,?,?)");
            
            stmt.setInt(1, 0);
            stmt.setString(2, p.getNomeCompleto());
            stmt.setString(3, p.getNomeMae());
            stmt.setString(4, p.getNomePai());
            stmt.setInt(5, p.getTelefone());
            stmt.setString(6, p.getGraduacaoAtual());
            stmt.setString(7, p.getCurriculun());
            stmt.setString(8, p.getFoto3x4());
            stmt.setString(9, p.getCpf());
            stmt.setString(10, p.getDataOutorga());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar "+ ex);
        }finally{
            ConnectionFactory.closeConection(con, stmt);
        }
        
    }
    
}
