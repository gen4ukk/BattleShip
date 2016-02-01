package com.gen4ukk;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by gen4ukk on 31.12.2015.
 */
public class MyFrame extends JFrame {
    public ArrayList<Cell> cellList = new ArrayList<>();

    MyFrame() {

        JPanel jPanel = new JPanel();

        GridLayout gl = new GridLayout(10,10);
        jPanel.setLayout(gl);

        for (int i = 0; i < 100; i++) {
            cellList.add(new Cell(i));
            jPanel.add(cellList.get(i));
        }
        initialCell();

        this.setContentPane(jPanel);
        setSize(600, 600);
        setTitle("BattleShip");
        setVisible(true);
    }

    private void initialCell() {

        CellIngine cellIngine = new CellIngine(this);
        for (Cell cell : cellList) {
            cell.addActionListener(cellIngine);
        }
    }
}
