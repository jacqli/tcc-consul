/*package rel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JDialog;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class TelaR extends JDialog{
public TelaR(){
super(new JFrame(),"Relatório",true);
//definindo tamanho da tela
setSize(800,600);
try{
//realizando conexão (MySQL)
Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
//creando statement
Statement st = conn.createStatement();
//buscando dados no banco
ResultSet rs = st.executeQuery("select * from estado");
//definindo data source
JRResultSetDataSource ds = new JRResultSetDataSource(rs);
//compilando relatório jrxml
JasperReport js = JasperCompileManager.compileReport(System.getProperty("user.dir")+"/relatorio/aaaaa.jrxml");
//inserindo dados no relatório compilado
JasperPrint jp = JasperFillManager.fillReport(js, null, ds);
JasperViewer jw = new JasperViewer(jp);
getContentPane().add(jw.getContentPane());
}catch(Exception e){
e.printStackTrace();
}
setVisible(true);
}}*/