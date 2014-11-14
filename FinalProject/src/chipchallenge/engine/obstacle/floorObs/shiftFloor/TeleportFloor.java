/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.floorObs.shiftFloor;

import chipchallenge.engine.obstacle.floorObs.Floor;
import java.awt.Image;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class TeleportFloor extends Floor{

    public TeleportFloor(int locationX, int locationY) {
        super(locationX, locationY);
    }


    
    public int getXNext(TeleportFloor next)
    {
        return next.getX();
    }
    public int getYNext(TeleportFloor next)
    {
        return next.getY();
    }
    
}
