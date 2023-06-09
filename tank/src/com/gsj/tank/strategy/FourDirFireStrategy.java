package com.gsj.tank.strategy;

import com.gsj.tank.*;

public class FourDirFireStrategy implements FireStrategy {

    @Override
    public void fire(Tank t) {
        int bx = t.x + Tank.WIDTH / 2 - Bullet.WIDTH;
        int by = t.y + Tank.HEIGHT / 2 + Bullet.HEIGHT / 2;

        Dir[] dirs = Dir.values();
        for (Dir dir : dirs) {
            GameModel.getInstance().gf.createBullet(bx, by, dir, t.group,GameModel.getInstance());

        }

        if (t.group == Group.GOOD) new Thread(() -> new Audio("audio/tank_fire.wav").play()).start();

    }
}
