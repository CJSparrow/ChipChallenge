/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.floorObs.dangerousFloor;

import chipchallenge.engine.obstacle.floorObs.Floor;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class WaterFloor extends Floor {

    public WaterFloor(int locationX, int locationY, String lokasiImg) {
        super(locationX, locationY, lokasiImg);
    }

    @Override
    public boolean killAllow() {
        return true;
    }
}
