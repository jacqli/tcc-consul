
package tela;

import Entidades.Cidade;
import Entidades.Funcionario;
import Fabrica_DAO.DAOGenerico;
import java.util.List;

public class TelaFun extends javax.swing.JInternalFrame {

 private DAOGenerico de = new DAOGenerico();
    public TelaFun() {
        initComponents();
        setVisible(true);
        List<Cidade> gg = de.consultar(Cidade.class);
        for(int i = 0;i<gg.size() ; i++){
            combocid.addItem(gg.get(i).getNome());
    }
   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        campobairro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campotel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campocpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        camporg = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        camponome = new javax.swing.JTextField();
        combocid = new javax.swing.JComboBox<>();
        salcar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        camponumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        camporua = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campocart = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        senha = new javax.swing.JTextField();

        setClosable(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setText("Numero");

        jLabel4.setText("Telefone");

        jLabel5.setText("Bairro");

        jLabel6.setText("Cidade");

        jLabel7.setText("RG");

        jLabel8.setText("CPF");

        salcar.setText("Salvar");
        salcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salcarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Rua");

        jLabel9.setText("Carteira de Trabalho");

        jLabel11.setText("Login");

        jLabel12.setText("Senha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(152, 152, 152))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(login)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campocart, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                        .addGap(7, 7, 7)
                        .addComponent(senha, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 205, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 206, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(camponome))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combocid, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(campobairro, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(campotel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(camporua)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(camponumero, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campocpf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(camporg, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salcar)))
                    .addGap(5, 5, 5)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campocart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 162, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 163, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combocid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(camporua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campobairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(camponumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel4)
                        .addComponent(jLabel8))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campocpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(camporg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                    .addComponent(salcar)
                    .addGap(6, 6, 6)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salcarActionPerformed

        List<Cidade> gg = de.consultar(Cidade.class);
        int numeroo = Integer.parseInt(camponumero.getText());
        int rgg = Integer.parseInt(camporg.getText());
        int cartt = Integer.parseInt(campocart.getText());
        Funcionario f1 = new Funcionario();
        f1.setNome(camponome.getText());
        f1.setCidade(gg.get(combocid.getSelectedIndex()));
        f1.setBairro(campobairro.getText());
        f1.setRua(camporua.getText());
        f1.setNumero(numeroo);
        f1.setCPF(campocpf.getText());
        f1.setRG(rgg);
        f1.setCartTrab(cartt);
        f1.setLogin(login.getText());
        f1.setSenha(senha.getText());
        de.salvar(f1);
     camponome.setText("");
     campobairro.setText("");
     camporua.setText("");
     camponumero.setText("");
     campotel.setText("");
     camporg.setText("");
     campocpf.setText("");
     campocart.setText("");
     login.setText("");
     senha.setText("");
    }//GEN-LAST:event_salcarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campobairro;
    private javax.swing.JTextField campocart;
    private javax.swing.JTextField campocpf;
    private javax.swing.JTextField camponome;
    private javax.swing.JTextField camponumero;
    private javax.swing.JTextField camporg;
    private javax.swing.JTextField camporua;
    private javax.swing.JTextField campotel;
    private javax.swing.JComboBox<String> combocid;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField login;
    private javax.swing.JButton salcar;
    private javax.swing.JTextField senha;
    // End of variables declaration//GEN-END:variables
}
