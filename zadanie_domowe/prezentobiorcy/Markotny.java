package zadanie_domowe.prezentobiorcy;

import zadanie_domowe.Prezent;

public class Markotny extends Prezentobiorca {
    public Markotny(int limitPrezentow) {
        super(limitPrezentow);
    }

    @Override
    public void przyjmijPrezent(Prezent prezent) throws ZaDuzoPrezentow {
        if(prezenty.size() >= limitPrezentów) {
            throw new ZaDuzoPrezentow();
        } else {
            if (prezent.getRodzaj().equals("Rózga")) {
                this.rozgi++;
            } else {
                prezenty.add(prezent);
            }
        }
    }
}
