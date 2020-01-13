package zadanie_domowe.mikolaje;

import zadanie_domowe.Prezent;
import zadanie_domowe.prezentobiorcy.Marzenia;
import zadanie_domowe.prezentobiorcy.Prezentobiorca;
import zadanie_domowe.prezentobiorcy.ZaDuzoPrezentow;

public class Zyczliwy implements Mikolaj {

    private String imie;

    public Zyczliwy() {
        this.imie = "Mikołaj";
    }

    public Zyczliwy(String imie) {
        this.imie = imie;
    }
    public void dajPrezent(Prezentobiorca prezentobiorca) {
        String idealnyPrezent;
        if (prezentobiorca.getMarzenie() == Marzenia.INNE) {
            idealnyPrezent  = "Skarpetki";
        } else {
            idealnyPrezent = "Idealny prezent z kategorii " + prezentobiorca.getMarzenie().name();
        }
        Prezent prezent = new Prezent("Idealny prezent", prezentobiorca.getMarzenie().name());
        try {
            prezentobiorca.przyjmijPrezent(prezent);
        } catch (ZaDuzoPrezentow zaDuzoPrezentow) {
            zaDuzoPrezentow.toString();
        }
    }

    public void przedstawSie() {
        przedstawSie(imie);
    }

    @Override
    public String toString() {
        return "Życzliwy";
    }
}
