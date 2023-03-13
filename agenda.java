import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Agenda{
    private static ArrayList<Kontaktua> kontaktuak;
    private static int tamaina;
    public Agenda(int i) {
        tamaina = i;
        kontaktuak = new ArrayList<Kontaktua>();
    }
    
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
public static Kontaktua DatuakSartu() {
    Scanner scanner = new Scanner(System.in);
    int telefonoa = 0;
    String izena = "";
      
       if (kontaktuak.size()!=tamaina) {
        try {
            System.out.println("Sartu kontaktuaren izena:");
            izena = scanner.nextLine();
        } catch (Exception e) {
        // TODO: handle exception
        }
    while (telefonoa < 100000000 || telefonoa > 999999999) {
        try {
            System.out.println("Sartu kontaktuaren telefonoa:");
            telefonoa = scanner.nextInt();
            scanner.nextLine();
          } catch (Exception e) {
            System.out.println("Telefonoa ez da egokia: " + e.getMessage());
          }
    
    
    
    }
       } else {
        System.out.println("Agenda beteta dago!");
       } 
       
        
    
   
   Kontaktua k = new Kontaktua(izena, telefonoa);
   return k;
   
}
    

public static void main(String[] args) {
    Agenda agenda = new Agenda(10);
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
                    Kontaktua k = DatuakSartu();
                    agenda.KontaktuakGehitu(k);
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Sartu bilatu nahi duzun kontaktuaren izena:");
                    scanner.nextLine();
                    String bilatuIzena = scanner.nextLine();
                    agenda.KontataktuaBilatu(bilatuIzena);
                    break;
                case 3:
                    System.out.println("Sartu ezabatu nahi duzun kontaktuaren izena:");
                    scanner.nextLine();
                    String ezabatuIzena = scanner.nextLine();
                    for (Kontaktua kontaktua : agenda.kontaktuak) {
                        if (kontaktua.getIzena().equals(ezabatuIzena)) {
                        agenda.KontaktuaEzabatu(kontaktua);
                        break;
                        }
                        }
                    break;
                case 4:
                    agenda.KontaktuakZerrendatu();
                    break;
                case 5:
                    System.out.println("Agendak hutsuneak: " + agenda.Hutsuneak());
                    scanner.nextLine();
                    break;
                case 6:
                    if (agenda.AgendaBeteta()) {
                    System.out.println("Agenda beteta dago.");
                    } else {
                    System.out.println("Agenda ez dago beteta.");
                    }
                    break;
                default:
                    System.out.println("Aukera okerra, saiatu berriro.");
                }
            }
        }
        
}
           