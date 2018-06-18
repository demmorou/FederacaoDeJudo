package modelo;

import controle.DAO;

/**
 *
 * @author deusimar
 */
public class CadastrarAcademia {
    
    public boolean DadosCadastroAcademia(Academia a){
    
        if(a.getNomeAcademia().equals("") || !new VerificarString().verificaString(a.getNomeAcademia()) || 2 < a.getNomeAcademia().length() || a.getNomeAcademia().length() > 40 )
            return false;
        
        if(a.getBairro().equals("") || !new VerificarString().verificaString(a.getBairro()) || 2 < a.getBairro().length() || a.getBairro().length() > 40)
            return false;
        
        if(a.getCep().equals("") || !Validar.isCep(a.getCep()))
            return false;
        
        if(a.getEstado().equals("") || !new VerificarString().verificaString(a.getEstado()) || 2 < a.getEstado().length() || a.getEstado().length() > 40)
            return false;
        
        if(a.getNumero() <= 0)
            return false;
        
        if(a.getRua().equals("") || !new VerificarString().verificaString(a.getRua()) || 2 < a.getRua().length() || a.getRua().length() > 40)
            return false;
        
        if(a.getCidade().equals("") || !new VerificarString().verificaString(a.getCidade()) || 2 < a.getCidade().length() || a.getCidade().length() > 40)
            return false;
        
        return new DAO().createAcademia(a);
        
    }
}
