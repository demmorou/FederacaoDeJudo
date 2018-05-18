package visao;

import controle.ConnectionFactory;
import controle.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Academia;
import modelo.CadastrarProfessor;
import modelo.ModeloTabela;
import modelo.Pessoa;
import modelo.Professor;
import modelo.Validar;
public final class CadastroProfessor extends javax.swing.JFrame {
    private boolean index = false;
    private int id_academia = 0;
    private String vinculo = null;
    private String sexo = null;
    
    public CadastroProfessor() {
        initComponents();
        PreencherTabela();
    }
    
    public CadastroProfessor(boolean valor){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Salvar = new javax.swing.JButton();
        nome_pai = new javax.swing.JTextField();
        buscar_foto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        telefone_professor = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##)#####-####");
            telefone_professor = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jLabel6 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("###########");
            cpf = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        idade = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##");
            idade = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        data_ourtoga = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");
            data_ourtoga = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        kkk = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        path_imagem = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cref = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        nome_mae = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        nome_completo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        locais_trabalho = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        competicoes = new javax.swing.JTextPane();
        jLabel16 = new javax.swing.JLabel();
        f = new javax.swing.JCheckBox();
        m = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        graduacao = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        nome_ac = new javax.swing.JLabel();
        add_academia = new javax.swing.JToggleButton();
        jLabel18 = new javax.swing.JLabel();
        prof = new javax.swing.JCheckBox();
        prof_res = new javax.swing.JCheckBox();
        refresh = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/floppy-icon.png"))); // NOI18N
        Salvar.setText("Salvar");
        Salvar.setToolTipText("Salvar");
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

        kkk.setText("Nome da Mãe*");

        jLabel4.setText("Nome do Pai ");

        jLabel10.setText("Graduação Atual*");

        jLabel13.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(17, 70, 88));
        jLabel13.setText("Cadastrar Professor");

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/left-arrow.png"))); // NOI18N
        voltar.setText("Voltar");
        voltar.setToolTipText("Voltar");
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

        jScrollPane4.setViewportView(competicoes);

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

        jLabel17.setText("Selecione a Academia de Vínculo*");

        jLabel19.setText("Academia: ");

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
        jScrollPane5.setViewportView(table);

        nome_ac.setFont(new java.awt.Font("Bitstream Vera Serif", 0, 15)); // NOI18N
        nome_ac.setForeground(new java.awt.Color(8, 160, 26));

