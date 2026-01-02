package org.example.organization;

import java.util.ArrayList;
import java.util.List;

public class FootballTeamManagement {
    public static List<FootballTeam> footballTeams = new ArrayList<>();

    public static void findTopPerformingClubs(int point){
        for (FootballTeam f : footballTeams){
            if (f.getNumberOfPointsScoredInSeason() > point){
                String str = String.format("Клуб набравший очков больше указанного: %s", f.getName() + " - " + f.getNumberOfPointsScoredInSeason());
                System.out.println(str);
                System.out.println();
            }
        }

    }

    public static void findClubsWithAveragePlayerSalaryLessThan(Long summa){
        Long total = 0L;
        for (FootballTeam f : footballTeams){
            total = f.getBudget() / f.getNumberOfRegisteredPlayers();
            if (total < summa){
                System.out.println("Среднее содержание игрока, которая меньше заданной суммы: " + total);
            }
        }

    }

    public static void findHistoricClubs(int year){
        for (FootballTeam f : footballTeams) {
            if (f.getFoundationYear() <= year) {
                String str = String.format("Клуб до указанного года: %s", f.getName() + " - " + f.getFoundationYear());
                System.out.println(str);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        footballTeams.add(new FootballTeam("ФК «Старожил»", 1997, 42, 28, 45000000000L));
        footballTeams.add(new FootballTeam("ФК «Прогресс»", 2005, 78, 24, 120000000000L));
        findClubsWithAveragePlayerSalaryLessThan(1700000002L);
    }
}
