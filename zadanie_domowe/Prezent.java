package zadanie_domowe;

import zadanie_domowe.prezentobiorcy.Marzenia;

public class Prezent {
    private String nazwa;
    private String rodzaj;

    public Prezent(String nazwa, String rodzaj) {
        this.nazwa = nazwa;
        this.rodzaj = rodzaj;
    }

    public boolean czyRózga() {
        return getRodzaj().equals("Rózga");
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getRodzaj() {
        return rodzaj;
    }


}
