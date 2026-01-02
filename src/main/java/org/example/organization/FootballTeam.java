package org.example.organization;

import java.time.LocalDate;

public class FootballTeam extends Organization {

    private int numberOfPointsScoredInSeason;
    private int numberOfRegisteredPlayers;

    FootballTeam(){
        super();
    }

    FootballTeam(FootballTeam footballTeam){
        super(footballTeam);
        this.numberOfPointsScoredInSeason = footballTeam.numberOfPointsScoredInSeason;
        this.numberOfRegisteredPlayers = footballTeam.numberOfRegisteredPlayers;
    }

    FootballTeam(String name, int foundationYear, int numberOfPointsScoredInSeason,
                 int numberOfRegisteredPlayers, Long budget){
        super(name, foundationYear, budget);
        this.numberOfPointsScoredInSeason = numberOfPointsScoredInSeason;
        this.numberOfRegisteredPlayers = numberOfRegisteredPlayers;
    }

    public int getNumberOfPointsScoredInSeason() {
        return numberOfPointsScoredInSeason;
    }

    public int getNumberOfRegisteredPlayers() {
        return numberOfRegisteredPlayers;
    }

    public void setNumberOfPointsScoredInSeason(int numberOfPointsScoredInSeason) {
        this.numberOfPointsScoredInSeason = numberOfPointsScoredInSeason;
    }

    public void setNumberOfRegisteredPlayers(int numberOfRegisteredPlayers) {
        this.numberOfRegisteredPlayers = numberOfRegisteredPlayers;
    }

    public void show(){
        System.out.println("Наименование команды: " + name);
        System.out.println("Год основания: " + foundationYear);
        System.out.println("Кол-во набранных очков в сезоне: " + numberOfPointsScoredInSeason);
        System.out.println("Кол-во заявленных игроков: " + numberOfRegisteredPlayers);
        System.out.println("Бюджет клуба на содержание игроков: " + budget);
    }
}

