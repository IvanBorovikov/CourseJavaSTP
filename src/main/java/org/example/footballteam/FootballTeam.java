package org.example.footballteam;

import java.time.LocalDate;

public class FootballTeam {

    protected String name;
    /*
    дата основания
     */
    protected LocalDate foundationYear;
    protected Long budget;
    /*
    количество набранных очков в сезоне
     */
    private int numberOfPointsScoredInSeason;
    /*
    количество заявленных игроков
     */
    private int numberOfRegisteredPlayers;

    public FootballTeam(){
    }

    public FootballTeam(FootballTeam footballTeam){
        this.name = footballTeam.name;
        this.foundationYear = footballTeam.foundationYear;
        this.budget = footballTeam.budget;
        this.numberOfPointsScoredInSeason = footballTeam.numberOfPointsScoredInSeason;
        this.numberOfRegisteredPlayers = footballTeam.numberOfRegisteredPlayers;
    }

    public FootballTeam(String name, LocalDate foundationYear, int numberOfPointsScoredInSeason,
                 int numberOfRegisteredPlayers, Long budget){
        this.name = name;
        this.foundationYear = foundationYear;
        this.budget = budget;
        this.numberOfPointsScoredInSeason = numberOfPointsScoredInSeason;
        this.numberOfRegisteredPlayers = numberOfRegisteredPlayers;
    }

    public String getName() {
        return name;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }

    public Long getBudget() {
        return budget;
    }

    public int getNumberOfPointsScoredInSeason() {
        return numberOfPointsScoredInSeason;
    }

    public int getNumberOfRegisteredPlayers() {
        return numberOfRegisteredPlayers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFoundationYear(LocalDate foundationYear) {
        this.foundationYear = foundationYear;
    }

    public void setBudget(Long budget) {
        this.budget = budget;
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

