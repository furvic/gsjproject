package com.gsj.tank.abstractFactory;

import com.gsj.tank.ResourceMgr;
import com.gsj.tank.TankFrame;

import java.awt.*;

public class RectExplode extends BaseExplode {

    public static int WIDTH = ResourceMgr.explode[0].getWidth();
    public static int HEIGHT = ResourceMgr.explode[0].getHeight();

    private boolean living = true;
    private int x, y;

    TankFrame tf = new TankFrame();

    private int step = 0;

    public RectExplode(int x, int y, TankFrame tf) {
        this.x = x;
        this.y = y;

        this.tf = tf;

//        new Audio("audio/explode.wav").start();
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


    @Override
    public void paint(Graphics g) {
//        g.drawImage(ResourceMgr.explode[step + 1], x, y, null);

        Color color = g.getColor();
        g.setColor(Color.RED);
        g.fillRect(x, y, 10 * step, 10 * step);

        step++;
        if (step >= 5) {
            tf.explodes.remove(this);
            g.setColor(color);
        }

//        if (step >= ResourceMgr.explode.length) {
////            step = 0;
//            tf.explodes.remove(this);
//        }

    }

}
