package com.gsj.tank;

import com.gsj.tank.abstractFactory.*;
import com.gsj.tank.cor.BulletTankCollider;
import com.gsj.tank.cor.Collider;
import com.gsj.tank.cor.ColliderChain;
import com.gsj.tank.cor.TankTankCollider;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GameModel {

    private static final GameModel INSTANCE = new GameModel();

    static {
        INSTANCE.init();
    }

    Tank tank;
//    public ArrayList<Bullet> bulletList = new ArrayList<>();
//    public ArrayList<Tank> tanks = new ArrayList<>();
//    public ArrayList<Explode> explodes = new ArrayList<>();

    Collider collider = new BulletTankCollider();
    Collider collider2 = new TankTankCollider();
    ColliderChain chain = new ColliderChain();
    public GameFactory gf = new RectFactory();

    private List<GameObject> objects = new ArrayList<>();

    public static GameModel getInstance() {
        return INSTANCE;
    }

    private GameModel() {

    }

    private void init() {
        tank = new Tank(200, 400, Dir.DOWN, Group.BAD);
        int initTankCount = Integer.parseInt((String) PropertyMgr.get("initTankCount"));

        for (int i = 0; i < initTankCount; i++) {
            new Tank(50 + i * 80, 200, Dir.DOWN, Group.BAD);
        }
        add(new Wail(150, 150, 200, 50));
        add(new Wail(550, 150, 200, 50));
        add(new Wail(300, 300, 50, 200));
        add(new Wail(550, 300, 50, 200));
    }

    public void add(GameObject go) {
        this.objects.add(go);
    }

    public void remove(GameObject go) {
        this.objects.remove(go);
    }

    public void paint(Graphics g) {

        Color c = g.getColor();
        g.setColor(Color.WHITE);
//        g.drawString("子弹的数量：" + bulletList.size(), 10, 69);
//        g.drawString("敌人的数量：" + tanks.size(), 10, 80);
//        g.drawString("爆炸的数量：" + explodes.size(), 10, 100);
        g.setColor(c);
//        tank.paint(g);
//        System.out.println("paint");
//        System.out.println("bullet");
        for (int i = 0; i < objects.size(); i++) {
            objects.get(i).paint((Graphics) g);
        }

        for (int i = 0; i < objects.size(); i++) {
            for (int j = i + 1; j < objects.size(); j++) {
                GameObject o1 = objects.get(i);
                GameObject o2 = objects.get(j);
//                o1.collideWith(o2);
//                collider.collide(o1, o2);
//                collider2.collide(o1, o2);
                chain.collide(o1, o2);

            }
        }
//        for (int i = 0; i < tanks.size(); i++) {
//            tanks.get(i).paint(g);
//        }
//        for (int i = 0; i < explodes.size(); i++) {
//            explodes.get(i).paint(g);
//        }

//        for (int i = 0; i < bulletList.size(); i++) {
//            for (int j = 0; j < tanks.size(); j++) {
//
//                bulletList.get(i).collideWith(tanks.get(j));
//            }
//        }
//        e.paint(g);


//        for (Iterator<Bullet> it = bulletList.iterator(); it.hasNext(); ) {
//            Bullet b = it.next();
//            if (!b.live) it.remove();
//        }
//        for (Bullet bullet : bulletList) {
//
//            bullet.paint(g);
//        }


    }

    public Tank getMaintank() {
        return tank;
    }

    public void save() {
        File file = new File("c:/gsj/tank.data");
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(tank);
            oos.writeObject(objects);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {

                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public void load() {
        File file = new File("c:/gsj/tank.data");
        ObjectInputStream oos = null;
        try {
            oos = new ObjectInputStream(new FileInputStream(file));
            tank = (Tank) oos.readObject();
            objects = (List<GameObject>) oos.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
