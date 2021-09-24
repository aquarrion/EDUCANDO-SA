package Gary;

public class Item {
    private String nombreBien;
    private int cantSol;
    private int uniMed;
    private String valorUni;
    private String valorTotal;
    private int cantDespa;
    private int cantEntregada;

    public Item(String nombreBien, int cantSol, int uniMed, String valorUni, String valorTotal, int cantDespa, int cantEntregada) {
        this.nombreBien = nombreBien;
        this.cantSol = cantSol;
        this.uniMed = uniMed;
        this.valorUni = valorUni;
        this.valorTotal = valorTotal;
        this.cantDespa = cantDespa;
        this.cantEntregada = cantEntregada;
    }

    public String getNombreBien() {
        return nombreBien;
    }

    public void setNombreBien(String nombreBien) {
        this.nombreBien = nombreBien;
    }

    public int getCantSol() {
        return cantSol;
    }

    public void setCantSol(int cantSol) {
        this.cantSol = cantSol;
    }

    public int getUniMed() {
        return uniMed;
    }

    public void setUniMed(int uniMed) {
        this.uniMed = uniMed;
    }

    public String getValorUni() {
        return valorUni;
    }

    public void setValorUni(String valorUni) {
        this.valorUni = valorUni;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getCantDespa() {
        return cantDespa;
    }

    public void setCantDespa(int cantDespa) {
        this.cantDespa = cantDespa;
    }

    public int getCantEntregada() {
        return cantEntregada;
    }

    public void setCantEntregada(int cantEntregada) {
        this.cantEntregada = cantEntregada;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nombreBien='" + nombreBien + '\'' +
                ", cantSol=" + cantSol +
                ", uniMed=" + uniMed +
                ", valorUni='" + valorUni + '\'' +
                ", valorTotal='" + valorTotal + '\'' +
                ", cantDespa=" + cantDespa +
                ", cantEntregada=" + cantEntregada +
                '}';
    }
}
