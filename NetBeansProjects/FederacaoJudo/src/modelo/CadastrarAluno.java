package modelo;

import controle.DAO;
import controle.GetId;

/**
 *
 * @author deusimar
 */
public class CadastrarAluno {
    
    Pessoa p = new Pessoa();
    Aluno a = new Aluno();
    Academia ac = new Academia();
    
    public boolean DadosCadastroAluno(Pessoa p, String nome_academia){
        
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
        
        if(p.getDataOutorga().equals("") || p.getDataOutorga().length() != 10){
            return false;
        }
        
        if(p.getIdade() < 10 || p.getIdade() > 100){
            return false;
        }
        
        if(p.getCatDiv().equals("")){
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
               if(new VerificarString().verificaString(p.getNomePai()) && p.getNomePai().length() >= 3){
                   
               }else{
                   return false;
               }
        }
        
        if(p.getNomePai().equals("")){
            return false;
        }
        
        if(p.getTelefone().equals("") || p.getTelefone().length() != 14){
            return false;
        }
        
        if(nome_academia.equals("")){
            return false;
        }
        
        if(p.getStatusPag() < 0 || p.getStatusPag() > 1)
            return false;
        
        if(!new DAO().createPessoa(p)){
            return false;
        }else{
            
            int ID_P = new GetId().getIDPEssoa(p.getCpf());
            int ID_A = new GetId().getIDAcademia(nome_academia);
            
            p.setIdpessoa(ID_P);
            a.setIdpessoaFK(p);
            
            ac.setIdacademia(ID_A);
            a.setIdacademiaFK(ac);
            
            return new DAO().createAluno(a);
            
        }
    }
}