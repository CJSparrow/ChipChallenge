/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.staticObs.wall;

import chipchallenge.engine.obstacle.floorObs.triggerFloor.ColouringWallFloor;
import java.awt.Image;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class ColouringWall extends Wall{
    private ColouringWallFloor theTrigger;

    public ColouringWall(int locationX, int locationY, ColouringWallFloor trigger) {
        super(locationX, locationY);
        theTrigger=trigger;
    }

    
     @Override
    public boolean isVisible() {
        return true;
    }

    @Override
    public boolean passAllow() {
        if(theTrigger.isClicked())
        {
            return true;
        }
        else
        {
            return false;
        }
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
