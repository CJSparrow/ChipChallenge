package chipchallenge.engine.obstacle.floorObs;

import chipchallenge.engine.obstacle.Obstacle;

/**
 *
 * @author TampanCrew
 */
public class Floor extends Obstacle {

    public Floor(int locationX, int locationY, String lokasiImg) {
        super(locationX, locationY, lokasiImg);
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
    
    public boolean isFinish()
    {
        return false;
    }
}
