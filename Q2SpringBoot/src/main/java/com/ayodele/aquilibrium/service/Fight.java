package com.ayodele.aquilibrium.service;

import com.ayodele.aquilibrium.model.Autobot;
import com.ayodele.aquilibrium.model.Decepticons;
import com.ayodele.aquilibrium.model.Transformer;

public class Fight {

    public Decepticons deceptions;
    public Autobot autobot;

    public Fight(Decepticons decepticons, Autobot autobot) {
        this.deceptions = decepticons;
        this.autobot = autobot;
    }

    public boolean winsByCourage() {
        return Math.abs(autobot.getCourage() - deceptions.getCourage()) >= 4;
    }

    public Transformer whoWinsByCourage() {
        return autobot.getCourage() > deceptions.getCourage() ? autobot : deceptions;
    }

    public boolean winsByStrength() {
        return Math.abs(autobot.getStrength() - deceptions.getStrength()) >= 3;
    }

    public Transformer whoWinsByStrength() {
        return autobot.getStrength() > deceptions.getStrength() ? autobot : deceptions;
    }

    public boolean winsBySkill() {
        return Math.abs(autobot.getSkill() - deceptions.getSkill()) >= 3;
    }

    public Transformer whoWinsBySkill() {
        return autobot.getSkill() > deceptions.getSkill() ? autobot : deceptions;
    }

    public Transformer whoWillByOverallRating() {
        return autobot.getOverallRating() > deceptions.getOverallRating() ? autobot : deceptions;
    }

    public boolean isAutoBotOptimusPrimeOrPredaking() {
        if(autobot.getName().equals("Optimus Prime") || autobot.getName().equals("Predaking")) {
            return true;
        }
        return false;
    }

    public boolean isDeceptionsOptimusPrimeOrPredaking() {
        if (deceptions.getName().equals("Optimus Prime") || deceptions.getName().equals("Predaking")) {
            return true;
        }
        return false;
    }

    public boolean didOpponentSurvives() {
        if (winsByCourage() || winsByStrength()) return true;
        return false;
    }

    public boolean isTieAndBothDie(){
        return !winsByCourage() && !winsByStrength() && autobot.getOverallRating() == deceptions.getOverallRating();
    }

    public Transformer getWinner() {
        if(isTieAndBothDie()){
            return null;
        }else if(isAutoBotOptimusPrimeOrPredaking()) {
            return autobot;
        }else if(isDeceptionsOptimusPrimeOrPredaking()) {
            return deceptions;
        }else if (winsByCourage() ) {
            return whoWinsByCourage();
        } else if(winsByStrength()) {
            return whoWinsByStrength();
        } else if(winsBySkill()) {
            return whoWinsBySkill();
        }else {
            return whoWillByOverallRating();
        }
    }

}
