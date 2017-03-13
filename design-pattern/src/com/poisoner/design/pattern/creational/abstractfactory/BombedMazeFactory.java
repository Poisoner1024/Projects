package com.poisoner.design.pattern.creational.abstractfactory;

import com.poisoner.design.pattern.creational.common.Room;
import com.poisoner.design.pattern.creational.common.Wall;
import com.poisoner.design.pattern.creational.factorymethod.BombedWall;
import com.poisoner.design.pattern.creational.factorymethod.RoomWithABomb;

/**
 * Created by shenjuan on 2017/3/16.
 */
public class BombedMazeFactory extends MazeFactory {
    public BombedMazeFactory(){

    }

    public Room makeRoom(int roomNo){
        return new RoomWithABomb(roomNo);
    }

    public Wall makeWall(){
        return new BombedWall();
    }
}
