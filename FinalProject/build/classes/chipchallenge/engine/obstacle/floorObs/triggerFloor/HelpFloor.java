/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.floorObs.triggerFloor;

import chipchallenge.engine.obstacle.floorObs.Floor;
import java.awt.Image;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class HelpFloor extends Floor{

    public HelpFloor(int locationX, int locationY) {
        super(locationX, locationY);
    }


    
    public String helpTrigger(String textHelp)
    {
        return textHelp;
    }
}
