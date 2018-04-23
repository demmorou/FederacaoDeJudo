/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

import controle.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.ModeloTabela;

/**
 *
 * @author Daniel
 */
public class MenuBuscar extends javax.swing.JFrame {
    
    /** Creates new form MenuBuscar */
    public MenuBuscar() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buscar_nome = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nome_mae = new javax.swing.JTextField();
        buscar_mae = new javax.swing.JButton();
        cpf_ = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        busca_cpf = new javax.swing.JButton();
        nome_completo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        academia = new javax.swing.JTextField();
        academia_botao = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        voltar_botao = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1072, 658));

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 70, 88));
        jLabel2.setText("Menu Buscar");

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        buscar_nome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        buscar_nome.setText("Buscar");
        buscar_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_nomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Buscar Pelo Nome da Mãe");

        buscar_mae.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        buscar_mae.setText("Buscar");
        buscar_mae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_maeActionPerformed(evt);
            }
        });

        cpf_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpf_ActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar Pelo Nome");

        busca_cpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        busca_cpf.setText("Buscar");
        busca_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busca_cpfActionPerformed(evt);
            }
        });

        nome_completo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_completoActionPerformed(evt);
            }
        });

        jLabel5.setText("Buscar Pelo CPF");

        jLabel6.setText("Buscar Pelo Nome da Academia");

        academia_botao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        academia_botao.setText("Buscar");
        academia_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                academia_botaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cpf_, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(busca_cpf))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nome_completo, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscar_nome))
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(academia)
                    .addComponent(nome_mae, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar_mae)
                    .addComponent(academia_botao))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_completo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_nome)
                    .addComponent(nome_mae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_mae))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busca_cpf)
                    .addComponent(academia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(academia_botao))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel4.setText("Resultado da Pesquisa");

        voltar_botao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/left-arrow.png"))); // NOI18N
        voltar_botao.setText("Voltar");
        voltar_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_botaoActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(454, 454, 454)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(voltar_botao)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(voltar_botao)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nome_completoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_completoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_completoActionPerformed

    private void cpf_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpf_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpf_ActionPerformed

    private void voltar_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_botaoActionPerformed
        // TODO add your handling code here:
                dispose();
                TelaInicial b = new TelaInicial();
                b.setTitle("Tela Inicial");
                b.setVisible(true);
                b.setLocationRelativeTo(null);
                b.setSize(1059, 608);
    }//GEN-LAST:event_voltar_botaoActionPerformed

    private void buscar_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_nomeActionPerformed
        BuscarNomePessoa("nome_completo", nome_completo.getText());
    }//GEN-LAST:event_buscar_nomeActionPerformed

    private void buscar_maeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_maeActionPerformed
        BuscarNomePessoa("nome_mae", nome_mae.getText());
    }//GEN-LAST:event_buscar_maeActionPerformed

    private void busca_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busca_cpfActionPerformed
        BuscarNomePessoa("cpf", cpf_.getText());
    }//GEN-LAST:event_busca_cpfActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (table.getSelectedRow() != -1) {
            
            
            
            JOptionPane.showMessageDialog(null, "A Academia Selecionada Foi: " + table.getValueAt(table.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_tableMouseClicked

    private void academia_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_academia_botaoActionPerformed
        BuscarNomePelaAcademia(academia.getText());
    }//GEN-LAST:event_academia_botaoActionPerformed
    
    public void BuscarNomePessoa(String busca, String valor){
        
        ResultSet rs = null;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Nome", "Nome da Mãe", "Telefone", "Idade", "Sexo"};
        
        int cont = 0;
        try {
            //select pessoa.nome_completo from (select aluno.Id_pessoaFK as id from (select * from academia where academia.nome_academia="Academia Sol") as acad inner join aluno on aluno.Id_academiaFK = acad.Id_academia) as alu inner join pessoa on pessoa.Id_pessoa = alu.id;
            stmt = con.prepareStatement("SELECT * FROM pessoa WHERE "+busca+" LIKE '%"+valor+"%'");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                dados.add(new Object[]{rs.getString("nome_completo"), rs.getString("nome_mae"), rs.getString("telefone"), rs.getInt("idade"), rs.getString("sexo")});
                cont++;
            }
                
            if(cont == 0){
                JOptionPane.showMessageDialog(null, "Não Foram Encontrados Registros Para:  "+ valor);
            }else{
            
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);

                table.setModel(modelo);

                table.getColumnModel().getColumn(0).setPreferredWidth(216);
                table.getColumnModel().getColumn(0).setResizable(false);

                table.getColumnModel().getColumn(1).setPreferredWidth(216);
                table.getColumnModel().getColumn(1).setResizable(false);

                table.getColumnModel().getColumn(2).setPreferredWidth(155);
                table.getColumnModel().getColumn(2).setResizable(false);

                table.getColumnModel().getColumn(3).setPreferredWidth(150);
                table.getColumnModel().getColumn(3).setResizable(false);

                table.getColumnModel().getColumn(4).setPreferredWidth(150);
                table.getColumnModel().getColumn(4).setResizable(false);

                table.getTableHeader().setReorderingAllowed(false);
                table.setAutoResizeMode(table.AUTO_RESIZE_OFF);

                table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MenuBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void BuscarNomePelaAcademia(String busca){
        
        ResultSet rs = null;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Nome", "Nome da Mãe", "Telefone", "Idade", "Sexo"};
        
        int cont = 0;
        try {
            
            stmt = con.prepareStatement("select pessoa.* from (select aluno.Id_pessoaFK as id from (select * from academia where academia.nome_academia LIKE '%"+busca+"%') as acad inner join aluno on aluno.Id_academiaFK = acad.Id_academia) as alu inner join pessoa on pessoa.Id_pessoa = alu.id");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                dados.add(new Object[]{rs.getString("nome_completo"), rs.getString("nome_mae"), rs.getString("telefone"), rs.getString("idade"), rs.getString("sexo")});
                cont++;
            }
                
            if(cont == 0){
                JOptionPane.showMessageDialog(null, "Não Foram Encontrados Registros Para:  "+ busca);
            }else{
                
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);

                table.setModel(modelo);

                table.getColumnModel().getColumn(0).setPreferredWidth(216);
                table.getColumnModel().getColumn(0).setResizable(false);

                table.getColumnModel().getColumn(1).setPreferredWidth(216);
                table.getColumnModel().getColumn(1).setResizable(false);

                table.getColumnModel().getColumn(2).setPreferredWidth(155);
                table.getColumnModel().getColumn(2).setResizable(false);

                table.getColumnModel().getColumn(3).setPreferredWidth(150);
                table.getColumnModel().getColumn(3).setResizable(false);

                table.getColumnModel().getColumn(4).setPreferredWidth(150);
                table.getColumnModel().getColumn(4).setResizable(false);

                table.getTableHeader().setReorderingAllowed(false);
                table.setAutoResizeMode(table.AUTO_RESIZE_OFF);

                table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MenuBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuBuscar p = new MenuBuscar();
                p.setTitle("Menu de Busca");
                p.setVisible(true);
                p.setLocationRelativeTo(null);
                p.setSize(1072, 608);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField academia;
    private javax.swing.JButton academia_botao;
    private javax.swing.JButton busca_cpf;
    private javax.swing.JButton buscar_mae;
    private javax.swing.JButton buscar_nome;
    private javax.swing.JTextField cpf_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nome_completo;
    private javax.swing.JTextField nome_mae;
    private javax.swing.JTable table;
    private javax.swing.JButton voltar_botao;
    // End of variables declaration//GEN-END:variables

}
