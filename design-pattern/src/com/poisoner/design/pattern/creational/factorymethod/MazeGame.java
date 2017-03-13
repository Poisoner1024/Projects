package com.poisoner.design.pattern.creational.factorymethod;

import com.poisoner.design.pattern.creational.common.*;

/**
 * Created by shenjuan on 2017/3/13.
 */
public class MazeGame {
    public Maze createMaze(){
        Maze aMaze = new Maze();

        Room r1 = makeRoom(1);
        Room r2 = makeRoom(2);
        Door theDoor = makeDoor(r1, r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSides(Direction.North, makeWall());
        r1.setSides(Direction.East, theDoor);
        r1.setSides(Direction.North, makeWall());
        r1.setSides(Direction.West, makeWall());

        r2.setSides(Direction.North, makeWall());
        r2.setSides(Direction.East, makeWall());
        r2.setSides(Direction.North, makeWall());
        r2.setSides(Direction.West, theDoor);

        return aMaze;
    }

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
