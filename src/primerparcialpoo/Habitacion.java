package primerparcialpoo;

/**
 *
 * @author Oscar Lovato
 */
public class Habitacion {
    private NumCorrelativo idHabitacion;
    private Precio precio;
    private boolean estado;

    public Habitacion() {
    }

    public NumCorrelativo getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(NumCorrelativo idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Precio getPrecio() {
        return precio;
    }

    public void setPrecio(Precio precio) {
        this.precio = precio;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    NumCorrelativo verifica=new NumCorrelativo();
    public boolean verfiEstado(){
        if(verifica.verificarEstado()){
            return true;
        }
        return false;
    }
    
}
