package com.poisoner.design.pattern.creational.abstractfactory;

import com.poisoner.design.pattern.creational.common.*;

/**
 * Created by shenjuan on 2017/3/16.
 */
public class MazeGame {
    public Maze createMaze(MazeFactory factory) {
        Maze aMaze = factory.makeMaze();
        Room r1 = factory.makeRoom(1);
        Room r2 = factory.makeRoom(2);
        Door aDoor = factory.makeDoor(r1, r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSides(Direction.North, factory.makeWall());
        r1.setSides(Direction.East, aDoor);
        r1.setSides(Direction.North, factory.makeWall());
        r1.setSides(Direction.West, factory.makeWall());

        r2.setSides(Direction.North, factory.makeWall());
        r2.setSides(Direction.East, factory.makeWall());
        r2.setSides(Direction.North, factory.makeWall());
        r2.setSides(Direction.West, aDoor);

        return aMaze;
    }
}
