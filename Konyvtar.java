import java.util.ArrayList;
import java.util.List;

public class Konyvtar {
    private String nev;
    private List<Konyv> konyvek;

    public Konyvtar(String nev) {
        this.nev = nev;
        this.konyvek = new ArrayList<>();
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public List<Konyv> getKonyvek() {
        return konyvek;
    }

    public void setKonyvek(List<Konyv> konyvek) {
        this.konyvek = konyvek;
    }

    public void hozzaadKonyv(Konyv konyv) {
        konyvek.add(konyv);
    }

    public boolean torolKonyv(String cim) {
        for (Konyv konyv : konyvek) {
            if (konyv.getCim().equals(cim)) {
                konyvek.remove(konyv);
                return true;
            }
        }
        return false;
    }

    public Konyv keresKonyv(String cim) {
        for (Konyv konyv : konyvek) {
            if (konyv.getCim().equals(cim)) {
                return konyv;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Könyvtár neve: " + nev + "\nKönyvek:\n");
        if (konyvek.isEmpty()) {
            result.append("A könyvtár jelenleg üres.\n");
        } else {
            for (Konyv konyv : konyvek) {
                result.append(konyv).append("\n");
            }
        }
        return result.toString();
    }
}