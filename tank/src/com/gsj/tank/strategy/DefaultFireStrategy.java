package com.gsj.tank.strategy;

import com.gsj.tank.*;
import com.gsj.tank.decorator.RectDecorator;
import com.gsj.tank.decorator.TailDecorator;
import com.gsj.tank.strategy.FireStrategy;

public class DefaultFireStrategy implements FireStrategy {

    @Override
    public void fire(Tank t) {
        int bx = t.x + Tank.WIDTH / 2 - Bullet.WIDTH;
        int by = t.y + Tank.HEIGHT / 2 + Bullet.HEIGHT / 2;
//
//        GameModel.getInstance().add(new RectDecorator(
//                new TailDecorator(new Bullet(bx, by, t.dir, t.group))));
        new Bullet(bx, by, t.dir, t.group);
        if (t.group == Group.GOOD) new Thread(() -> new Audio("audio/tank_fire.wav").play()).start();

    }
}
