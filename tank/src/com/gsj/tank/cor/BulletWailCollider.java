package com.gsj.tank.cor;

import com.gsj.tank.*;

public class BulletWailCollider implements Collider {


    @Override
    public boolean collide(GameObject o1, GameObject o2) {
        if (o1 instanceof Bullet && o2 instanceof Wail) {
            Bullet b = (Bullet) o1;
            Wail w = (Wail) o2;
//            return !b.collideWith(w);

            if (b.rect.intersects(w.rect)) {
                b.die();

            }
        } else if (o1 instanceof Wail && o2 instanceof Bullet) {
            return collide(o2, o1);
        }
        return true;
    }
}
