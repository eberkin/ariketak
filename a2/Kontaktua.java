package a2;
public class Kontaktua {
    public String izena;
    public int telefonoa;
    

    public Kontaktua(String StrIzena,int telefonoa2){
        izena = StrIzena;
        telefonoa = telefonoa2;
    }
    
    public String getIzena() {
        return izena;
    }
    public int getTelefonoa() {
        return telefonoa;
    }
    public void setIzena(String izena) {
        this.izena = izena;
    }
    public void setTelefonoa(int telefonoa) {
        this.telefonoa = telefonoa;
    }

}
