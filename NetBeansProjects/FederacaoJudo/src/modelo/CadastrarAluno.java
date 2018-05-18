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
    
    public boolean DadosCadastroAluno(Pessoa p){
        
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
        
//        p.setNomeCompleto(nome);
//        p.setNomeMae(nome_mae);
//        p.setCatDiv("nao definido");
//        p.setCpf(cpf);
//        p.setCurriculun(competicoes);
//        p.setDataOutorga(data_ourtoga);
//        p.setFoto3x4(path);
//        p.setGraduacaoAtual(graduacao);
//        p.setIdade(Integer.parseInt(idade));
//        p.setNomePai(nome_pai);
//        p.setPeso(Float.parseFloat(peso));
//        p.setSexo(sexo);
//        p.setStatusPag(0);
//        p.setTelefone(telefone);
        
//        if(!new DAO().createPessoa(p)){
//            return false;
//        }else{
//            
//            int ID_P = new GetId().getIDPEssoa(cpf);
//            int ID_A = new GetId().getIDAcademia(nome_academia);
//            
//            p.setIdpessoa(ID_P);
//            a.setIdpessoaFK(p);
//            
//            ac.setIdacademia(ID_A);
//            a.setIdacademiaFK(ac);
//            
            //return new DAO().createAluno(a);
            
        //}
        return true;
    }
        
}