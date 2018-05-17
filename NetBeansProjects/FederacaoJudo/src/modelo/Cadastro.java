package modelo;

/**
 *
 * @author deusimar
 */
public class Cadastro {
    
    public boolean CadAluno(String cpf, String nome_completo, String mae, float peso/*, String graduacao, String mae, String nome, String ourtoga, String fone, String idade, String peso*/){
        
        if(!cpf.equals("") && Validar.isCPF(cpf) == true && cpf.length() == 11 && 
           !nome_completo.equals("") && nome_completo.length() > 12 &&
           !mae.equals("") && mae.length() > 12 &&
            peso > 0.0){
            return true;
        }else{
            return false;
        }
    }
        
}

