package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

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
    
    public boolean data(String s){
        
        char[] c = s.toCharArray();
        String bb1, bb2;
        
        StringBuilder sb = new StringBuilder();
        
        char d1 = c[0], d2 = c[1];
        
        StringBuilder ba2 = new StringBuilder();
        StringBuilder ba1 = new StringBuilder();
        
        ba1.append(c[2]);
        ba2.append(c[5]);
        
        bb1 = ba1.toString();
        bb2 = ba2.toString();
        
        if(!bb1.equals("/") || !bb2.equals("/")){
            return false;
        }
        
        sb.append(d1);
        sb.append(d2);
        
        int dia = Integer.parseInt(sb.toString());
        
        char m1 = c[3], m2 = c[4];
        
        StringBuilder sb1 = new StringBuilder();
        
        sb1.append(m1);
        sb1.append(m2);
        
        int mes = Integer.parseInt(sb1.toString());
        
        char a1 = c[6], a2 = c[7], a3 = c[8], a4 = c[9];
        
        StringBuilder sb2 = new StringBuilder();
        
        sb2.append(a1);
        sb2.append(a2);
        sb2.append(a3);
        sb2.append(a4);
        
        int ano = Integer.parseInt(sb2.toString());
        
        if(mes == 2){
            if((ano > 1900 && ano < 3000) && (mes >= 1 && mes <= 12) && (dia >= 1 && dia <= 29)){
                return true;
            }else{
                return false;
            }
        }else if(mes != 2){
            if(mes == 1 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                if((ano > 1900 && ano < 3000) && (mes >= 1 && mes <= 12) && (dia >= 1 && dia <= 31)){
                    return true;
                }else{
                    return false;
                }
            }else if(mes == 3 || mes == 4 || mes == 6 || mes == 9 || mes == 11){
                if((ano > 1900 && ano < 3000) && (mes >= 1 && mes <= 12) && (dia >= 1 && dia <= 30)){
                    return true;
                }else{
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public int calcularIdade(String s){
        
        char[] c = s.toCharArray();
        
        char a1 = c[6], a2 = c[7], a3 = c[8], a4 = c[9];
        
        StringBuilder sb2 = new StringBuilder();
        
        sb2.append(a1);
        sb2.append(a2);
        sb2.append(a3);
        sb2.append(a4);
        
        int ano = Integer.parseInt(sb2.toString());
        Calendar cal = GregorianCalendar.getInstance();
        
        int year = cal.get(Calendar.YEAR);
        
        return year - ano;
    }
    
}
