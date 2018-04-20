/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controle.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import visao.CadastroAcademia;

/**
 *
 * @author deusimar
 */
public class PreencherTabela {
    
    public PreencherTabela(ResultSet rs){
    
        ArrayList dados = new ArrayList();
        String [] Colunas = new String[]{"Nome"};
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            while(rs.next()){
                dados.add(new Object[]{rs.getString("nome_completo"), rs.getInt("Id_pessoa")});
                System.out.println(rs.getString("nome_completo"));
            }
            
            ModeloTabela modelo = new ModeloTabela(dados, Colunas);
            CadastroAcademia ca = new CadastroAcademia();

            ca.table.setModel(modelo);

            ca.table.getColumnModel().getColumn(0).setPreferredWidth(80);
            ca.table.getColumnModel().getColumn(0).setResizable(false);

            ca.table.getTableHeader().setReorderingAllowed(false);
            ca.table.setAutoResizeMode(ca.table.AUTO_RESIZE_OFF);

            ca.table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList! "+ex);
        }
        
    }

    public PreencherTabela() {
        
    }
    
   
}
