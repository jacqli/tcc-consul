
package tela;

import Entidades.TipoEx;
import Fabrica_DAO.DAOGenerico;
import java.util.List;


public class TelaTEx extends javax.swing.JInternalFrame {
    
 private DAOGenerico dg = new DAOGenerico();
 private TipoEx ent;

    public TelaTEx() {
        initComponents();
        novos();
        setVisible(true);
             List<TipoEx> gg = dg.consultar(TipoEx.class);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salvar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        nome = new javax.swing.JTextField();
        labnome = new javax.swing.JLabel();
        labpreco = new javax.swing.JLabel();
        preco = new javax.swing.JTextField();
        labTempo = new javax.swing.JLabel();
        tempo = new javax.swing.JTextField();

        salvar.setText("salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        excluir.setText("excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        atualizar.setText("atualizar");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        alterar.setText("alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        labnome.setText("Nome");

        labpreco.setText("Preço inicial");
        labpreco.setToolTipText("");

        labTempo.setText("Tempo(minutos)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(alterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labTempo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tempo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labnome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labpreco)
                            .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labnome)
                    .addComponent(labpreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labTempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar)
                    .addComponent(atualizar)
                    .addComponent(excluir)
                    .addComponent(alterar)
                    .addComponent(cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        TipoEx e1 = new TipoEx();
        e1.setNome(nome.getText());
        e1.setPreco(Double.parseDouble(preco.getText()));
        e1.setTempoEx(Integer.parseInt(tempo.getText()));
        
        dg.salvar(e1);
        limpar();

    }//GEN-LAST:event_salvarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        dg.excluir(TipoEx.class, ent.getId());
        novos();
        limpar();
    }//GEN-LAST:event_excluirActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        ent.setNome(nome.getText());
        ent.setPreco(Double.parseDouble(preco.getText()));
        ent.setTempoEx(Integer.parseInt(tempo.getText()));
        dg.atualizar(ent);
        novos();
        limpar();
    }//GEN-LAST:event_atualizarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
     TelaTExCon consulta = new TelaTExCon(null, true);
        consulta.setVisible(true);
        consulta.setModal(true);

        ent = consulta.numero();
        nome.setText(ent.getNome());
        preco.setText(Double.toString(ent.getPreco()));
        tempo.setText(Integer.toString(ent.getTempoEx()));
        labnome.setText("nome(" + ent.getNome() + ")");
        labpreco.setText("preco(" + ent.getPreco() + ")");
        labTempo.setText("preco(" + ent.getTempoEx() + ")");
        
        atualizas();
    }//GEN-LAST:event_alterarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        novos();
        limpar();
    }//GEN-LAST:event_cancelarActionPerformed
    public void novos() {

        alterar.setEnabled(true);
        atualizar.setEnabled(false);
        excluir.setEnabled(false);
        salvar.setEnabled(true);
        
        alterar.setVisible(true);
        atualizar.setVisible(false);
        excluir.setVisible(false);
        salvar.setVisible(true);
    }

    public void atualizas() {
        alterar.setEnabled(false);
        atualizar.setEnabled(true);
        excluir.setEnabled(true);
        salvar.setEnabled(false);
        
        alterar.setVisible(false);
        atualizar.setVisible(true);
        excluir.setVisible(true);
        salvar.setVisible(false);
    }

    private void limpar() {
        nome.setText("");
        preco.setText("");
        tempo.setText("");
        labnome.setText("nome");
        labpreco.setText("preco");
        labTempo.setText("tempo(minutos)");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel labTempo;
    private javax.swing.JLabel labnome;
    private javax.swing.JLabel labpreco;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField preco;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField tempo;
    // End of variables declaration//GEN-END:variables
}
