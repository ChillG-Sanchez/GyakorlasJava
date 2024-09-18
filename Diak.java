public class Diak {
    private String nev;
    private int eletkor;

    public Diak(String nev, int eletkor) {
        this.nev = nev;
        this.eletkor = eletkor;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getEletkor() {
        return eletkor;
    }

    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }

    @Override
    public String toString() {
        return "Név: " + nev + ", Életkor: " + eletkor;
    }
}