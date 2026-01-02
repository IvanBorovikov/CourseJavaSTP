package org.example.administration;

import org.example.separate.ResultRunners;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ResultRunnersManagement {
    public static List<ResultRunners> resultRunners = new ArrayList<>();

    public static void findAthletesByDistanceAndTimeRange(double distance, LocalTime res){
        for (ResultRunners r : resultRunners){
            if (r.getRaceDistance() == distance && r.getResult().getHour() >= res.getHour() && r.getResult().getMinute() >= res.getMinute()
                    || r.getResult().getSecond() >= res.getSecond()){
                r.show();
                System.out.println();
            }
        }
    }

    public static void findAthletesByCountryOrderByResultAsc(String country){
        ArrayList<ResultRunners> res = new ArrayList<>();
        for (ResultRunners r : resultRunners){
            if (r.getCountry().equalsIgnoreCase(country)){
                res.add(r);
//                r.show();
//                System.out.println();
            }
        }
        res.sort(Comparator.comparing(ResultRunners::getResult));
        for (ResultRunners r : res){
            r.show();
            System.out.println();
        }
    }



    public static void main(String[] args) {
        resultRunners.add(new ResultRunners("Кипчоге", "Кения", 39, 42.192, LocalTime.of(2, 1, 9)));
        resultRunners.add(new ResultRunners("Ингебригтсен", "Норвегия", 23, 1500, LocalTime.of(0, 3, 27, 95)));
        resultRunners.add(new ResultRunners("Томпсон-Хера", "Ямайка", 30, 100, LocalTime.of(0, 0, 10, 54)));
        resultRunners.add(new ResultRunners("Томпсон-Хера", "Ямайка", 30, 100, LocalTime.of(0, 2, 10, 54)));
        resultRunners.add(new ResultRunners("Томпсон-Хера", "Ямайка", 30, 100, LocalTime.of(0, 1, 10, 54)));


        findAthletesByCountryOrderByResultAsc("Ямайка");
    }
}
