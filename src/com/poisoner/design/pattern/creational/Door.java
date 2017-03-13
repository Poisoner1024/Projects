package com.poisoner.design.pattern.creational;

/**
 * Created by shenjuan on 2017/3/13.
 */
public class Door extends MapSite {
    public Door(Room room1, Room room2){

    }

    public Room otherSideFrom(Room otherSideFromRoom){
        return null;
    }

    @Override
    public void Enter() {

    }

    private Room room1;
    private Room room2;
    private boolean isOpen;
}
