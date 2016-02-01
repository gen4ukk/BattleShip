package com.gen4ukk;

import javax.swing.*;
import java.util.HashMap;

/**
 * Created by gen4ukk on 01.01.2016.
 */
public class Cell extends JButton {
    private int position;


    Cell (int _position){
        this.position = _position;
    }


    public void setPosition(int _position) {
        this.position = _position;
    }

    public int getPosition() {
        return position;
    }

}
