package com.ayodele.aquilibrium.service;

import com.ayodele.aquilibrium.model.Autobot;
import com.ayodele.aquilibrium.model.BattleResult;
import com.ayodele.aquilibrium.model.Decepticons;
import com.ayodele.aquilibrium.model.Transformer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Battle {

    List<Decepticons> decepticons;
    List<Autobot> autoBots;

    List<Decepticons> deadDecepticons;
    List<Autobot> deadAutoBots;

    List<Decepticons> survivingDecepticons;
    List<Autobot> survivingAutoBots;

    public Battle(List<Decepticons> decepticons, List<Autobot> autoBots) {
        Collections.sort(decepticons);
        Collections.sort(autoBots);
        this.decepticons = decepticons;
        this.autoBots = autoBots;
        deadDecepticons = new ArrayList<>();
        deadAutoBots = new ArrayList<>();
        survivingDecepticons = new ArrayList<>();
        survivingAutoBots = new ArrayList<>();
    }

    public BattleResult fight() {
        BattleResult battleResult = new BattleResult();
        int maxBattles = Math.max(decepticons.size(), autoBots.size());

        int numberOfFights = 0;

        while(maxBattles > 0 && decepticons.size() > 0 && autoBots.size() > 0) {
            Decepticons currentDeception = decepticons.get(0);
            Autobot currentAutobot = autoBots.get(0);

            Fight fight = new Fight(currentDeception, currentAutobot);
            if (fight.isDeceptionsOptimusPrimeOrPredaking() && fight.isAutoBotOptimusPrimeOrPredaking()){
                deadDecepticons.addAll(decepticons);
                deadAutoBots.addAll(autoBots);
                decepticons.clear();
                autoBots.clear();

                battleResult.setNumberOfBattles(1);
                battleResult.setSurvivors(null);
                battleResult.setWinnerTeam(null);
                break;
            } else {
                Transformer winner = fight.getWinner();
                if (winner == null) {
                    deadAutoBots.add(currentAutobot);
                    autoBots.remove(currentAutobot);
                    deadDecepticons.add(currentDeception);
                    decepticons.remove(currentDeception);
                } else if (winner instanceof Decepticons) {
                    deadAutoBots.add(currentAutobot);
                    autoBots.remove(currentAutobot);
                } else {
                    deadDecepticons.add(currentDeception);
                    decepticons.remove(currentDeception);
                }
            }

            if (!(fight.winsByCourage() || fight.winsByStrength())){
                numberOfFights++;
            }

            maxBattles--;
        }

        battleResult.setNumberOfBattles(numberOfFights);

        if (autoBots.size() == 0 && decepticons.size() == 0) {
            return battleResult;
        }else {

            if(decepticons.size() > autoBots.size()) {
                battleResult.setSurvivors(null);
                battleResult.setWinnerTeam("Decepticons");
            } else {
                battleResult.setSurvivors(null);
                battleResult.setWinnerTeam("AutoBot");
            }
            return battleResult;
        }
    }
}
