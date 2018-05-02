package primerparcialpoo;

/**
 *
 * @author MMonterrosa
 */
public class Precio {
    double precioBase;
    
    public Precio(){
    }
    public Precio (double precio){
        precioBase = precio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
}
