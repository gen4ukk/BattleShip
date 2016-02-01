package com.gen4ukk;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by gen4ukk on 02.01.2016.
 */
public class Battle_Place {

    private int wallLength = 10;
    public static String alphabet = "abcdefghijklm";
    private HashSet<String> blockedCell = new HashSet<String>();
    private boolean success = true;
    private int xRandom;
    private int yRandom;

    public HashSet<String> getBlockedSet() {
        return blockedCell;
    }

    public ArrayList<String> placeDotCom(int comSize) {

        ArrayList<String> cellWithCom = null;

        while (success) {
            xRandom = (int) (Math.random() * (wallLength - comSize + 1));    //0,1,2,3,4,5,6
            yRandom = (int) (Math.random() * wallLength);                    //a,b,c,d,e,f,g
            cellWithCom = new ArrayList<String>();

            if (!blockedCell.contains(intToAlphabet(yRandom) + xRandom)) {
                for (int i = 0; i < comSize; i++) {
                    if (!blockedCell.contains(intToAlphabet(yRandom) + (xRandom + i))) {
                        cellWithCom.add(intToAlphabet(yRandom) + (xRandom + i));
                    }
                }
            }

            if (cellWithCom.size() == comSize) {
                blockMap(cellWithCom);
                success = false;
            }

            if (success) {

                int temp =xRandom;
                xRandom = yRandom;
                yRandom = temp;

                cellWithCom = new ArrayList<String>();

                if (!blockedCell.contains(intToAlphabet(yRandom) + xRandom)) {
                    for (int i = 0; i < comSize; i++) {
                        if (!blockedCell.contains(intToAlphabet(yRandom + i) + (xRandom))) {
                            cellWithCom.add(intToAlphabet(yRandom + i) + (xRandom));
                        }
                    }
                }

                if (cellWithCom.size() == comSize) {
                    blockMap(cellWithCom);
                    success = false;
                }

            }


        }
        success = true;
        System.out.println(cellWithCom);
        return cellWithCom;
    }

    public String intToAlphabet(int number) {
        if (number >= 0) {
            return "" + alphabet.toCharArray()[number];
        } else {
            return "-1";
        }
    }


    public void blockMap(ArrayList<String> arrayList) {
        String[] alphabetC = alphabet.split("");
        int x = -1;
        int y = -1;

        for (String text : arrayList) {

            String[] coord = text.split("");
            x = Integer.parseInt(coord[1]);

            for (int j = 0; j < alphabetC.length; j++) {
                if (alphabetC[j].equals(coord[0])) {
                    y = j;
                }
            }

            blockedCell.add(intToAlphabet(y + 1) + (x - 1));
            blockedCell.add(intToAlphabet(y) + (x - 1));
            blockedCell.add(intToAlphabet(y - 1) + (x - 1));

            blockedCell.add(intToAlphabet(y + 1) + (x));
            blockedCell.add(intToAlphabet(y - 1) + (x));
            blockedCell.add(intToAlphabet(y)+(x));

            blockedCell.add(intToAlphabet(y + 1) + (x + 1));
            blockedCell.add(intToAlphabet(y) + (x + 1));
            blockedCell.add(intToAlphabet(y - 1) + (x + 1));

        }

    }
}