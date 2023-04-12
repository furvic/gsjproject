package com.gsj.tank.abstractFactory;

import com.gsj.tank.*;

public abstract class GameFactory {
    public abstract Tank createTank(int x, int y, Dir dir, Group group, GameModel gm);
    public abstract Explode createExplode(int x, int y, GameModel gm);
    public abstract Bullet createBullet(int x, int y, Dir dir, Group group, GameModel gm);
}
