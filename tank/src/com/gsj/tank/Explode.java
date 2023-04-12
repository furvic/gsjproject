package com.gsj.tank;

import com.gsj.tank.abstractFactory.BaseExplode;

import java.awt.*;

public class Explode extends GameObject {


    public static int WIDTH = ResourceMgr.explode[0].getWidth();
    public static int HEIGHT = ResourceMgr.explode[0].getHeight();

    private boolean living = true;
//    private int x, y;

//    TankFrame tf = new TankFrame();
//    public GameModel gm = new GameModel();


    private int step = 0;

    public Explode(int x, int y) {
        this.x = x;
        this.y = y;

//        this.gm = gm;
new Thread(()->new Audio("audio/explode.wav").play()).start();

        GameModel.getInstance().add(this);
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
        g.drawImage(ResourceMgr.explode[step + 1], x, y, null);
        if (step >= ResourceMgr.explode.length) {
//            step = 0;
            GameModel.getInstance().remove(this);
        }

    }

    @Override
    public int getWidth() {
        return WIDTH;
    }

    @Override
    public int getHeight() {
        return HEIGHT;
    }


}
