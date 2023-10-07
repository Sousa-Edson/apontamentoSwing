package view;

import conexao.ConexaoMySQL;
import enums.TipoMovimento;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.Movimentacao;
import model.Produto;
import services.MovimentacaoService;
import services.ProdutoService;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author edson
 */
public class MovimentoGUI extends javax.swing.JFrame {

    /**
     * Creates new form UnidadeGUI
     */
    public MovimentoGUI() {
        initComponents();
        cbProduto.setVisible(false);
        lblCbProduto.setVisible(false);
        btnLimpar.setVisible(false);
        
        carregarTipo();
        carregarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblCbProduto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cbProduto = new javax.swing.JComboBox<>();
        txtBusca = new javax.swing.JTextField();
        lblTxtProduto = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        spQuantidade = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 2, 36)); // NOI18N
        jLabel1.setText("APONTAMENTO SWING");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel2.setText("MOVIMENTOS");

        txtCodigo.setEditable(false);
        txtCodigo.setText("0");
        txtCodigo.setEnabled(false);

        jLabel3.setText("ID:");

        lblCbProduto.setText("PRODUTO: ");

        jLabel5.setText("QUANTIDADE: ");

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Deletar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo", "Descrição", "Unidade", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        cbProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbProdutoKeyPressed(evt);
            }
        });

        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaKeyPressed(evt);
            }
        });

        lblTxtProduto.setText("PRODUTO: ");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        spQuantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel4.setText("TIPO: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(lblCbProduto)
                                    .addComponent(lblTxtProduto)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtBusca)
                                    .addComponent(cbProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscar)
                                    .addComponent(btnLimpar))
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)))
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jLabel2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCbProduto)
                    .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTxtProduto)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        HomeGUI home = new HomeGUI();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        carregarProdutos("");
        carregarTabela();
        limparProduto();
        mostraCampos();
        
        carregarTipo();
        
        carregarProdutos(cbProduto.getSelectedItem().toString());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            adicionarProduto();
        } catch (SQLException ex) {
            Logger.getLogger(UnidadeGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int row = jTable1.rowAtPoint(evt.getPoint());
        int col = jTable1.columnAtPoint(evt.getPoint());
        if (row >= 0) {
            
            txtCodigo.setText("" + jTable1.getValueAt(row, 0));
//            txtNome.setText("" + jTable1.getValueAt(row, 1));
            carregarProdutos("" + jTable1.getValueAt(row, 2));
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        deletarProduto();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        mostraCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        encontrarProdutos(txtBusca.getText());
        txtBusca.requestFocus();
        if (cbProduto.getSelectedObjects().length != 0) {
            escondecampos();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Ação a ser executada quando a tecla Enter é pressionada
            encontrarProdutos(txtBusca.getText());
            txtBusca.requestFocus();
            if (cbProduto.getSelectedObjects().length != 0) {
                escondecampos();
            }
        }
    }//GEN-LAST:event_txtBuscaKeyPressed

    private void cbProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbProdutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            mostraCampos();
        }
    }//GEN-LAST:event_cbProdutoKeyPressed
    public void escondecampos() {
        cbProduto.setVisible(!false);
        lblCbProduto.setVisible(!false);
        btnLimpar.setVisible(!false);
        
        txtBusca.setVisible(false);
        lblTxtProduto.setVisible(false);
        btnBuscar.setVisible(false);
    }
    
    public void mostraCampos() {
        cbProduto.setVisible(false);
        lblCbProduto.setVisible(false);
        btnLimpar.setVisible(false);
        
        txtBusca.setVisible(!false);
        lblTxtProduto.setVisible(!false);
        btnBuscar.setVisible(!false);
        txtBusca.setText("");
        txtBusca.requestFocus();
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
            java.util.logging.Logger.getLogger(MovimentoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovimentoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovimentoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovimentoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovimentoGUI().setVisible(true);
            }
        });
    }
    
    public void adicionarProduto() throws SQLException {
        int quantidade = (int) spQuantidade.getValue();
        int id = Integer.parseInt(txtCodigo.getText());
        String nome = "";
//                txtNome.getText().toUpperCase();
        Produto produto = (Produto) cbProduto.getSelectedItem();
        TipoMovimento tipoMovimento = (TipoMovimento) cbTipo.getSelectedItem();
        if (quantidade >= 1) {
            try (Connection conexao = ConexaoMySQL.obterConexao()) {
                MovimentacaoService movimentacaoService = new MovimentacaoService(conexao);
                
                if (id == 0) {
                    movimentacaoService.adicionarMovimentacao(new Movimentacao(tipoMovimento, produto, quantidade));
                }
//                else {
//                   movimentacaoService.atualizarMovimentacao(new Movimentacao());
//                }
                limparProduto();
                carregarTabela();
            } catch (SQLException e) {
                System.out.println("ERRO: " + e);
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Não deixe campos em branco!", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    public void limparProduto() {
        txtCodigo.setText("0");
        mostraCampos();
        spQuantidade.setValue(0);
    }
    
    public void carregarProdutos(String p) {
        try (Connection conexao = ConexaoMySQL.obterConexao()) {
            ProdutoService produtoService = new ProdutoService(conexao);
            cbProduto.removeAllItems();
            for (Produto produto : produtoService.listarProdutos()) {
                cbProduto.addItem(produto);
                if (produto.getNome().contains(p)) {
                    cbProduto.setSelectedItem(produto);
                }
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e);
            e.printStackTrace();
        }
    }
    
    public void encontrarProdutos(String p) {
        try (Connection conexao = ConexaoMySQL.obterConexao()) {
            ProdutoService produtoService = new ProdutoService(conexao);
            cbProduto.removeAllItems();
            for (Produto produto : produtoService.encontrarProdutosPorNome(p)) {
                cbProduto.addItem(produto);
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e);
            e.printStackTrace();
        }
    }
    
    public void carregarTabela() {
        
        try (Connection conexao = ConexaoMySQL.obterConexao()) {
            MovimentacaoService movimentacaoService = new MovimentacaoService(conexao);
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); // jTable1 é o nome da sua tabela
            List<Movimentacao> movimentos = movimentacaoService.listarMovimentacoes(); // Chame o seu serviço para obter os dados
            model.setRowCount(0); // Remove todas as linhas existentes do modelo de tabela
            for (Movimentacao movimentacao : movimentos) {
                model.addRow(new Object[]{movimentacao.getCodigo(),movimentacao.getTipoMovimento(), movimentacao.getProduto().getNome(),
                    movimentacao.getProduto().getUnidade().getSimbolo(), movimentacao.getQuantidade()});
            }
            jTable1.getTableHeader().setReorderingAllowed(false);
            jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        } catch (SQLException e) {
            System.out.println("ERRO: " + e);
            e.printStackTrace();
        }
    }
    
    public void deletarProduto() {
        try (Connection conexao = ConexaoMySQL.obterConexao()) {
            int codigo = Integer.parseInt(txtCodigo.getText());
            if (codigo != 0) {
                MovimentacaoService movimentacaoService = new MovimentacaoService(conexao);
                movimentacaoService.deletarMovimentacaoPorCodigo(codigo);
                JOptionPane.showMessageDialog(rootPane, "Deletado com sucesso!", "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
                carregarTabela();
            }
            limparProduto();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Em uso!", "Cuidado", JOptionPane.ERROR_MESSAGE);
            
            System.out.println("ERRO: " + e);
            e.printStackTrace();
        }
    }
    
    public void carregarTipo() {

        // Adicione os valores do enum ao modelo de combobox
        Arrays.stream(TipoMovimento.values()).forEach(cbTipo::addItem);
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<Produto> cbProduto;
    private javax.swing.JComboBox<TipoMovimento> cbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCbProduto;
    private javax.swing.JLabel lblTxtProduto;
    private javax.swing.JSpinner spQuantidade;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables

}
