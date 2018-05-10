
package tela;

import Entidades.Cliente;
import Entidades.Exame;
import Entidades.TipoEx;
import Fabrica_DAO.DAOGenerico;
import java.util.Calendar;
import java.util.List;


public class TelaExame extends javax.swing.JInternalFrame {
   private DAOGenerico dg = new DAOGenerico();
    private TipoEx ent;
       private List<Cliente> listCli = dg.consultar(Cliente.class);
       private List<TipoEx> listCon = dg.consultar(TipoEx.class);
 
    public TelaExame() {
        initComponents();
                novos();
        setVisible(true);
            
        for (int i = 0; i < listCon.size(); i++) {
            consulta.addItem(listCon.get(i).getNome());
        }
            
        for (int i = 0; i < listCli.size(); i++) {
            cliente.addItem(listCli.get(i).getNome());
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labhora = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        labdata = new javax.swing.JLabel();
        labtex = new javax.swing.JLabel();
        horario = new javax.swing.JTextField();
        consulta = new javax.swing.JComboBox<>();
        data = new zaas.Meud();
        labcliente = new javax.swing.JLabel();
        cliente = new javax.swing.JComboBox<>();

        labhora.setText("horario");

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

        labdata.setText("data");

        labtex.setText("consulta");
        labtex.setToolTipText("");

        consulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "aaaaa" }));

        data.setBackground(new java.awt.Color(245, 245, 245));

        labcliente.setText("Paciente");

        cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "aaaaaa" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labcliente)
                            .addComponent(labdata))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labhora)
                            .addComponent(labtex)
                            .addComponent(consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labtex)
                    .addComponent(labcliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labhora)
                    .addComponent(labdata))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
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
        Exame e1 = new Exame();
        e1.setCliente(listCli.get(cliente.getSelectedIndex()+1));
        e1.setTipoEx(listCon.get(consulta.getSelectedIndex()+1));
        Calendar cal =  Calendar.getInstance();
      
        cal.set(WIDTH, WIDTH, WIDTH, WIDTH, WIDTH);
       // e1.setData();
        dg.salvar(e1);
        limpar();
    }//GEN-LAST:event_salvarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed

    }//GEN-LAST:event_excluirActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed

    }//GEN-LAST:event_atualizarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed

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
       
        horario.setText("");
        labdata.setText("nome");
        labtex.setText("sigla");
        labcliente.setText("paciente");
        labhora.setText("horario");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> cliente;
    private javax.swing.JComboBox<String> consulta;
    private zaas.Meud data;
    private javax.swing.JButton excluir;
    private javax.swing.JTextField horario;
    private javax.swing.JLabel labcliente;
    private javax.swing.JLabel labdata;
    private javax.swing.JLabel labhora;
    private javax.swing.JLabel labtex;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
