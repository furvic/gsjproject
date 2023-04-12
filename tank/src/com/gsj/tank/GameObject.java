package com.gsj.tank;

import com.gsj.tank.observer.TankFireEvent;
import com.gsj.tank.observer.TankFireHandler;
import com.gsj.tank.observer.TankFireObserver;

import java.awt.*;
import java.io.Serializable;
import java.util.*;
import java.util.List;

public abstract class GameObject implements Serializable {

    public int x,y;

    public abstract void paint(Graphics g);
    public abstract int getWidth();
    public abstract int getHeight();


}
