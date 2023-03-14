package a1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Test {
    static ArrayList<Galdera> galderakTest;
    private double puntuaketaOsoa;
    private int unekoGaldera;
    public static void FitxeroaIrakurri() {
        ArrayList<Aukera> aukerak = new ArrayList<>();
        
        String galderaTestua = "";
        double puntuaketa = 0;
        int aukeraZuzena = 0;
        boolean bGaldera = false, bErantzuna = false, bPuntuak = false;
        Galdera galdera;
        try {
            FileReader archivo = new FileReader("test.txt");
            BufferedReader lector = new BufferedReader(archivo);
            String linea = lector.readLine();
            while (linea != null) {
                try {
 
                    //;G; hasten bada galdera bat da
                    if (linea.startsWith(";G;")) {
                        galderaTestua = linea.substring(3);
                        bGaldera = true; //galdera irakurri dugula adierazteko
                        //galdera irakurrita baldin badut eta ;E; irakurtzen badu, erantzun zuzena irakurtzen du
                    } else if (bGaldera && linea.startsWith(";E;")) {
                        aukeraZuzena = Integer.parseInt(linea.substring(3).trim());
                        bErantzuna = true; //erantzuna irakurri dugula adierazteko
                        //erantzuna jasota baldin badgo, puntuak irakurri
                    } else if (bErantzuna) {
                        puntuaketa = Double.valueOf(linea.substring(3).trim());
                        bPuntuak = true; //puntuak irakurri ditugula adierazteko
                        //galdera irakurrita baldin badago, aukerak irakurri
                       
                    } else if (bGaldera) {
                        aukerak.add(new Aukera(linea.substring(2).trim())); //Respuesta objetu mota
                        //4 aukera baino gehiago baldin badaude, exception bat botako dugu
                        if (aukerak.size() > 4) {
                            throw new Exception();
                        }
                    }
     
                    //galdera, ernatzuna, puntuak eta 2-4 aukeren artean baldin baditugu
                    if (bGaldera && bErantzuna && bPuntuak && (aukerak.size() >= 2 && aukerak.size() <= 4)) {
     
                        //galdera sortu, testu, aukerak, puntuaketa eta aukera zuzena ezarriz
                       galdera = new Galdera(galderaTestua, aukerak, puntuaketa,aukeraZuzena );
                       
                        //Testeko Galdera Zerrendari galdera gehitu
                        galderakTest.add(galdera);
     
                        //aldagaiak berrabiarazi hurrengo galderarako
                        bGaldera = false;
                        bErantzuna = false;
                        bPuntuak = false;
                        aukerak = new ArrayList<>();
     
                    }
     
                } catch (Exception ex) {
                    //berrabiarazi
                    bGaldera = false;
                    bErantzuna = false;
                    bPuntuak = false;
                    aukerak = new ArrayList<>();
                }
            }
            lector.close();
            archivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    public static void GalderakIrakurri() {
        
    }
    public static void HurrengoGaldera () {
        
    }
    public static void TestaBerrabiarazi () {
        
    }
    public static void TestaEgin() {
        
    }
    public static void main(String[] args) {
        FitxeroaIrakurri();
    }

}
