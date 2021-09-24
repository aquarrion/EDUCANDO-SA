package Gary;

public class Almacen {
    private String nombre;
    private int nro;

    public Almacen(String nombre, int nro) {
        this.nombre = nombre;
        this.nro = nro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }
}
