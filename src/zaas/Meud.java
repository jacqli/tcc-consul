
package zaas;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import javax.swing.JPanel;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;


public class Meud extends JPanel {

    public Meud() {
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        model.setValue(Calendar.getInstance().getTime());
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
       Date selectedate = (Date) datePicker.getModel().getValue();
       datePicker.setVisible(true);
       add(datePicker);
       setVisible(true);
    }
    
}
