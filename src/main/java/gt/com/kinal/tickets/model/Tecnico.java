package gt.com.kinal.tickets.model; //mapeo de relaciones

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 *
 * @author armas
 */
@Entity
@Table(name = "AT_TECNICO")
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)        
    @Column(name ="TECNICO_ID")
    Long tecnicoID;
    @NotNull
    @Size(max = 100)    
    @Column(nullable = false, length = 100)
    String nombre;
    @NotNull
    @Size(max = 100)    
    @Column(nullable = false, length = 100)
    String email;
    @OneToMany(mappedBy = "tecnico") //indica quien es el dueño
    @JoinColumn(name = "TECNICO_ID")
    List<Ticket> tickets;//convertir la relacion unidireccional en bidireccional
    
    public Tecnico() {
    }

    public Tecnico(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    

    public Long getTecnicoID() {
        return tecnicoID;
    }

    public void setTecnicoID(Long tecnicoID) {
        this.tecnicoID = tecnicoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
    
    
    
    
}
