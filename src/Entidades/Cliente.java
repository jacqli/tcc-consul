
package Entidades;

import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa {
   private int rg;
   private String CPF;
   private String camImg;

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCamImg() {
        return camImg;
    }

    public void setCamImg(String camImg) {
        this.camImg = camImg;
    }
   
}
