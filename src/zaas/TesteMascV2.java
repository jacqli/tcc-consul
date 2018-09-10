
package zaas;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class TesteMascV2 extends JPanel{
        public TesteMascV2() {
       MaskFormatter masc = null;
        try {
            // #(numero) ?(letra) U(uppercase) L(lowercase)
             masc = new MaskFormatter("UUU.LLL.???-##");
            masc.setPlaceholderCharacter('_');
  
        } catch (ParseException ex) {
              System.err.println("Erro na formatação: " + ex.getMessage());
                    System.exit(-1);
        }
        
            JFormattedTextField jj = new JFormattedTextField(masc);
            add(jj);
        
    }
}
