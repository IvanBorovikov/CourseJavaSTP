package org.example.lighting;

import java.util.ArrayList;
import java.util.List;

public class LightningManagement {
    public static List<Lightning> lightnings = new ArrayList<>();

    public static void findDistantLightningsRecordedBy(String owner, double distance){
        for (Lightning l : lightnings){
            if (l.getLastNameObserver().equalsIgnoreCase(owner) && l.getDistanceFromObserver() > distance){
                l.show();
                System.out.println();
            }
        }
    }

    public static void findLightningsByLengthAndDuration(int length, double duration){
        for (Lightning l : lightnings){
            if (l.getZipperLength() > length && l.getDischargeDuration() == duration){
                l.show();
                System.out.println();
            }
        }
    }



    public static void main(String[] args) {
        lightnings.add(new Lightning("LN-2024-0875", 8, 35, 2.1, 0.3, "Петров"));
        lightnings.add(new Lightning("SP-2024-012", 60, 10, 300.0, 0.05, "Васильев"));
        lightnings.add(new Lightning("IC-2024-3456", 3, 5, 15.2, 0.15, "Сидорова"));
    }
}
