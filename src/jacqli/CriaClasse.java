package jacqli;

import Entidades.Cidade;
import Entidades.Cliente;
import Entidades.Exame;
import Entidades.Estado;
import Entidades.Funcionario;
import Entidades.Produto;
import Entidades.TipoEx;
import Fabrica_DAO.DAOGenerico;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class CriaClasse {

    public void Classes() {
        DAOGenerico dg = new DAOGenerico();

        Estado e2 = new Estado();
        e2.setNome("Acre");
        e2.setSigla("AC");
        dg.salvar(e2);
     /*   e2.setNome("dasdasd");
        e2.setSigla("MA");
        dg.atualizar(e2);
   */

        Estado e3 = new Estado();
        e3.setNome("Alagoas");
        e3.setSigla("AL");
        dg.salvar(e3);
   //     dg.excluir(Estado.class, e3.getId());

        Estado e4 = new Estado();
        e4.setNome("Amapa");
        e4.setSigla("AP");
        dg.salvar(e4);

        Estado e5 = new Estado();
        e5.setNome("Amazonas");
        e5.setSigla("AM");
        dg.salvar(e5);
        
           Estado e6 = new Estado();
        e6.setNome("Bahia");
        e6.setSigla("BA");
        dg.salvar(e6);
        
           Estado e7 = new Estado();
        e7.setNome("Ceara");
        e7.setSigla("CE");
        dg.salvar(e7);

           Estado e8 = new Estado();
        e8.setNome("Distrito Federal");
        e8.setSigla("DF");
        dg.salvar(e8);
        
           Estado e9 = new Estado();
        e9.setNome("Espirito Santo");
        e9.setSigla("ES");
        dg.salvar(e9);
        
           Estado e10 = new Estado();
        e10.setNome("Goias");
        e10.setSigla("GO");
        dg.salvar(e10);
        
        Cidade c2 = new Cidade();
        c2.setNome("platina");
        c2.setEstado(e2);
        dg.salvar(c2);

        Cidade c3 = new Cidade();
        c3.setNome("deku forest");
        c3.setEstado(e2);
        dg.salvar(c3);

        Produto p1 = new Produto();
        p1.setNome("aaaaaaaa");
        p1.setEstoque(10);
        dg.salvar(p1);

        Funcionario f2 = new Funcionario();
        f2.setNome("eu");
        f2.setCPF("111111111");
        f2.setCartTrab(111);
        f2.setTel(2222222);
        f2.setLogin("aula");
        f2.setSenha("aula");
        f2.setCidade(c3);
        f2.setBairro("Centro");
        f2.setRua("rua");
        f2.setNumero(1999);
        dg.salvar(f2);

        Funcionario f3 = new Funcionario();
        f3.setNome("ele");
        f3.setCPF("111111111");
        f3.setCartTrab(222);
        f3.setTel(3333333);
        f3.setLogin("aluno");
        f3.setSenha("aluno");
        f3.setCidade(c3);
        f3.setBairro("Centro");
        f3.setRua("ruas");
        f3.setNumero(1998);
        dg.salvar(f3);

        Cliente cl2 = new Cliente();
        cl2.setNome("aa");
        cl2.setCidade(c3);
        cl2.setBairro("aaa");
        cl2.setRua("ruaaaa");
        cl2.setNumero(1234);
        cl2.setTel(12345);
        cl2.setRg(123456);
        cl2.setCPF("12342455");
        dg.salvar(cl2);

        Cliente cl3 = new Cliente();
        cl3.setNome("bb");
        cl3.setCidade(c3);
        cl3.setBairro("bbb");
        cl3.setRua("rubbbbb");
        cl3.setNumero(4321);
        cl3.setTel(54321);
        cl3.setRg(654321);
        cl3.setCPF("12355324");
        dg.salvar(cl3);

        TipoEx te1 = new TipoEx();
        te1.setNome("meu dente");
        te1.setTempoEx(30);
        dg.salvar(te1);
        
        TipoEx te2 = new TipoEx();
        te2.setNome("doi");
        te2.setTempoEx(90);
        dg.salvar(te2);

        
        Exame co1 = new Exame();
        Calendar cal = Calendar.getInstance();
       cal.set(Calendar.HOUR_OF_DAY, 10);
       cal.set(Calendar.MINUTE, 00);
       /* esse codigo pode ser util dps 
        String tempo = "2018 Jul 14 10:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm", Locale.getDefault());
        try {
            cal.setTime(sdf.parse(tempo));
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        co1.setCliente(cl3);
        co1.setTipoEx(te2);
        co1.setData(cal.getTime());
        co1.setHora(cal.getTime());
        dg.salvar(co1);
        
        Exame co2 = new Exame();
        Calendar cal2 = Calendar.getInstance();
       cal2.set(Calendar.HOUR_OF_DAY, 10);
       cal2.set(Calendar.MINUTE, 30);
   
        co2.setCliente(cl2);
        co2.setTipoEx(te2);
        co2.setData(cal2.getTime());
        co2.setHora(cal2.getTime());
        dg.salvar(co2);
        
        Exame co3 = new Exame();
        Calendar cal3 = Calendar.getInstance();
        cal3.set(Calendar.HOUR_OF_DAY, 11);
       cal3.set(Calendar.MINUTE, 30);
   
    
        co3.setCliente(cl3);
        co3.setTipoEx(te2);
        co3.setData(cal3.getTime());
        co3.setHora(cal3.getTime());
        dg.salvar(co3);
        
        
        

        /*     
    List<Genero> gg = dg.consultar(Genero.class);
    for(int i = 0;i<gg.size() ; i++){
        System.out.println(gg.get(i).getNome());
    }
    gg.forEach((g) -> {
        System.out.println(g.getNome());
        });
     

     Produto prodc = (Produto) dg.consultar(Produto.class, p1.getId());
        System.out.println(prodc.getNome());
        for(int i = 0; i < gp1.size(); i++){
            System.out.println(gp1.get(i).getNome());
        }
        GerarCodigo cp1 = new GerarCodigo();
        cp1.setProduto(p1);
        dg.salvar(cp1);
        System.out.println(cp1.getCodprod());
        
       tela1 telam = new tela1();
         telam.setName("Jacqli");
         telam.setTitle("Abanana");*/
    }
    

}
