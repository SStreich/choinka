package zadanie_domowe.prezentobiorcy;

import zadanie_domowe.Prezent;

import java.util.ArrayList;

public abstract class Prezentobiorca {
    ArrayList<Prezent> prezenty = new ArrayList<>();
    Marzenia marzenie;
    int limitPrezentow;
    boolean zadowolony;
    int rozgi = 0;

    Prezentobiorca(int limitPrezentow) {
        this.limitPrezentow = limitPrezentow;
    }

    public abstract void przyjmijPrezent(Prezent prezent) throws ZaDuzoPrezentow;

    public boolean czyZadowolony() { return zadowolony; }

    public int ileRozg() {
        return rozgi;
    }

    public Marzenia getMarzenie() {
        return marzenie;
    }

    protected boolean czyZaDuzoPrezentow() throws ZaDuzoPrezentow {
        if(prezenty.size() >= limitPrezentow) {
            throw new ZaDuzoPrezentow();
        } else {
            return false;
        }
    }

}
