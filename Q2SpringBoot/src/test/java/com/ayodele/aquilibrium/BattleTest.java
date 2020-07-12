package com.ayodele.aquilibrium;

import com.ayodele.aquilibrium.model.Autobot;
import com.ayodele.aquilibrium.model.BattleResult;
import com.ayodele.aquilibrium.model.Decepticons;
import com.ayodele.aquilibrium.service.Battle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BattleTest {

    /**
     * Soundwave, D, 8,9,2,6,7,5,6,10
     * Bluestreak, A, 6,6,7,9,5,2,9,7
     * Hubcap: A, 4,4,4,4,4,4,4,4
     */

    @Test
    public void testFight() {

        List<Decepticons> decepticons = new ArrayList<>();
        decepticons.add(new Decepticons("Soundwave", 8,9,2,6,7,5,6,10));

        List<Autobot> autobots = new ArrayList<>();
        autobots.add(new Autobot("Bluestreak", 6,6,7,9,5,2,9,7));
        autobots.add(new Autobot("Hubcap", 4,4,4,4,4,4,4,4));

        Battle battle = new Battle(decepticons, autobots);
        BattleResult battleResult = battle.fight();
        System.out.println(battleResult);
    }

}
