import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Szamitogep> szamitogepek = new ArrayList<>();
        szamitogepek.add(new Szamitogep("Gamer PC", new Processzor(3.6, "Intel"), new Memoria(16, "DDR4"), new Videokartya("NVIDIA", 8)));
        szamitogepek.add(new Szamitogep("Office PC", new Processzor(2.8, "AMD"), new Memoria(8, "DDR3"), new Videokartya("AMD", 4)));
        szamitogepek.add(new Szamitogep("Workstation", new Processzor(4.0, "Intel"), new Memoria(32, "DDR4"), new Videokartya("NVIDIA", 16)));

        listazSzamitogepek(szamitogepek);

        String keresettGyarto = "NVIDIA";
        listazSzamitogepekGyartoAlapjan(szamitogepek, keresettGyarto);
    }

    public static void listazSzamitogepek(List<Szamitogep> szamitogepek) {
        System.out.println("Számítógépek listája:");
        for (Szamitogep szamitogep : szamitogepek) {
            System.out.println(szamitogep);
            System.out.println();
        }
    }

    public static void listazSzamitogepekGyartoAlapjan(List<Szamitogep> szamitogepek, String gyarto) {
        System.out.println("Számítógépek, amelyek videokártyája " + gyarto + " gyártmányú:");
        for (Szamitogep szamitogep : szamitogepek) {
            if (szamitogep.getVideokartya().getGyarto().equals(gyarto)) {
                System.out.println(szamitogep);
                System.out.println();
            }
        }
    }
}