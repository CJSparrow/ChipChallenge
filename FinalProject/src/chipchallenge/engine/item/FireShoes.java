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
 * class yang merepresentasikan sepatu tahan api, chip yang memakai ini akan mampu untuk berjalan di atas api
 * @author TampanCrew
 */
public class FireShoes extends Item{
    /**
     * constructor dari fire shoes
     * @param locationX : posisi fire shoes di titik x
     * @param locationY : posisi fire shoes di titik y
     */
    public FireShoes(int locationX, int locationY) {
        super(locationX, locationY);
        URL imgChipURL = getClass().getClassLoader().getResource("images/fireShoes.png");
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
     * method untuk menandakan apakah item ini bisa diambil atau tidak oleh chip
     * @return true : jika bisa diambil
     * false : jika tidak bisa diambil
     */
    @Override
    public boolean canBeObtained() {
        return true;
    }
    
}
