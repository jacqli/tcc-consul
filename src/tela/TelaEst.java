package tela;

import Entidades.Estado;
import Fabrica_DAO.DAOGenerico;
import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;

public class TelaEst extends javax.swing.JInternalFrame {

    private DAOGenerico dg = new DAOGenerico();
    private Estado ent;
  private String txtErro = "";
    public TelaEst() {
        super("Estado", true, true, true);
        initComponents();
        setVisible(true);
        List<Estado> gg = dg.consultar(Estado.class);
        getRootPane().setDefaultButton(salvar);
       
        novos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jToggleButton1 = new javax.swing.JToggleButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        nome = new javax.swing.JTextField();
        labnome = new javax.swing.JLabel();
        labsigla = new javax.swing.JLabel();
        sigla = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        calcelar = new javax.swing.JButton();
        soNumero1 = new zaas.SoNumero();
        testess = new javax.swing.JTextField();
        try{ 
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("(*.).###-##");
            cpf.setPlaceholderCharacter('_');
            testess = new javax.swing.JFormattedTextField(cpf);
        }
        catch (Exception e){
        }
        testeMascV21 = new zaas.TesteMascV2();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jToggleButton1.setText("jToggleButton1");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setClosable(true);
        setToolTipText("");

        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomeKeyTyped(evt);
            }
        });

        labnome.setText("Nome");

        labsigla.setText("Sigla");

        sigla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                siglaKeyTyped(evt);
            }
        });

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

        calcelar.setText("Cancelar");
        calcelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcelarActionPerformed(evt);
            }
        });

        soNumero1.setText("soNumero1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labnome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labsigla)
                            .addComponent(sigla, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(soNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(alterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(calcelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(testess, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(testeMascV21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labnome)
                    .addComponent(labsigla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(soNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(testess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(138, 138, 138)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salvar)
                            .addComponent(atualizar)
                            .addComponent(excluir)
                            .addComponent(alterar)
                            .addComponent(calcelar))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(testeMascV21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(172, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
       if(teste()){
          return; 
       }
           Estado e1 = new Estado();
        e1.setNome(nome.getText());
        e1.setSigla(sigla.getText());
        dg.salvar(e1);
        limpar();
 
    }//GEN-LAST:event_salvarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed

        TelaEstCon consulta = new TelaEstCon(null, true);
        consulta.setModal(true);
        
    if(consulta.numero() == null)
          return;
    else
     ent = consulta.numero();
    
        nome.setText(ent.getNome());
        sigla.setText(ent.getSigla());
        labnome.setText("nome(" + ent.getNome() + ")");
        labsigla.setText("sigla(" + ent.getSigla() + ")");

        atualizas();
    }//GEN-LAST:event_alterarActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
           if(teste()){
            return;
        }
        ent.setNome(nome.getText());
        ent.setSigla(sigla.getText());
        dg.atualizar(ent);
        novos();
        limpar();
    }//GEN-LAST:event_atualizarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        dg.excluir(Estado.class, ent.getId());
        novos();
        limpar();
    }//GEN-LAST:event_excluirActionPerformed

    private void calcelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcelarActionPerformed
        novos();
        limpar();
    }//GEN-LAST:event_calcelarActionPerformed

    private void siglaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_siglaKeyTyped
       char c = evt.getKeyChar();
       if(c== KeyEvent.VK_BACKSPACE || c== KeyEvent.VK_DELETE){     
       }else if( Character.isDigit(c) || sigla.getText().length() >= 2){
        Toolkit.getDefaultToolkit().beep();
        evt.consume();
       }
       else if(Character.isLowerCase(c)){
     evt.setKeyChar(Character.toUpperCase(c));
       }
    }//GEN-LAST:event_siglaKeyTyped

    private void nomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyTyped
    if(nome.getText().isEmpty()){
       evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
    }
    }//GEN-LAST:event_nomeKeyTyped
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
        sigla.setText("");
        labnome.setText("nome");
        labsigla.setText("sigla");

    }
    
    private boolean teste(){
        Boolean b = false;
    if(nome.getText().isEmpty()){
        addErro("o campo nome esta vazio", b);
    }
    if(sigla.getText().isEmpty()){
        addErro("o campo sigla esta vazio", b);
    }
    if(txtErro == ""){
         JOptionPane.showMessageDialog(null,"operação concluida com sucesso");
    }else{    
       JOptionPane.showMessageDialog(null,txtErro);   
        } 
    return b;
    }
    
    private void addErro(String s, boolean b){
    if(txtErro == ""){
      txtErro = s;  
    }else{
       txtErro += "\n"+ s;
    }   
     b = true;  
    }     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton calcelar;
    private javax.swing.JButton excluir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labnome;
    private javax.swing.JLabel labsigla;
    private javax.swing.JTextField nome;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField sigla;
    private zaas.SoNumero soNumero1;
    private zaas.TesteMascV2 testeMascV21;
    private javax.swing.JTextField testess;
    // End of variables declaration//GEN-END:variables
}
