package com.gen4ukk;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gen4ukk on 02.01.2016.
 */
public class CellIngine implements ActionListener {
    private MyFrame parent;
    Shot shotShip = new Shot();
    Icon iconHit = new ImageIcon("hit.png");
    Icon iconMiss = new ImageIcon("miss.png");
    Icon iconKill = new ImageIcon("boom.png");

    public CellIngine(MyFrame _parent) {
        this.parent = _parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Cell clickedCell = (Cell) e.getSource();
        int position = clickedCell.getPosition();
        int x = position % 10;
        int y = (position - x) / 10;
        String shot = "" + Battle_Place.alphabet.toCharArray()[y] + x;
        String result = shotShip.startPlaying(shot);
        System.out.println("" + x + y + "=" + shot);

        switch (result) {
            case "0": {
                clickedCell.setIcon(iconKill);
                JOptionPane.showMessageDialog(null, "VICTORY");
                break;
            }
            case "1": {
                clickedCell.setIcon(iconMiss);
                break;
            }
            case "Попал": {
                clickedCell.setIcon(iconHit);
                break;
            }
            case "Убил": {
                clickedCell.setIcon(iconKill);
                break;
            }

        }
    }
}
