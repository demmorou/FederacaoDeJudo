package modelo;

import controle.DAO;

/**
 *
 * @author deusimar
 */
public class CadastrarAcademia {
    
    public boolean DadosCadastroAcademia(Academia a){
    
        if(a.getNomeAcademia().equals(""))
            return false;
        
        if(a.getBairro().equals(""))
            return false;
        
        if(a.getCep().equals(""))
            return false;
        
        if(a.getEstado().equals(""))
            return false;
        
        if(a.getNumero() <= 0 )
            return false;
        
        if(a.getRua().equals(""))
            return false;
        
        return new DAO().createAcademia(a);
    }
}
