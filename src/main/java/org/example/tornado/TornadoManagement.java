package org.example.tornado;

import java.util.ArrayList;
import java.util.List;

public class TornadoManagement {
    public static List<Tornado> tornadoes = new ArrayList<>();

    public static void findLongLastingLandTornadoes(int duration){
        boolean found = true;
        for (Tornado t : tornadoes){
            if (t.isLandOrSurface() == found && t.getDuration() > duration){
                t.show();
                System.out.println();
            }
        }
    }

    public static void findOverlandTornadoesByObserverAndCategory(String lastName){
        boolean found = true;
        for (Tornado t : tornadoes){
            if (t.isLandOrSurface() == found && t.getLastNameOfTheObserver().equalsIgnoreCase(lastName)){
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
