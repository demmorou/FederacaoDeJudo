package modelo;

/**
 *
 * @author deusimar
 */
public class VerificarString {
 
    public boolean verificaString(String s){
    
        // cria um array de char
        char[] c = s.toCharArray();
        boolean d = true;
        for ( int i = 0; i < c.length; i++ )
            // verifica se o char não é um dígito
            if (Character.isDigit( c[ i ] ) ) {
                d = false;
                break;
            }
        return d;
    }
    
    public String pontosCpf(String cpf){
    
        StringBuilder stringBuilder = new StringBuilder(cpf);
        stringBuilder.insert(3, '.');
        stringBuilder.insert(7, '.');
        stringBuilder.insert(11, '-');
        
        return cpf;
    }
}
