package com.gen4ukk;

import java.util.ArrayList;

/**
 * Created by gen4ukk on 02.01.2016.
 */
public class BattleHit {

    private ArrayList<String> locationCells;
    private String name;
    private String result;

    int checkYourself(String guess) {

        result = "Мимо";

        int check = locationCells.indexOf(guess);
        if (check >= 0) {
            result = "Попал";
            locationCells.remove(check);
        }

        if (locationCells.isEmpty()) {
            result = "Убил";
        }

        if (result.equals("Убил")) {
            return 100;
        } else if (result.equals("Попал")) {
            return 10;
        } else {
            return 1;
        }
    }

    void setLocationCells(ArrayList<String> cells) {
        locationCells = cells;
    }

    public void setName(String _name) {
        name = _name;
    }

    public String getName(){
        return name;
    }

    public String getResult(){
        return result;
    }
}
