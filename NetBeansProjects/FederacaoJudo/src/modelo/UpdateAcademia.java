package modelo;

import controle.Update;

/**
 *
 * @author deusimar
 */
public class UpdateAcademia {
    
    public boolean dadosUpdateAcademia(Academia a){
        
        if(a.getNomeAcademia().equals("") || !new VerificarString().verificaString(a.getNomeAcademia()))
            return false;
        
        if(a.getBairro().equals("") || !new VerificarString().verificaString(a.getBairro()))
            return false;
        
        if(a.getCep().equals("") || !Validar.isCep(a.getCep()))
            return false;
        
        if(a.getEstado().equals("") || !new VerificarString().verificaString(a.getEstado()))
            return false;
        
        if(a.getNumero() <= 0)
            return false;
        
        if(a.getRua().equals("") || !new VerificarString().verificaString(a.getRua()))
            return false;
        
        if(a.getCidade().equals("") || !new VerificarString().verificaString(a.getCidade()))
            return false;
        
        return new Update().updateAcademia(a);
    }
}
