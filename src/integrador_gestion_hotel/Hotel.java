package integrador_gestion_hotel;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Axel
 */
public class Hotel {
    private String nombre;
    private String direccion;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Recepcionista> recepcionistas;
    private ArrayList<Reserva> reservasTotales;
    
    public Hotel(){
        this.habitaciones = new ArrayList<>();
        this.recepcionistas = new ArrayList<>();
        this.reservasTotales = new ArrayList<>();
    }
    
    
    public Hotel(String nombre, String direccion){
        this();
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return new ArrayList(this.habitaciones);
    }

    public ArrayList<Recepcionista> getRecepcionistas() {
        return new ArrayList(this.recepcionistas);
    }

    public ArrayList<Reserva> getReservasTotales() {
        return new ArrayList(this.reservasTotales);
    }
    
    public void agregarHabitacion(Habitacion habitacion){
        this.habitaciones.add(habitacion);
    }
    
    public void agregarRecepcionista(Recepcionista recepcionistas){
        this.recepcionistas.add(recepcionistas);
    }
        
    public void agregarReservasTotales(Reserva reservasTotales){
        this.reservasTotales.add(reservasTotales);
    }
    
    public ArrayList<Habitacion> buscarHabitacionesDisponibles(LocalDate inicio, LocalDate fin, TipoHabitacion tipo){
        ArrayList<Habitacion> habitacionesDisponibles = new ArrayList<>();
        
        for (Habitacion item : this.habitaciones) {
            if(this.estaHabitacionDisponible(item, inicio, fin)){
                habitacionesDisponibles.add(item);
            }
        }
        return habitacionesDisponibles;
    }
    
    
    public boolean estaHabitacionDisponible(Habitacion habitacion, LocalDate inicio, LocalDate fin){
        boolean disponibilidad = true;
        
        
        for (Reserva item : this.reservasTotales) {
            if(item.getHabitacion().equals(habitacion)){
                LocalDate inicioReserva = item.getFechaInicio() ;
                LocalDate inicioSolicitud = inicio;
                LocalDate finReserva = item.getFechaFin();
                LocalDate finSolicitud = fin;
                
                boolean solapados = inicioReserva.isBefore(finSolicitud) && inicioSolicitud.isBefore(finReserva);
                if(solapados){
                    disponibilidad = false;
                }
            }
        }
        return disponibilidad;
    }
    
    
        
    
    
    
    
    
    
    
    
    
}
