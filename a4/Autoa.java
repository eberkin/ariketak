package a4;

import java.time.LocalDate;

public class Autoa {
  public String matrikula;
  public LocalDate salmentaData;
  public String modeloa;
  public String marka;


public Autoa(String matrikula, LocalDate salmentaData, String modeloa, String marka){
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
public boolean bermeanDago() {
    LocalDate orain = LocalDate.now();
    return salmentaData.plusYears(2).isAfter(orain);
}
public String toString() {
    return matrikula + " " + modeloa + " " + marka + " " + salmentaData.toString();
}
public boolean equals(Object o) {
    if (o == null) {
        return false;
    }
    if (getClass() != o.getClass()) {
        return false;
    }
    Autoa a = (Autoa) o;
    return matrikula.equals(a.matrikula);
}
}
