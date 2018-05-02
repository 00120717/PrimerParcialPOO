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
        int verificador=1,cont=9,var;
        int suma=0,mod=0,ver=0;
        for(int i=0;i<8;i++){
               var=codigo[i]*cont;
               suma+=var;
               cont--;
        }
        mod=suma%10;
        ver=10-mod;
    return ver==verificador || ver==0;
}

}