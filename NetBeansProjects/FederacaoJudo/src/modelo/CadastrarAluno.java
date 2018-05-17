package modelo;

import controle.DAO;

/**
 *
 * @author deusimar
 */
public class CadastrarAluno {
    
    Pessoa p = new Pessoa();
    
    public boolean DadosCadastroAluno(String nome, String nome_mae, String telefone,
                                        String data_ourtoga, String idade,
                                        String competicoes, String nome_pai,
                                        String path, String cpf, String nome_academia,
                                        String peso, String graduacao, String sexo
                                        ){
        
        if(nome.equals("") && nome.length() < 12){
            return false;
        }else if(nome_mae.equals("") && nome_mae.length() < 12){
            return false;
        }
        
//        p.setNomeCompleto(nome);
//        p.setNomeMae(nome_mae);
//        
//        if(!new DAO().createPessoa(p)){
//            return false;
//        }
        
        return true;
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
    
    public void criarAluno(){
        
        new DAO().createPessoa(p);
    }
    
        
}