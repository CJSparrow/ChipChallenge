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
 * class ini merepresentasikan sepatu renangdimana pada saat chip mengambil item ini akan bisa berenang
 * (mampu berjalan di atas air)
 * @author TampanCrew
 */
public class WaterShoes extends Item{
    /**
     * constructor untuk class water shoes
     * @param locationX : posisi x untuk water shoes
     * @param locationY : posisi y untuk water shoes
     */
    public WaterShoes(int locationX, int locationY) {
        super(locationX, locationY);
        URL imgChipURL = getClass().getClassLoader().getResource("images/waterShoes.png");
        if (imgChipURL == null) {
            System.err.println("Couldn't find file: " + "images/chipDown.png");
        } else {
            try {
                img = ImageIO.read(imgChipURL);
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
        return true;
    }
}
