/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.staticObs.wall;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class InvisibleWall extends Wall{

    public InvisibleWall(int locationX, int locationY, String lokasiImg) {
        super(locationX, locationY, lokasiImg);
    }
     @Override
    public boolean isVisible() {
        return false;
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
        return false;
    }
}
