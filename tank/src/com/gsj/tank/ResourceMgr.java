package com.gsj.tank;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ResourceMgr {

    public static BufferedImage goodTankl, goodTanku, goodTankr, goodTankd;
    public static BufferedImage badTankl, badTanku, badTankr, badTankd;
    public static BufferedImage bulletl, bulletu, bulletr, bulletd;

    public static BufferedImage[] explode = new BufferedImage[16];

    static {
        try {
            goodTanku = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("image/BadTank1.png"));
            goodTankl = ImageUtil.rotateImage(goodTanku, -90);
            goodTankr = ImageUtil.rotateImage(goodTanku, 90);
            goodTankd = ImageUtil.rotateImage(goodTanku, 180);

            badTanku = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("image/BadTank1.png"));
            badTankl = ImageUtil.rotateImage(badTanku, -90);
            badTankr = ImageUtil.rotateImage(badTanku, 90);
            badTankd = ImageUtil.rotateImage(badTanku, 180);

            bulletu = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("image/bulletU.png"));
            bulletl = ImageUtil.rotateImage(bulletu, -90);
            bulletr = ImageUtil.rotateImage(bulletu, 90);
            bulletd = ImageUtil.rotateImage(bulletu, 180);

            for (int i = 0; i < 16; i++) {
                explode[i] = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/e" + (i + 1) + ".gif"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
