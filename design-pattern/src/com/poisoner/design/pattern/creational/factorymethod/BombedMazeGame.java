package com.poisoner.design.pattern.creational.factorymethod;


import com.poisoner.design.pattern.creational.common.Room;
import com.poisoner.design.pattern.creational.common.Wall;

/**
 * Created by shenjuan on 2017/3/15.
 */
public class BombedMazeGame extends MazeGame {
    public BombedMazeGame() {

    }

    @Override
    public Wall makeWall(){
        return new BombedWall();
    }

    @Override
    public Room makeRoom(int roomNO){
        return new RoomWithABomb(roomNO);
    }

}
