package Gary;

public class Inventario {
    private String nombre;
    private int nro;

    public Inventario(String nombre, int nro) {
        this.setNombre(nombre);
        this.setNro(nro);
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
