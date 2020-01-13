package zadanie_domowe.prezentobiorcy;

import zadanie_domowe.Prezent;

public class Radosny extends Prezentobiorca {
    public Radosny(int limitPrezentow) {
        super(limitPrezentow);
        marzenie = Marzenia.INNE;
        zadowolony = true;
    }

    @Override
    public void przyjmijPrezent(Prezent prezent) throws ZaDuzoPrezentow {
        if(!czyZaDuzoPrezentow()) {
            if(prezent.czyRózga()) {
                rozgi++;
            } else {
                prezenty.add(prezent);
            }
        }
    }
}
