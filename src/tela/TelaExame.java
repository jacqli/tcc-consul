
package tela;

import Entidades.Cliente;
import Entidades.Exame;
import Entidades.TipoEx;
import Fabrica_DAO.DAOGenerico;
import java.awt.Toolkit;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.jdatepicker.impl.JDatePickerImpl;


public class TelaExame extends javax.swing.JInternalFrame {
   private DAOGenerico dg = new DAOGenerico();
    private TipoEx ent;
       private List<Cliente> listCli = dg.consultar(Cliente.class);
       private List<TipoEx> listCon = dg.consultar(TipoEx.class);
 
    public TelaExame() {
        initComponents();
                novos();
        setVisible(true);
        addHorarios();
        
        System.out.println( listCon.size());
        for (int i = 0; i < listCon.size(); i++) {
            System.out.println("aaaa");
            consulta.addItem(listCon.get(i).getNome());
        }
            
        for (int i = 0; i < listCli.size(); i++) {
            cliente.addItem(listCli.get(i).getNome());
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        labhora = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        labdata = new javax.swing.JLabel();
        labtex = new javax.swing.JLabel();
        consulta = new javax.swing.JComboBox<>();
        labcliente = new javax.swing.JLabel();
        cliente = new javax.swing.JComboBox<>();
        data = new zaas.Meud();
        horario = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        labcliente.setText("Paciente");

        data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dataMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(alterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labcliente)
                    .addComponent(labdata))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labhora)
                    .addComponent(labtex))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labcliente)
                    .addComponent(labtex, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
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
        Calendar cal =  Calendar.getInstance();
        JDatePickerImpl datePicker = (JDatePickerImpl) data.getComponent(0);
        datePicker.getModel().getValue();
        String h1 = (String) horario.getSelectedItem();
        String[] h = h1.split(":");
        cal.set(datePicker.getModel().getYear(), datePicker.getModel().getMonth(), datePicker.getModel().getDay(), 
                Integer.parseInt(h[0]), Integer.parseInt(h[1]),0);
 
        e1.setCliente(listCli.get(cliente.getSelectedIndex()));
        e1.setTipoEx(listCon.get(consulta.getSelectedIndex()));
        e1.setData(cal.getTime());
        e1.setHora(cal.getTime());
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

    private void dataMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataMouseReleased
       addHorarios();   
        System.out.println("ddddd");
    }//GEN-LAST:event_dataMouseReleased

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
       
        horario.setSelectedIndex(0);
        labdata.setText("nome");
        labtex.setText("sigla");
        labcliente.setText("paciente");
        labhora.setText("horario");

    }
    private void addHorarios(){
        horario.removeAllItems();
         List<Exame> listEx = dg.consultar(Exame.class);
         JDatePickerImpl datePicker = (JDatePickerImpl) data.getComponent(0);
        datePicker.getModel().getValue();
        boolean jaMarcado;
        
  for (LocalTime i = LocalTime.of(8, 00); i.getHour() <= 20; i=i.plusMinutes(30)) {
      jaMarcado = true;
                  
      for (int i2 = 0; i2 < listEx.size(); i2++) {
      if(listEx.get(i2).getData().getMonth() == datePicker.getModel().getMonth()
      && listEx.get(i2).getData().getDate()== datePicker.getModel().getDay()
      && listEx.get(i2).getHora().getHours() == i.getHour() 
      && listEx.get(i2).getHora().getMinutes() == i.getMinute()){
      jaMarcado = false;
      }
      }

      
      if(jaMarcado && !(i.getHour() == 12 || (i.getHour() == 13 && i.getMinute() == 00))){   
      horario.addItem(i.toString());
          }
       
  }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> cliente;
    private javax.swing.JComboBox<String> consulta;
    private zaas.Meud data;
    private javax.swing.JButton excluir;
    private javax.swing.JComboBox<String> horario;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel labcliente;
    private javax.swing.JLabel labdata;
    private javax.swing.JLabel labhora;
    private javax.swing.JLabel labtex;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
