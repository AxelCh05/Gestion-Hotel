
package integrador_gestion_hotel;

/**
 *
 * @author Axel
 */
public class Recepcionista extends Persona{
    private String legajo;
    private int entero;
    
    public Recepcionista(String nombre, String dni, String legajo){
        super(nombre,dni);
        this.legajo = legajo;
    }
    
    public String getLegajo(){
        return this.legajo;
    }
    
    public void confirmarReserva(Reserva reserva, Hotel hotel){
        
    }
    
    @Override
    public void notificar(String notificacion){
        String mensaje = "Legajo Nro: "+ this.legajo + " " + " Sr: " + super.getNombre() + " : " + notificacion;
        super.agregarNotificacion(mensaje);
    }
    
    
    
}// FIn
