package com.gsj.tank.observer;

import com.gsj.tank.Tank;

public class TankFireEvent {

    public Tank tank;

    public Tank getSource(){
        return tank;
    }

    public TankFireEvent(Tank tank){
        this.tank = tank;
    }
}
