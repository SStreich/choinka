package zadanie_domowe.prezentobiorcy;

import zadanie_domowe.Prezent;

public class Czytelnik extends Prezentobiorca {
    public Czytelnik(int limitPrezentow) {
        super(limitPrezentow);
        marzenie = Marzenia.KSIAZKI;
        zadowolony = false;
    }

    @Override
    public void przyjmijPrezent(Prezent prezent) throws ZaDuzoPrezentow {
        if(!czyZaDuzoPrezentow()) {
            if(prezent.czyRózga()) {
                rozgi++;
            } else {
                prezenty.add(prezent);
                if(prezent.getRodzaj().equals(marzenie)) zadowolony = true;
            }
        }
    }
}
