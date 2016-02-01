package com.gen4ukk;

/**
 * Created by gen4ukk on 02.01.2016.
 */
public class Shot {

    public String startPlaying(String _shot) {

        String shot = _shot;
        String resultStr = "";

        int deleteIndex = 0;
        int summ = 0;
        for (BattleHit battleHit : Ships.battleHits) {
            int result = battleHit.checkYourself(shot);
            summ = summ + result;

            if (result == 100) {
                resultStr = battleHit.getResult();  // kill
                deleteIndex = Ships.battleHits.indexOf(battleHit);

            } else if (result == 10) {
                resultStr = battleHit.getResult();   // hit
            }
        }

        if (summ <= 10) {
            resultStr = "1";                // miss
        } else if (summ >= 100) {
            Ships.battleHits.remove(deleteIndex);
        }
        if (Ships.battleHits.isEmpty()) {
            resultStr = "0";                //end of game
        }

        return resultStr;
    }
}
