import java.util.Scanner;

public class ejekutatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Produktu array-a sortu
        Produktua[] produktuak = new Produktua[5];
        produktuak[0] = new Galkorra("Kafea", 5.5, 10);
        produktuak[1] = new EzGalkorra("Barazkiak", 2.0, null);
        produktuak[2] = new Galkorra("Gazta", 3.0, 5);
        produktuak[3] = new EzGalkorra("Fruta", 1.5, null);
        produktuak[4] = new Galkorra("Ogiak", 1.0, 3);

        // Produktuak erakutsi
        for (int i = 0; i < produktuak.length; i++) {
            System.out.println(produktuak[i].toString() + " - Salneurria: " + produktuak[i].getSalneurria());
        }

        // Produktu kopuruak kalkulatu eta erakutsi
        System.out.print("Sartu zenbaki bat produktu kopuruak kalkulatzeko: ");
        int zenbakia = sc.nextInt();
        int produktuKopurua = 0;
        for (int i = 0; i < produktuak.length; i++) {
            produktuKopurua += produktuak[i].getSalneurria() * zenbakia;
        }
        System.out.println("Produktu kopurua: " + produktuKopurua);
    }
}
