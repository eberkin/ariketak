public class Produktua {

    protected String izena;
    protected double salneurria;
    private String mota;

    // Eraikitzailea
    public Produktua(String izena, double salneurria, String mota) {
        this.izena = izena;
        this.salneurria = salneurria;
        this.mota = mota;
    }

    // Getter eta setter metodoak
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

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    // toString metodoa
    @Override
    public String toString() {
        return "Produktua{" +
                "izena='" + izena + '\'' +
                ", salneurria=" + salneurria +
                ", mota='" + mota + '\'' +
                '}';
    }

    // Funtzioa zenbakia pasatzen denean produktu kopurua bueltatuko du
    public int produktuKopurua(int zenbakia) {
        if (mota.equals("Galkorra")) {
            // Galkorrean, salneurria egun falta diren arabera kalkulatuko da
            int egunFalta = zenbakia - IraungitzekoEgunak.KONSTANTEA;
            if (egunFalta <= 0) {
                return 1;
            } else if (egunFalta == 1) {
                return 2;
            } else if (egunFalta == 2) {
                return 3;
            } else if (egunFalta == 3) {
                return 4;
            } else {
                return 0;
            }
        } else if (mota.equals("EzGalkorra")) {
            // EzGalkorrean, produktu kopurua bere salneurria biderkatuko da
            return (int) (zenbakia / salneurria);
        } else {
            return 0;
        }
    }
    public class Main {

        public static void main(String[] args) {
    
            // Produktuen arraya sortu
            Produktua[] produktuak = {
                    new Galkorra("Banana", 1.5, 5),
                    new EzGalkorra("Gazta", 2.0),
                    new Galkorra("Sagarra", 1.0, 3),
                    new EzGalkorra("Birra", 3.0),
                    new Galkorra("Laranja", 1.2, 4),
                    new EzGalkorra("Patata", 1.5),
            };
    
            // Produktu bakoitzaren salneurria erakutsi
            for (Produktua produktua : produktuak) {
                System.out.println(produktua.getIzena() + ": " + produktua.getSalneurria() + " €");
            }
    
            // Funtzioak deia egiten
            System.out.println("Banana kopurua: " + produktuak[0].produktuKopurua(10));
            System.out.println("Gazta kopurua: " + produktuak[1].produktuKopurua(10));
            System.out.println("Sagarra kopurua: " + produktuak[2].produktuKopurua(10));
            System.out.println("Birra kopurua: " + produktuak[3].produktuKopurua(10));
            System.out.println("Laranja kopurua: " + produktuak[4].produktuKopurua(10));
            System.out.println("Patata kopurua: " + produktuak[5].produktuKopurua(10));
        }
    }
}