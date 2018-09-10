
package Entidades;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Exame {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; 
     @Temporal(TemporalType.DATE)
    private Date data; 
     @Temporal(TemporalType.TIME)
    private Date hora;  
    private boolean jaPago = false;
    private double preco;
    @ManyToOne
    private TipoEx tipoEx;
    @ManyToOne
    private Cliente cliente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public TipoEx getTipoEx() {
        return tipoEx;
    }

    public void setTipoEx(TipoEx tipoEx) {
        this.tipoEx = tipoEx;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isJaPago() {
        return jaPago;
    }

    public void setJaPago(boolean jaPago) {
        this.jaPago = jaPago;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
