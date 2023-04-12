package com.gsj.tank.abstractFactory;

import com.gsj.tank.*;
import com.gsj.tank.strategy.FireStrategy;

import java.awt.*;
import java.util.Random;

public class RectTank extends BaseTank {

//    public Rectangle rect = new Rectangle();
    public int x, y;
    public Dir dir = Dir.DOWN;
    private static final int SPEED = 1;
    private boolean living = true;

    private boolean moving = true;

    private Random random = new Random();

    public static int WIDTH = ResourceMgr.goodTanku.getWidth();
    public static int HEIGHT = ResourceMgr.goodTanku.getHeight();

    public TankFrame tf = new TankFrame();

//    public Group group = Group.BAD;

    FireStrategy fs;

    public RectTank(int x, int y, Dir dir, Group group, TankFrame tf) {
        super();
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;
        this.group = group;

        rect.x = this.x;
        rect.y = this.y;
        rect.width = WIDTH;
        rect.height = HEIGHT;

        if (group == Group.GOOD) {
            String goodFSName = (String) PropertyMgr.get("goodFS");
//            fs = PropertyMgr.get("goodFS");
            try {
                fs = (FireStrategy) Class.forName(goodFSName).getDeclaredConstructor(Void.class).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            String badFSName = (String) PropertyMgr.get("badFS");
//            fs = PropertyMgr.get("goodFS");
            try {
                fs = (FireStrategy) Class.forName(badFSName).getDeclaredConstructor(Void.class).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//            fs = new DefaultFireStrategy();

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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
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
//        Color c = g.getColor();
//        g.setColor(Color.YELLOW);
//        g.fillRect(x, y, 50, 50);
//        g.setColor(c);
//        x += 10;
        //y+=10;


        if (!living) tf.tanks.remove(this);
//        switch (dir) {
//            case LIFT:
//                g.drawImage(this.group == Group.GOOD ? ResourceMgr.goodTankl : ResourceMgr.badTankl, x, y, null);
//                break;
//            case UP:
//                g.drawImage(this.group == Group.GOOD ? ResourceMgr.goodTanku : ResourceMgr.badTanku, x, y, null);
//                break;
//
//            case RIGHT:
//                g.drawImage(this.group == Group.GOOD ? ResourceMgr.goodTankr : ResourceMgr.badTankr, x, y, null);
//                break;
//            case DOWN:
//                g.drawImage(this.group == Group.GOOD ? ResourceMgr.goodTankd : ResourceMgr.badTankd, x, y, null);
//                break;
//        }

        Color color = g.getColor();
        g.setColor(group == Group.GOOD ? Color.RED : Color.BLUE);
        g.fillRect(x, y, 40, 40);
        g.setColor(color);

        move();

    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    private void move() {
        if (moving) return;
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
            default:
                break;
//        randomDir();
        }
        if (this.group == Group.BAD && random.nextInt(100) > 95) this.fire();

        if (this.group == Group.BAD && random.nextInt(100) > 95)
            randomDir();

        boundsCheck();

        rect.x = this.x;
        rect.y = this.y;

    }

    private void boundsCheck() {

        if (this.x < 2) x = 2;
        else if (this.y < 30) y = 30;
        else if (this.x > TankFrame.GAME_WIDTH - RectTank.WIDTH) x = TankFrame.GAME_WIDTH - RectTank.WIDTH - 2;
        else if (this.y > TankFrame.GAME_HEIGHT - RectTank.HEIGHT) y = TankFrame.GAME_HEIGHT - RectTank.HEIGHT - 2;
    }


    private void randomDir() {
        this.dir = Dir.values()[random.nextInt(4)];
    }

    public void fire() {

//        int bx = this.x + Tank.WIDTH / 2 - Bullet.WIDTH;
//        int by = this.y + Tank.HEIGHT / 2 + Bullet.HEIGHT / 2;
//
//        tf.bulletList.add(new Bullet(bx, by, this.dir, this.group, this.tf));
//        if (this.group == Group.GOOD) new Thread(() -> new Audio("audio/tank_fire.wav").play()).start();
//        fs.fire(this);
        int bx = this.x + Tank.WIDTH / 2 - Bullet.WIDTH;
        int by = this.y + Tank.HEIGHT / 2 + Bullet.HEIGHT / 2;

        Dir[] dirs = Dir.values();
        for (Dir dir : dirs) {
            tf.gf.createBullet(bx, by, dir, group, tf);

        }

        if (group == Group.GOOD) new Thread(() -> new Audio("audio/tank_fire.wav").play()).start();
    }

    public boolean isLiving() {
        return living;
    }

    public void setLiving(boolean living) {
        this.living = living;
    }

    public void die() {
        this.living = false;
    }
}
