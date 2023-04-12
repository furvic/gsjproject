package com.gsj.tank;

import com.gsj.tank.abstractFactory.BaseBullet;
import com.gsj.tank.abstractFactory.BaseTank;

import java.awt.*;

public class Bullet extends GameObject {

    private static final int SPEED = 3;
    public static int WIDTH = ResourceMgr.bulletd.getWidth();
    public static int HEIGHT = ResourceMgr.bulletd.getHeight();


    public Rectangle rect = new Rectangle();


    private boolean living = true;
//    private int x, y;
    private Dir dir;
//    TankFrame tf = new TankFrame();

    //    public GameModel gm;
    public Group group = Group.BAD;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Bullet(int x, int y, Dir dir, Group group) {
        this.x = x;
        this.y = y;
        this.dir = dir;
//        this.gm = gm;
        this.group = group;

        rect.x = this.x;
        rect.y = this.y;
        rect.width = WIDTH;
        rect.height = HEIGHT;

        GameModel.getInstance().add(this);
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    @Override
    public void paint(Graphics g) {
        if (!living) {
            GameModel.getInstance().remove(this);
        }
//        Color color = g.getColor();
//        g.setColor(Color.red);
//        g.fillOval(x, y, WIDTH, HEIGHT);
//        g.setColor(color);
        switch (dir) {
            case LIFT:
                g.drawImage(ResourceMgr.bulletl, x, y, null);
                break;
            case UP:
                g.drawImage(ResourceMgr.bulletu, x, y, null);
                break;

            case RIGHT:
                g.drawImage(ResourceMgr.bulletr, x, y, null);
                break;
            case DOWN:
                g.drawImage(ResourceMgr.bulletd, x, y, null);
                break;
        }
        move();

    }

    @Override
    public int getWidth() {
        return WIDTH;
    }

    @Override
    public int getHeight() {
        return HEIGHT;
    }

    private void move() {
        switch (dir) {
            case LIFT:
                x -= SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
        }

        rect.x = this.x;
        rect.y = this.y;
        if (x < 0 || y < 0 || x > TankFrame.GAME_WIDTH || y > TankFrame.HEIGHT) {
            living = false;
        }
    }

//
//    public boolean collideWith(Tank tank) {
//
//        if (this.group == tank.getGroup()) return false;
////        Rectangle rect1 = new Rectangle(this.x, this.y, WIDTH, HEIGHT);
////        Rectangle rect2 = new Rectangle(tank.getX(), tank.getY(), tank.WIDTH, tank.HEIGHT);
//        if (rect.intersects(tank.rect)) {
//            tank.die();
//            this.die();
//            int ex = tank.getX() + Tank.WIDTH / 2 - Explode.WIDTH;
//            int ey = tank.getY() + Tank.HEIGHT / 2 - Explode.HEIGHT / 2;
//
//
//            gm.add(gm.gf.createExplode(ex, ey, gm));
//            return true;
//        }
//        return false;
//    }

//    public boolean isLiving() {
//        return living;
//    }
//
//    public void setLiving(boolean living) {
//        this.living = living;
//    }

    public void die() {
        this.living = false;
    }


}
