/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

/**
 *
 * @author Marvin Ramirez
 */
public class Tarjeta {
    private int[] codigo = new int[15];
    private int verificador;
    private String idTarjeta; 
    
    public Tarjeta(){};
    
    
    public Tarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    public int getVerificador() {
        return verificador;
    }

    public void setVerificador(int verificador) {
        this.verificador = verificador;
    }

    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }
    
    
}
