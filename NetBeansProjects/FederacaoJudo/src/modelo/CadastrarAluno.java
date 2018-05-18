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
    
    public boolean DadosCadastroAluno(String nome, String nome_mae, String telefone,
                                        String data_ourtoga, String idade,
                                        String competicoes, String nome_pai,
                                        String path, String cpf, String nome_academia,
                                        String peso, String graduacao, String sexo
                                        ){
        
        if(nome.equals("") || nome.length() < 12 || new VerificarString().verificaString(nome_pai)){
            return false;
        }
        
        if(nome_mae.equals("") || nome_mae.length() < 12 || new VerificarString().verificaString(nome_pai)){
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
        
        p.setNomeCompleto(nome);
        p.setNomeMae(nome_mae);
        p.setCatDiv("nao definido");
        p.setCpf(cpf);
        p.setCurriculun(competicoes);
        p.setDataOutorga(data_ourtoga);
        p.setFoto3x4(path);
        p.setGraduacaoAtual(graduacao);
        p.setIdade(Integer.parseInt(idade));
        p.setNomePai(nome_pai);
        p.setPeso(Float.parseFloat(peso));
        p.setSexo(sexo);
        p.setStatusPag(0);
        p.setTelefone(telefone);
        
        if(!new DAO().createPessoa(p)){
            return false;
        }else{
            
            int ID_P = new GetId().getIDPEssoa(cpf);
            int ID_A = new GetId().getIDAcademia(nome_academia);
            
            p.setIdpessoa(ID_P);
            a.setIdpessoaFK(p);
            
            ac.setIdacademia(ID_A);
            a.setIdacademiaFK(ac);
            
            return new DAO().createAluno(a);
            
        }
        
    }
        
}