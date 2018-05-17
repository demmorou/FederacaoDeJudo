package modelo;

/**
 *
 * @author deusimar
 */
public class Cadastro {
    
    public boolean CadAluno(String cpf /*, String comp, String graduacao, String mae, String nome, String ourtoga, String fone, String idade, String peso*/){
    
        if(!cpf.equals("") && Validar.isCPF(cpf) == true && cpf.length() == 11){
            return true;
        }
        
        return false;
    }
}
