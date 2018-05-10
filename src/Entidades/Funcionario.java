
package Entidades;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Funcionario extends Pessoa {
   private int RG;
   private String CPF;
   private int cartTrab;
   private String login;
   private String senha;


    public int getCartTrab() {
        return cartTrab;
    }

    public void setCartTrab(int cartTrab) {
        this.cartTrab = cartTrab;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    

}
