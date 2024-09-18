public class Szamitogep {
    private String nev;
    private Processzor processzor;
    private Memoria memoria;
    private Videokartya videokartya;

    public Szamitogep(String nev, Processzor processzor, Memoria memoria, Videokartya videokartya) {
        this.nev = nev;
        this.processzor = processzor;
        this.memoria = memoria;
        this.videokartya = videokartya;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public Processzor getProcesszor() {
        return processzor;
    }

    public void setProcesszor(Processzor processzor) {
        this.processzor = processzor;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public Videokartya getVideokartya() {
        return videokartya;
    }

    public void setVideokartya(Videokartya videokartya) {
        this.videokartya = videokartya;
    }

    @Override
    public String toString() {
        return "Számítógép neve: " + nev + "\n" + processzor + "\n" + memoria + "\n" + videokartya;
    }
}