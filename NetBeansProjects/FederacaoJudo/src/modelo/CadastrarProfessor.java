package modelo;

import controle.DAO;
import controle.GetId;

/**
 *
 * @author deusimar
 */
public class CadastrarProfessor {
    
    Pessoa p = new Pessoa();
    Professor pr = new Professor();
    Academia ac = new Academia();
    
    public boolean DadosCadastroProfessor(Pessoa p, Professor pr, String nome_academia){
        
        if(p.getNomeCompleto().equals("") || p.getNomeCompleto().length() < 12 || !new VerificarString().verificaString(p.getNomeCompleto())){
            return false;
        }
        
        if(p.getNomeMae().equals("") || p.getNomeMae().length() < 12 || !new VerificarString().verificaString(p.getNomeMae())){
            return false;
        }
        
        if(p.getCpf().equals("") || !Validar.isCPF(p.getCpf()) || p.getCpf().length() != 11){
            return false;
        }
        
        if(p.getPeso() < 10.0 || p.getPeso() > 500.0){
            return false;
        }
        
        if(p.getDataOutorga().equals("")){
            return false;
        }
        
        if(p.getIdade() < 10 || p.getIdade() > 100){
            return false;
        }
        
        if(p.getCurriculun().equals("")){
            return false;
        }
        
        if(p.getFoto3x4().equals("")){
            return false;
        }
        
        if(p.getGraduacaoAtual().equals("")){
            return false;
        }
        
        if(p.getSexo().equals("")){
            return false;
        }
        
        if(!p.getNomePai().equals("")){
               if(new VerificarString().verificaString(p.getNomePai()) && p.getNomePai().length() > 12){
                   
               }else{
                   return false;
               }
        }
        
        if(p.getNomePai().equals("")){
            return false;
        }
        
        if(p.getTelefone().equals("")){
            return false;
        }
        
        if(Integer.toString(pr.getCref()).length() != 4 || pr.getCref() < 0){
            return false;
        }
        
        if(pr.getLocaisDeTrabalho().equals("")){
            return false;
        }
        
          if(!new DAO().createPessoa(p)){
              return false;
          }else{
              
              int ID_P = new GetId().getIDPEssoa(p.getCpf());
              int ID_A = new GetId().getIDAcademia(nome_academia);
              
              p.setIdpessoa(ID_P);
              pr.setIdpessoaFK(p);
            
              ac.setIdacademia(ID_A);
              pr.setIdacademiaFK(ac);
             
              return new DAO().createProfessor(pr);
            
          }
    }
}