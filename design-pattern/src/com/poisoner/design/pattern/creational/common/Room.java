package com.poisoner.design.pattern.creational.common;

import java.util.HashMap;

/**
 * Created by shenjuan on 2017/3/13.
 */
public class Room extends MapSite {
    private int roomNo;
    private HashMap<Direction, MapSite> sides;

    public Room(){

    }

    public Room(int roomNO){

    }

    public MapSite getSides(Direction direction) {

        return sides.get(direction);
    }

    public void setSides(Direction direction, MapSite side) {
       sides.put(direction, side);
    }

    @Override
    public void enter() {

    }
}
