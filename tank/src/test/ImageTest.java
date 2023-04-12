package test;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class ImageTest {

    @Test
    void test() {
        BufferedImage read = null;
        try {
            read = ImageIO.read(new File("D:/workspace/马士兵老师_坦克大战_java基础(一期)/tank/src/images/bulletD.gif"));
            assertNotNull(read);
            BufferedImage images = ImageIO.read(ImageTest.class.getClassLoader().getResourceAsStream("image/bulletD.gif"));
            assertNotNull(images);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
