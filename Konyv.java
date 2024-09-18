public class Konyv {
    private String cim;
    private String szerzo;
    private int ev;

    public Konyv(String cim, String szerzo, int ev) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.ev = ev;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public int getEv() {
        return ev;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    @Override
    public String toString() {
        return "Cím: " + cim + ", Szerző: " + szerzo + ", Év: " + ev;
    }
}