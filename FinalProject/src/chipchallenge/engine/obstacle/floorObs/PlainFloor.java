/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.floorObs;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class PlainFloor extends Floor{

    public PlainFloor(int locationX, int locationY) {
        super(locationX, locationY);
        URL imgFloorURL = getClass().getClassLoader().getResource("images/plainFloor.png");
        if (imgFloorURL == null) {
            System.err.println("Couldn't find file: " + "images/plainFloor.png");
        } else {
            try {
                img = ImageIO.read(imgFloorURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    
}
