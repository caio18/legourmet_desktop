/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.legourmet.view;

import br.com.legourmet.dao.ItemDAO;
import br.com.legourmet.model.Item;
import br.com.legourmet.model.ItemTableModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gouri
 */
public class FormCardapio extends javax.swing.JFrame {

    private ItemTableModel itemTableModel;
    
    private void prepararTable() {
        ItemDAO itemDAO = new ItemDAO();
        ArrayList<Item> itens = new ArrayList<>();
        try {
            itens = itemDAO.listar();
        } catch (Exception ex) {
            Logger.getLogger(FormCardapio.class.getName()).log(Level.SEVERE, null, ex);
        }
        //pesquisar clientes cadastrados no banco de dados
        itemTableModel = new ItemTableModel(itens);
        tableListaItens1.setModel(itemTableModel);
    }
    
    /**
     * Creates new form FormPrincipalAdmin
     */
    public FormCardapio() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);//Tela centralizada
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGDisponivel1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        btnHome3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableListaItens1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtImagemItem = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnAddItem1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnBloqueioItem1 = new javax.swing.JLabel();
        btnExcluirItem1 = new javax.swing.JLabel();
        btnEditItem1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnPesquisarCategoria = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTFNomeItem1 = new javax.swing.JTextField();
        btnPesquisarItem = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rbTodos1 = new javax.swing.JRadioButton();
        rbDisponivel1 = new javax.swing.JRadioButton();
        rbIndisponivel1 = new javax.swing.JRadioButton();
        choiceCategoria1 = new java.awt.Choice();
        btnPesquisarDisponibilidade = new javax.swing.JLabel();
        btnPesquisa3 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(239, 152, 43));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        btnHome3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/legourmet/imgs/icons8_Home_25px.png"))); // NOI18N
        btnHome3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHome3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(1175, Short.MAX_VALUE)
                .addComponent(btnHome3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHome3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tableListaItens1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tableListaItens1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableListaItens1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Acompanhamento", "Pesto de Manjericão", "Sim", "00:05:00"},
                { new Integer(2), "Massa", "Raviolli Ricota", "Não", "00:10:00"},
                { new Integer(3), "Bebida", "Suco de Uva", "Sim", "00:01:00"},
                { new Integer(4), "Sobremesa", "Tiramisú", "Sim", "00:20:00"}
            },
            new String [] {
                "Código Item", "Categoria", "Nome Item", "Disponível", "Tempo de Preparo (Estimativa)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableListaItens1.setGridColor(new java.awt.Color(255, 255, 255));
        tableListaItens1.setRowHeight(22);
        tableListaItens1.setSelectionBackground(new java.awt.Color(255, 96, 2));
        jScrollPane2.setViewportView(tableListaItens1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 895, 250));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Lista de Itens");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 890, -1));
        jPanel3.add(txtImagemItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 270, 210));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 960, 720));

        jPanel4.setBackground(new java.awt.Color(249, 189, 0));

        btnAddItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/legourmet/imgs/icons8_Add_25px.png"))); // NOI18N
        btnAddItem1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddItem1MouseClicked(evt);
            }
        });

        btnBloqueioItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/legourmet/imgs/icons8_Lock_25px_2.png"))); // NOI18N
        btnBloqueioItem1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBloqueioItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBloqueioItem1MouseClicked(evt);
            }
        });

        btnExcluirItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/legourmet/imgs/icons8_Minus_25px.png"))); // NOI18N
        btnExcluirItem1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExcluirItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirItem1MouseClicked(evt);
            }
        });

        btnEditItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/legourmet/imgs/icons8_Edit_Property_25px.png"))); // NOI18N
        btnEditItem1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditItem1MouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Categoria");

        btnPesquisarCategoria.setForeground(new java.awt.Color(102, 102, 102));
        btnPesquisarCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPesquisarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/legourmet/imgs/icons8_Search_18px.png"))); // NOI18N
        btnPesquisarCategoria.setText("Pesquisar");
        btnPesquisarCategoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPesquisarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarCategoriaMouseClicked(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Item");

        jTFNomeItem1.setBackground(new java.awt.Color(239, 152, 43));
        jTFNomeItem1.setForeground(new java.awt.Color(255, 255, 255));
        jTFNomeItem1.setBorder(null);
        jTFNomeItem1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTFNomeItem1.setPreferredSize(new java.awt.Dimension(2, 20));

        btnPesquisarItem.setForeground(new java.awt.Color(102, 102, 102));
        btnPesquisarItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPesquisarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/legourmet/imgs/icons8_Search_18px.png"))); // NOI18N
        btnPesquisarItem.setText("Pesquisar");
        btnPesquisarItem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPesquisarItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarItemMouseClicked(evt);
            }
        });

        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Disponível:");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/legourmet/imgs/icons8_Search_Property_35px.png"))); // NOI18N

        rbTodos1.setBackground(new java.awt.Color(249, 189, 0));
        bGDisponivel1.add(rbTodos1);
        rbTodos1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        rbTodos1.setForeground(new java.awt.Color(102, 102, 102));
        rbTodos1.setSelected(true);
        rbTodos1.setText("Todos");

        rbDisponivel1.setBackground(new java.awt.Color(249, 189, 0));
        bGDisponivel1.add(rbDisponivel1);
        rbDisponivel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        rbDisponivel1.setForeground(new java.awt.Color(102, 102, 102));
        rbDisponivel1.setText("Disponível");

        rbIndisponivel1.setBackground(new java.awt.Color(249, 189, 0));
        bGDisponivel1.add(rbIndisponivel1);
        rbIndisponivel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        rbIndisponivel1.setForeground(new java.awt.Color(102, 102, 102));
        rbIndisponivel1.setText("Indisponível");
        rbIndisponivel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIndisponivel1ActionPerformed(evt);
            }
        });

        choiceCategoria1.setBackground(new java.awt.Color(239, 152, 43));
        choiceCategoria1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnPesquisarDisponibilidade.setForeground(new java.awt.Color(102, 102, 102));
        btnPesquisarDisponibilidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPesquisarDisponibilidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/legourmet/imgs/icons8_Search_18px.png"))); // NOI18N
        btnPesquisarDisponibilidade.setText("Pesquisar");
        btnPesquisarDisponibilidade.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPesquisarDisponibilidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarDisponibilidadeMouseClicked(evt);
            }
        });

        btnPesquisa3.setBackground(new java.awt.Color(249, 189, 0));
        btnPesquisa3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnPesquisa3.setForeground(new java.awt.Color(102, 102, 102));
        btnPesquisa3.setLabel("PESQUISAR");
        btnPesquisa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisa3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel14)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNomeItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel3)
                            .addComponent(btnPesquisarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(choiceCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel22))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(rbDisponivel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbIndisponivel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbTodos1)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAddItem1)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditItem1)
                        .addGap(18, 18, 18)
                        .addComponent(btnBloqueioItem1)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirItem1)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnPesquisarDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnPesquisa3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddItem1)
                    .addComponent(btnBloqueioItem1)
                    .addComponent(btnExcluirItem1)
                    .addComponent(btnEditItem1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choiceCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisarCategoria)
                .addGap(29, 29, 29)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNomeItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisarItem)
                .addGap(60, 60, 60)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDisponivel1)
                    .addComponent(rbIndisponivel1)
                    .addComponent(rbTodos1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisarDisponibilidade)
                .addGap(53, 53, 53)
                .addComponent(btnPesquisa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 250, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Volta para FormPrincipal
    private void btnHome3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome3MousePressed
        this.dispose();
    }//GEN-LAST:event_btnHome3MousePressed

    // Abre FormNovoItem
    private void btnAddItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddItem1MouseClicked
        FormNovoItem janela = new FormNovoItem();
        this.setEnabled(false);
        janela.setVisible(true);
    }//GEN-LAST:event_btnAddItem1MouseClicked

   //Abre FormEditarItem 
    private void btnEditItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditItem1MouseClicked
        FormEditarItem janela = new FormEditarItem();
        
        this.setEnabled(false);
        janela.setVisible(true);
    }//GEN-LAST:event_btnEditItem1MouseClicked

    // Métodos jPanel2MouseDragged e jPanel2MousePressed são para mover a tela
    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
         // src to drag
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    int xx, xy;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // drag this pane
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void rbIndisponivel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIndisponivel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbIndisponivel1ActionPerformed

    private void btnPesquisa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisa3ActionPerformed
        ItemDAO itemDAO = new ItemDAO();

        //        if (!jTFCodigoItem1.equals("")) {
            //            try {
                //                ArrayList<Item> itens = itemDAO.listarPorItem(jTFNomeItem1.getText().trim());
                //                itemTableModel = new ItemTableModel(itens);
                //                tableListaItens1.setModel(itemTableModel);
                //            } catch (Exception ex) {
                //                Logger.getLogger(FormCardapio.class.getName()).log(Level.SEVERE, null, ex);
                //            }
            //        }
        if(!choiceCategoria1.equals("")){
            try {
                ArrayList<Item> itens = itemDAO.listarPorCategoria(choiceCategoria1.getSelectedItem());
                itemTableModel = new ItemTableModel(itens);
                tableListaItens1.setModel(itemTableModel);
            } catch (Exception ex) {
                Logger.getLogger(FormCardapio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(rbDisponivel1.isSelected()){
            try {
                ArrayList<Item> itens = itemDAO.listarPorDisponibilidade(rbDisponivel1.getText());
                itemTableModel = new ItemTableModel(itens);
                tableListaItens1.setModel(itemTableModel);
            } catch (Exception ex) {
                Logger.getLogger(FormCardapio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(rbIndisponivel1.isSelected()){
            try {
                ArrayList<Item> itens = itemDAO.listarPorDisponibilidade(rbIndisponivel1.getText());
                itemTableModel = new ItemTableModel(itens);
                tableListaItens1.setModel(itemTableModel);
            } catch (Exception ex) {
                Logger.getLogger(FormCardapio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnPesquisa3ActionPerformed

    private void btnBloqueioItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBloqueioItem1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBloqueioItem1MouseClicked

    private void btnExcluirItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirItem1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirItem1MouseClicked

    private void btnPesquisarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarCategoriaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarCategoriaMouseClicked

    private void btnPesquisarItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarItemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarItemMouseClicked

    private void btnPesquisarDisponibilidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarDisponibilidadeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarDisponibilidadeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FormCardapio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGDisponivel1;
    private javax.swing.JLabel btnAddItem1;
    private javax.swing.JLabel btnBloqueioItem1;
    private javax.swing.JLabel btnEditItem1;
    private javax.swing.JLabel btnExcluirItem1;
    private javax.swing.JLabel btnHome3;
    private java.awt.Button btnPesquisa3;
    private javax.swing.JLabel btnPesquisarCategoria;
    private javax.swing.JLabel btnPesquisarDisponibilidade;
    private javax.swing.JLabel btnPesquisarItem;
    private java.awt.Choice choiceCategoria1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFNomeItem1;
    private javax.swing.JRadioButton rbDisponivel1;
    private javax.swing.JRadioButton rbIndisponivel1;
    private javax.swing.JRadioButton rbTodos1;
    private javax.swing.JTable tableListaItens1;
    private javax.swing.JLabel txtImagemItem;
    // End of variables declaration//GEN-END:variables
}
