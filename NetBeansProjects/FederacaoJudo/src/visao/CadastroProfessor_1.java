package visao;

import controle.ConnectionFactory;
import static java.awt.Frame.MAXIMIZED_BOTH;
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
import modelo.PreencherTabela;

public class CadastroProfessor_1 extends javax.swing.JFrame {
    private boolean index = false;
    
    
    public CadastroProfessor_1() {
        initComponents();
    }
    
    public CadastroProfessor_1(boolean valor){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Salvar = new javax.swing.JButton();
        nome_pai = new javax.swing.JTextField();
        buscar_foto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        idade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        data_de_outorga = new javax.swing.JTextField();
        nome_mae = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        foto_3x4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cref = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        nome_maee = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        nome_complto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        locais_trabalho = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jLabel16 = new javax.swing.JLabel();
        f = new javax.swing.JCheckBox();
        m = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        graduacao_atual = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/floppy-icon.png"))); // NOI18N
        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        buscar_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        buscar_foto.setText("Buscar");
        buscar_foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_fotoActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefone*");

        jLabel6.setText("CPF*");

        jLabel7.setText("Data de Ourtoga da Graduação*");

        jLabel1.setText("Nome Completo*");

        nome_mae.setText("Nome da Mãe*");

        jLabel4.setText("Nome do Pai ");

        jLabel10.setText("Graduação Ataul*");

        jLabel13.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(17, 70, 88));
        jLabel13.setText("Cadastrar Professor");

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/left-arrow.png"))); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel14.setText("Sexo");

        jLabel15.setFont(new java.awt.Font("Cantarell", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(152, 26, 31));
        jLabel15.setText("*Campos obrigatórios");

        jLabel3.setText("Foto*");

        jLabel12.setText("Locais de Trabalho*");

        jScrollPane3.setViewportView(locais_trabalho);

        jScrollPane4.setViewportView(jTextPane3);

        jLabel16.setText("Competições que Participou*");

        f.setText("Feminino");
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });

        m.setText("Masculino");
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });

        jLabel2.setText("Idade*");

        jLabel8.setText("CREF*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addComponent(nome_complto, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome_mae)
                    .addComponent(nome_maee, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(nome_pai, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(data_de_outorga, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(m)
                    .addComponent(f))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(cref, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel10)
                        .addComponent(graduacao_atual)
                        .addComponent(jLabel3)
                        .addComponent(jLabel12)
                        .addComponent(jScrollPane3)
                        .addComponent(jLabel16)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(foto_3x4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buscar_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(voltar)
                        .addGap(18, 18, 18)
                        .addComponent(Salvar)))
                .addGap(177, 177, 177))
            .addGroup(layout.createSequentialGroup()
                .addGap(407, 407, 407)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_complto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_mae)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_maee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_pai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(graduacao_atual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foto_3x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_foto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(data_de_outorga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(m)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(voltar)
                            .addComponent(Salvar)
                            .addComponent(jLabel15)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel11)
                .addGap(510, 510, 510))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
            if(isIndex() == true){
                dispose();
                CadastroAcademia b = new CadastroAcademia();
                b.setTitle("Cadastrar Academia");
                b.setVisible(true);
                b.setLocationRelativeTo(null);
                b.setSize(1059, 608);
            }else if(isIndex() == false){
                dispose();
                TelaInicial b = new TelaInicial();
                b.setTitle("Tela Inicial");
                b.setVisible(true);
                b.setLocationRelativeTo(null);
                b.setSize(1059, 608);
            }
    }//GEN-LAST:event_voltarActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        // TODO add your handling code here:
        if (nome_complto.getText().equals("") || nome_mae.getText().equals("") || 
            telefone.getText().equals("") ||
            data_de_outorga.getText().equals("") || foto_3x4.getText().equals("") ||
            cpf.equals("") || cref.getText().equals("")|| locais_trabalho.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Preencha os campos obrigatórios!","Aviso",JOptionPane.WARNING_MESSAGE);
        }else{
            
        }
    }//GEN-LAST:event_SalvarActionPerformed

    private void buscar_fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_fotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_fotoActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        
        if(f.isSelected()){
            f.setSelected(false);
        }
    }//GEN-LAST:event_mActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        
        if(m.isSelected()){
            m.setSelected(false);
        }
    }//GEN-LAST:event_fActionPerformed
    
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroProfessor_1 p = new CadastroProfessor_1();
                p.setTitle("Cadastro de Professor");
                p.setVisible(true);
                p.setLocationRelativeTo(null);
                p.setSize(1072, 608);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salvar;
    private javax.swing.JButton buscar_foto;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField cref;
    private javax.swing.JTextField data_de_outorga;
    private javax.swing.JCheckBox f;
    private javax.swing.JTextField foto_3x4;
    private javax.swing.JTextField graduacao_atual;
    private javax.swing.JTextField idade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane locais_trabalho;
    private javax.swing.JCheckBox m;
    private javax.swing.JTextField nome_complto;
    private javax.swing.JLabel nome_mae;
    private javax.swing.JTextField nome_maee;
    private javax.swing.JTextField nome_pai;
    private javax.swing.JTextField telefone;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the index
     */
    public boolean isIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(boolean index) {
        this.index = index;
    }
}