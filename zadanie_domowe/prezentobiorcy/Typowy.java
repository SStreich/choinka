package zadanie_domowe.prezentobiorcy;

import zadanie_domowe.Prezent;

public class Typowy extends Prezentobiorca {

    public Typowy(int limitPrezentow) {
        super(limitPrezentow);
        this.marzenie = Marzenia.MAJSTERKOWANIE;
    }

    @Override
    public void przyjmijPrezent(Prezent prezent) throws ZaDuzoPrezentow {
        if (!czyZaDuzoPrezentow()) {
            if(prezent.czyRózga()) {
                rozgi++;
            } else {
                prezenty.add(prezent);
                if(prezent.getRodzaj().equals(marzenie.name()) && rozgi == 0) zadowolony = true;
            }
        }
    }

}
