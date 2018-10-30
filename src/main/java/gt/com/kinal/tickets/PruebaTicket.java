package gt.com.kinal.tickets;

import gt.com.kinal.tickets.model.Tecnico;
import gt.com.kinal.tickets.model.Ticket;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author armas
 */
public class PruebaTicket {
    
    public static void main (String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ticketsPU"); //Unidad de persistencia
        EntityManager em = emf.createEntityManager(); //obtiene una conexion para poder conextarse a MySQL
        EntityTransaction tx = em.getTransaction();
        
        Ticket ticket = new Ticket("Navegacion", "No puedo ingresar a pagina Banguat", new Date(), "C");
        
        
        //cuando la transacion es local debemos iniciarla nosotros
        tx.begin();
        //todo lo que se encuetra aca dentro de la transacion
        em.persist(ticket); //em=ntity manager pestiste la entidad ticket
        //asignar ticket a un tecnico
        Tecnico tecnico = new Tecnico("Pedro Armas", "pedroarmasr@kinal.org.gt");
       // em.persist(tecnico);
        ticket.setTecnico(tecnico);
        ticket.setEstado("A");
        //Eliminar de base de datos
        //DELETE
        //em.remove(ticket);
        
        tx.commit(); //damos commit a la transaccion
        
        System.out.println("Transaccion ejecutada");
        em.close();
        emf.close();
    }
    
}
