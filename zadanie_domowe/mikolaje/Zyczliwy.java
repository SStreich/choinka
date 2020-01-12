package zadanie_domowe.mikolaje;

import zadanie_domowe.prezentobiorcy.Prezentobiorca;

public class Zyczliwy implements Mikolaj {

    private String imie;

    public Zyczliwy() {
        this.imie = "Mikołaj";
    }

    public Zyczliwy(String imie) {
        this.imie = imie;
    }
    public void dajPrezent(Prezentobiorca prezentobiorca) {

    }

    public void przedstawSie() {
        przedstawSie(imie);
    }
}
