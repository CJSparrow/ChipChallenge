/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.staticObs.wall;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * class ini merepresentasikan normal wall yang hanya mempunyai fungsi untuk menghalangi chip saja
 * @author Jonathan Surya Laksa
 */
public class NormalWall extends Wall{
    
    /**
     * constructor dari class Normal wall
     * @param locationX : posisi x normal wall
     * @param locationY : posisi y normal wall
     */
    public NormalWall(int locationX, int locationY) {
        super(locationX, locationY);
        URL imgWallURL = getClass().getClassLoader().getResource("images/wall.png");
        if (imgWallURL == null) {
            System.err.println("Couldn't find file: " + "images/wall.png");
        } else {
            try {
                img = ImageIO.read(imgWallURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * menandakan apakah wall nya ada / tidak
     * @return true jika ada wall
     * false jika tidak ada wall
     */
     @Override
    public boolean isVisible() {
        return true;
    }
    /**
     * menandakan apakah wall bisa dilewati / tidak
     * @return true jika bisa dilewati
     * false jika tidak bisa dilewati
     */
    @Override
    public boolean passAllow() {
        return false;
    }
    /**
     * menandakan apakah wall mematikan / tidak
     * @return true jika mematikan
     * false jika aman
     */
    @Override
    public boolean killAllow() {
        return false;
    }
    /**
     * menandakan apakah wall bisa didorong / tidak
     * @return true jika bisa didorong
     * false jika tidak bisa didorong
     */
    @Override
    public boolean pushAllow() {
        return false;
    }
}
