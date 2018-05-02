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
                System.out.println("Nombre: " + reservacion.Persona.getNombres() + reservacion.Persona.getApellidos());
                System.out.println("Habitacion: " + reservacion.Habitacion.NumCorrelativo.getPiso() 
                                                + reservacion.Habitacion.NumCorrelativo.getNumHabitacion());
                System.out.println("Fecha: " + reservacion.Fecha.getDia() +"/" +  reservacion.Fecha.getMes() + "/"+  reservacion.Fecha.getAnnio() );            
                System.out.println("Estadia: " + reservacion.getNnumDias());
                System.out.println("Precio por Dia: " + reservacion.precioPorDia.getPrecioBase());
                System.out.println("Precio Total: " + reservacion.precioTotal.getPrecioBase());  
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
                    break;
                    
                    case 2: 
                    case 3: System.out.println("Ingrese numero de dias: ");
                    Scanner leer4 = new Scanner(System.in);
                    String newEstadia= leer4.next();
                    int estadia = Integer.parseInt(newEstadia);
                    reservacion.huesped.setNumDias(estadia);
                    break;
                    
                    case 4: System.out.println("Ingrese dia: ");
                    Scanner leer5 = new Scanner(System.in);
                    String dia= leer5.next();
                    int newDia = Integer.parseInt(dia);
                    
                    System.out.println("Ingrese mes: ");
                    Scanner leer6 = new Scanner(System.in);
                    String mes= leer6.next();
                    int newMes = Integer.parseInt(mes);
                    
                    System.out.println("Ingrese annio: ");
                    Scanner leer7 = new Scanner(System.in);
                    String annio = leer7.next();
                    int newAnnio = Integer.parseInt(annio);
                    
                    reservacion.fecha.setDia(newDia);
                    reservacion.fecha.setMes(newMes);
                    reservacion.fecha.setAnnio(newAnnio);
                    
                    case 5: System.out.println("1) Paquete Basico ");
                    System.out.println("2) Paquete Premium ");
                    System.out.println("Ingrese una opcion: ");
                    Scanner leer8 = new Scanner(System.in);
                    String opcPaquete = leer8.next();
                    int opcionPkt = Integer.parseInt(opcPaquete);
                    
                }
            }
        }   
    }
    public void cancelarReservacion(){
        
    }
    
    
}
