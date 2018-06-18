package modelo;

import controle.Update;
import java.sql.SQLException;

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
        
        if(p.getPeso() < 15.0 || p.getPeso() > 500.0){
            return false;
        }
        
        if(p.getDataOutorga().equals("") || p.getDataOutorga().length() != 10 || !new VerificarString().data(p.getDataOutorga())){
            return false;
        }
        
        if(p.getIdade() < 13 || p.getIdade() > 100){
            return false;
        }
        
        if(p.getCurriculun().equals("") || p.getCurriculun().length() < 2 || p.getCurriculun().length() > 80){
            return false;
        }
        
        if(p.getGraduacaoAtual().equals("") || !p.getGraduacaoAtual().matches("[a-zA-Z\\s]+")){
            return false;
        }
        
        if(p.getIdpessoa() < 1)
            return false;
        
        if(p.getSexo().equals("M") || p.getSexo().equals("Masculino")){
            p.setCatDiv(new Validar().categoria_masculina(p.getPeso(), p.getIdade()));
        }else{
            p.setCatDiv(new Validar().categoria_feminina(p.getPeso(), p.getIdade()));
        }
        
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
    
}
