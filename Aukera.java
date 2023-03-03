public class Aukera {
    
    private String aukerarenTestua;
    private boolean zuzenaAlDa = false;
    
    public Aukera(String testua){
        aukerarenTestua = testua;
    }
    
    public Aukera(String testua, boolean zuzena)
    {
        aukerarenTestua = testua;
        zuzenaAlDa = zuzena;
    }
    
    public void setZuzena(boolean zuzena)
    {
        zuzenaAlDa = zuzena;
    }
    
    public boolean getZuzena(){
        return zuzenaAlDa;
    }
    
    public String getaAukerarenTestua()
    {
        return aukerarenTestua;
    }
}
