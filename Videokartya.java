public class Videokartya {
    private String gyarto;
    private int VRAM;

    public Videokartya(String gyarto, int VRAM) {
        this.gyarto = gyarto;
        this.VRAM = VRAM;
    }

    public String getGyarto() {
        return gyarto;
    }

    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    public int getVRAM() {
        return VRAM;
    }

    public void setVRAM(int VRAM) {
        this.VRAM = VRAM;
    }

    @Override
    public String toString() {
        return "Videokártya: " + gyarto + ", VRAM: " + VRAM + " GB";
    }
}