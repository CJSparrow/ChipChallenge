package chipchallenge.engine.obstacle.staticObs;

import chipchallenge.engine.obstacle.Obstacle;

/**
 *
 * @author TampanCrew
 */
public class StaticObstacle extends Obstacle{

    public StaticObstacle(int locationX, int locationY, String lokasiImg) {
        super(locationX, locationY);
    }

    public void setVisible() {
        
    }

    @Override
    public boolean passAllow() {
        return true;
    }

    @Override
    public boolean killAllow() {
        return true;
    }

    @Override
    public boolean pushAllow() {
        return false;
    }

    @Override
    public boolean isVisible() {
        return true;
    }
    
}
