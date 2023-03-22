package a4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Salmenta {

    static List <Autoa> autoak = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean jarraitu = true;

        while (jarraitu) {
            System.out.println("Aukeratu bat:");
            System.out.println("1. Saldutako autoa erregistratu");
            System.out.println("2. Saldutako auto guztiak bistaratu");
            System.out.println("3. Matrikula bat sartu eta bermean al dagoen esan");
            System.out.println("4. Irten");

            int aukera = sc.nextInt();

            switch (aukera) {
                case 1:
                    System.out.println("Sartu autoaren matrikula:");
                    String matrikula = sc.next();

                    System.out.println("Sartu autoaren salmenta data (uuuu/hh/ee):");
                    String salmentaDatu = sc.next();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                    LocalDate salmentaData = LocalDate.parse(salmentaDatu, formatter);


                    System.out.println("Sartu autoaren marka:");
                    String marka = sc.next();

                    System.out.println("Sartu autoaren modeloa:");
                    String modeloa = sc.next();

                    Autoa auto = new Autoa(matrikula, salmentaData, marka, modeloa);
                    autoak.add(auto);

                    break;

                case 2:
                    for (Autoa a : autoak) {
                        System.out.println(a.toString());
                    }
                    break;

                case 3:
                    System.out.println("Sartu autoaren matrikula:");
                    String mat = sc.next();
                    boolean badago = false;
                    int diferentzia =0;

                    for (Autoa a : autoak) {
                        if (a.getMatrikula().equals(mat)) {
                            badago = true;
                            diferentzia = a.bermeanDago();
                            if(diferentzia>=2){
                                System.out.println("Autoa bermean dago");
                            }
                            else{
                                System.out.println("Autoa ez dago bermean");
                            }
                            
                            break;
                        }
                    }
                    
                    if (!badago) {
                        System.out.println("Matrikula hori duen autoa ez dago erregistratuta.");
                    }

                    break;

                case 4:
                    jarraitu = false;
                    break;

                default:
                    System.out.println("Aukera okerra. Saiatu berriro.");
                    break;
            }
        }

        sc.close();
    }
}
