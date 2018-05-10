
package tela;

import Entidades.Produto;
import Fabrica_DAO.DAOGenerico;
import java.util.ArrayList;
import java.util.List;

public class TelaPro extends javax.swing.JInternalFrame {


    DAOGenerico de = new DAOGenerico();
    
    public TelaPro() {
        initComponents();
    
        setVisible(true);
 
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        estoque = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();

        jLabel1.setText("Nome");

        jLabel2.setText("Estoque");

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estoque)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salvar)
                        .addGap(0, 291, Short.MAX_VALUE))
                    .addComponent(nome)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(salvar)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        
        int estoquee = Integer.parseInt(estoque.getText());
        Produto p1 = new Produto();
        p1.setNome(nome.getText());
        p1.setEstoque(estoquee);
        de.salvar(p1);
        nome.setText("");
        estoque.setText("");
    }//GEN-LAST:event_salvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField estoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nome;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
