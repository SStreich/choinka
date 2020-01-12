package zadanie_domowe;

import zadanie_domowe.mikolaje.*;
import zadanie_domowe.prezentobiorcy.*;

class Choinka {

     static void rozpocznijCzasPrezentow() {
         System.out.println("Czas prezentów!\n");

         Mikolaj[] mikolaje = new Mikolaj[]{new Zyczliwy(), new Rodzinny(), new Zyczliwy(), new Konserwatywny()};
         Prezentobiorca[] dzieciMałeiDuże = new Prezentobiorca[]{new Typowy(1), new Markotny(2)};
         for (int mi = 0, bi = 0, ile = 0; ile < 10; ile++, mi = (mi + 1) % mikolaje.length, bi = (bi + 1) % dzieciMałeiDuże.length) {
             System.out.println("Mikołaj " + mikolaje[mi] + " daje prezent " + dzieciMałeiDuże[bi]);
             mikolaje[mi].dajPrezent(dzieciMałeiDuże[bi]);
         }

         System.out.println("\nPodsumowanie:\n");

         for (Prezentobiorca biorca : dzieciMałeiDuże) {
             System.out.println(biorca + (biorca.zadowolony() ? " i zadowolony!" : " nie jest zadowolony 😞"));
         }
     }
}
