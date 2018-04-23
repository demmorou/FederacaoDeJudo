package modelo;
import java.util.InputMismatchException;
public class Validar {
    public static boolean isCPF(String CPF) {
        if (CPF.equals("00000000000") || CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;
    try {
      sm = 0;
      peso = 10;
      for (i=0; i<9; i++) {              
        num = (int)(CPF.charAt(i) - 48); 
        sm = sm + (num * peso);
        peso = peso - 1;
      }
      r = 11 - (sm % 11);
      if ((r == 10) || (r == 11))
         dig10 = '0';
      else dig10 = (char)(r + 48);


      sm = 0;
      peso = 11;
      for(i=0; i<10; i++) {
        num = (int)(CPF.charAt(i) - 48);
        sm = sm + (num * peso);
        peso = peso - 1;
      }

      r = 11 - (sm % 11);
      if ((r == 10) || (r == 11))
          dig11 = '0';
      else dig11 = (char)(r + 48);

      if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
         return(true);
      else return(false);
    } catch (InputMismatchException erro) {
        return(false);
    }
  }
    public static String categoria_masculina(float peso, int idade){
        
        if ((peso <=36) && ((idade >= 13) && (idade <15))){
            return "S. Ligeiro/Sub 15";
            // Categoria S.Ligeiro...Sub 15... peso até 36 kg, idades entre 13-14 anos
        }else if (((peso > 36) && (peso <=40)) && ((idade >= 13) && (idade <15))){
            return "Ligeiro/Sub 15";
            // Categoria Ligeiro...Sub 15... peso + de 36 ate 40 kg, idades entre 13-14 anos
        }else if (((peso > 40) && (peso <=44)) && ((idade >= 13) && (idade <15))){
            return "M. Leve/Sub 15";
            // Categoria M. Leve...Sub 15... peso + de 40 ate 44 kg, idades entre 13-14 anos
        }else if (((peso > 44) && (peso <=48)) && ((idade >= 13) && (idade <15))){
            return "Leve/Sub 15";
            // Categoria Leve...Sub 15... peso + de 44 ate 48 kg, idades entre 13-14 anos
        }else if (((peso > 48) && (peso <=53)) && ((idade >= 13) && (idade <15))){
            return "M. Medio/Sub 15";
            // Categoria M. Medio...Sub 15... peso + de 48 ate 53 kg, idades entre 13-14 anos
        }else if (((peso > 53) && (peso <=58)) && ((idade >= 13) && (idade <15))){
            return "Medio/Sub 15";
            // Categoria Medio...Sub 15... peso + de 53 ate 58 kg, idades entre 13-14 anos
        }else if (((peso > 58) && (peso <=64)) && ((idade >= 13) && (idade <15))){
            return "M. Pesado/Sub 15";
            // Categoria M. Pesado...Sub 15... peso + de 58 ate 64 kg, idades entre 13-14 anos
        }else if ((peso > 64) && ((idade >= 13) && (idade <15))){
            return "Pesado/Sub 15";
            // Categoria Pesado...Sub 15... peso + de 64 KG, idades entre 13-14 anos
            
            /*
            
            */
            //condições do sub 18 <3
        }else if ((peso < 50) && ((idade >= 15) && (idade <18))){
            return "S. Ligeiro/Sub 18";
            // Categoria S.Ligeiro...Sub 18... peso até 50 kg, idades entre 15-17 anos
        } else if (((peso > 50) && (peso <=55)) && ((idade >= 15) && (idade <18))){
            return "Ligeiro/Sub 18";
            // Categoria Ligeiro...Sub 18... peso + de 50 ate 55 kg, idades entre 15-17 anos
        }else if (((peso > 55) && (peso <=60)) && ((idade >= 15) && (idade <18))){
            return "M. Leve/Sub 18";
            // Categoria M. Leve...Sub 18... peso + de 55 ate 60 kg, idades entre 15-17 anos
        }else if (((peso > 60) && (peso <=66)) && ((idade >= 15) && (idade <18))){
            return "Leve/Sub 18";
            // Categoria Leve...Sub 18... peso + de 60 ate 66 kg, idades entre 15-18 anos
        }else if (((peso > 66) && (peso <=73)) && ((idade >= 15) && (idade <18))){
            return "M. Medio/Sub 18";
            // Categoria M. Medio...Sub 18... peso + de 66 ate 73 kg, idades entre 15-18 anos
        }else if (((peso > 73) && (peso <=81)) && ((idade >= 15) && (idade <18))){
            return "Medio/Sub 18";
            // Categoria Medio...Sub 18... peso + de 73 ate 81 kg, idades entre 15-18 anos
        }else if (((peso > 81) && (peso <=90)) && ((idade >= 15) && (idade <18))){
            return "M. Pesado/Sub 18";
            // Categoria M. Pesado...Sub 18... peso + de 81 ate 90 kg, idades entre 15-18 anos
        }else if ((peso > 90) && ((idade >= 15) && (idade <18))){
            return "Pesado/Sub 18";
            // Categoria Pesado...Sub 18... peso + de 90 kg, idades entre 15-18 anos
            
            //Condições sub 21 <3 
        }else if ((peso < 55) && ((idade >= 18) && (idade <20))){
            return "S. Ligeiro/Sub 21";
            // Categoria S.Ligeiro...Sub 21... peso até 55 kg, idades entre 18-20 anos
        } else if (((peso > 55) && (peso <=60)) && ((idade >= 18) && (idade <20))){
            return "Ligeiro/Sub 21";
            // Categoria Ligeiro...Sub 21... peso + de 55 ate 60 kg, idades entre 18-20 anos
        }else if (((peso > 60) && (peso <=66)) && ((idade >= 18) && (idade <20))){
            return "M. Leve/Sub 21";
            // Categoria M. Leve...Sub 21... peso + de 60 ate 66 kg, idades entre 18-20 anos
        }else if (((peso > 66) && (peso <=73)) && ((idade >= 18) && (idade <20))){
            return "Leve/Sub 21";
            // Categoria Leve...Sub 21... peso + de 66 ate 73 kg, idades entre 18-20 anos
        }else if (((peso > 73) && (peso <=81)) && ((idade >= 18) && (idade <20))){
            return "M. Medio/Sub 21";
            // Categoria M. Medio...Sub 21... peso + de 73 ate 81 kg, idades entre 18-20 anos
        }else if (((peso > 81) && (peso <=90)) && ((idade >= 18) && (idade <20))){
            return "Medio/Sub 21";
            // Categoria Medio...Sub 21... peso + de 81 ate 90 kg, idades entre 18-20 anos
        }else if (((peso > 90) && (peso <=100)) && ((idade >= 18) && (idade <20))){
            return "M. Pesado/Sub 21";
            // Categoria M. Pesado...Sub 21... peso + de 90 ate 100 kg, idades entre 18-20 anos
        }else if ((peso > 100) && ((idade >= 18) && (idade <20))){
            return "Pesado/Sub 21";
            // Categoria Pesado...Sub 21... peso + de 100 kg, idades entre 18-20 anos
            
            //Condições Senior
        }else if ((peso < 55) && (idade > 21)){
            return "S. Ligeiro/Senior";
            // Categoria S.Ligeiro...Senior... peso até 55 kg, idades acima de 21 anos
        } else if (((peso > 55) && (peso <=60)) && (idade > 21)){
            return "Ligeiro/Senior";
            // Categoria Ligeiro...Senior... peso + de 55 ate 60 kg, idades acima de 21 anos
        }else if (((peso > 60) && (peso <=66)) && (idade > 21)){
            return "M. Leve/Senior";
            // Categoria M. Leve...Senior... peso + de 60 ate 66 kg, idades acima de 21 anos
        }else if (((peso > 66) && (peso <=73)) && (idade > 21)){
            return "Leve/Senior";
            // Categoria Leve...Senior... peso + de 66 ate 73 kg, idades acima de 21 anos
        }else if (((peso > 73) && (peso <=81)) && (idade > 21)){
            return "M. Medio/Senior";
            // Categoria M. Medio...Senior... peso + de 73 ate 81 kg, idades acima de 21 anos
        }else if (((peso > 81) && (peso <=90)) && (idade > 21)){
            return "Medio/Senior";
            // Categoria Medio...Senior... peso + de 81 ate 90 kg, idades acima de 21 anos
        }else if (((peso > 90) && (peso <=100)) && (idade > 21)){
            return "M. Pesado/Senior";
            // Categoria M. Pesado...Senior... peso + de 90 ate 100 kg, idades acima de 21 anos
        }else if ((peso > 100) && (idade > 21)){
            return "Pesado/Senior";
            // Categoria Pesado...Senior... peso + de 100 kg, idades acima de 21 anos
        }
        
        return "";
    }
    
    public static String categoria_feminina(float peso, int idade){
        
        if ((peso <=36) && ((idade >= 13) && (idade <15))){
            return "S. Ligeiro/Sub 15";
            // Categoria S.Ligeiro...Sub 15... peso até 36 kg, idades entre 13-14 anos
        }else if (((peso > 36) && (peso <=40)) && ((idade >= 13) && (idade <15))){
            return "Ligeiro/Sub 15";
            // Categoria Ligeiro...Sub 15... peso + de 36 ate 40 kg, idades entre 13-14 anos
        }else if (((peso > 40) && (peso <=44)) && ((idade >= 13) && (idade <15))){
            return "M. Leve/Sub 15";
            // Categoria M. Leve...Sub 15... peso + de 40 ate 44 kg, idades entre 13-14 anos
        }else if (((peso > 44) && (peso <=48)) && ((idade >= 13) && (idade <15))){
            return "Leve/Sub 15";
            // Categoria Leve...Sub 15... peso + de 44 ate 48 kg, idades entre 13-14 anos
        }else if (((peso > 48) && (peso <=53)) && ((idade >= 13) && (idade <15))){
            return "M. Medio/Sub 15";
            // Categoria M. Medio...Sub 15... peso + de 48 ate 53 kg, idades entre 13-14 anos
        }else if (((peso > 53) && (peso <=58)) && ((idade >= 13) && (idade <15))){
            return "Medio/Sub 15";
            // Categoria Medio...Sub 15... peso + de 53 ate 58 kg, idades entre 13-14 anos
        }else if (((peso > 58) && (peso <=64)) && ((idade >= 13) && (idade <15))){
            return "M. Pesado/Sub 15";
            // Categoria M. Pesado...Sub 15... peso + de 58 ate 64 kg, idades entre 13-14 anos
        }else if ((peso > 64) && ((idade >= 13) && (idade <15))){
            return "Pesado/Sub 15";
            // Categoria Pesado...Sub 15... peso + de 64 KG, idades entre 13-14 anos
            
            //condições do sub 18 <3
        }else if ((peso < 40) && ((idade >= 15) && (idade <18))){
            return "S. Ligeiro/Sub 18";
            // Categoria S.Ligeiro...Sub 18... peso até 40 kg, idades entre 15-17 anos
        } else if (((peso > 40) && (peso <=44)) && ((idade >= 15) && (idade <18))){
            return "Ligeiro/Sub 18";
            // Categoria Ligeiro...Sub 18... peso + de 40 ate 44 kg, idades entre 15-17 anos
        }else if (((peso > 44) && (peso <=48)) && ((idade >= 15) && (idade <18))){
            return "M. Leve/Sub 18";
            // Categoria M. Leve...Sub 18... peso + de 44 ate 48 kg, idades entre 15-17 anos
        }else if (((peso > 48) && (peso <=52)) && ((idade >= 15) && (idade <18))){
            return "Leve/Sub 18";
            // Categoria Leve...Sub 18... peso + de 48 ate 52 kg, idades entre 15-18 anos
        }else if (((peso > 52) && (peso <=57)) && ((idade >= 15) && (idade <18))){
            return "M. Medio/Sub 18";
            // Categoria M. Medio...Sub 18... peso + de 52 ate 57 kg, idades entre 15-18 anos
        }else if (((peso > 57) && (peso <=63)) && ((idade >= 15) && (idade <18))){
            return "Medio/Sub 18";
            // Categoria Medio...Sub 18... peso + de 57 ate 63 kg, idades entre 15-18 anos
        }else if (((peso > 66) && (peso <=70)) && ((idade >= 15) && (idade <18))){
            return "M. Pesado/Sub 18";
            // Categoria M. Pesado...Sub 18... peso + de 66 ate 70 kg, idades entre 15-18 anos
        }else if ((peso > 70) && ((idade >= 15) && (idade <18))){
            return "Pesado/Sub 18";
            // Categoria Pesado...Sub 18... peso + de 70 kg, idades entre 15-18 anos
            
            //Condições sub 21 <3 
        }else if ((peso < 44) && ((idade >= 18) && (idade <20))){
            return "S. Ligeiro/Sub 21";
            // Categoria S.Ligeiro...Sub 21... peso até 44 kg, idades entre 18-20 anos
        } else if (((peso > 44) && (peso <=48)) && ((idade >= 18) && (idade <20))){
            return "Ligeiro/Sub 21";
            // Categoria Ligeiro...Sub 21... peso + de 44 ate 48 kg, idades entre 18-20 anos
        }else if (((peso > 48) && (peso <=52)) && ((idade >= 18) && (idade <20))){
            return "M. Leve/Sub 21";
            // Categoria M. Leve...Sub 21... peso + de 48 ate 52 kg, idades entre 18-20 anos
        }else if (((peso > 52) && (peso <=57)) && ((idade >= 18) && (idade <20))){
            return "Leve/Sub 21";
            // Categoria Leve...Sub 21... peso + de 52 ate 57 kg, idades entre 18-20 anos
        }else if (((peso > 57) && (peso <=63)) && ((idade >= 18) && (idade <20))){
            return "M. Medio/Sub 21";
            // Categoria M. Medio...Sub 21... peso + de 57 ate 63 kg, idades entre 18-20 anos
        }else if (((peso > 63) && (peso <=70)) && ((idade >= 18) && (idade <20))){
            return "Medio/Sub 21";
            // Categoria Medio...Sub 21... peso + de 63 ate 70 kg, idades entre 18-20 anos
        }else if (((peso > 70) && (peso <=78)) && ((idade >= 18) && (idade <20))){
            return "M. Pesado/Sub 21";
            // Categoria M. Pesado...Sub 21... peso + de 70 ate 78 kg, idades entre 18-20 anos
        }else if ((peso > 78) && ((idade >= 18) && (idade <20))){
            return "Pesado/Sub 21";
            // Categoria Pesado...Sub 21... peso + de 78 kg, idades entre 18-20 anos
            
            //Condições Senior
        }else if ((peso < 44) && (idade > 21)){
            return "S. Ligeiro/Sub Senior";
            // Categoria S.Ligeiro...Senior... peso até 44 kg, idades acima de 21 anos
        } else if (((peso > 44) && (peso <=48)) && (idade > 21)){
            return "Ligeiro/Sub Senior";
            // Categoria Ligeiro...Senior... peso + de 44 ate 48 kg, idades acima de 21 anos
        }else if (((peso > 48) && (peso <=52)) && (idade > 21)){
            return "M. Leve/Sub Senior";
            // Categoria M. Leve...Senior... peso + de 48 ate 52 kg, idades acima de 21 anos
        }else if (((peso > 52) && (peso <=57)) && (idade > 21)){
            return "Leve/Sub Senior";
            // Categoria Leve...Senior... peso + de 52 ate 57 kg, idades acima de 21 anos
        }else if (((peso > 57) && (peso <=63)) && (idade > 21)){
            return "M. Medio/Sub Senior";
            // Categoria M. Medio...Senior... peso + de 57 ate 63 kg, idades acima de 21 anos
        }else if (((peso > 63) && (peso <=70)) && (idade > 21)){
            return "Medio/Sub Senior";
            // Categoria Medio...Senior... peso + de 63 ate 70 kg, idades acima de 21 anos
        }else if (((peso > 70) && (peso <=78)) && (idade > 21)){
            return "M. Pesado/Sub Senior";
            // Categoria M. Pesado...Senior... peso + de 70 ate 78 kg, idades acima de 21 anos
        }else if ((peso > 78) && (idade > 21)){
            return "Pesado/Sub Senior";
            // Categoria Pesado...Senior... peso + de 78 kg, idades acima de 21 anos
        }
        return "";
    }
}