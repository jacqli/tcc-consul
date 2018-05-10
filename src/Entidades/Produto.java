
package Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
          @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int id; 
   private int estoque; 
   private String nome;  


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}

