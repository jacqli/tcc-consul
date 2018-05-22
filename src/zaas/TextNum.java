
package zaas;

import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;


public class TextNum extends JFormattedTextField {
 
    public TextNum(){
     NumberFormatter formatter = new NumberFormatter(); 
    formatter.setAllowsInvalid(false); 
        setFormatter(formatter);
 }
    private void delnum(java.awt.event.KeyEvent evt){
     char c = evt.getKeyChar();
     if(Character.isLetter(c)){
         Toolkit.getDefaultToolkit().beep();
         evt.consume();
     }
    }
}
