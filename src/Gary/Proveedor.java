package Gary;

public class Proveedor extends Persona{
    private int codProve;

    public Proveedor(String nombre,String direccion,int Ci,int telefono){
        super(nombre,direccion,Ci,telefono);

        this.setCodProve(getCodProve());
    }


    public int getCodProve() {
        return codProve;
    }

    public void setCodProve(int codProve) {
        this.codProve = codProve;
    }


}
