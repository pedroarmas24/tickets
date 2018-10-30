package gt.com.kinal.tickets.model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author armas
 */
@Entity
@Table(name = "AT_TICKET") /*//Modifica el nombre de la tabla*/
public class Ticket {
    @Id //atributo que identifica la identidad
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincrementa
    @Column(name = "TICKET_ID")//palabras compuestas cambia el nombre de columna
    private Long TicketId;
    @NotNull
    @Size(max = 50)
    @Column(nullable = false, length = 50)
    private String titulo;
    @NotNull
    @Size(max = 500)
    @Column(nullable = false, length = 500)
    private String descripcion;
    @Temporal(TemporalType.TIMESTAMP)//da formato a los atributos de fecha
    @NotNull
    @Column(name = "FECHA_CRECION", nullable = false) 
    private Date fechaCreacion;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_SOLUCION")
    private Date fechaSolucion;
    @NotNull
    @Size(max = 1)
    @Column(nullable = false, length = 1)
    private String estado;
//    @Column(name = "TECNICO_ID")
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "TECNICO_ID")
    private Tecnico tecnico;

    public Ticket() {
    }

    public Ticket(String titulo, String descripcion, Date fechaCreacion, String estado) {
        this.titulo = titulo; //seleccionamos los que no son not Null menos ticketid
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
    }
    
    
    public Long getTicketId() {
        return TicketId;
    }

    public void setTicketId(Long TicketId) {
        this.TicketId = TicketId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaSolucion() {
        return fechaSolucion;
    }

    public void setFechaSolucion(Date fechaSolucion) {
        this.fechaSolucion = fechaSolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

//    public Long getTecnicoId() {
//        return tecnicoId;
//    }
//
//    public void setTecnicoId(Long tecnicoId) {
//        this.tecnicoId = tecnicoId;
//    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    
    
    
    
   
    
}
