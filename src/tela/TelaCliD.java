
package tela;

import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class TelaCliD extends javax.swing.JInternalFrame {

Image img = null;
    public TelaCliD() {
        initComponents();
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        try{  
            img = ImageIO.read(getClass().getResource("../fotos/cliTeste.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
        img2 = new JLabel(new ImageIcon(img));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img2, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img2;
    // End of variables declaration//GEN-END:variables
}
