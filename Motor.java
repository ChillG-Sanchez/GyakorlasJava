public class Motor {
    private int teljesitmeny;
    private String tipus;

    public Motor(int teljesitmeny, String tipus) {
        this.teljesitmeny = teljesitmeny;
        this.tipus = tipus;
    }

    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    public void setTeljesitmeny(int teljesitmeny) {
        this.teljesitmeny = teljesitmeny;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Teljesítmény: " + teljesitmeny + " LE, Típus: " + tipus;
    }
}