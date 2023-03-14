package a3;
public class EzGalkorra extends Produktua {
    private String mota;
    
    public EzGalkorra(String izena, double salneurria, String mota) {
        super(izena, salneurria);
        this.mota = mota;
    }
    
    public String getMota() {
        return mota;
    }
    
    public void setMota(String mota) {
        this.mota = mota;
    }
    
    public double kalkulatuSalneurria(int kopurua) {
        return getSalneurria() * kopurua;
    }
}
    
   
