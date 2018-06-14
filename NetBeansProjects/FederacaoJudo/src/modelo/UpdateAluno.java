package modelo;

import controle.DAO;
import controle.GetId;
import controle.Update;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deusimar
 */
public class UpdateAluno {
    Pessoa p = new Pessoa();
    Aluno a = new Aluno();
    Academia ac = new Academia();
    
    public boolean DadosCadastroAluno(Pessoa p){
        
        if(p.getNomeCompleto().equals("") || p.getNomeCompleto().length() < 12 || !new VerificarString().verificaString(p.getNomeCompleto()) || !p.getNomeCompleto().matches("[a-zA-Z\\s]+")){
            return false;
        }
        
        if(p.getNomeMae().equals("") || p.getNomeMae().length() < 12 || !new VerificarString().verificaString(p.getNomeMae()) || !p.getNomeMae().matches("[a-zA-Z\\s]+")){
            return false;
        }
        
        if(p.getPeso() < 10.0 || p.getPeso() > 500.0){
            return false;
        }
        
        if(p.getDataOutorga().equals("") || p.getDataOutorga().length() != 10){
            return false;
        }
        
        if(p.getIdade() < 10 || p.getIdade() > 100){
            return false;
        }
        
        if(p.getCurriculun().equals("")){
            return false;
        }
        
        if(p.getGraduacaoAtual().equals("")){
            return false;
        }
        
        if(p.getIdpessoa() < 1)
            return false;
        
        try {
            if(!new Update().verificaID(p.getIdpessoa())){
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
//        if(!p.getNomePai().equals("")){
//               if(new VerificarString().verificaString(p.getNomePai()) && p.getNomePai().length() >= 3){
//                   
//               }else{
//                   return false;
//               }
//        }
//        
//        if(p.getNomePai().equals("")){
//            return false;
//        }
        System.out.println(p.getTelefone().length());
        if(p.getTelefone().equals("") || p.getTelefone().length() != 14){
            return false;
        }
        
        return new Update().updateAluno(p);
    }
    
    public boolean data(String s) {
        
       
        
       if(s.length() == 10){
           
           
           
       }
       
       return true;
    }
    
    public static void main(String[] args){
        System.out.println(new UpdateAluno().data("21/12/2012"));
    }
}
