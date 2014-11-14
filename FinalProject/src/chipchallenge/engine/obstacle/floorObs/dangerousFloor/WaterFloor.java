/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.floorObs.dangerousFloor;

import chipchallenge.engine.obstacle.floorObs.Floor;
import java.awt.Image;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class WaterFloor extends Floor {

    public WaterFloor(int locationX, int locationY) {
        super(locationX, locationY);
    }




    @Override
    public boolean killAllow() {
        return true;
    }
}
