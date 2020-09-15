/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.staticObs;

import chipchallenge.engine.Chip;
import chipchallenge.engine.obstacle.Obstacle;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * class ini merepresentasikan barrier yang menghalangi jalan, dapat dibuka jika semua IC dalam stage tersebutsudah diambil
 * @author tampanCrew
 */
public class Barrier extends Obstacle{
    /**
     * atribut untuk menyimpan objek chip
     */
    private Chip identifyChip;
    /**
     * true : barrier menjadi tidak ada
     * false : barrier tetap ada
     */
    private boolean erase;
    
    /**
     * constructor dari class Barrier
     * @param locationX : posisi x dari barrier
     * @param locationY : posisi y dari barrier
     * @param newChip : objek baru chip
     */
    public Barrier(int locationX, int locationY, Chip newChip) {
        super(locationX, locationY);
        URL imgBarrierURL = getClass().getClassLoader().getResource("images/barrier.png");
        if (imgBarrierURL == null) {
            System.err.println("Couldn't find file: " + "images/barrier.png");
        } else {
            try {
                img = ImageIO.read(imgBarrierURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        identifyChip = newChip;
        erase = false;
    }

    /**
     * untuk menandakan apakah barrier masih ada / tidak
     * @return true : jika masih ada
     * false : jika sudah tidak ada
     */
    @Override
    public boolean isVisible() {
        if(identifyChip.getChipRemain()==0&&identifyChip.getX()==this.getX()&&identifyChip.getY()==this.getY()||erase)
        {
            erase=true;
            return false;
        }
        else
        {
            return true;
        }
    }
    
    /**
     * untuk menandakan apakah barrier bisa dilewati atau tidak
     * @return true : bisa dilewati
     * false : tidak bisa dilewati
     */
    @Override
    public boolean passAllow() {
        if(identifyChip.getChipRemain()==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * menandakan apakah barrier mematikan / tidak
     * @return true jika mematikan
     * false jika aman
     */
    @Override
    public boolean killAllow() {
        return false;
    }
    
    /**
     * menandakan apakah barrier bisa didorong atau tidak
     * @return true jika bisa didorong
     * false jika tidak bisa didorong
     */
    @Override
    public boolean pushAllow() {
        return false;
    }
    
    /**
     * menandakan apakah chip sudah sampai ke finish jika menyentuh barrier
     * @return true jika sudah finish
     * false jika belum
     */
    @Override
    public boolean isFinish() {
        return false;
    }
    
}
