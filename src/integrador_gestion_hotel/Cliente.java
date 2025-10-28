
package integrador_gestion_hotel;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Axel
 */
public class Cliente extends Persona{
    private String email;
    private ArrayList<Reserva> reservas;
    
    public Cliente(String nombre, String dni, String email){
        super(nombre, dni);
        this.email = email;
        this.reservas = new ArrayList<>();
    }

    public String getEmail() {
        return this.email;
    }

    public ArrayList<Reserva> getReservas() {
        return new ArrayList<Reserva>(this.reservas);
    }
    
    public void realizarReserva(Hotel hotel, Habitacion habitacion, LocalDate inicio, LocalDate fin ){
        //Completar
    }
    
    @Override
    public void notificar(String notificacion){
        String mensaje = "Email: " + this.email + " " + " Señor: " + super.getNombre() + ": " + notificacion;
        super.agregarNotificacion(mensaje);
    }
    
    
    
    
    
    
}
