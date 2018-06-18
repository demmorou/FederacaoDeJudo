package modelo;

import controle.DAO;

/**
 *
 * @author deusimar
 */
public class CadastrarAcademia {
    
    public boolean DadosCadastroAcademia(Academia a){
        
        if(a.getNomeAcademia().equals("") || !new VerificarString().verificaString(a.getNomeAcademia()) || a.getNomeAcademia().length() < 2 || a.getNomeAcademia().length() > 40 || !a.getNomeAcademia().matches("[a-zA-Z\\s]+"))
            return false;
        
        if(a.getBairro().equals("") || !new VerificarString().verificaString(a.getBairro()) || a.getBairro().length() < 2 || a.getBairro().length() > 40 || !a.getBairro().matches("[a-zA-Z\\s]+"))
            return false;
        
        if(a.getCep().equals("") || !Validar.isCep(a.getCep()))
            return false;
        
        if(a.getEstado().equals("") || !new VerificarString().verificaString(a.getEstado()) || a.getEstado().length() < 2 || a.getEstado().length() > 40 || !a.getEstado().matches("[a-zA-Z\\s]+"))
            return false;
        
        if(a.getNumero() <= 0)
            return false;
        System.out.println(a.getRua());
        if(a.getRua().equals("") || !new VerificarString().verificaString(a.getRua()) || a.getRua().length() < 2 || a.getRua().length() > 40 || !a.getRua().matches("[a-zA-Z\\s]+"))
            return false;
        
        if(a.getCidade().equals("") || !new VerificarString().verificaString(a.getCidade()) || a.getCidade().length() < 2 || a.getCidade().length() > 40 || !a.getCidade().matches("[a-zA-Z\\s]+"))
            return false;
        
        return new DAO().createAcademia(a);
        
    }
}
