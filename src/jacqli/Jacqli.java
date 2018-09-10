package jacqli;

import Entidades.Estado;
import Fabrica_DAO.DAOGenerico;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import tela.TelaMain;
import tela.Teste;
import zaas.asd;

public class Jacqli {

    public static void main(String[] args) throws ParseException {
        DAOGenerico dg = new DAOGenerico();
  //LEMBRAR internalFrame.setMaximum(true);
        
        /* SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");    
        
   
       System.out.println(LocalDateTime.now().toLocalDate().atStartOfDay().atZone(ZoneId.systemDefault()).toString());
      
  
      asd a = new asd();  a.setSize(300, 300);
            
     for (double i = 0; i < 24; i+= 0.5) {
            String  i2 = Double.toString(i);
            if(i2.matches("^\\d{1}.5$")){
              i2 = i2.substring(0, 1)+".30";
                System.out.println(i2+"AAAAAA");
            }
            else if(i2.matches("^\\d{2}.5$")){
                i2 = i2.substring(0, 2)+".30";
                System.out.println(i2+"bbbbbbb");
            } else 
          System.out.println(i+"ccccccc");
            
        }
     
         */
 /*Time t =  Time.valueOf(LocalTime.of(10, 0));
Date t = Date.from(Instant.now());
Date.UTC(1200, 2, 20, 12, 3, 30);
LocalTime a = LocalTime.of(10, 0);
LocalDate b = LocalDate.of(10, 2,20);
         */
 /*  String ca = "81-2";
        System.out.println(ca.matches("[0-9][0-9]-[0-9]"));
        System.out.println(ca.matches("^\\d{2}-\\d{1}$"));
        System.out.println(ca.matches("(.*)1-(.*)"));
         */
     /*   DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nome");
        model.addColumn("Sigla");
        List<Estado> listEnt = dg.consultar(Estado.class);

        for (int i = 0; i < listEnt.size(); i++) {
            Object[] data = {listEnt.get(i).getNome(), listEnt.get(i).getSigla()};
            model.addRow(data);
        }
            if (model.getRowCount() > 0) {
                for (int i4 = model.getRowCount() - 1; i4 > -1; i4--) {
                    System.out.println("A"+model.getValueAt(0, i4).toString());
                    model.removeRow(i4);
                }
            }*/
        
/*List<Estado> e2;
e2.add(e1.get(1));*
   */  
String x = "1233.23";
        System.out.println(x.matches("(.*)\\.\\d{2}"));
          TelaMain tm = new TelaMain();
          CriaClasse c1 = new CriaClasse();
       c1.Classes();


/*try{ 
javax.swing.text.MaskFormatter hora = new javax.swing.text.MaskFormatter("##:##");
hora.setPlaceholderCharacter('_');
    System.out.println(hora.getMask());
}
catch (Exception e){
}*/

    }
}
