/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.agenda;

import Factory.ConnectionFactory;
import Factory.PacienteDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author Daniel S
 */
public class Aplicacao extends javax.swing.JFrame {

  
    public Aplicacao() {
        initComponents();
        inicializar();
    }

    private void inicializar() {
        try {
            pacienteDAO = new PacienteDAO(ConnectionFactory.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(Aplicacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        enderecos = new ArrayList<>();
        enderecosTableModel = new EnderecoTableModel(enderecos);
        tbEnde.setModel((TableModel) enderecosTableModel);
        
        pacientes = new ArrayList<>();
        pacientesTableModel = new PacienteTableModel(pacientes);
        tbRegistro.setModel((TableModel) pacientesTableModel);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo = new javax.swing.ButtonGroup();
        maisDados = new javax.swing.JFrame();
        pnMais = new javax.swing.JPanel();
        btnPesqui = new javax.swing.JButton();
        txtnome = new javax.swing.JTextField();
        jScrollPane = new javax.swing.JScrollPane();
        tbEnde = new javax.swing.JTable();
        painelPrincipal = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        Paciente = new javax.swing.JLabel();
        Idade = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        Diagnostico = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        Rua = new javax.swing.JLabel();
        Numero = new javax.swing.JLabel();
        Bairro = new javax.swing.JLabel();
        Cidade = new javax.swing.JLabel();
        UF = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtDiagno = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancela = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtUF = new javax.swing.JTextField();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPaciPes = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRegistro = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnMaisInfo = new javax.swing.JButton();

        btnPesqui.setText("Pesquisar");
        btnPesqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquiActionPerformed(evt);
            }
        });

        tbEnde.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane.setViewportView(tbEnde);

        javax.swing.GroupLayout pnMaisLayout = new javax.swing.GroupLayout(pnMais);
        pnMais.setLayout(pnMaisLayout);
        pnMaisLayout.setHorizontalGroup(
            pnMaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMaisLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnPesqui, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMaisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnMaisLayout.setVerticalGroup(
            pnMaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMaisLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnMaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesqui))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout maisDadosLayout = new javax.swing.GroupLayout(maisDados.getContentPane());
        maisDados.getContentPane().setLayout(maisDadosLayout);
        maisDadosLayout.setHorizontalGroup(
            maisDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maisDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnMais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        maisDadosLayout.setVerticalGroup(
            maisDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maisDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnMais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Paciente.setText("Paciente");

        Idade.setText("Idade");

        CPF.setText("CPF");

        Diagnostico.setText("Diagnostico");

        ID.setText("ID");

        Rua.setText("Rua");

        Numero.setText("Numero");

        Bairro.setText("Bairro");

        Cidade.setText("Cidade");

        UF.setText("UF");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.setMaximumSize(new java.awt.Dimension(75, 25));
        btnAdicionar.setMinimumSize(new java.awt.Dimension(75, 25));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setMaximumSize(new java.awt.Dimension(75, 25));
        btnSalvar.setMinimumSize(new java.awt.Dimension(75, 25));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancela.setText("Cancelar");
        btnCancela.setMaximumSize(new java.awt.Dimension(75, 25));
        btnCancela.setMinimumSize(new java.awt.Dimension(75, 25));
        btnCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaActionPerformed(evt);
            }
        });

