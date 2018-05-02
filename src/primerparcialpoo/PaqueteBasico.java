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
public class PaqueteBasico {
    public String idPaquete; 
    public boolean piscina,internet; 
    public Precio costoExtra;
    
    public PaqueteBasico(){}
    
    public PaqueteBasico(String idPaquete, boolean piscina, boolean internet, Precio costoExtra){
        this.idPaquete=idPaquete;
        this.piscina=piscina;
         
   }

    public String getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(String idPaquete) {
        this.idPaquete = idPaquete;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public Precio getCostoExtra() {
        return costoExtra;
    }

    public void setCostoExtra(Precio costoExtra) {
        this.costoExtra = costoExtra;
    }
   
}