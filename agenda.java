import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Agenda{
    private ArrayList<Kontaktua> kontaktuak;
    private int tamaina;
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
public static void TelefonoaSartu(telefonoa) {
    try {
        System.out.print("Ingrese un número de máximo 9 dígitos: ");
        telefonoa = scanner.nextInt();
        
        if(telefonoa < 0 || telefonoa > 999999999){
            throw new Exception("El número debe estar entre 0 y 999999999");
        }
        
        System.out.println("El número ingresado es: " + numero);
      } catch (Exception e) {
        System.out.println("Ha ocurrido un error: " + e.getMessage());
      }
      
      scanner.close();
    }
}
public static void main(String[] args) {
    Agenda agenda = new Agenda(10);
    Scanner scanner = new Scanner(System.in);
    String izena;
    String telefonoa;

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
                    System.out.println("Sartu kontaktuaren izena:");
                    izena = scanner.nextLine();
                    System.out.println("Sartu kontaktuaren telefonoa:");
                    telefonoa = TelefonoaSartu();
                    Kontaktua k = new Kontaktua(izena, telefonoa);
                    agenda.KontaktuakGehitu(k);
                    break;
                case 2:
                    System.out.println("Sartu bilatu nahi duzun kontaktuaren izena:");
                    String bilatuIzena = scanner.nextLine();
                    agenda.KontataktuaBilatu(bilatuIzena);
                    break;
                case 3:
                    System.out.println("Sartu ezabatu nahi duzun kontaktuaren izena:");
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
           