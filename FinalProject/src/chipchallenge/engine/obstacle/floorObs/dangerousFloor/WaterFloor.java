/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.floorObs.dangerousFloor;

import chipchallenge.engine.obstacle.floorObs.Floor;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class WaterFloor extends Floor {

    public WaterFloor(int locationX, int locationY) {
        super(locationX, locationY);
        URL imgWaterFloorURL = getClass().getClassLoader().getResource("images/waterFloor.png");
        if (imgWaterFloorURL == null) {
            System.err.println("Couldn't find file: " + "images/waterFloor.png");
        } else {
            try {
                img = ImageIO.read(imgWaterFloorURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }




    @Override
    public boolean killAllow() {
        return true;
    }
}
