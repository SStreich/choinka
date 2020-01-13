package zadanie_domowe;

import zadanie_domowe.mikolaje.*;
import zadanie_domowe.prezentobiorcy.*;

class Choinka {

     static void rozpocznijCzasPrezentow() {
         System.out.println("Czas prezentów!\n");

         Mikolaj[] mikolaje = new Mikolaj[]{new Zyczliwy(), new Rodzinny(), new Zyczliwy(), new Konserwatywny()};
         Prezentobiorca[] dzieciMałeiDuże = new Prezentobiorca[]{new Typowy(1), new Markotny(2), new Radosny(7), new Nerd(3), new Czytelnik(1)};
         for (int mi = 0, bi = 0, ile = 0; ile < 10; ile++, mi = (mi + 1) % mikolaje.length, bi = (bi + 1) % dzieciMałeiDuże.length) {
             System.out.println("Mikołaj " + mikolaje[mi].toString() + " daje prezent " + dzieciMałeiDuże[bi].getClass().getSimpleName());
             mikolaje[mi].dajPrezent(dzieciMałeiDuże[bi]);
         }

         System.out.println("\nPodsumowanie:\n");;

         for (Prezentobiorca biorca : dzieciMałeiDuże) {
             System.out.println(biorca.getClass().getSimpleName() + (biorca.czyZadowolony() ? " i zadowolony!" : " nie jest zadowolony 😞"));
         }
     }
}
