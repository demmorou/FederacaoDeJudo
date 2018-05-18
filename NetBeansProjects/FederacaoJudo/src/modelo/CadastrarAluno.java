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
        
        if(nome.equals("") || nome.length() < 12){
            return false;
        }
        
        if(nome_mae.equals("") || nome_mae.length() < 12){
            return false;
        }
        
        if(cpf.equals("") || !Validar.isCPF(cpf) || cpf.length() != 11){
            return false;
        }
        
        if(!peso.equals("")  && !peso.contains("^[a-Z]")){
                    if(Float.valueOf(peso.replace(",", ".")) < 10.0){
                        return false;
                    }
        }
        
        if(peso.equals("")  || peso.contains("^[a-Z]")){
            return false;
        }
        
        if(data_ourtoga.equals("")){
            return false;
        }
        
        if(idade.equals("")){
            return false;
        }
        
        if(competicoes.equals("")){
            return false;
        }
        
        if(path.equals("")){
            return false;
        }
        
        if(nome_academia.equals("")){
            return false;   
        }
        
        if(graduacao.equals("")){
            return false;
        }
        
        if(sexo.equals("")){
            return false;
        }
        
        if(!nome_pai.equals("")){
               if(new VerificarString().verificaString(nome_pai) && nome_pai.length() > 12){
                   
               }else{
                   return false;
               }
        }
        
        if(nome_pai.equals("")){
            return false;
        }
        
        if(telefone.equals("")){
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
        
}