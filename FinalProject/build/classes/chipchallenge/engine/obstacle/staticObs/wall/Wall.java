/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.staticObs.wall;

import chipchallenge.engine.obstacle.Obstacle;
import java.awt.Image;

/**
 * class ini merepresentasikan wall yang mengahalangi chip, tidak bisa ditembus
 * @author TampanCrew
 */
public class Wall extends Obstacle{
    /**
     * contructor dari class wall
     * @param locationX : posisi x wall
     * @param locationY : posisi y wall
     */
    public Wall(int locationX, int locationY) {
        super(locationX, locationY);
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
    
    /**
     * menandakan apakah saat menyentuh wall ini chip bisa finish / tidak
     * @return true jika bisa finish
     * false jika tidak bisa
     */
    @Override
    public boolean isFinish() {
        return false;
    }
    
}
