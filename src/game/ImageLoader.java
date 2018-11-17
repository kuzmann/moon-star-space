package game;


import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

    static Image moon, star;

    public ImageLoader() {
        try {
            moon = ImageIO.read(new File("res/moon.png"));
            star = ImageIO.read(new File("res/star.png"));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

}
