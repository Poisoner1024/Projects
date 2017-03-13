package com.poisoner.design.pattern.creational.abstractfactory;

import com.poisoner.design.pattern.creational.common.Door;
import com.poisoner.design.pattern.creational.common.Room;

/**
 * Created by shenjuan on 2017/3/16.
 */
public class DoorNeedingSpell extends Door {
    public DoorNeedingSpell(Room r1, Room r2) {
        super(r1, r2);
    }
}
