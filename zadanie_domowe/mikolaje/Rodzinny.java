package zadanie_domowe.mikolaje;

import zadanie_domowe.Prezent;
import zadanie_domowe.prezentobiorcy.Marzenia;
import zadanie_domowe.prezentobiorcy.Prezentobiorca;

public class Rodzinny implements Mikolaj {

    private String imie;

    public  Rodzinny() {
        this.imie = "Mikołaj";
    }
    public Rodzinny(String imie) {
        this.imie = imie;
    }
    public void dajPrezent(Prezentobiorca prezentobiorca) {
        Prezent prezent = new Prezent("Skarpetki", Marzenia.INNE.name());
    }

    public void przedstawSie() {
        przedstawSie(imie);
    }
}
