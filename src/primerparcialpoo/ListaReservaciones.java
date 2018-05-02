package primerparcialpoo;

/**
 *
 * @author 00161617
 */
import java.util.ArrayList;


public class ListaReservaciones {
    private ArrayList <Reservacion> reservaciones;
    
    public ListaReservaciones(){
        reservaciones = new ArrayList<>();
        
    }
    
    public void addReservacion(Reservacion reservacion){
        reservaciones.add(reservacion);   
    }
    
    public void verReservacion(int id){
        for (Reservacion reservacion : reservaciones){
            if (reservacion.idReservacion == id){
                System.out.println("Nombre: " + reservacion.Persona.nombre);
                System.out.println("Habitacion: " + reservacion.Habitacion.NumCorrelativo.piso 
                                                + reservacion.Habitacion.NumCorrelativo.numHabitacion);
                System.out.println("Fecha: " + reservacion.Fecha.dia +"/" +  reservacion.Fecha.mes + "/"+  reservacion.Fecha.annio );            
                System.out.println("Estadia: " + reservacion.numDias);
                System.out.println("Precio por Dia: " + reservacion.precioPorDia.precioBase);
                System.out.println("Precio Total: " + reservacion.precioTotal.precioBase);
                
                 
                
                
            }
        }
    }
        
        
        
        /*
        for (int i=0; i<= reservaciones.size(); i++){
            int h = reservaciones.get(i);
            
            
            if (reservaciones.get(i).idReservacion == id) {
                
            }
        }
*/
    
}
