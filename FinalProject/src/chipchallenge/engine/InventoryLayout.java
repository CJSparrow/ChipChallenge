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
 * class ini untuk menampilkan panel item yang berada di sebelah kanan board
 * @author TampanCrew
 */
public class InventoryLayout {
    /**
     * atribut objek image
     */
    private Image img;
    
    /**
     * constructor dari class inventory layout
     */
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
    
    /**
     * method untuk menampilkan atau mengembalikan objek image dari panel inventory
     * @return objek image untuk panel inventory
     */
    public Image getImg()
    {
        return img;
    }
}
