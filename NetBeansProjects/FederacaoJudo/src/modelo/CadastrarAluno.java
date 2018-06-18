package modelo;

import Gerar_Boleto.GerarBoleto;
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
        
        if(p.getNomeCompleto().equals("") || p.getNomeCompleto().length() < 2 || p.getNomeCompleto().length() > 80 || !new VerificarString().verificaString(p.getNomeCompleto()) || !p.getNomeCompleto().matches("[a-zA-Z\\s]+")){
            return false;
        }
        
        if(p.getNomeMae().equals("") || p.getNomeMae().length() < 2 || p.getNomeMae().length() > 80 || !new VerificarString().verificaString(p.getNomeMae()) || !p.getNomeMae().matches("[a-zA-Z\\s]+")){
            return false;
        }
        
        if(p.getCpf().equals("") || !Validar.isCPF(p.getCpf()) || p.getCpf().length() != 11){
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
        
        if(p.getFoto3x4().equals("")){
            return false;
        }
        
        if(p.getGraduacaoAtual().equals("") || !p.getGraduacaoAtual().matches("[a-zA-Z\\s]+")){
            return false;
        }
        
        if(p.getSexo().equals("") || !p.getSexo().matches("[a-zA-Z\\s]+") || (p.getSexo().length() != 1 && p.getSexo().length() != 9)){
            return false;
        }
        
        if(!p.getNomePai().equals("")){
               if(new VerificarString().verificaString(p.getNomePai()) && p.getNomePai().length() >= 2 && p.getNomePai().matches("[a-zA-Z\\s]+") && p.getNomePai().length() <= 80){
                   
               }else if (p.getNomePai().equals("---")){
                   
               }else{
                   return false;
               }
        }
        
        
        if(p.getTelefone().equals("") || p.getTelefone().length() != 14){
            return false;
        }
        
        if(nome_academia.equals("") || !nome_academia.matches("[a-zA-Z\\s]+")){
            return false;
        }
        
        if(p.getStatusPag() < 0 || p.getStatusPag() > 1)
            return false;
        
        if(p.getSexo().equals("M") || p.getSexo().equals("Masculino")){
            p.setCatDiv(new Validar().categoria_masculina(p.getPeso(), p.getIdade()));
        }else{
            p.setCatDiv(new Validar().categoria_feminina(p.getPeso(), p.getIdade()));
        }
        
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