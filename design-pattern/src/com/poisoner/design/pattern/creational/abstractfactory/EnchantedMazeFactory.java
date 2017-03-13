package com.poisoner.design.pattern.creational.abstractfactory;

import com.poisoner.design.pattern.creational.common.Door;
import com.poisoner.design.pattern.creational.common.Room;
import com.poisoner.design.pattern.creational.common.Wall;

/**
 * Created by shenjuan on 2017/3/16.
 */
public class EnchantedMazeFactory extends MazeFactory {
    public EnchantedMazeFactory(){

    }

    public Room makeRoom(int roomNo){
        return new EnchantedRoom(roomNo, castSpell());
    }

    private Spell castSpell() {
        Spell spell = new Spell();
        return spell;
    }

    public Door makeDoor(Room r1, Room r2){
        return new DoorNeedingSpell(r1, r2);
    }
}
