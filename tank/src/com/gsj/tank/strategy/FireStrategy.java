package com.gsj.tank.strategy;

import com.gsj.tank.Tank;
import com.gsj.tank.abstractFactory.BaseTank;

import java.io.Serializable;

public interface FireStrategy extends Serializable {

    void fire(Tank t);
}
