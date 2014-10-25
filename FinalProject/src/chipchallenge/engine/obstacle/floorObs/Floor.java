package chipchallenge.engine.obstacle.floorObs;

import chipchallenge.engine.obstacle.staticObs.Obstacle;

/**
 *
 * @author TampanCrew
 */
public class Floor extends Obstacle {

    @Override
    public boolean setVisible() {
        return true;
    }

    @Override
    public boolean passAllow() {
        return true;
    }

    @Override
    public boolean killAllow() {
        return true;
    }
    
}
