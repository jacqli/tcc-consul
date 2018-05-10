package jacqli;

import Entidades.Cidade;
import Entidades.Cliente;
import Entidades.Exame;
import Entidades.Estado;
import Entidades.Funcionario;
import Entidades.Produto;
import Entidades.TipoEx;
import Fabrica_DAO.DAOGenerico;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class CriaClasse {

    public void Classes() {
        DAOGenerico dg = new DAOGenerico();

        Estado e2 = new Estado();
        e2.setNome("aaaa");
        e2.setSigla("gh");
        dg.salvar(e2);
        e2.setNome("dasdasd");
        e2.setSigla("MA");
        dg.atualizar(e2);

        Estado e3 = new Estado();
        e3.setNome("ab");
        e3.setSigla("MF");
        dg.salvar(e3);
        dg.excluir(Estado.class, e3.getId());

        Estado e4 = new Estado();
        e4.setNome("aac");
        e4.setSigla("M");
        dg.salvar(e4);

        Estado e5 = new Estado();
        e5.setNome("ddaa");
        e5.setSigla("MS");
        dg.salvar(e5);

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
        f2.setFone(2222222);
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
        f3.setFone(3333333);
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
        cl2.setFone(12345);
        cl2.setRg(123456);
        cl2.setCPF("12342455");
        dg.salvar(cl2);

        Cliente cl3 = new Cliente();
        cl3.setNome("bb");
        cl3.setCidade(c3);
        cl3.setBairro("bbb");
        cl3.setRua("rubbbbb");
        cl3.setNumero(4321);
        cl3.setFone(54321);
        cl3.setRg(654321);
        cl3.setCPF("12355324");
        dg.salvar(cl3);

        TipoEx te1 = new TipoEx();
        te1.setNome("meu dente");
        te1.setPreco(20.20);
        te1.setTempoEx(30);
        dg.salvar(te1);
        
        TipoEx te2 = new TipoEx();
        te2.setNome("mead");
        te2.setPreco(130.50);
        te2.setTempoEx(90);
        dg.salvar(te2);

        Exame co1 = new Exame();
        Calendar cal = Calendar.getInstance();
    
        String tempo = "2011 Mar 14 16:02";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm", Locale.getDefault());
        try {
            cal.setTime(sdf.parse(tempo));
// adicionar minhutos cal.add(Calendar.MINUTE, 100); 
       cal.add(Calendar.MINUTE, te2.getTempoEx());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        co1.setCliente(cl3);
        co1.setTipoEx(te2);
        co1.setData(cal);
        dg.salvar(co1);
        
        

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
