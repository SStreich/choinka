package zadanie_domowe.mikolaje;

import zadanie_domowe.Prezent;
import zadanie_domowe.prezentobiorcy.Prezentobiorca;
import zadanie_domowe.prezentobiorcy.ZaDuzoPrezentow;

public class Konserwatywny implements Mikolaj {

    private String imie;

    public Konserwatywny() {
        this.imie = "Mikołaj";
    }

    public Konserwatywny(String imie) {
        this.imie = imie;
    }
    public void dajPrezent(Prezentobiorca prezentobiorca) {
        Prezent prezent = new Prezent("Rózga", "Rózga");
        try {
            prezentobiorca.przyjmijPrezent(prezent);
        } catch (ZaDuzoPrezentow ex) {
            System.out.println(ex.toString());
        }
    }

    public void przedstawSie() {
        przedstawSie(imie);
    }

    @Override
    public String toString() {
        return "Konserwatywny";
    }
}

