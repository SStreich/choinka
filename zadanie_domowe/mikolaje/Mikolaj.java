package zadanie_domowe.mikolaje;

import zadanie_domowe.Prezent;
import zadanie_domowe.prezentobiorcy.Prezentobiorca;
import zadanie_domowe.prezentobiorcy.ZaDuzoPrezentow;

public interface Mikolaj {

    void dajPrezent(Prezentobiorca prezentobiorca);

    default void przedstawSie(String imie) {
        System.out.println("Witaj! Nazywam sie " + imie + "i mam dla Ciebie prezent!");
    }

}
