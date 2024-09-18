public class Processzor {
    private double sebesseg;
    private String gyarto;

    public Processzor(double sebesseg, String gyarto) {
        this.sebesseg = sebesseg;
        this.gyarto = gyarto;
    }

    public double getSebesseg() {
        return sebesseg;
    }

    public void setSebesseg(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    public String getGyarto() {
        return gyarto;
    }

    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    @Override
    public String toString() {
        return "Processzor: " + gyarto + ", Sebesség: " + sebesseg + " GHz";
    }
}