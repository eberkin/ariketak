package a4;

import java.time.LocalDate;
import java.time.Period;

public class Autoa {
  public String matrikula;
  public LocalDate salmentaData;
  public String modeloa;
  public String marka;


public Autoa(String matrikula, LocalDate salmentaData, String marka, String modeloa){
    this.matrikula = matrikula;
    this.marka = marka;
    this.modeloa = modeloa;
    this.salmentaData = salmentaData;
}
public String getMatrikula() {
    return matrikula;
}
public String getModeloa() {
    return modeloa;
}
public LocalDate getSalmentaData(){
    return salmentaData;
}
public String getMarka() {
    return marka;
}
public int bermeanDago() {
    int diferentzia;
    LocalDate orain = LocalDate.now();
    Period periodoa = Period.between(salmentaData, orain);
     diferentzia = periodoa.getYears();
    return diferentzia;
}
public String toString() {
    return "Autoa{" +
            "matrikula='" + matrikula + '\'' +
            ", salmentaData=" + salmentaData +
            ", marka='" + marka + '\'' +
            ", modeloa='" + modeloa + '\'' +
            '}';
}
public boolean equals(Autoa a) {
    if (a == null) {
        return false;
    }
   
   
    return matrikula.equals(a.matrikula);
}
public boolean salduGabeDago() {
    return false;
}
}
