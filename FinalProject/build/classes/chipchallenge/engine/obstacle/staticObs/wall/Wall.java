/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.staticObs.wall;

import chipchallenge.engine.obstacle.Obstacle;
import java.awt.Image;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class Wall extends Obstacle{

    public Wall(int locationX, int locationY) {
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
        return false;
    }

    @Override
    public boolean isFinish() {
        return false;
    }
    
}
