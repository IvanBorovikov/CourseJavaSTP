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
    public static void findOverlandTornadoesByObserverAndCategory(String observer, String category){
        System.out.printf("Наземные торнадо описанные конкретным наблюдателем, с указанной категорией: %s\n", category);
        for (Tornado t : tornadoes){
            if (t.isLandOrSurface() && t.getHurricaneCategory().equalsIgnoreCase(category)){
                t.show();
                System.out.println();
            }
        }
    }

}