        btnGrupo.add(rbMasculino);
        rbMasculino.setText("Masculino");
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });

        btnGrupo.add(rbFeminino);
        rbFeminino.setText("Feminino");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ID)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Paciente))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Idade)
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(CPF)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Diagnostico)
                            .addComponent(txtDiagno, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(Bairro)
                            .addComponent(txtCPF))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Rua)
                                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cidade)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(rbMasculino)
                                .addGap(18, 18, 18)
                                .addComponent(rbFeminino))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCidade))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numero))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UF)
                            .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID)
                    .addComponent(Paciente)
                    .addComponent(Idade))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(CPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Diagnostico)
                    .addComponent(Rua))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiagno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bairro)
                    .addComponent(Cidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UF)
                    .addComponent(Numero))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        painelPrincipal.addTab("Registro", jPanel2);

        jLabel1.setText("Paciente");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tbRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbRegistro);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnMaisInfo.setText("Mais Informações");
        btnMaisInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMaisInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtPaciPes)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(121, 121, 121))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaciPes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(btnExcluir)
                    .addComponent(btnMaisInfo))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        painelPrincipal.addTab("Pesquisa", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        paciente = new Paciente();
        limparEdits();
        txtPaciente.grabFocus();
        txtPaciente.setEnabled(true);
        btnAdicionar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancela.setEnabled(true);
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        editParaPaciente();
       
        try {
            if(paciente.getId() == null || paciente.getId() == 0) {
                Integer id = pacienteDAO.create(paciente);   
                paciente.setId(id);
                txtId.setText(id.toString());

            } else {
                pacienteDAO.update(paciente);
                
            }

            btnAdicionar.setEnabled(true);
            btnExcluir.setEnabled(true);
            btnCancela.setEnabled(true);

            JOptionPane.showMessageDialog(this, "Gravado com sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
            btnAdicionarActionPerformed(null);
        } catch (SQLException ex) {
            Logger.getLogger(Aplicacao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erro ao gravar pessoa", "Erro", JOptionPane.ERROR);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            pacientes = pacienteDAO.findByNome(txtPaciPes.getText());
            pacientesTableModel.setPacientes(pacientes);
            pacientesTableModel.fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(Aplicacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resultado = JOptionPane.showConfirmDialog(this, "Confirma exclusão", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION);
        if(resultado == 0) {
            try {
                pacienteDAO.delete(paciente);
                limparEdits();
                btnExcluir.setEnabled(false);
                btnCancela.setEnabled(false);
            } catch (SQLException ex) {
                Logger.getLogger(Aplicacao.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Erro ao excluir", "Erro", JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
        paciente = null;
        limparEdits();
        btnAdicionar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancela.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnCancelaActionPerformed

    private void btnMaisInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisInfoActionPerformed
        maisDados.setVisible(true);
    }//GEN-LAST:event_btnMaisInfoActionPerformed

    private void btnPesquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquiActionPerformed
        try {
            pacientes = pacienteDAO.findByNome(txtnome.getText());
            enderecosTableModel.setEnderecos(pacientes);
            enderecosTableModel.fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(Aplicacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquiActionPerformed

    
    private void tbPacientesMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        if(evt.getClickCount() == 2) {
            paciente = pacientes.get(tbRegistro.getSelectedRow());
            pacienteParaEdit();
            painelPrincipal.setSelectedIndex(1);
            txtPaciente.setEnabled(true);
            btnAdicionar.setEnabled(false);
            btnSalvar.setEnabled(true);
            btnCancela.setEnabled(true);
            btnExcluir.setEnabled(true);
        }
    } 
    
    
    
    private void editParaPaciente() {
        if(txtId.getText() != null && !txtId.getText().isEmpty()) {
            paciente.setId(Integer.parseInt(txtId.getText()));
        }

        paciente.setNome(txtPaciente.getText());
        paciente.setIdade(Integer.parseInt(txtIdade.getText()));
        paciente.setDoenca(txtDiagno.getText());
        paciente.setCPF(txtCPF.getText());
        paciente.setRua(txtRua.getText());
        paciente.setNumero(Integer.parseInt(txtNumero.getText()));
        paciente.setBairro(txtBairro.getText());
        paciente.setCidade(txtCidade.getText());
        paciente.setUF(txtUF.getText());
        //endereco.setDia(txtData.getDate);
      
        
    }

    private void pacienteParaEdit() {
        txtId.setText(paciente.getId().toString());
        txtPaciente.setText(paciente.getNome());
        txtIdade.setText(paciente.getIdade().toString());
        txtDiagno.setText(paciente.getDoenca());
        txtCPF.setText(paciente.getCPF());
        txtRua.setText(paciente.getRua());
        txtNumero.setText(paciente.getNumero().toString());
        txtBairro.setText(paciente.getBairro());
        txtCidade.setText(paciente.getCidade());
        txtUF.setText(paciente.getUF());
    }

    private void limparEdits() {
        txtId.setText("");
        txtPaciente.setText("");
        txtIdade.setText("");
        txtDiagno.setText("");
        txtCPF.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtUF.setText("");
    }
    //GRAVA ENDERECO
    
    
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
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bairro;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Cidade;
    private javax.swing.JLabel Diagnostico;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Idade;
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel Paciente;
    private javax.swing.JLabel Rua;
    private javax.swing.JLabel UF;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancela;
    private javax.swing.JButton btnExcluir;
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JButton btnMaisInfo;
    private javax.swing.JButton btnPesqui;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFrame maisDados;
    private javax.swing.JTabbedPane painelPrincipal;
    private javax.swing.JPanel pnMais;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTable tbEnde;
    private javax.swing.JTable tbRegistro;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtDiagno;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPaciPes;
    private javax.swing.JTextField txtPaciente;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtUF;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
    private Paciente paciente;
    private PacienteDAO pacienteDAO;
    private List<Paciente> pacientes;
    private List<Paciente> enderecos;
    private PacienteTableModel pacientesTableModel;
    private EnderecoTableModel enderecosTableModel;
}

