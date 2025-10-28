package integrador_gestion_hotel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author Axel
 */
public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean confirmada;
    
    public Reserva(Cliente cliente, Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin){
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.confirmada = false;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Habitacion getHabitacion() {
        return this.habitacion;
    }

    public LocalDate getFechaInicio() {
        return this.fechaInicio;
    }

    public LocalDate getFechaFin() {
        return this.fechaFin;
    }

    public boolean isConfirmada() {
        return this.confirmada;
    }
    
    public void confirmar(){
        if(this.confirmada == false){
            this.confirmada =! this.confirmada;
        }
        
    }
    
    public double calcularTotal(){
        long cantidadNoches = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        
        return cantidadNoches * this.habitacion.getPrecioPorNoche();
        
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reserva{");
        sb.append("cliente=").append(cliente);
        sb.append(", habitacion=").append(habitacion);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", fechaFin=").append(fechaFin);
        sb.append(", confirmada=").append(confirmada);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    
    
}//FIN
