
package Entidades;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Exame {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; 
    private Calendar data;
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

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
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
    
    
}
