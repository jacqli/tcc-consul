
package tela;

import Entidades.Estado;
import Fabrica_DAO.DAOGenerico;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class TelaEstCon extends javax.swing.JDialog implements MouseListener {

      private Estado entSel;
      private List<Estado> listEnt;
       DAOGenerico dg = new DAOGenerico();
    public TelaEstCon(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tabela.addMouseListener(this);
        pesquisar.setText("dasdadsada");
    }
        public Estado numero(){
    return entSel;   
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pesquisar = new javax.swing.JButton();
        nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        concluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pesquisar.setText("pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeKeyPressed(evt);
            }
        });

        jLabel1.setText("nome");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabela);

        concluir.setText("Concluir");
        concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(concluir)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisar)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(concluir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
       
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nome");
        model.addColumn("Sigla");
        
        listEnt = dg.consultar(Estado.class, nome.getText());
        
        for (int i = 0; i < listEnt.size(); i++) {
        Object[] data = {listEnt.get(i).getNome(), listEnt.get(i).getSigla()};
            model.addRow(data);
            }
           
           tabela.setModel(model);
          
    }//GEN-LAST:event_pesquisarActionPerformed

    private void concluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirActionPerformed
        
    entSel =listEnt.get(tabela.getSelectedRow());
    dispose();
    }//GEN-LAST:event_concluirActionPerformed

    private void tabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyPressed
        if(evt.getKeyCode() == 10){
            concluir.doClick();
        }
            
    }//GEN-LAST:event_tabelaKeyPressed

    private void nomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyPressed
     if(evt.getKeyCode() == KeyEvent.VK_ENTER){
         pesquisar.doClick();
     }
    }//GEN-LAST:event_nomeKeyPressed

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
            java.util.logging.Logger.getLogger(TelaEstCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstCon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaEstCon dialog = new TelaEstCon(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton concluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nome;
    private javax.swing.JButton pesquisar;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
    if(e.getClickCount()==2){
     entSel = listEnt.get(tabela.getSelectedRow());
     dispose();
    } 
    }

    @Override
    public void mousePressed(MouseEvent e) {
     
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }
    @Override
    public void mouseEntered(MouseEvent e) {
       
    }
    @Override
    public void mouseExited(MouseEvent e) {
       
    }

    public Estado getTabelasel() {
        return entSel;
    }

    public void setTabelasel(Estado tabelasel) {
        this.entSel = tabelasel;
    }
    
}
