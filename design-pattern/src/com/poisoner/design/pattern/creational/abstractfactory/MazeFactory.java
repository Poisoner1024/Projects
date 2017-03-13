package com.poisoner.design.pattern.creational.abstractfactory;

import com.poisoner.design.pattern.creational.common.Door;
import com.poisoner.design.pattern.creational.common.Maze;
import com.poisoner.design.pattern.creational.common.Room;
import com.poisoner.design.pattern.creational.common.Wall;

/**
 * Created by shenjuan on 2017/3/16.
 */
public class MazeFactory {
    public MazeFactory(){

    };

    public Maze makeMaze(){
        return  new Maze();
    }

    public Room makeRoom(int roomNo){
        return new Room(roomNo);
    }

    public Wall makeWall(){
        return new Wall();
    }

    public Door makeDoor(Room r1, Room r2){
        return new Door(r1, r2);
    }
}
