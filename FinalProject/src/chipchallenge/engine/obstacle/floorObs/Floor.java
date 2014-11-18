package chipchallenge.engine.obstacle.floorObs;

import chipchallenge.engine.obstacle.Obstacle;
import java.awt.Image;

/**
 *
 * @author TampanCrew
 */
public class Floor extends Obstacle {

    public Floor(int locationX, int locationY) {
        super(locationX, locationY);
    }


    @Override
    public boolean isVisible() {
        return true;
    }

    @Override
    public boolean passAllow() {
        return true;
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
    public boolean isFinish()
    {
        return false;
    }
}
