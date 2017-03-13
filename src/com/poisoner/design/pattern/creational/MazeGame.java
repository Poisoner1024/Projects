package com.poisoner.design.pattern.creational;

/**
 * Created by shenjuan on 2017/3/13.
 */
public class MazeGame {
    public Maze createMaze(){
        Maze aMaze = new Maze();

        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Door theDoor = new Door(r1, r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSides(Direction.North, new Wall());
        r1.setSides(Direction.East, theDoor);
        r1.setSides(Direction.North, new Wall());
        r1.setSides(Direction.West, new Wall());

        r2.setSides(Direction.North, new Wall());
        r2.setSides(Direction.East, new Wall());
        r2.setSides(Direction.North, new Wall());
        r2.setSides(Direction.West, theDoor);

        return aMaze;
    }
}
