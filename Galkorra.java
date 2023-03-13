class Galkorra extends Produktua {

    public int iraungitzekoEgunak;

    public Galkorra(String izena, double salneurria, int iraungitzekoEgunak) {
        super(izena, salneurria, "Galkorra");
        this.iraungitzekoEgunak = iraungitzekoEgunak;
    }

    // Getter eta setter metodoak
    public int getIraungitzekoEgunak() {
        return iraungitzekoEgunak;
    }

    public void setIraungitzekoEgunak(int iraungitzekoEgunak) {
        this.iraungitzekoEgunak = iraungitzekoEgunak;
    }
}