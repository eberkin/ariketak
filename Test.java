import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Test {
    public static void FitxeroaIrakurri() {
        ArrayList<String> fitxeroa = new ArrayList<>();
        try {
            FileReader archivo = new FileReader("test.txt");
            BufferedReader lector = new BufferedReader(archivo);
            String linea = lector.readLine();
            while (linea != null) {
                fitxeroa.add(linea);
                linea = lector.readLine();
            }
            lector.close();
            archivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        GalderakIrakurri(fitxeroa);
    }
    public static void GalderakIrakurri(ArrayList<String> fitxeroa) {
        
    }
    public static void HurrengoGaldera () {
        
    }
    public static void TestaBerrabiarazi () {
        
    }
    public static void TestaEgin() {
        
    }
    public static void main(String[] args) {
        
    }

}
