package chipchallenge.engine.obstacle.dynamicObs;

import chipchallenge.engine.obstacle.staticObs.Obstacle;

/**
 *
 * @author TampanCrew
 */
public class DynamicObstacle extends Obstacle{

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
