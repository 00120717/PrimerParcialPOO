package primerparcialpoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 00161617
 */
public class AdmReservacion {
    
    private ArrayList <Reservacion> reservaciones;
    
    public AdmReservacion(){
        //reservaciones = new ArrayList<>();
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
                break;
            }
            System.out.println("El Id no se encuentra registrado en el sistema");
        }
        
    }
    
   
    public void modificarReservacion(int id){
        
       System.out.println("Que Desea Modificar? ");
       System.out.println("1) Nombre ");
       System.out.println("2) Habitacion");
       System.out.println("3) Estadia");
       System.out.println("4) Fecha");
       System.out.println("5) Paquete");
       System.out.print("Ingrese una Opcion: ");
       Scanner leer = new Scanner(System.in);
       String name = leer.next();
       int opcion = Integer.parseInt(name);
       
           
       
        for (Reservacion reservacion : reservaciones){
            if (reservacion.idReservacion == id){
                switch(opcion){
                    case 1: System.out.println("Ingrese nuevos nombres: ");
                    Scanner leer2 = new Scanner(System.in);
                    String newName= leer2.next();
                    System.out.println("Ingrese nuevos apellidos: ");
                    Scanner leer3 = new Scanner(System.in);
                    String newApellidos= leer3.next();
                    reservacion.huesped.nombre.setNombres(newName);
                    reservacion.huesped.mombre.setApellidos(newApellidos);
                    case 2
                            
                }
            }
        }   
    }
    public void calcelarReservacion(){
        
    }
    
    
}
