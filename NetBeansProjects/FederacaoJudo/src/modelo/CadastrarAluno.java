package modelo;

import controle.DAO;

/**
 *
 * @author deusimar
 */
public class CadastrarAluno {
    
    Pessoa p;
    
    public boolean nomeCompleto(String nome_completo/*, String graduacao, String mae, String nome, String ourtoga, String fone, String idade, String peso*/){
        
        if(!nome_completo.equals("") && nome_completo.length() > 12){
            p.setNomeCompleto(nome_completo);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean nomeMae(String nome){
    
        if(!nome.equals("") && nome.length() > 12){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean CPF(String cpf){
        
        if(!cpf.equals("") && cpf.length() == 11 && Validar.isCPF(cpf)){
            return true;
        }else{
            return false;
        }
    }
        
}