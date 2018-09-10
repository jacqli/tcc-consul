

package zaas;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.MaskFormatter;


public class MeuCampo extends JPanel {
  // classe é um campo por causa da herança
private boolean obrigatorio = true;

    public MeuCampo(){
       setSize(300, 150);
           MaskFormatter masc = null;
        try {
             masc = new MaskFormatter("###.###.###-##");
            masc.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
              System.err.println("Erro na formatação: " + ex.getMessage());
                    System.exit(-1);
        }
        
             JFormattedTextField jj = new JFormattedTextField(masc);
             add(jj);
             setSize(400, 250);
             setVisible(true);
    }

}
