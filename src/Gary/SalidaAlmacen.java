package Gary;

import java.util.Date;

public class SalidaAlmacen {
    private int nroSalida;
    private Date fechaSalida;
    private Date fechaEtnrega;
    private Item item;
    private Empleado empleado;

    public SalidaAlmacen(int nroSalida, Date fechaSalida, Date fechaEtnrega, Item item, Empleado empleado) {
        this.setNroSalida(nroSalida);
        this.setFechaSalida(fechaSalida);
        this.setFechaEtnrega(fechaEtnrega);
        this.setItem(item);
        this.setEmpleado(empleado);
    }

    public int getNroSalida() {
        return nroSalida;
    }

    public void setNroSalida(int nroSalida) {
        this.nroSalida = nroSalida;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaEtnrega() {
        return fechaEtnrega;
    }

    public void setFechaEtnrega(Date fechaEtnrega) {
        this.fechaEtnrega = fechaEtnrega;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "SalidaAlmacen{" +
                "nroSalida=" + nroSalida +
                ", fechaSalida=" + fechaSalida +
                ", fechaEtnrega=" + fechaEtnrega +
                ", item=" + item +
                ", empleado=" + empleado +
                '}';
    }
}
