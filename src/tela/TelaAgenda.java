
package tela;

import Entidades.Exame;
import Fabrica_DAO.DAOGenerico;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdatepicker.impl.JDatePickerImpl;


public class TelaAgenda extends javax.swing.JInternalFrame {

   private DAOGenerico dg = new DAOGenerico();
   private List<Exame> itensTabela = new ArrayList();
    public TelaAgenda() {
        initComponents();
         addHorarios();       
        setVisible(true);
        
        

       
   /*    for (double i = 0; i < 24; i+= 0.5) {
            String  i2 = Double.toString(i);
            if(i2.matches("^\\d{1}.5$")){
                System.out.println(i+"AAAAAA");          
         Object[] data = {i};
         model.addRow(data);  
            }
            else if(i2.matches("^\\d{2}.5$")){
                System.out.println(i+"bbbbbbb");
            } else 
          System.out.println(i+"ccccccc");
           
         Object[] data = {i};
         model.addRow(data);    
            
        }*/
       /* listExame = dg.consultar(Exame.class);
        
        for (int i = 0; i < listExame.size(); i++) {
        Object[] data = {listExame.get(i).getData(), listExame.get(i).getData()};
            model.addRow(data);
            }
           
           tabela.setModel(model);
         */ 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        horario = new javax.swing.JTable();
        dataSel = new zaas.Meud();
        eftPag = new javax.swing.JButton();
        addPag = new javax.swing.JButton();

        horario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(horario);

        eftPag.setText("Efetuar pagamento");
        eftPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eftPagActionPerformed(evt);
            }
        });

        addPag.setText("Adicionar pagamento");
        addPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dataSel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addPag, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(eftPag, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(dataSel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eftPag)
                    .addComponent(addPag)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPagActionPerformed
       //se nenhum item estiver selecionado ele manda uma mensagem e retorna
  if(selecioneUmItem()){
            return;
       }
            if(itemNaoValido(itensTabela)){
           return;
            }
        
        TelaAddPag consulta = new TelaAddPag(null, true, itensTabela.get(horario.getSelectedRow()));

       addHorarios();
    }//GEN-LAST:event_addPagActionPerformed

    private void eftPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eftPagActionPerformed
         //se nenhum item estiver selecionado ele manda uma mensagem e retorna
        if(selecioneUmItem()){
            return;
       }
            if(itemNaoValido(itensTabela)){
           return;
            }
                if(precoNaoAdd(itensTabela)){
                return;
                }
            
        
        
    Exame e1 = itensTabela.get(horario.getSelectedRow()); 
int confirma = JOptionPane.showConfirmDialog (null, "Confirmar o pagamento de R$ "+e1.getPreco() +"?","Aviso", JOptionPane.YES_NO_OPTION);
if(confirma == JOptionPane.YES_OPTION){
          e1.setJaPago(true);
          dg.atualizar(e1);
         
      addHorarios();
}else{
    return;
}
  
        
    }//GEN-LAST:event_eftPagActionPerformed

    private void addHorarios(){
        horario.removeAll();
        itensTabela.clear();
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("horario");
        model.addColumn("cliente");
        model.addColumn("status do pagamento");
        
         List<Exame> listEx = dg.consultar(Exame.class);
         JDatePickerImpl datePicker = (JDatePickerImpl) dataSel.getComponent(0);
        datePicker.getModel().getValue();
       
  for (LocalTime i = LocalTime.of(8, 00); i.getHour() <= 20; i=i.plusMinutes(30)) {
      // reseta que não tem nenhum cliente selecionado
      int cliSel = -2;          
      //testa se tem um cliente no horario e se tiver adiciona o id na variavel
      for (int i2 = 0; i2 < listEx.size(); i2++) {
      if(listEx.get(i2).getData().getMonth() == datePicker.getModel().getMonth()
      && listEx.get(i2).getData().getDate()== datePicker.getModel().getDay()
      && listEx.get(i2).getHora().getHours() == i.getHour() 
      && listEx.get(i2).getHora().getMinutes() == i.getMinute()){
         cliSel = i2;
         itensTabela.add(listEx.get(i2));
         i2 =listEx.size();
      }
      }
      //se não tiver nenum cliente agendado no horario ele adiciona um nulo na list
      if(cliSel == -2){
          itensTabela.add(null);
      }
      
//adiciona os dados no modelo se não ter um cliente selecionado cliSel é -2       
  if(cliSel != -2){    
//se não tiver adicionado o preço adiciona a mensagem que não adicionou o preço     
if(listEx.get(cliSel).getPreco() == 0){
      Object[] data = {i,
          listEx.get(cliSel).getCliente().getNome(),
          "preço não adicionado"};   
      
         model.addRow(data); 
         //se o preço for adicionado e não pago adiciona a msg mais o preço a pagar
}else if(listEx.get(cliSel).isJaPago() == false){
       Object[] data = {i,
          listEx.get(cliSel).getCliente().getNome(),
          listEx.get(cliSel).getPreco()};
         model.addRow(data); 
//se ja foi pago ele adiciona a msg de ja pago         
}else{
        Object[] data = {i,
          listEx.get(cliSel).getCliente().getNome(),
          "ja pago" +"("+listEx.get(cliSel).getPreco() + ")"};
         model.addRow(data); 
}
//caso não tenha um cliente agendado ele só adiciona um horario
  }else{
       Object[] data = {i};

         model.addRow(data); 
  } }        
         horario.setModel(model);
  
        for (int i = 1; i < itensTabela.size(); i++) {
            System.out.print(i);
            System.out.println( itensTabela.get(i));
            
        }
    }
    
    
  private boolean itemNaoValido(List<Exame> li){
      if(li.get(horario.getSelectedRow()) == null){
       JOptionPane.showMessageDialog(null, "Não Ha uma consulta agendada no horario selecionado");
      return true;
      }else
          return false;
  }  
  private boolean selecioneUmItem(){
      if(horario.getSelectionModel().isSelectionEmpty()){
       JOptionPane.showMessageDialog(null, "Selecione um item na tabela");
      return true;
      }else
          return false;
  }  
   private boolean precoNaoAdd(List<Exame> li){
      if(li.get(horario.getSelectedRow()).getPreco() == 0){
       JOptionPane.showMessageDialog(null, "o preço não foi adicionado");
      return true;
      }else
          return false;
  }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPag;
    private zaas.Meud dataSel;
    private javax.swing.JButton eftPag;
    private javax.swing.JTable horario;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

