package Gary;

public class Jefe extends Persona {
    private int codJefe;

    public Jefe(String nombre,String direccion,int Ci,int telefono){
        super(nombre,direccion,Ci,telefono);

        this.setCodJefe(getCodJefe());
    }


    public int getCodJefe() {
        return codJefe;
    }

    public void setCodJefe(int codJefe) {
        this.codJefe = codJefe;
    }

}
