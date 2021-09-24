package Gary;

import java.util.Date;

public class Contractual {
    private int nroContractual;
    private int nit;
    private Date fechaOrden;
    private int montoTotal;
    private Date fechaEntrega;
    private Proveedor proveedor;

    public Contractual(int nroContractual, int nit, Date fechaOrden, int montoTotal, Date fechaEntrega, Proveedor proveedor) {
        this.setNroContractual(nroContractual);
        this.setNit(nit);
        this.setFechaOrden(fechaOrden);
        this.setMontoTotal(montoTotal);
        this.setFechaEntrega(fechaEntrega);
        this.setProveedor(proveedor);
    }

    public int getNroContractual() {
        return nroContractual;
    }

    public void setNroContractual(int nroContractual) {
        this.nroContractual = nroContractual;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
