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
public class DangerousWall extends Wall{

    private Obstacle dynamicKillerObstacle;

    public DangerousWall(int locationX, int locationY, Obstacle killerObstacle) {
        super(locationX, locationY);
        dynamicKillerObstacle=killerObstacle;
    }

    public Obstacle getKiller()
    {
        return dynamicKillerObstacle;
    }
}
