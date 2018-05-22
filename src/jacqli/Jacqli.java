package jacqli;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import tela.TelaMain;
import tela.Teste;
import zaas.asd;


public class Jacqli {

    public static void main(String[] args) throws ParseException {
      /* SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");    
        
   
       System.out.println(LocalDateTime.now().toLocalDate().atStartOfDay().atZone(ZoneId.systemDefault()).toString());
      
  
      asd a = new asd();  a.setSize(300, 300);
            
     
       String ca = "81-2";
        System.out.println(ca.matches("[0-9][0-9]-[0-9]"));
        System.out.println(ca.matches("^\\d{2}-\\d{1}$"));
        System.out.println(ca.matches("(.*)1-(.*)"));
        */
    
       TelaMain tm = new TelaMain();
          CriaClasse c1 = new CriaClasse();
       c1.Classes();

    }

}
