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
    
    public boolean AltercaoAluno(String academia, String cpf, String comp, String graduacao, String mae, String nome, String ourtoga, String fone, String idade, String peso){
        if(academia.equals("")){
            JOptionPane.showInputDialog("Informe um Nome");
            return false;
        }
        if(cpf.equals("") && new Validar().isCPF(cpf) == false){
            JOptionPane.showInputDialog("Informe um CPF Válido");
            return false;
        }
        if(comp.equals("")){
            JOptionPane.showInputDialog("Informe as Competições");
            return false;
        }
        if(graduacao.equals("")){
            JOptionPane.showInputDialog("Informe a Graduação");
            return false;
        }
        if(mae.equals("")){
            JOptionPane.showInputDialog("Informe o nome da Mãe");
            return false;
        }
        if(ourtoga.equals("")){
            JOptionPane.showInputDialog("Informe a data de Ourtoga");
            return false;
        }
        if(fone.equals("")){
            JOptionPane.showInputDialog("Informe o Telefone");
            return false;
        }
        if(Integer.parseInt(idade) < 0 && Integer.parseInt(idade) > 150){
            JOptionPane.showInputDialog("Informe uma Idade Válida");
            return false;
        }
        
        if(Float.parseFloat(peso) < 0.0 &&  Float.parseFloat(peso) > 500){
            JOptionPane.showInputDialog("infome um peso Válido");
            return false;
        }
        
        return true;
    }
}
