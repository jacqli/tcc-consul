package tela;

import Entidades.Cidade;
import Entidades.Cliente;
import Entidades.Estado;
import Fabrica_DAO.DAOGenerico;
import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;

public class TelaCli extends javax.swing.JInternalFrame {

  private  DAOGenerico dg = new DAOGenerico();
    private Cliente altes;
private List<Cidade> gg = dg.consultar(Cidade.class);
    public TelaCli() {
        initComponents();
        setVisible(true);
        List<Cidade> gg = dg.consultar(Cidade.class);
        for (int i = 0; i < gg.size(); i++) {
            cidade.addItem(gg.get(i).getNome());
        }
        atualizar.setVisible(false);
        excluir.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labNome = new javax.swing.JLabel();
        labRua = new javax.swing.JLabel();
        labNumero = new javax.swing.JLabel();
        labTel = new javax.swing.JLabel();
        labBairro = new javax.swing.JLabel();
        labCid = new javax.swing.JLabel();
        labRg = new javax.swing.JLabel();
        labCpf = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        cidade = new javax.swing.JComboBox<>();
        numero = new javax.swing.JTextField();
        try{ 
            javax.swing.text.MaskFormatter masc= new javax.swing.text.MaskFormatter("######");
            numero = new javax.swing.JFormattedTextField(masc);
        }
        catch (Exception e){
        }
        rua = new javax.swing.JTextField();
        bairro = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        try{ 
            javax.swing.text.MaskFormatter masc= new javax.swing.text.MaskFormatter("(##)#####-####");
            masc.setPlaceholderCharacter('_');
            telefone = new javax.swing.JFormattedTextField(masc);
        }
        catch (Exception e){
        }
        if(telefone.getText().length() > 9){
            System.out.println("asdqwezxc");
        }
        cpf = new javax.swing.JTextField();
        try{ 
            javax.swing.text.MaskFormatter masc= new javax.swing.text.MaskFormatter("###.###.###-##");
            masc.setPlaceholderCharacter('_');
            cpf = new javax.swing.JFormattedTextField(masc);
        }
        catch (Exception e){
        }
        rg = new javax.swing.JTextField();
        calcelar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();

        setClosable(true);

        labNome.setText("Nome");

        labRua.setText("Rua");

        labNumero.setText("Numero");

        labTel.setText("Telefone");

        labBairro.setText("Bairro");

        labCid.setText("Cidade");

        labRg.setText("RG");

        labCpf.setText("CPF");

        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomeKeyTyped(evt);
            }
        });

        cidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma cidade" }));

        rua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ruaKeyTyped(evt);
            }
        });

        bairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bairroKeyTyped(evt);
            }
        });

        calcelar.setText("Cancelar");
        calcelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcelarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labNome)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(nome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labCid)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labBairro)
                            .addComponent(bairro, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(labTel)
                            .addComponent(telefone))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rua)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labRua)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labCpf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labRg)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labNumero)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rg, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addComponent(calcelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salvar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNome)
                    .addComponent(labCid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labBairro)
                    .addComponent(labRua)
                    .addComponent(labNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labRg)
                    .addComponent(labTel)
                    .addComponent(labCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar)
                    .addComponent(atualizar)
                    .addComponent(excluir)
                    .addComponent(alterar)
                    .addComponent(calcelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcelarActionPerformed
        novos();
        limpar();
    }//GEN-LAST:event_calcelarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        if(teste()){
            return;
        }
       
        int numeroo = Integer.parseInt(numero.getText());
        int rgg = Integer.parseInt(rg.getText());
        Cliente c1 = new Cliente();
        c1.setNome(nome.getText());
        c1.setCidade(gg.get(cidade.getSelectedIndex()-1));
        c1.setBairro(bairro.getText());
        c1.setRua(rua.getText());
        c1.setNumero(numeroo);
        c1.setCPF(cpf.getText());
        c1.setRg(rgg);
        dg.salvar(c1);
        limpar();
    }//GEN-LAST:event_salvarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
    dg.excluir(Cliente.class, altes.getId());
        novos();
        limpar();

    }//GEN-LAST:event_excluirActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
          if(teste()){
            return;
        }
       
        altes.setNome(nome.getText());
        altes.setCidade(gg.get(cidade.getSelectedIndex()-1));
        altes.setBairro(bairro.getText());
        altes.setRua(rua.getText());
        altes.setNumero(Integer.parseInt(numero.getText()));
        altes.setTel(Integer.parseInt(telefone.getText()));
        altes.setRg(Integer.parseInt(rg.getText()));
        altes.setCPF(cpf.getText());
        dg.atualizar(altes);
        novos();
        limpar();
    }//GEN-LAST:event_atualizarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed

        atualizas();

        TelaCliCon a = new TelaCliCon(null, true);

        altes = a.getCliSel();
        nome.setText(altes.getNome());
        cidade.setSelectedIndex(0);
        bairro.setText(altes.getBairro());
        rua.setText(altes.getRua());
        numero.setText(Integer.toString(altes.getNumero()));
        telefone.setText(Integer.toString(altes.getTel()));
        cpf.setText(altes.getCPF());
        rg.setText(Integer.toString(altes.getRg()));
        labNome.setText("nome(" + altes.getNome() + ")");
        labCid.setText("cidade(" + altes.getCidade().getNome() + ")");
        labBairro.setText("bairro(" + altes.getBairro() + ")");
        labRua.setText("rua(" + altes.getRua() + ")");
        labNumero.setText("numero(" + altes.getNumero() + ")");
        labTel.setText("telefone(" + altes.getTel()+ ")");
        labCpf.setText("cpf(" + altes.getCPF() + ")");
        labRg.setText("rg(" + altes.getRg() + ")");
    }//GEN-LAST:event_alterarActionPerformed

    private void nomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyTyped
        if(nome.getText().isEmpty()){
       evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
    }
    }//GEN-LAST:event_nomeKeyTyped

    private void ruaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ruaKeyTyped
        if(nome.getText().isEmpty()){
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
        }
    }//GEN-LAST:event_ruaKeyTyped

    private void bairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bairroKeyTyped
        if(nome.getText().isEmpty()){
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
        }
    }//GEN-LAST:event_bairroKeyTyped
      public void novos() {
        alterar.setVisible(true);
        atualizar.setVisible(false);
        excluir.setVisible(false);
        salvar.setVisible(true);
    }

    public void atualizas() {
        alterar.setVisible(false);
        atualizar.setVisible(true);
        excluir.setVisible(true);
        salvar.setVisible(false);
    }

    private void limpar() {
        nome.setText("");
        bairro.setText("");
        rua.setText("");
        numero.setText("");
        telefone.setText("");
        cpf.setText("");
        rg.setText("");
        labNome.setText("nome");
        labCid.setText("cidade");
        labBairro.setText("bairro");
        labRua.setText("rua");
        labNumero.setText("numero");
        labTel.setText("telefone");
        labCpf.setText("cpf");
        labRg.setText("rg");
    }
        private boolean teste(){
    if(nome.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"o campo nome esta vazio");
        return true;
    }else if(cidade.getSelectedIndex() == 0){
        JOptionPane.showMessageDialog(null,"selecione uma cidade");
        return true;
    } else if(bairro.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"o campo bairro esta vazio");
        return true;
    } else if(rua.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"o campo rua esta vazio");
        return true;
    } else if(numero.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"o campo numero esta vazio");
        return true;
    } else if(telefone.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"o campo telefone esta vazio");
        return true;
    } else if(cpf.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"o campo cpf esta vazio");
        return true;
    } else if(rg.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"o campo rg esta vazio");
        return true;
    } else{
         JOptionPane.showMessageDialog(null,"operação concluida com sucesso");
          
       return false; 
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton atualizar;
    private javax.swing.JTextField bairro;
    private javax.swing.JButton calcelar;
    private javax.swing.JComboBox<String> cidade;
    private javax.swing.JTextField cpf;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel labBairro;
    private javax.swing.JLabel labCid;
    private javax.swing.JLabel labCpf;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labNumero;
    private javax.swing.JLabel labRg;
    private javax.swing.JLabel labRua;
    private javax.swing.JLabel labTel;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField rua;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables
}
