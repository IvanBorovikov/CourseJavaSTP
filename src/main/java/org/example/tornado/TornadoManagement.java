package org.example.tornado;

import java.util.ArrayList;
import java.util.List;

public class TornadoManagement {
    public static List<Tornado> tornadoes = new ArrayList<>();

    /*
    а) вывод списка наземных торнадо, просуществовавших дольше указанного времени;
     */
    public static void findLongLastingLandTornadoes(int duration){
        System.out.printf("Наземные торнадо просуществовавшие дольше указанного времени: %d\n", duration);
        for (Tornado t : tornadoes){
            if (t.isLandOrSurface() && t.getDuration() > duration){
                t.show();
                System.out.println();
            }
        }
    }

    /*
        б) вывод списка наземных торнадо, описанных конкретным наблюдателем, с указанной категорией.
         */
    public static void findOverlandTornadoesByObserverAndCategory(String category){
        System.out.printf("Наземные торнадо описанные конкретным наблюдателем, с указанной категорией: %s\n", category);
        for (Tornado t : tornadoes){
            if (t.isLandOrSurface() && t.getHurricaneCategory().equalsIgnoreCase(category)){
                t.show();
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        tornadoes.add(new Tornado("F4", 42, 1800, "Петров", true));
        tornadoes.add(new Tornado("W2", 18, 850, "Иванова", false));
        tornadoes.add(new Tornado("F1", 7, 400, "Сидоров", true));
    }
}
