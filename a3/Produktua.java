package a3;
public abstract class Produktua {
    private String izena;
    private double salneurria;
    
    public Produktua(String izena, double salneurria) {
        this.izena = izena;
        this.salneurria = salneurria;
    }
    
    public String getIzena() {
        return izena;
    }
    
    public void setIzena(String izena) {
        this.izena = izena;
    }
    
    public double getSalneurria() {
        return salneurria;
    }
    
    public void setSalneurria(double salneurria) {
        this.salneurria = salneurria;
    }
    
    public abstract double kalkulatuSalneurria(int kopurua);
    
    public String toString() {
        return "Produktua [izena=" + izena + ", salneurria=" + salneurria + "]";
    }
    
}

