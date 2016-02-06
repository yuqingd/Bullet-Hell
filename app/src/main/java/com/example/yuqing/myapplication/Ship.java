package com.example.yuqing.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yuqing on 2/6/2016.
 */
public class Ship {

    Position currenPos;
    final double INITIAL_XPOS = 0.0;
    final double INITIAL_YPOS = 0.0;

    /*
     constructor for initializing the player ship
     */
    public Ship(){
        currenPos = new Position(INITIAL_XPOS, INITIAL_YPOS);
    }


}
