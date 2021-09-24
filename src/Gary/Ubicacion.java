package Gary;

import Gary.Empleado;

import java.util.Date;

public class Ubicacion {
    private Empleado empleado;
    private Date fechaEntrega;
    private String dirBien;
    private int codUbi;

    public Ubicacion(Empleado empleado, Date fechaEntrega, String dirBien, int codUbi) {
        this.setEmpleado(empleado);
        this.setFechaEntrega(fechaEntrega);
        this.setDirBien(dirBien);
        this.setCodUbi(codUbi);
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getDirBien() {
        return dirBien;
    }

    public void setDirBien(String dirBien) {
        this.dirBien = dirBien;
    }

    public int getCodUbi() {
        return codUbi;
    }

    public void setCodUbi(int codUbi) {
        this.codUbi = codUbi;
    }
}
