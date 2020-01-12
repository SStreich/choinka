package zadanie_domowe.mikolaje;

import zadanie_domowe.prezentobiorcy.ZaDuzoPrezentow;

public abstract class Mikolaj {
    private String nazwa;

    Mikolaj(String nazwa) {
        this.nazwa = nazwa;
    }

    protected abstract void dajPrezent() throws ZaDuzoPrezentow;

    public void sprobujDacPrezent() {
        try {
            dajPrezent();
        } catch (ZaDuzoPrezentow ex) {
            System.out.println(ex.toString());
        }
    }
}
