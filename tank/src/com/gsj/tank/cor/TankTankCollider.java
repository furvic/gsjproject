package com.gsj.tank.cor;

import com.gsj.tank.Bullet;
import com.gsj.tank.GameObject;
import com.gsj.tank.Tank;

public class TankTankCollider implements Collider {


    @Override
    public boolean collide(GameObject o1, GameObject o2) {
        if (o1 instanceof Tank && o2 instanceof Tank) {
            Tank t1 = (Tank) o1;
            Tank t = (Tank) o2;
            if (t1.getRect().intersects(t.getRect())) {
//                t1.stop();
//                t.stop();

                t1.back();
                t.back();
//                return false
            }
        }
        return true;

    }
}
