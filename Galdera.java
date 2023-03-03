

public class Galdera {
    private String galdera;
    private String [] aukerak;
    private int erantzunZuzena;
    private double puntuaketa;
    
    public Galdera(String galdera, String[] aukerak, int erantzunZuzena, double puntuaketa) {
        this.galdera = galdera;
        this.aukerak = aukerak;
        this.erantzunZuzena = erantzunZuzena;
        this.puntuaketa = puntuaketa;
    }

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

    


