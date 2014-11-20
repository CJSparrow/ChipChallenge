/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.floorObs.shiftFloor;

import chipchallenge.engine.obstacle.floorObs.Floor;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author
 */
public class FinishFloor extends Floor{

    public FinishFloor(int locationX, int locationY) {
        super(locationX, locationY);
        URL imgFinishFloorURL = getClass().getClassLoader().getResource("images/finishFloor.png");
        if (imgFinishFloorURL == null) {
            System.err.println("Couldn't find file: " + "images/finishFloor.png");
        } else {
            try {
                img = ImageIO.read(imgFinishFloorURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    
    @Override
    public boolean isFinish()
    {
        return true;
    }
}
