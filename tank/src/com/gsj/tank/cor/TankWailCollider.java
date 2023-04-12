package com.gsj.tank.cor;

import com.gsj.tank.Bullet;
import com.gsj.tank.GameObject;
import com.gsj.tank.Tank;
import com.gsj.tank.Wail;

public class TankWailCollider implements Collider {


    @Override
    public boolean collide(GameObject o1, GameObject o2) {
        if (o1 instanceof Tank && o2 instanceof Wail) {
            Tank t = (Tank) o1;
            Wail w = (Wail) o2;
//            return !b.collideWith(w);

            if (t.rect.intersects(w.rect)) {
                t.die();

            }
        } else if (o1 instanceof Wail && o2 instanceof Tank) {
            return collide(o2, o1);
        }
        return true;
    }
}
