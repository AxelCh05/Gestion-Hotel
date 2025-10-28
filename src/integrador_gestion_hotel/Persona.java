
package integrador_gestion_hotel;

import java.util.ArrayList;

/**
 *
 * @author Axel
 */
public abstract class Persona {
    private String nombre;
    private String dni;
    private ArrayList<String> notificaciones;
    
    public Persona(){
        this.notificaciones = new ArrayList<>();
    }
    
    public Persona(String nombre, String dni){
        this(); // Llamando al constructor sin parametro - /En caso de buscar uno con parametros se le agrega
        this.nombre = nombre;
        this.dni = dni;        
    }
    
    //metodo abstracto
    public abstract void notificar(String notificacion);
    
    // gets
    public String getNombre() {
        return this.nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public ArrayList<String> getNotificaciones() {
        return new ArrayList<String>(); // mandar la copia
    }
    
    //metodo protegido
    protected void agregarNotificacion(String mensaje){
        this.notificaciones.add(mensaje);
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", dni=").append(dni);
        for (String item : notificaciones) {
            sb.append("Notificacion ").append(item);
        }
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//FIN
