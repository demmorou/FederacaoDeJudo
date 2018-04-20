package visao;

import controle.ConnectionFactory;
import controle.DAO;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Academia;
import modelo.Aluno;
import modelo.Pessoa;

public class CadastroAluno extends javax.swing.JFrame {

    public CadastroAluno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        salvar = new javax.swing.JButton();
        nome_completo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nome_mae = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nome_pai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telefone_aluno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        graduacao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        data_ourtoga = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nome_academia = new javax.swing.JTextField();
        path_imagem = new javax.swing.JTextField();
        box_prof = new javax.swing.JCheckBox();
        box_aluno = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        cref = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        locais_de_trabalho = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        competicoes = new javax.swing.JTextPane();
        jLabel17 = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1072, 658));

        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/floppy-icon.png"))); // NOI18N
        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        nome_completo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_completoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome Completo*");

        jLabel3.setText("Nome da Mãe*");

        nome_mae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_maeActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome do Pai");

        jLabel5.setText("Telefone*");

        jLabel6.setText("Graduação Atual*");

        jLabel7.setText("Data de Ourtoga da Graduação*");

        jLabel8.setText("Competições em que teve participação");

        jLabel9.setText("Foto 3x4*");

        buscar.setText("Escolher");

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 70, 88));
        jLabel10.setText("Cadastrar Aluno ou Professor");

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/left-arrow.png"))); // NOI18N
        voltar.setText("Voltar");

        jLabel11.setText("CPF*");

        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(152, 26, 31));
        jLabel12.setText("*Campos obrigatórios");

        jLabel13.setText("Academia Que Participa*");

        box_prof.setText("Professor");
        box_prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_profActionPerformed(evt);
            }
        });

        box_aluno.setText("Aluno");
        box_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_alunoActionPerformed(evt);
            }
        });

        jLabel14.setText("Escolha Uma Opção*");

        jLabel15.setText("CREF*");

        jLabel16.setText("Locais de Trabalho*");

        jScrollPane1.setViewportView(competicoes);

        jLabel17.setText("Peso (Kg)*");

        peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(nome_completo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome_mae, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(nome_pai, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(telefone_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(graduacao, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(data_ourtoga, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12))
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel17))
                                .addGap(0, 105, Short.MAX_VALUE))
                            .addComponent(cpf)
                            .addComponent(peso)
                            .addComponent(nome_academia))
                        .addGap(214, 214, 214))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(path_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscar))
                            .addComponent(box_aluno)
                            .addComponent(box_prof)
                            .addComponent(jLabel14)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(locais_de_trabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(voltar)
                                    .addGap(18, 18, 18)
                                    .addComponent(salvar))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(cref, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome_completo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel17))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome_mae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(nome_pai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(telefone_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(graduacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(data_ourtoga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome_academia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(path_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addGap(6, 6, 6)
                        .addComponent(box_prof)
                        .addGap(3, 3, 3)
                        .addComponent(box_aluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addGap(6, 6, 6)
                        .addComponent(cref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel16)
                        .addGap(6, 6, 6)
                        .addComponent(locais_de_trabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar)
                    .addComponent(voltar)
                    .addComponent(jLabel12))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfActionPerformed

    private void nome_completoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_completoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_completoActionPerformed

    private void nome_maeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_maeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_maeActionPerformed

    private void box_profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_profActionPerformed
        if(box_aluno.isSelected()){
            System.out.println("professor");
            box_aluno.setSelected(false);
        }
    }//GEN-LAST:event_box_profActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        Aluno a = new Aluno();
        Pessoa p = new Pessoa();
        Academia ac = new Academia();
        DAO dao = new DAO();
        int ida = getIDAcademia();
        
        if(box_aluno.isSelected() || box_prof.isSelected()){
            if(ida != -1){
                salvarCadastro();
            if(box_aluno.isSelected()){
                
                p.setIdpessoa(getIDPEssoa());
                a.setIdpessoaFK(p);
                a.setIdpessoaFK(p);
                dao.createAluno(a);
                
                }else{
                    JOptionPane.showMessageDialog(null, "Informe o nome de uma academia ja cadastrada!", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
                
            }else if(box_prof.isSelected()){
                 System.out.println(getIDPEssoa());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Por Favor, Selecione um CheckBox informando se esse cadastro se refere a aluno ou professor!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_salvarActionPerformed

    private void box_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_alunoActionPerformed
        if(box_prof.isSelected()){
            System.out.println("aluno");
            box_prof.setSelected(false);
        }
    }//GEN-LAST:event_box_alunoActionPerformed

    private void pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoActionPerformed
    
//    public void ass(){
//        academia_que_participa.setEditable(false);
//        path_imagem.setEditable(false);
//    }
    
    public void salvarCadastro(){
        
            Pessoa p = new Pessoa();
            Date data = null;
            Date dataBanco;
            ResultSet rs = null;
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            
            DAO dao = new DAO();
            
            p.setNomeCompleto(nome_completo.getText());
            p.setNomeMae(nome_mae.getText());
            p.setCpf(cpf.getText());
            p.setCurriculun(competicoes.getText());
            p.setGraduacaoAtual(graduacao.getText());
            p.setTelefone(Integer.parseInt(telefone_aluno.getText()));
            p.setDataOutorga(data_ourtoga.getText());
            p.setFoto3x4(path_imagem.getText());
            
            dao.createPessoa(p);
    }
    
    public int getIDPEssoa(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Integer> cod = new ArrayList();
        try {
            stmt = con.prepareStatement("SELECT * FROM pessoa");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                cod.add(rs.getInt("Id_pessoa"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar ID: "+ ex);
        }
        
        return cod.get(cod.size()-1);
    }
    
    public int getIDAcademia(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int ida = -1;
        try {
            stmt = con.prepareStatement("SELECT Id_academia, nome_academia FROM academia = '"+nome_academia.getText()+"'");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                if(rs.getString("nome_academia") == nome_academia.getText()){
                    ida = rs.getInt("Id_academia");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar ID: "+ ex);
        }
        
        return ida;
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroAluno a = new CadastroAluno();
                a.setTitle("Cadastrar");
                a.setVisible(true);
                a.setLocationRelativeTo(null);
                a.setSize(1072, 608);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox box_aluno;
    private javax.swing.JCheckBox box_prof;
    private javax.swing.JButton buscar;
    private javax.swing.JTextPane competicoes;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField cref;
    private javax.swing.JTextField data_ourtoga;
    private javax.swing.JTextField graduacao;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField locais_de_trabalho;
    private javax.swing.JTextField nome_academia;
    private javax.swing.JTextField nome_completo;
    private javax.swing.JTextField nome_mae;
    private javax.swing.JTextField nome_pai;
    private javax.swing.JTextField path_imagem;
    private javax.swing.JTextField peso;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField telefone_aluno;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
