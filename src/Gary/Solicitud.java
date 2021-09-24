package Gary;

import java.util.Date;

public class Solicitud {
    private int nroSoli;
    private Date fecha;
    private String cenCos;
    private String rubro;
    private double presuComp;
    private Item item;

    public Solicitud(int nroSoli, Date fecha, String cenCos, String rubro, double presuComp, Item item) {
        this.nroSoli = nroSoli;
        this.fecha = fecha;
        this.cenCos = cenCos;
        this.rubro = rubro;
        this.presuComp = presuComp;
        this.item = item;
    }

    public int getNroSoli() {
        return nroSoli;
    }

    public void setNroSoli(int nroSoli) {
        this.nroSoli = nroSoli;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCenCos() {
        return cenCos;
    }

    public void setCenCos(String cenCos) {
        this.cenCos = cenCos;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public double getPresuComp() {
        return presuComp;
    }

    public void setPresuComp(double presuComp) {
        this.presuComp = presuComp;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "nroSoli=" + nroSoli +
                ", fecha=" + fecha +
                ", cenCos='" + cenCos + '\'' +
                ", rubro='" + rubro + '\'' +
                ", presuComp=" + presuComp +
                ", item=" + item +
                '}';
    }
}
