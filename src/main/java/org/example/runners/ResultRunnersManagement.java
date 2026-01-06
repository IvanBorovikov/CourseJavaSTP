package org.example.runners;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ResultRunnersManagement {
    public static List<ResultRunners> resultRunners = new ArrayList<>();

    /*
    а) вывод списка спортсменов, пробежавших указанную дистанцию, результат которых укладывается во введенный диапазон;
     */
    public static void findAthletesByDistanceAndTimeRange(double distance, LocalTime res){
        System.out.printf("Спортсмены пробежавшие указанную дистанцию %.2f. И результат которых укладывается во введенный диапазон: %s\n", distance, res);
        for (ResultRunners r : resultRunners){
            if (r.getRaceDistance() == distance && r.getResult().getHour() >= res.getHour() && r.getResult().getMinute() >= res.getMinute()
                    && r.getResult().getSecond() >= res.getSecond()){
                r.show();
                System.out.println();
            }
        }
    }

    /*
    б) вывод отсортированного(по результатам) списка спортсменов, принадлежащих указанной стране.
     */
    public static void findAthletesByCountryOrderByResultAsc(String country){
        System.out.printf("Спортсмены принадлежащих указанной стране: %s\n", country);
        ArrayList<ResultRunners> res = new ArrayList<>();
        for (ResultRunners r : resultRunners){
            if (r.getCountry().equalsIgnoreCase(country)){
                res.add(r);
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
        resultRunners.add(new ResultRunners("Кипчоге", "Кения", 39, 42.192, LocalTime.of(2, 1, 9)));
        resultRunners.add(new ResultRunners("Ингебригтсен", "Норвегия", 23, 1500, LocalTime.of(0, 3, 27, 95)));
        resultRunners.add(new ResultRunners("Томпсон-Хера", "Ямайка", 30, 100, LocalTime.of(0, 0, 10, 54)));
        resultRunners.add(new ResultRunners("Томпсон-Хера", "Ямайка", 30, 100, LocalTime.of(0, 2, 10, 54)));
        resultRunners.add(new ResultRunners("Томпсон-Хера", "Ямайка", 30, 100, LocalTime.of(0, 1, 10, 54)));


        findAthletesByDistanceAndTimeRange(42.192, LocalTime.of(2, 0, 9));
    }
}
