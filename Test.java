

public class Test {
    public static void GalderakIrakurri() {
        ArrayList <String> Galderak = new ArrayList();
        try {
            //DOKUMENTUA IRAKURRI
            File dokumentua = new File(pathFitxategia);
            FileReader fr = new FileReader(dokumentua);
            BufferedReader br = new BufferedReader(fr);
            String lerroa;
      
            while ((lerroa = br.readLine()) != null) {
            
                int barraIndex = pathFitxategia.lastIndexOf("\\");
                int puntoIndex = pathFitxategia.lastIndexOf(".");
                String izena = pathFitxategia.substring(barraIndex+1,puntoIndex);
                pg.setEtiketa(lerroa,izena);
                // Objetua listan sartu
                datuakGorde.add(pg);
            } 
      
        } catch (Exception e) {
            System.out.println("Ezin izan da dokumentua topatu" + e);
        }
      
        return datuakGorde;
    }
    public static void HurrengoGaldera () {
        
    }
    public static void TestaBerrabiarazi () {
        
    }
    public static void TestaEgin() {
        
    }

}
