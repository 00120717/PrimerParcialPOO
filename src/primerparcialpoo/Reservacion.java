/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

/**
 *
 * @author R.Fuentes
 */
public class Reservacion {
   public Persona huesped; Habitacion habitacion; int numDias; Precio precioPorDia,precioTotal;
    public Reservacion(){}

    public Persona getHuesped() {
        return huesped;
    }

    public void setHuesped(Persona huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public Precio getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(Precio precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public Precio getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Precio precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Reservacion(Persona huesped, Habitacion habitacion, int numDias, Precio precioPorDia, Precio precioTotal) {
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.numDias = numDias;
        this.precioPorDia = precioPorDia;
        this.precioTotal = precioTotal;
    }
    
   
    
}
