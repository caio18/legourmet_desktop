/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.legourmet.view;

import javax.swing.JOptionPane;

/**
 *
 * @author gouri
 */
public class InternalFormPagamento extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalFormPagamento
     */
    public InternalFormPagamento() {
        initComponents();
        this.setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFormaPagamento1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        btnAddFormaPagamento1 = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePagamento1 = new javax.swing.JTable();
        btnRemoveFormaPagamento = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTotalPedido1 = new javax.swing.JTextField();
        btnCancelar2 = new java.awt.Button();
        btnFinalizarPagamento1 = new java.awt.Button();
        jLabel19 = new javax.swing.JLabel();
        txtTotalQtd1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtCodigoPagamento2 = new javax.swing.JTextField();
        txtCodigoPedido2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(1100, 760));
        setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(239, 152, 43));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/legourmet/imgs/icons8_Close_Window_25px_2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(1065, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tableFormaPagamento1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tableFormaPagamento1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableFormaPagamento1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Dinheiro",  new Double(180.0)}
            },
            new String [] {
                "Forma de Pagamento", "Valor   (R$)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableFormaPagamento1.setGridColor(new java.awt.Color(255, 255, 255));
        tableFormaPagamento1.setRowHeight(22);
        tableFormaPagamento1.setSelectionBackground(new java.awt.Color(255, 96, 2));
        jScrollPane1.setViewportView(tableFormaPagamento1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 790, 140));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Pagamento");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 10, 790, -1));

        btnAddFormaPagamento1.setBackground(new java.awt.Color(249, 189, 0));
        btnAddFormaPagamento1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAddFormaPagamento1.setForeground(new java.awt.Color(102, 102, 102));
        btnAddFormaPagamento1.setLabel("ADD FORMA DE PAGAMENTO");
        jPanel3.add(btnAddFormaPagamento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, -1, -1));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tablePagamento1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tablePagamento1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Pesto de Manjericão",  new Integer(2),  new Double(25.0),  new Double(50.0)},
                {"Raviolli de Tofu",  new Integer(1),  new Double(100.0),  new Double(100.0)},
                {"Suco de Uva",  new Integer(1),  new Double(30.0),  new Double(30.0)}
            },
            new String [] {
                "Item", "Qtd.", "Valor Unidade Item (R$)", "Valor Total Item  (R$)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePagamento1.setGridColor(new java.awt.Color(255, 255, 255));
        tablePagamento1.setSelectionBackground(new java.awt.Color(255, 96, 2));
        jScrollPane2.setViewportView(tablePagamento1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 790, 260));

        btnRemoveFormaPagamento.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnRemoveFormaPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/legourmet/imgs/icons8_Delete_18px.png"))); // NOI18N
        btnRemoveFormaPagamento.setText("Remover Forma de Pagamento");
        jPanel3.add(btnRemoveFormaPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("___________________________________________________________ Forma de Pagamento ______________________________________________________");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, 20));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Total: R$");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, -1, 20));

        txtTotalPedido1.setEditable(false);
        txtTotalPedido1.setBackground(new java.awt.Color(255, 122, 12));
        txtTotalPedido1.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalPedido1.setBorder(null);
        txtTotalPedido1.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTotalPedido1.setPreferredSize(new java.awt.Dimension(2, 20));
        jPanel3.add(txtTotalPedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 90, -1));

        btnCancelar2.setBackground(new java.awt.Color(249, 189, 0));
        btnCancelar2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCancelar2.setForeground(new java.awt.Color(102, 102, 102));
        btnCancelar2.setLabel("CANCELAR");
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancelar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 650, -1, -1));

        btnFinalizarPagamento1.setBackground(new java.awt.Color(249, 189, 0));
        btnFinalizarPagamento1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnFinalizarPagamento1.setForeground(new java.awt.Color(102, 102, 102));
        btnFinalizarPagamento1.setLabel("FINALIZAR PAGAMENTO");
        jPanel3.add(btnFinalizarPagamento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 650, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Qtd. Itens:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, 20));

        txtTotalQtd1.setEditable(false);
        txtTotalQtd1.setBackground(new java.awt.Color(255, 122, 12));
        txtTotalQtd1.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalQtd1.setBorder(null);
        txtTotalQtd1.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTotalQtd1.setPreferredSize(new java.awt.Dimension(2, 20));
        jPanel3.add(txtTotalQtd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 90, -1));

        jPanel4.setBackground(new java.awt.Color(249, 189, 0));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Cód. Pagamento");

        txtCodigoPagamento2.setEditable(false);
        txtCodigoPagamento2.setBackground(new java.awt.Color(255, 122, 12));
        txtCodigoPagamento2.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoPagamento2.setBorder(null);
        txtCodigoPagamento2.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCodigoPagamento2.setPreferredSize(new java.awt.Dimension(2, 20));

        txtCodigoPedido2.setEditable(false);
        txtCodigoPedido2.setBackground(new java.awt.Color(255, 122, 12));
        txtCodigoPedido2.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigoPedido2.setBorder(null);
        txtCodigoPedido2.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCodigoPedido2.setPreferredSize(new java.awt.Dimension(2, 20));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Cód. Pedido");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/legourmet/imgs/icons8_Cash_Register_100px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoPagamento2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoPedido2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(47, 47, 47))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoPagamento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtCodigoPedido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138)
                .addComponent(jLabel20)
                .addContainerGap(400, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar pagamento?", "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar pagamento?", "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAddFormaPagamento1;
    private java.awt.Button btnCancelar2;
    private java.awt.Button btnFinalizarPagamento1;
    private javax.swing.JLabel btnRemoveFormaPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableFormaPagamento1;
    private javax.swing.JTable tablePagamento1;
    private javax.swing.JTextField txtCodigoPagamento2;
    private javax.swing.JTextField txtCodigoPedido2;
    private javax.swing.JTextField txtTotalPedido1;
    private javax.swing.JTextField txtTotalQtd1;
    // End of variables declaration//GEN-END:variables
}
