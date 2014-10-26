package chipchallenge.engine.obstacle;

import chipchallenge.engine.obstacle.staticObs.Obstacle;

/**
 *
 * @author TampanCrew
 */
public class StaticObstacle extends Obstacle{

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
