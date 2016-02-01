package com.gen4ukk;

import java.util.ArrayList;

/**
 * Created by gen4ukk on 02.01.2016.
 */
public class Ships {
    static ArrayList<BattleHit> battleHits = new ArrayList<>();
    Battle_Place battlePlace = new Battle_Place();

    public void setUpGame(){

        BattleHit dotCom7 = new BattleHit();
        dotCom7.setLocationCells(battlePlace.placeDotCom(1));
        dotCom7.setName("1-палубный");
        battleHits.add(dotCom7);

        BattleHit dotCom8 = new BattleHit();
        dotCom8.setLocationCells(battlePlace.placeDotCom(1));
        dotCom8.setName("1-палубный");
        battleHits.add(dotCom8);

        BattleHit dotCom9 = new BattleHit();
        dotCom9.setLocationCells(battlePlace.placeDotCom(1));
        dotCom9.setName("1-палубный");
        battleHits.add(dotCom9);

        BattleHit dotCom10 = new BattleHit();
        dotCom10.setLocationCells(battlePlace.placeDotCom(1));
        dotCom10.setName("1-палубный");
        battleHits.add(dotCom10);

        BattleHit dotCom4 = new BattleHit();
        dotCom4.setLocationCells(battlePlace.placeDotCom(2));
        dotCom4.setName("2-палубный");
        battleHits.add(dotCom4);

        BattleHit dotCom5 = new BattleHit();
        dotCom5.setLocationCells(battlePlace.placeDotCom(2));
        dotCom5.setName("2-палубный");
        battleHits.add(dotCom5);

        BattleHit dotCom6 = new BattleHit();
        dotCom6.setLocationCells(battlePlace.placeDotCom(2));
        dotCom6.setName("2-палубный");
        battleHits.add(dotCom6);

        BattleHit dotCom2 = new BattleHit();
        dotCom2.setLocationCells(battlePlace.placeDotCom(3));
        dotCom2.setName("Valentin V");
        battleHits.add(dotCom2);

        BattleHit dotCom3 = new BattleHit();
        dotCom3.setLocationCells(battlePlace.placeDotCom(3));
        dotCom3.setName("Ivan III");
        battleHits.add(dotCom3);

        BattleHit dotCom1 = new BattleHit();
        dotCom1.setLocationCells(battlePlace.placeDotCom(4));
        dotCom1.setName("Титаник");
        battleHits.add(dotCom1);

        System.out.println(battlePlace.getBlockedSet());
    }
}