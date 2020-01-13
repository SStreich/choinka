package zadanie_domowe.prezentobiorcy;

import zadanie_domowe.Prezent;

public class Markotny extends Prezentobiorca {
    public Markotny(int limitPrezentow) {
        super(limitPrezentow);
        marzenie = Marzenia.INNE;
        this.zadowolony = false;
    }

    @Override
    public void przyjmijPrezent(Prezent prezent) throws ZaDuzoPrezentow {
        if(!czyZaDuzoPrezentow()) {
            if (prezent.czyRózga()) {
                this.rozgi++;
            } else {
                prezenty.add(prezent);
            }
        }
    }
}
