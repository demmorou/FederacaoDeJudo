/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author deusimar
 */

public class VerificacoesInsercao {
    
    public boolean AltercaoAluno(String cpf, String comp, String graduacao, String mae, String nome, String ourtoga, String fone, String idade, String peso){
        
        if(cpf.equals("") && new Validar().isCPF(cpf) == false){
            JOptionPane.showMessageDialog(null,"Informe um CPF Válido");
            return false;
        }
        
        if(comp.equals("")){
            JOptionPane.showMessageDialog(null,"Informe as Competições");
            return false;
        }
        
        if(graduacao.equals("")){
            JOptionPane.showMessageDialog(null,"Informe a Graduação");
            return false;
        }
        
        if(mae.equals("")){
            JOptionPane.showMessageDialog(null,"Informe o nome da Mãe");
            return false;
        }
        
        if(ourtoga.equals("")){
            JOptionPane.showMessageDialog(null,"Informe a data de Ourtoga");
            return false;
        }
        
        if(fone.equals("")){
            JOptionPane.showMessageDialog(null,"Informe o Telefone");
            return false;
        }
        
        if(Integer.parseInt(idade) < 0 && Integer.parseInt(idade) > 150){
            JOptionPane.showMessageDialog(null,"Informe uma Idade Válida");
            return false;
        }
        
        if(peso.contains("^[a-Z]") == false){
            JOptionPane.showMessageDialog(null,"Informe um peso Válido");
            return false;
        }else if((Float.parseFloat(peso) < 0.0 &&  Float.parseFloat(peso) > 500)){
                JOptionPane.showMessageDialog(null,"Informe um peso Válido");
                return false;
            }
        
        return true;
    }
}
