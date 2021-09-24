package Gary;

public class Persona {
     protected String nombre;
     protected String direccion;
     protected int Ci;
     protected int telefono;

    public Persona(String nombre, String direccion, int ci, int telefono) {
        this.setNombre(nombre);
        this.setDireccion(direccion);
        setCi(ci);
        this.setTelefono(telefono);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCi() {
        return Ci;
    }

    public void setCi(int ci) {
        Ci = ci;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", Ci=" + Ci +
                ", telefono=" + telefono +
                '}';
    }
}
