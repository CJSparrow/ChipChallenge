/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.staticObs.wall;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class NormalWall extends Wall{

    public NormalWall(int locationX, int locationY) {
        super(locationX, locationY);
        URL imgWallURL = getClass().getClassLoader().getResource("images/wall.png");
        if (imgWallURL == null) {
            System.err.println("Couldn't find file: " + "images/wall.png");
        } else {
            try {
                img = ImageIO.read(imgWallURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }


     @Override
    public boolean isVisible() {
        return true;
    }

    @Override
    public boolean passAllow() {
        return false;
    }

    @Override
    public boolean killAllow() {
        return false;
    }

    @Override
    public boolean pushAllow() {
        return false;
    }
}
