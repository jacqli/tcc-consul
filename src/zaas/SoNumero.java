
package zaas;

import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;
import javax.swing.text.Element;

public class SoNumero extends JTextField{   

    public SoNumero() {
        setSize(300, 150);
    setSize(100, 50);
    AbstractDocument dc = (AbstractDocument) getDocument();
    dc.setDocumentFilter(upperDF);
    setDocument(dc);
    }
//"[^0-9.]
    DocumentFilter upperDF = new DocumentFilter() {
      public void insertString(FilterBypass fb, int offset,
              String string, AttributeSet attr) throws BadLocationException {
          super.insertString(fb, offset, string.toUpperCase(), attr);
      }

      public void replace(FilterBypass fb, int offset, int length, 
              String string, AttributeSet attr) throws BadLocationException {
          if (string != null) {
              string = string.toUpperCase();
          }
          super.replace(fb, offset, length, string, attr);
      }
   };
}


