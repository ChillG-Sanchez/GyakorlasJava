public class Auto {
    private String rendszam;
    private String szin;
    private Motor motor;

    public Auto(String rendszam, String szin, Motor motor) {
        this.rendszam = rendszam;
        this.szin = szin;
        this.motor = motor;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Rendszám: " + rendszam + ", Szín: " + szin + ", Motor: " + motor;
    }
}