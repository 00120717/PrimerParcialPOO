package primerparcialpoo;

/**
 *
 * @author Oscar Lovato
 */
public class DUI{
    private int [] codigo=new int[8];
    private int verificador;

    public DUI(int verificador, int [] codigo) {
        this.verificador = verificador;
        this.codigo=codigo;
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
    
    public boolean verificar(){
        
    return false;
}

}