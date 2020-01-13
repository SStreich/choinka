package zadanie_domowe.prezentobiorcy;

import zadanie_domowe.Prezent;

public class Markotny extends Prezentobiorca {
    public Markotny(int limitPrezentow) {
        super(limitPrezentow);
        this.zadowolony = false;
    }

    @Override
    public void przyjmijPrezent(Prezent prezent) throws ZaDuzoPrezentow {
        if(!czyZaDuzoPrezentow()) {
            if (prezent.getRodzaj().equals("Rózga")) {
                this.rozgi++;
            } else {
                prezenty.add(prezent);
            }
        }
    }
}
