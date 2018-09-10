
package tela;

import Entidades.Exame;
import Fabrica_DAO.DAOGenerico;
import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;


public class TelaAddPag extends javax.swing.JDialog {
 private Exame e1;
 private DAOGenerico dg = new DAOGenerico();
    public TelaAddPag(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        System.out.println("aaaaaaaa");
        initComponents();
        setVisible(true);
    }
        public TelaAddPag(java.awt.Frame parent, boolean modal, Exame ex) {
           super(parent, modal);
           
        e1 = ex;
            System.out.println(e1);
            System.out.println("asdasdsaDCEQWE");
        initComponents();
        setVisible(true);
        System.out.println(ex);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pagamento = new javax.swing.JTextField();
        add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pagamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pagamentoKeyTyped(evt);
            }
        });

        add.setText("Adicionar");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pagamento)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 323, Short.MAX_VALUE)
                .addComponent(add))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pagamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagamentoKeyTyped
   char c = evt.getKeyChar();
   if(evt.getKeyCode() == KeyEvent.VK_BACKSPACE || evt.getKeyCode() == KeyEvent.VK_DELETE){
       
   }else if(!(Character.isDigit(c) || c =='.') || pagamento.getText().matches("(.*)\\.\\d{2}")){
       Toolkit.getDefaultToolkit().beep();
   evt.consume();
}
       
    }//GEN-LAST:event_pagamentoKeyTyped

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       if(!pagamento.getText().isEmpty()){
           System.out.println(e1);
           e1.setPreco(Double.parseDouble(pagamento.getText()));
          dg.atualizar(e1);
       }dispose();
    }//GEN-LAST:event_addActionPerformed



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
            java.util.logging.Logger.getLogger(TelaAddPag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAddPag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAddPag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAddPag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaAddPag dialog = new TelaAddPag(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton add;
    private javax.swing.JTextField pagamento;
    // End of variables declaration//GEN-END:variables
}
