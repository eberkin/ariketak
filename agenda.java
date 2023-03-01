import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Agenda{
    private ArrayList<Kontaktua> kontaktuak;
    private int tamaina;
public void KontaktuakGehitu() {
    
}
public boolean KontaktuaExistitzenDu(Kontaktua k) {
   return kontaktuak.contains(k); 
    
}
public void KontaktuakZerrendatu() {
    
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
    
}
public void AgendaBeteta() {
    
}
public void Hutsuneak() {
    
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