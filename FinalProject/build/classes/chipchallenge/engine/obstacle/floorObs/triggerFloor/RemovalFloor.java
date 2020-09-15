/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.floorObs.triggerFloor;

import chipchallenge.engine.Chip;
import chipchallenge.engine.item.Item;
import chipchallenge.engine.obstacle.floorObs.Floor;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class RemovalFloor extends Floor {

    public RemovalFloor(int locationX, int locationY) {
        super(locationX, locationY);
        URL imgRemovalURL = getClass().getClassLoader().getResource("images/removalFloor.png");
        if (imgRemovalURL == null) {
            System.err.println("Couldn't find file: " + "images/removalFloor.png");
        } else {
            try {
                img = ImageIO.read(imgRemovalURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
