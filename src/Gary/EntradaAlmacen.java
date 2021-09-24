package Gary;

import java.util.Date;

public class EntradaAlmacen {
    private int nroEntrada;
    private Date fecha;
    private Proveedor proveedor;
    private int totalBienes;
    private Item item;
    private Factura factura;

    public EntradaAlmacen(int nroEntrada, Date fecha, Proveedor proveedor, int totalBienes, Item item, Factura factura) {
        this.setNroEntrada(nroEntrada);
        this.setFecha(fecha);
        this.setProveedor(proveedor);
        this.setTotalBienes(totalBienes);
        this.setItem(item);
        this.setFactura(factura);
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public int getTotalBienes() {
        return totalBienes;
    }

    public void setTotalBienes(int totalBienes) {
        this.totalBienes = totalBienes;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "EntradaAlmacen{" +
                "nroEntrada=" + nroEntrada +
                ", fecha=" + fecha +
                ", proveedor=" + proveedor +
                ", totalBienes=" + totalBienes +
                ", item=" + item +
                ", factura=" + factura +
                '}';
    }
}

