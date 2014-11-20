/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.item;

import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class IntergratedCircuit extends Item{

    public IntergratedCircuit(int locationX, int locationY) {
        super(locationX, locationY);
        URL imgICURL = getClass().getClassLoader().getResource("images/IC.png");
        if (imgICURL == null) {
            System.err.println("Couldn't find file: " + "images/IC.png");
        } else {
            try {
                img = ImageIO.read(imgICURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        this.setVisible(true);
        
    }

    @Override
    public boolean canBeObtained() {
        return false;
    }
    
}
