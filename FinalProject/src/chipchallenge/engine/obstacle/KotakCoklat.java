/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class KotakCoklat extends Obstacle{

    public KotakCoklat(int locationX, int locationY, String lokasiImg) {
        super(locationX, locationY, lokasiImg);
    }


    @Override
    public boolean isVisible() {
        return true;
    }

    @Override
    public boolean passAllow() {
        return false;
    }

    @Override
    public boolean killAllow() {
        return false;
    }

    @Override
    public boolean pushAllow() {
        return true;
    }
    
}
