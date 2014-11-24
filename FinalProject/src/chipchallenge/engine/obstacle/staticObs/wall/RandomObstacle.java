/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.staticObs.wall;

import chipchallenge.engine.Chip;
import chipchallenge.engine.obstacle.Obstacle;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class RandomObstacle extends Obstacle{
    private Chip identifyChip;
    private boolean pushed;
    private Obstacle nextObstacle;

    public RandomObstacle(int locationX, int locationY, Obstacle nextObs, Chip newChip) {
        super(locationX, locationY);
        URL imgRandomWallURL = getClass().getClassLoader().getResource("images/randomWall.png");
        if (imgRandomWallURL == null) {
            System.err.println("Couldn't find file: " + "images/randomWall.png");
        } else {
            try {
                img = ImageIO.read(imgRandomWallURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        identifyChip = newChip;
        pushed = false;
        nextObstacle = nextObs;
    }

     @Override
    public boolean isVisible() {
        return nextObstacle.isVisible();
    }

    @Override
    public boolean passAllow() {
        img=nextObstacle.getImg();
        return nextObstacle.passAllow();
    }

    @Override
    public boolean killAllow() {
        return false;
    }

    @Override
    public boolean pushAllow() {
        pushed = true;
        return pushed;
    }
}
