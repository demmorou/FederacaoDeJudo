package modelo;

import controle.Update;

/**
 *
 * @author deusimar
 */
public class UpdateAcademia {
    
    public boolean dadosUpdateAcademia(Academia a){
        
        if(a.getNomeAcademia().equals("") 
                || !new VerificarString().verificaString(a.getNomeAcademia())
                || a.getNomeAcademia().length() < 2)
            return false;
        
        if(a.getBairro().equals("") 
                || !new VerificarString().verificaString(a.getBairro())
                || a.getBairro().length() < 2)
            return false;
        
        if(a.getCep().equals("") || !Validar.isCep(a.getCep())
                || a.getCep().length() != 9)
            return false;
        
        if(a.getEstado().equals("") 
                || !new VerificarString().verificaString(a.getEstado())
                || a.getEstado().length() < 2)
            return false;
        
        if(a.getNumero() <= 0)
            return false;
        
        if(a.getRua().equals("") || a.getRua().length() < 2)
            return false;
        
        if(a.getCidade().equals("") 
                || !new VerificarString().verificaString(a.getCidade())
                || a.getCidade().length() < 2)
            return false;
        
        return new Update().updateAcademia(a);
    }
}
