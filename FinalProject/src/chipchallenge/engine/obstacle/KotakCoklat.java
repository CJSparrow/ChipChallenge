/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle;

import java.awt.Image;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class KotakCoklat extends Obstacle{

    public KotakCoklat(int locationX, int locationY) {
        super(locationX, locationY);
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

    @Override
    public boolean isFinish() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
