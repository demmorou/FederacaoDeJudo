package visao;

import controle.ConnectionFactory;
import controle.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Academia;
import modelo.Aluno;
import modelo.CadastrarAluno;
import modelo.ModeloTabela;
import modelo.Pessoa;
import modelo.Validar;

public final class CadastroAluno extends javax.swing.JFrame {

    /**
     * @return the tela
     */
    public String getTela() {
        return tela;
    }

    /**
     * @param tela the tela to set
     */
    public void setTela(String tela) {
        this.tela = tela;
    }
    private int id = 0;
    private String sexo = null;
    private String tela = null;
    public CadastroAluno() {
        initComponents();
        PreencherTabela();
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
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##)#####-####");
            telefone_aluno = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jLabel6 = new javax.swing.JLabel();
        graduacao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        data_ourtoga = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");
            data_ourtoga = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("###########");
            cpf = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        path_imagem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        competicoes = new javax.swing.JTextPane();
        jLabel17 = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        masculino = new javax.swing.JCheckBox();
        feminino = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        idade = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##");
            idade = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nome_ac = new javax.swing.JLabel();
        add_ac = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

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

        telefone_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone_alunoActionPerformed(evt);
            }
        });

        jLabel6.setText("Graduação Atual*");

        jLabel7.setText("Data de Ourtoga da Graduação*");

        jLabel8.setText("Competições Que Participou*");

        jLabel9.setText("Foto 3x4*");

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        buscar.setText("Escolher");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 70, 88));
        jLabel10.setText("Cadastrar Aluno");

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/left-arrow.png"))); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel11.setText("CPF*");

        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(152, 26, 31));
        jLabel12.setText("*Campos obrigatórios");

        jLabel13.setText("Selecione a Academia de Vínculo*");

        jScrollPane1.setViewportView(competicoes);

        jLabel17.setText("Peso (Kg)*");

        peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoActionPerformed(evt);
            }
        });

        masculino.setText("Masculino");
        masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masculinoActionPerformed(evt);
            }
        });

        feminino.setText("Feminino");
        feminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femininoActionPerformed(evt);
            }
        });

        jLabel18.setText("Escolha o Sexo*");

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
        jScrollPane3.setViewportView(table);

        jLabel19.setText("Academia: ");

        jLabel20.setText("Idade*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        nome_ac.setFont(new java.awt.Font("Bitstream Vera Serif", 0, 15)); // NOI18N
        nome_ac.setForeground(new java.awt.Color(8, 160, 26));

        add_ac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add-1_1.png"))); // NOI18N
        add_ac.setText("Nova Academia");
        add_ac.setToolTipText("Adicionar Academia");
        add_ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_acActionPerformed(evt);
            }
        });

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/reload (1).png"))); // NOI18N
        refresh.setToolTipText("Atualizar");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(nome_completo, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(nome_mae)
                    .addComponent(jLabel4)
                    .addComponent(nome_pai)
                    .addComponent(jLabel5)
                    .addComponent(telefone_aluno)
                    .addComponent(jLabel3)
                    .addComponent(graduacao)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(data_ourtoga)
                    .addComponent(jLabel12))
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(refresh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(add_ac))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(feminino, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(masculino, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nome_ac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(path_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(voltar)
                                    .addGap(18, 18, 18)
                                    .addComponent(salvar))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel8)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel10)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel20))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nome_completo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(path_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buscar)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(masculino)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(feminino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nome_ac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(add_ac)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(graduacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(data_ourtoga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(231, 231, 231))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(nome_mae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(nome_pai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefone_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addGap(53, 53, 53)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar)
                    .addComponent(salvar)
                    .addComponent(jLabel12))
                .addContainerGap(47, Short.MAX_VALUE))
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

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        
        CadastrarAluno ca = new CadastrarAluno();

        if (ca.DadosCadastroAluno(nome_completo.getText(), nome_mae.getText(),
            telefone_aluno.getText(), data_ourtoga.getText(),
            idade.getText(), competicoes.getText(),
            nome_pai.getText(), path_imagem.getText(),
            cpf.getText(), nome_ac.getText(),
            peso.getText(), graduacao.getText(), getSexo())) {
                
                JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso!");
        }else{
                JOptionPane.showMessageDialog(null, "Erro ao Salvar os Dados\nVerifique se você preencheu os dados corretamente!");
        }
            
        
    }//GEN-LAST:event_salvarActionPerformed

    private void pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoActionPerformed

    private void masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masculinoActionPerformed
        setSexo("Masculino");
        if (feminino.isSelected()) {
            feminino.setSelected(false);
        }
    }//GEN-LAST:event_masculinoActionPerformed

    private void femininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femininoActionPerformed
        setSexo("Feminino");
        if (masculino.isSelected()) {
            masculino.setSelected(false);
        }
    }//GEN-LAST:event_femininoActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        JFileChooser arquivo = new JFileChooser();
        FileNameExtensionFilter filtroPDF = new FileNameExtensionFilter("Foto", "png", "jpg", "jpeg");
        arquivo.addChoosableFileFilter(filtroPDF);
        arquivo.setAcceptAllFileFilterUsed(false);

        if (arquivo.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            path_imagem.setText(arquivo.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (table.getSelectedRow() != -1) {
            nome_ac.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
            setId(getIDAcademia(table.getValueAt(table.getSelectedRow(), 0).toString()));
            JOptionPane.showMessageDialog(null, "A Academia Selecionada Foi: " + table.getValueAt(table.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_tableMouseClicked

    private void add_acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_acActionPerformed
        CadastroAcademia ca = new CadastroAcademia();
        ca.setIndex("aluno");
        ca.setTitle("Cadastrar Academia");
        ca.setVisible(true);
        ca.setLocationRelativeTo(null);
        ca.setSize(1072, 608);
    }//GEN-LAST:event_add_acActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        PreencherTabela();
    }//GEN-LAST:event_refreshActionPerformed

    private void telefone_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone_alunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone_alunoActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        if (getTela().equals("cadastro")){
            dispose();
        }
    }//GEN-LAST:event_voltarActionPerformed


    public void salvarCadastro() {

        Pessoa p = new Pessoa();

        DAO dao = new DAO();
        Validar v = new Validar();
        
        p.setNomeCompleto(nome_completo.getText());
        p.setNomeMae(nome_mae.getText());
        if(nome_pai.getText().equals("")){
            p.setNomePai("---");
        }else{
            p.setNomePai(nome_pai.getText());
        }
        
        p.setCatDiv("-------");
        p.setCpf(cpf.getText());
        p.setCurriculun(competicoes.getText());
        p.setGraduacaoAtual(graduacao.getText());
        p.setTelefone(telefone_aluno.getText());
        p.setDataOutorga(data_ourtoga.getText());
        p.setFoto3x4(path_imagem.getText());
        p.setPeso(Float.valueOf(peso.getText().replace(",", ".")));
        p.setIdade(Integer.parseInt(idade.getText()));
        p.setCatDiv(Validar.categoria_masculina(Float.valueOf(peso.getText().replace(",", ".")), Integer.parseInt(idade.getText())));
        p.setSexo(getSexo());
        
        dao.createPessoa(p);
    }

    public int getIDPEssoa() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Integer> cod = new ArrayList();
        try {
            stmt = con.prepareStatement("SELECT * FROM pessoa");
            rs = stmt.executeQuery();

            while (rs.next()) {
                cod.add(rs.getInt("Id_pessoa"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar ID: " + ex);
        }

        return cod.get(cod.size() - 1);
    }

    public int getIDAcademia(String name_academia) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int ida = -1;
        try {
            stmt = con.prepareStatement("SELECT Id_academia, nome_academia FROM academia WHERE nome_academia = '"+name_academia+"'");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                if(rs.getString("nome_academia").equals(name_academia)){
                    ida = rs.getInt("Id_academia");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar ID: "+ ex);
        }

        return ida;
    }

    public void PreencherTabela() {
        ResultSet rs = null;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("SELECT nome_academia FROM academia");
            rs = stmt.executeQuery();

            ArrayList dados = new ArrayList();
            String[] Colunas = new String[]{"Nome Da Academia"};

            try {
                while (rs.next()) {
                    dados.add(new Object[]{rs.getString("nome_academia")});
                }
                if (dados.size() < 1) {
                    if (JOptionPane.showConfirmDialog(null, "Desculpe, Não Há Academia Cadastrada! \n\nDeseja Cadastrar Uma Nova Academia?") == JOptionPane.OK_OPTION) {
                        dispose();
                        CadastroAcademia p = new CadastroAcademia();
                        p.setIndex("aluno");
                        p.setTitle("Cadastro de Academia");
                        p.setVisible(true);
                        p.setLocationRelativeTo(null);
                        p.setSize(1072, 608);
                    }
                } else {
                    ModeloTabela modelo = new ModeloTabela(dados, Colunas);

                    table.setModel(modelo);

                    table.getColumnModel().getColumn(0).setPreferredWidth(216);
                    table.getColumnModel().getColumn(0).setResizable(false);

                    table.getTableHeader().setReorderingAllowed(false);
                    table.setAutoResizeMode(table.AUTO_RESIZE_OFF);

                    table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList! " + ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CadastroAcademia.class.getName()).log(Level.SEVERE, null, ex);
        }

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
    private javax.swing.JButton add_ac;
    private javax.swing.JButton buscar;
    private javax.swing.JTextPane competicoes;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField data_ourtoga;
    private javax.swing.JCheckBox feminino;
    private javax.swing.JTextField graduacao;
    private javax.swing.JTextField idade;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBox masculino;
    private javax.swing.JLabel nome_ac;
    private javax.swing.JTextField nome_completo;
    private javax.swing.JTextField nome_mae;
    private javax.swing.JTextField nome_pai;
    private javax.swing.JTextField path_imagem;
    private javax.swing.JTextField peso;
    private javax.swing.JButton refresh;
    private javax.swing.JButton salvar;
    private javax.swing.JTable table;
    private javax.swing.JTextField telefone_aluno;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
