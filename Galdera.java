import java.util.ArrayList;

public class Galdera {
    private String galdera;
    private ArrayList<Aukera> erantzunak;
    private int erantzunZuzena;
    private double puntuaketa;
    
    public Galdera(String testua, ArrayList<Aukera> txtEdukia, double puntuak,int erantzunZuzena)
    {
        galdera = testua;
        this.puntuak = puntuak;
        this.erantzunak = new ArrayList<>();
        this.erantzunak = txtEdukia;
        this.erantzunak.get(erantzunZuzena).setZuzena(true);

    public void galderaErakutsi() {
        System.out.println(galdera);
        for (int i = 0; i < aukerak.length; i++) {
            System.out.println((i + 1) + ": " + aukerak[i]);
        }
    }

    public boolean erantzunaKonprobatu(int erabiltzailearenErantzuna) {
        return erabiltzailearenErantzuna == erantzunZuzena;
    }

    public String getGaldera() {
        return galdera;
    }

    public String[] getAukerak() {
        return aukerak;
    }

    public int getErantzunZuzena() {
        return erantzunZuzena;
    }

    public double getPuntuaketa() {
        return puntuaketa;
    }
}

    


