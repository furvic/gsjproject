package com.gsj.tank.cor;

import com.gsj.tank.GameObject;

public interface Collider {
    boolean collide(GameObject o1,GameObject o2);
}
