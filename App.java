import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Auto> autok = new ArrayList<>();
        autok.add(new Auto("ABC-123", "Piros", new Motor(150, "Benzin")));
        autok.add(new Auto("XYZ-789", "Kék", new Motor(200, "Dízel")));
        autok.add(new Auto("LMN-456", "Fekete", new Motor(180, "Hibrid")));
        autok.add(new Auto("DEF-321", "Fehér", new Motor(160, "Elektromos")));
        autok.add(new Auto("GHI-654", "Zöld", new Motor(170, "Benzin")));

        for (Auto auto : autok) {
            System.out.println(auto);
        }
    }
}