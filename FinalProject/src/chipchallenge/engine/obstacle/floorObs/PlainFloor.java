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
 * class yang merepresentasikan floor biasa
 * @author TampanCrew
 */
public class PlainFloor extends Floor{
    /**
     * constructor dari class plain floor
     * @param locationX : posisi x plain floor nya
     * @param locationY : posisi y plain floor nya
     */
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
