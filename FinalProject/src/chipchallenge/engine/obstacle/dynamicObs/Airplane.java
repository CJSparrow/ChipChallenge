/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.dynamicObs;

import chipchallenge.engine.obstacle.Obstacle;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class Airplane extends Obstacle{

    public Airplane(int locationX, int locationY) {
        super(locationX, locationY);
        URL imgAirplaneURL = getClass().getClassLoader().getResource("images/obs.png");
        if (imgAirplaneURL == null) {
            System.err.println("Couldn't find file: " + "images/obs.png");
        } else {
            try {
                img = ImageIO.read(imgAirplaneURL);
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
        return true;
    }

    @Override
    public boolean pushAllow() {
        return false;
    }
}
