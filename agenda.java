import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Agenda{
    private ArrayList<Kontaktua> kontaktuak;
    private int tamaina;
public void KontaktuakGehitu(Kontaktua k) {
    if (kontaktuak.size() < tamaina && !kontaktuak.contains(k)) {
        kontaktuak.add(k);
        System.out.println("Kontaktua gehitu da: " + k.getIzena() + ", " + k.getTelefonoa());
    } else {
        System.out.println("Ezin da kontaktua gehitu.");
    }
}
public boolean KontaktuaExistitzenDu(Kontaktua k) {
   return kontaktuak.contains(k); 
    
}
public void KontaktuakZerrendatu() {
    if (kontaktuak.isEmpty()) {
        System.out.println("Agendak hutsik dago.");
    } else {
        System.out.println("Agendako kontaktuak:");
        for (Kontaktua k : kontaktuak) {
            System.out.println(k.getIzena() + ", " + k.getTelefonoa());
        }
    }
}
public void KontataktuaBilatu(String izena) {
    for (Kontaktua k : kontaktuak) {
        if (k.getIzena().equals(izena)) {
            System.out.println("Kontaktua aurkitu da: " + k.getIzena() + ", " + k.getTelefonoa());
            return;
        }
    }
    System.out.println("Ezin da kontaktua aurkitu.");
}
public void KontaktuaEzabatu(Kontaktua k) {
    if (kontaktuak.remove(k)) {
        System.out.println("Kontaktua ezabatu da: " + k.getIzena() + ", " + k.getTelefonoa());
    } else {
        System.out.println("Ezin da kontaktua ezabatu.");
    }
}
public boolean AgendaBeteta() {
    return kontaktuak.size() == tamaina;
}
public int Hutsuneak() {
    return tamaina - kontaktuak.size();
}
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Aukeratu ekintza:");
            System.out.println("1. Kontaktua gehitu");
            System.out.println("2. Kontaktua bilatu");
            System.out.println("3. Kontaktua ezabatu");
            System.out.println("4. Agendako kontaktuak zerrendatu");
            System.out.println("5. Hutsuneak erakutsi");
            System.out.println("6. Agenda beteta dagoen edo ez");
            System.out.println("0. Irten");
            int aukera = scanner.nextInt();

            switch(aukera){
                case 0:
                System.out.println("Agur!");
                scanner.close();
                System.exit(0);
                break;
                case 1:
                System.out.println("Sartu kontaktuaren izena");

            }
        }
}
}