/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.floorObs.triggerFloor;

import chipchallenge.engine.obstacle.floorObs.Floor;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class ColouringWallFloor extends Floor{

    private boolean clicked;
    public ColouringWallFloor(int locationX, int locationY, String lokasiImg) {
        super(locationX, locationY, lokasiImg);
        clicked=false;
    }
    public boolean isClicked()
    {
        return clicked;
    }
    public void turnClicked()
    {
        if(clicked=false)
        {
            clicked=true;
        }
        else
        {
            clicked=false;
        }
    }
            
}
