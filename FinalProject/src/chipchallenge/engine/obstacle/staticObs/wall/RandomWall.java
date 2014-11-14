/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.staticObs.wall;

import java.awt.Image;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class RandomWall extends Wall{

    private boolean pushed;
    private Wall nextWall;

    public RandomWall(int locationX, int locationY, Wall randomWall) {
        super(locationX, locationY);
        pushed = false;
        nextWall = randomWall;
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
        return false;
    }
    
    public void pushed()
    {
        pushed = true;
    }
    
    public boolean getPushed()
    {
        return pushed;
    }
}
