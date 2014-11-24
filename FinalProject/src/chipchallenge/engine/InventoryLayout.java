/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class InventoryLayout {
    private Image img;
    public InventoryLayout()
    {
        
    URL imgLayoutURL = getClass().getClassLoader().getResource("images/inventoryLayout.png");
        if (imgLayoutURL == null) {
            System.err.println("Couldn't find file: " + "images/inventoryLayout.png");
        } else {
            try {
                img = ImageIO.read(imgLayoutURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public Image getImg()
    {
        return img;
    }
}
