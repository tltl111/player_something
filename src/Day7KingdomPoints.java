public class Day7KingdomPoints {
    private int estates;
    private int duchys;
    private int provinces;

    public Day7KingdomPoints(int estates, int duchys, int provinces) {
        this.estates = estates;
        this.duchys = duchys * 3;
        this.provinces = provinces * 6;
    }

    public int getEstates() {
        return estates;
    }
    public void setEstates(int estates) {
        this.estates = estates;
    }

    public int getDuchys() {
        return duchys;
    }
    public void setDuchys(int duchys) {
        this.duchys = duchys;
    }

    public int getProvinces() {
        return provinces;
    }
    public void setProvinces(int provinces) {
        this.provinces = provinces;
    }

    public int addUpKingdomPoints() {
        return estates + duchys + provinces;
    }
}
