public class Kontaktua {
    public String izena;
    public String telefonoa;
    

    public Kontaktua(String StrIzena,String telefonoa2){
        izena = StrIzena;
        telefonoa = telefonoa2;
    }
    
    public String getIzena() {
        return izena;
    }
    public String getTelefonoa() {
        return telefonoa;
    }
    public void setIzena(String izena) {
        this.izena = izena;
    }
    public void setTelefonoa(String telefonoa) {
        this.telefonoa = telefonoa;
    }

}
