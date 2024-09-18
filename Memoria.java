public class Memoria {
    private int meret;
    private String tipus;

    public Memoria(int meret, String tipus) {
        this.meret = meret;
        this.tipus = tipus;
    }

    public int getMeret() {
        return meret;
    }

    public void setMeret(int meret) {
        this.meret = meret;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Memória: " + meret + " GB, Típus: " + tipus;
    }
}