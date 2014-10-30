/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.floorObs.shiftFloor;

import chipchallenge.engine.obstacle.floorObs.Floor;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class TeleportFloor extends Floor{

    public TeleportFloor(int locationX, int locationY, String lokasiImg) {
        super(locationX, locationY, lokasiImg);
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
