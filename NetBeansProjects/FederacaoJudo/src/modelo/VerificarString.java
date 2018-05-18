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
}
