package Gary;

public class Empleado extends Persona{
    private int codEm;

    public Empleado(String nombre,String direccion,int Ci,int telefono){
        super(nombre,direccion,Ci,telefono);

        this.setCodEm(getCodEm());
    }

    public int getCodEm() {
        return codEm;
    }

    public void setCodEm(int codEm) {
        this.codEm = codEm;
    }

}
