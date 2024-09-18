import java.util.ArrayList;
import java.util.List;

public class Iskola {
    private String nev;
    private List<Diak> diakok;

    public Iskola(String nev) {
        this.nev = nev;
        this.diakok = new ArrayList<>();
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public List<Diak> getDiakok() {
        return diakok;
    }

    public void setDiakok(List<Diak> diakok) {
        this.diakok = diakok;
    }

    public void hozzaadDiak(Diak diak) {
        diakok.add(diak);
    }

    public boolean torolDiak(String nev) {
        for (Diak diak : diakok) {
            if (diak.getNev().equals(nev)) {
                diakok.remove(diak);
                return true;
            }
        }
        return false;
    }

    public Diak keresDiak(String nev) {
        for (Diak diak : diakok) {
            if (diak.getNev().equals(nev)) {
                return diak;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Iskola neve: " + nev + "\nDiákok:\n");
        if (diakok.isEmpty()) {
            result.append("Az iskola jelenleg üres.\n");
        } else {
            for (Diak diak : diakok) {
                result.append(diak).append("\n");
            }
        }
        return result.toString();
    }
}