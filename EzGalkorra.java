class EzGalkorra extends Produktua {

    public EzGalkorra(String izena, double salneurria) {
        super(izena, salneurria, izena);
    }

    @Override
    public int produktuKopurua(int zenbat) {
        return zenbat;
    }

    @Override
    public String toString() {
        return "EzGalkorra{" +
                "izena='" + izena + '\'' +
                ", salneurria=" + salneurria +
                '}';
    }
}