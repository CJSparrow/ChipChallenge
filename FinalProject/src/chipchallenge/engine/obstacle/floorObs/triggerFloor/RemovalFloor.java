/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.floorObs.triggerFloor;

import chipchallenge.engine.Chip;
import chipchallenge.engine.item.Item;
import chipchallenge.engine.obstacle.floorObs.Floor;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class RemovalFloor extends Floor{

    private Chip identifyChip;
    public RemovalFloor(int locationX, int locationY, String lokasiImg, Chip newChip) {
        super(locationX, locationY, lokasiImg);
        identifyChip=newChip;
    }
    public void clearInventory(Item typeItem)
    {
        Item[] inv = identifyChip.getInventory();
        for(int i = 0 ; i<inv.length;i++)
        {
            if(inv[i].getClass()==typeItem.getClass())
            {
                inv[i]=null;
            }
        }
    }
}
