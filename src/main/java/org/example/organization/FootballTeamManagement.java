package org.example.organization;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FootballTeamManagement {
    public static List<FootballTeam> footballTeams = new ArrayList<>();

    /*
    а) вывод списка клубов набравших в сезоне очков больше заданного;
     */
    public static void findTopPerformingClubs(int point){
        System.out.printf("Клуб набравший очков больше указанного: %d\n", point);
        for (FootballTeam f : footballTeams){
            if (f.getNumberOfPointsScoredInSeason() > point){
                f.show();
                System.out.println();
            }
        }

    }

    /*
    б) вывод списка клубов среднее содержание игрока которых меньше заданной суммы;
     */
    public static void findClubsWithAveragePlayerSalaryLessThan(Long summa){
        long total;
        for (FootballTeam f : footballTeams){
            total = f.getBudget() / f.getNumberOfRegisteredPlayers();
            if (total < summa){
                System.out.println("Среднее содержание игрока, которая меньше заданной суммы: " + total);
            }
        }

    }

    /*
    в)вывод списка клубов, основанных до указанного года.
     */
    public static void findHistoricClubs(LocalDate year){
        System.out.println("Клуб до указанного года: " + year);
        for (FootballTeam f : footballTeams) {
            if (!f.getFoundationYear().isAfter(year)) {
                f.show();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        footballTeams.add(new FootballTeam("ФК «Старожил»", LocalDate.of(2003, 1, 1), 42, 28, 45000000000L));
        footballTeams.add(new FootballTeam("ФК «Прогресс»", LocalDate.of(2005, 1, 1), 78, 24, 120000000000L));
        //findClubsWithAveragePlayerSalaryLessThan(1700000002L);
        findHistoricClubs(LocalDate.of(2004, 1, 1));
    }
}
