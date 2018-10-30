package gt.com.kinal.tickets.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author armas
 */
@Entity
@Table(name = "AT_DEPARTAMENTO")
public class Departamento {
    @EmbeddedId
    DepartamentoPk id;
    String nombre;
    String telefono;

    public Departamento() {
    }

    public DepartamentoPk getId() {
        return id;
    }

    public void setId(DepartamentoPk id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
