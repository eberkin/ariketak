package a3;
public class Galkorra extends Produktua {
    private int iraungitzekoEgunak;
    
    public Galkorra(String izena, double salneurria, int iraungitzekoEgunak) {
        super(izena, salneurria);
        this.iraungitzekoEgunak = iraungitzekoEgunak;
    }
    
    public int getIraungitzekoEgunak() {
        return iraungitzekoEgunak;
    }
    
    public void setIraungitzekoEgunak(int iraungitzekoEgunak) {
        this.iraungitzekoEgunak = iraungitzekoEgunak;
    }
    
    public double kalkulatuSalneurria(int kopurua) {
        int falta = iraungitzekoEgunak - kopurua;
        if (falta >= 3) {
            return getSalneurria() * kopurua;
        } else if (falta == 2) {
            return getSalneurria() * kopurua / 2;
        } else if (falta == 1) {
            return getSalneurria() * kopurua / 3;
        } else {
            return 0;
        }
    }
    public String toString() {
        return "Galkorra [iraungitzekoEgunak=" + iraungitzekoEgunak + ", " + super.toString() + "]";
    }
}