        add_academia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add-1_1.png"))); // NOI18N
        add_academia.setText("Nova Academia");
        add_academia.setToolTipText("Nova Academia");
        add_academia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_academiaActionPerformed(evt);
            }
        });

        jLabel18.setText("Tipo de Vínculo*");

        prof.setText("Apenas Professor");
        prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profActionPerformed(evt);
            }
        });

        prof_res.setText("Professor Responsável");
        prof_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prof_resActionPerformed(evt);
            }
        });

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/reload (1).png"))); // NOI18N
        refresh.setToolTipText("Atualizar");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jLabel9.setText("Peso (Kg)*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel15)))
                .addGap(410, 438, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(kkk)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(telefone_professor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(data_ourtoga, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(m)
                    .addComponent(f)
                    .addComponent(nome_mae, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(nome_completo)
                    .addComponent(nome_pai))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cref, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(graduacao, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(path_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar_foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(voltar)
                            .addGap(18, 18, 18)
                            .addComponent(Salvar))
                        .addComponent(prof_res)
                        .addComponent(prof)
                        .addComponent(jLabel18)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(refresh)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(add_academia))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nome_ac, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(6, 6, 6)
                                .addComponent(nome_completo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(kkk)
                                .addGap(6, 6, 6)
                                .addComponent(nome_mae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4)
                                .addGap(11, 11, 11)
                                .addComponent(nome_pai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel5)
                                .addGap(12, 12, 12)
                                .addComponent(telefone_professor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6)
                                .addComponent(data_ourtoga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel14)
                                .addGap(6, 6, 6)
                                .addComponent(m)
                                .addGap(6, 6, 6)
                                .addComponent(f)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19)
                                    .addComponent(nome_ac, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add_academia))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prof)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prof_res)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(voltar)
                                    .addComponent(Salvar)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8)
                        .addGap(19, 19, 19)
                        .addComponent(cref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel10)
                        .addGap(11, 11, 11)
                        .addComponent(graduacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(path_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar_foto))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel16)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 54, Short.MAX_VALUE))
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
        
        CadastrarProfessor cp = new CadastrarProfessor();
        Pessoa p = new Pessoa();
        Professor pr = new Professor();
        
        p.setNomeCompleto(nome_completo.getText());
        p.setNomeMae(nome_mae.getText());
        p.setNomePai(nome_pai.getText());
        p.setCatDiv("nao defined");
        p.setCpf(cpf.getText());
        p.setCurriculun(competicoes.getText());
        p.setDataOutorga(data_ourtoga.getText());
        p.setFoto3x4(path_imagem.getText());
        p.setGraduacaoAtual(graduacao.getText());
  
        if(!idade.getText().equals("  "))
            p.setIdade(Integer.parseInt(idade.getText()));
        else
            p.setIdade(0);
        
        if(!peso.getText().equals(""))
            p.setPeso(Float.parseFloat(peso.getText()));
        else
            p.setPeso((float)0.0);
        
        p.setSexo(getSexo());
        p.setStatusPag(0);
        p.setTelefone(telefone_professor.getText());
        
        pr.setLocaisDeTrabalho(locais_trabalho.getText());
        pr.setCref(Integer.parseInt(cref.getText()));
        //pr.setVinculoComAcademia(vinculo);
        
        if (cp.DadosCadastroProfessor(p, pr, nome_ac.getText())) 
            JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso!");
        else
            JOptionPane.showMessageDialog(null, "Por favor, Preencha os campos obrigatórios!","Aviso",JOptionPane.WARNING_MESSAGE);
        
    }//GEN-LAST:event_SalvarActionPerformed

    private void buscar_fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_fotoActionPerformed
        JFileChooser arquivo = new JFileChooser();
        FileNameExtensionFilter filtroPDF = new FileNameExtensionFilter("Foto", "png", "jpg", "jpeg");
        arquivo.addChoosableFileFilter(filtroPDF);
        arquivo.setAcceptAllFileFilterUsed(false);
        
        if (arquivo.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            path_imagem.setText(arquivo.getSelectedFile().getAbsolutePath());
        }
        
    }//GEN-LAST:event_buscar_fotoActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (table.getSelectedRow() != -1) {
            setId_academia(getIDAcademia(table.getValueAt(table.getSelectedRow(), 0).toString()));
            nome_ac.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
            JOptionPane.showMessageDialog(null, "A Academia Selecionada Foi: " + table.getValueAt(table.getSelectedRow(), 0).toString());
        }
        
    }//GEN-LAST:event_tableMouseClicked

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        setSexo("Masculino");
        if(f.isSelected()){
            f.setSelected(false);
        }
    }//GEN-LAST:event_mActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        setSexo("Feminino");
        if(m.isSelected()){
            m.setSelected(false);
        }
    }//GEN-LAST:event_fActionPerformed

    private void add_academiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_academiaActionPerformed

        CadastroAcademia b = new CadastroAcademia();
        b.setIndex("professor");
        b.setTitle("Cadastrar Academia");
        b.setVisible(true);
        b.setLocationRelativeTo(null);
        b.setSize(1059, 608);
    }//GEN-LAST:event_add_academiaActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        PreencherTabela();
    }//GEN-LAST:event_refreshActionPerformed

    private void profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profActionPerformed
        setVinculo("professor");
        if(prof_res.isSelected()){
            prof_res.setSelected(false);
        }
    }//GEN-LAST:event_profActionPerformed

    private void prof_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prof_resActionPerformed
        setVinculo("professor responsavel");
        if(prof.isSelected()){
            prof.setSelected(false);
        }
    }//GEN-LAST:event_prof_resActionPerformed
    
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
                if (dados.size() >= 1) {
                    
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
    
    public int getIDAcademia(String nome_academiaa) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int ida = -1;
        System.out.println(nome_academiaa);
        try {
            stmt = con.prepareStatement("SELECT Id_academia, nome_academia FROM academia WHERE nome_academia = '"+nome_academiaa+"'");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                if(rs.getString("nome_academia").equals(nome_academiaa)){
                    ida = rs.getInt("Id_academia");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar ID: "+ ex);
        }
        System.out.println(ida);
        return ida;
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
    
    public void salvarCadastro() {

        Pessoa p = new Pessoa();

        DAO dao = new DAO();

        p.setNomeCompleto(nome_completo.getText());
        p.setNomeMae(nome_mae.getText());
        
        if(nome_pai.getText().equals("")){
            p.setNomePai("---");
        }else{
            p.setNomePai(nome_pai.getText());
        }
        p.setCatDiv("-----");
        p.setPeso(Float.valueOf(peso.getText().replace(",", ".")));
        p.setIdade(Integer.parseInt(idade.getText()));
        p.setSexo(getSexo());
        p.setCpf(cpf.getText());
        p.setCurriculun(competicoes.getText());
        p.setGraduacaoAtual(graduacao.getText());
        p.setTelefone(telefone_professor.getText());
        p.setDataOutorga(data_ourtoga.getText());
        p.setFoto3x4(path_imagem.getText());

        dao.createPessoa(p);
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
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroProfessor p = new CadastroProfessor();
                p.setTitle("Cadastro de Professor");
                p.setVisible(true);
                p.setLocationRelativeTo(null);
                p.setSize(1072, 608);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salvar;
    private javax.swing.JToggleButton add_academia;
    private javax.swing.JButton buscar_foto;
    private javax.swing.JTextPane competicoes;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField cref;
    private javax.swing.JTextField data_ourtoga;
    private javax.swing.JCheckBox f;
    private javax.swing.JTextField graduacao;
    private javax.swing.JTextField idade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel kkk;
    private javax.swing.JTextPane locais_trabalho;
    private javax.swing.JCheckBox m;
    private javax.swing.JLabel nome_ac;
    private javax.swing.JTextField nome_completo;
    private javax.swing.JTextField nome_mae;
    private javax.swing.JTextField nome_pai;
    private javax.swing.JTextField path_imagem;
    private javax.swing.JTextField peso;
    private javax.swing.JCheckBox prof;
    private javax.swing.JCheckBox prof_res;
    private javax.swing.JButton refresh;
    private javax.swing.JTable table;
    private javax.swing.JTextField telefone_professor;
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

    /**
     * @return the id_academia
     */
    public int getId_academia() {
        return id_academia;
    }

    /**
     * @param id_academia the id_academia to set
     */
    public void setId_academia(int id_academia) {
        this.id_academia = id_academia;
    }

    /**
     * @return the vinculo
     */
    public String getVinculo() {
        return vinculo;
    }

    /**
     * @param vinculo the vinculo to set
     */
    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
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