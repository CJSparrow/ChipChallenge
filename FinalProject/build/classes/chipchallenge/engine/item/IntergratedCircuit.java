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
 * class ini merepresentasikan IC yang ada di stage, jika semua IC telah diambil oleh chip maka chip dapat membuka barrier
 * @author TampanCrew
 */
public class IntergratedCircuit extends Item{
    /**
     * constructor dari IntergratedCircuit
     * @param locationX : posisi x dimana IC berada
     * @param locationY : posisi y dimana IC berada
     */
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
    
    /**
     * method yang menandakan apakah item ini bisa diambil atau tidak
     * @return true : jika dapat diambil
     * false : jika tidak dapat diambil
     */
    @Override
    public boolean canBeObtained() {
        return false;
    }
    
}
