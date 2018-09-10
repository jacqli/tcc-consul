
package tela;

import Entidades.TipoEx;
import Fabrica_DAO.DAOGenerico;
import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;


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

        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomeKeyTyped(evt);
            }
        });

        labnome.setText("Nome");

        labTempo.setText("Tempo(minutos)");

        tempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tempoKeyTyped(evt);
            }
        });

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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tempo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labnome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                .addGap(0, 249, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labnome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labTempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
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
       if(teste()){
       return;
       } 
        TipoEx e1 = new TipoEx();
        e1.setNome(nome.getText());
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
       if(teste()){
       return;
       } 
        ent.setNome(nome.getText());
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
        tempo.setText(Integer.toString(ent.getTempoEx()));
        labnome.setText("nome(" + ent.getNome() + ")");
        labTempo.setText("tempo(" + ent.getTempoEx() + ")");
        
        atualizas();
    }//GEN-LAST:event_alterarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        novos();
        limpar();
    }//GEN-LAST:event_cancelarActionPerformed

    private void nomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyTyped
      if(nome.getText().isEmpty()){
       evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
    }
    }//GEN-LAST:event_nomeKeyTyped

    private void tempoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tempoKeyTyped
           char c = evt.getKeyChar();
       if(c== KeyEvent.VK_BACKSPACE || c== KeyEvent.VK_DELETE){     
       }else if( Character.isLetter(c)){
        Toolkit.getDefaultToolkit().beep();
        evt.consume();
       }
    }//GEN-LAST:event_tempoKeyTyped
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
        tempo.setText("");
        labnome.setText("nome");
        labTempo.setText("tempo(minutos)");

    }
    
    private boolean teste(){
      if(nome.getText().isEmpty()){
      JOptionPane.showMessageDialog(null,"o campo nome esta vazio");
          return true;
      } else if(tempo.getText().isEmpty()){
         JOptionPane.showMessageDialog(null,"o campo tempo esta vazio");
          return true;
      } else{
         return false; 
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel labTempo;
    private javax.swing.JLabel labnome;
    private javax.swing.JTextField nome;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField tempo;
    // End of variables declaration//GEN-END:variables
}
