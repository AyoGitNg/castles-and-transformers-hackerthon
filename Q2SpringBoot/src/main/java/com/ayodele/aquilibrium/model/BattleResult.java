package com.ayodele.aquilibrium.model;

import java.util.List;
import java.util.Objects;

public class BattleResult {

    private Integer numberOfBattles;
    private String WinnerTeam;
    private List<String> survivors;

    public Integer getNumberOfBattles() {
        return numberOfBattles;
    }

    public void setNumberOfBattles(Integer numberOfBattles) {
        this.numberOfBattles = numberOfBattles;
    }

    public String getWinnerTeam() {
        return WinnerTeam;
    }

    public void setWinnerTeam(String winnerTeam) {
        WinnerTeam = winnerTeam;
    }

    public List<String> getSurvivors() {
        return survivors;
    }

    public void setSurvivors(List<String> survivors) {
        this.survivors = survivors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BattleResult battleResult = (BattleResult) o;
        return Objects.equals(numberOfBattles, battleResult.numberOfBattles) &&
                Objects.equals(WinnerTeam, battleResult.WinnerTeam) &&
                Objects.equals(survivors, battleResult.survivors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfBattles, WinnerTeam, survivors);
    }

    @Override
    public String toString() {
        return "Result{" +
                "numberOfBattles=" + numberOfBattles +
                ", WinnerTeam='" + WinnerTeam + '\'' +
                ", survivors=" + survivors +
                '}';
    }
}
