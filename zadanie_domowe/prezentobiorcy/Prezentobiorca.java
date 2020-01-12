package zadanie_domowe.prezentobiorcy;

import zadanie_domowe.Prezent;

import java.util.ArrayList;

public abstract class Prezentobiorca {
    ArrayList<Prezent> prezenty = new ArrayList<>();
    Marzenia marzenie;
    int limitPrezentów;
    boolean zadowolony = false;
    int rozgi = 0;

    Prezentobiorca(int limitPrezentow) {
        this.limitPrezentów = limitPrezentow;
    }

    public abstract void przyjmijPrezent(Prezent prezent) throws ZaDuzoPrezentow;
    public boolean zadowolony() {
        return zadowolony;
    }

    public int ileRozg() {
        return rozgi;
    }

}
