package com.gsj.tank.abstractFactory;

import com.gsj.tank.*;

import java.awt.*;

public class RectBullet extends BaseBullet {

    private static final int SPEED = 3;
    public static int WIDTH = ResourceMgr.bulletd.getWidth();
    public static int HEIGHT = ResourceMgr.bulletd.getHeight();


    public Rectangle rect = new Rectangle();


    private boolean living = true;
    private int x, y;
    private Dir dir;
    TankFrame tf = new TankFrame();

    Group group = Group.BAD;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public RectBullet(int x, int y, Dir dir, Group group, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;
        this.group = group;

        rect.x = this.x;
        rect.y = this.y;
        rect.width = WIDTH;
        rect.height = HEIGHT;

        tf.bulletList.add(this);
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

    public void paint(Graphics g) {
        if (!living) {
            tf.bulletList.remove(this);
        }
//        Color color = g.getColor();
//        g.setColor(Color.red);
//        g.fillOval(x, y, WIDTH, HEIGHT);
//        g.setColor(color);
//        switch (dir) {
//            case LIFT:
//                g.drawImage(ResourceMgr.bulletl, x, y, null);
//                break;
//            case UP:
//                g.drawImage(ResourceMgr.bulletu, x, y, null);
//                break;
//
//            case RIGHT:
//                g.drawImage(ResourceMgr.bulletr, x, y, null);
//                break;
//            case DOWN:
//                g.drawImage(ResourceMgr.bulletd, x, y, null);
//                break;
//        }
        Color color = g.getColor();
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, 20, 20);
        g.setColor(color);

        move();

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


    public void collideWith(BaseTank tank) {

        if (this.group == tank.getGroup()) return;
//        Rectangle rect1 = new Rectangle(this.x, this.y, WIDTH, HEIGHT);
//        Rectangle rect2 = new Rectangle(tank.getX(), tank.getY(), tank.WIDTH, tank.HEIGHT);
        if (rect.intersects(tank.rect)) {
            tank.die();
            this.die();
            int ex = tank.getX() + Tank.WIDTH / 2 - Explode.WIDTH;
            int ey = tank.getY() + Tank.HEIGHT / 2 - Explode.HEIGHT / 2;


            tf.explodes.add(tf.gf.createExplode(ex, ey, tf));
        }
    }

    public boolean isLiving() {
        return living;
    }

    public void setLiving(boolean living) {
        this.living = living;
    }

    private void die() {
        this.living = false;
    }
}
