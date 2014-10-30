package chipchallenge.engine.obstacle.dynamicObs;

import chipchallenge.engine.obstacle.Obstacle;

/**
 *
 * @author TampanCrew
 */
public class DynamicObstacle extends Obstacle{

    public DynamicObstacle(int locationX, int locationY, String lokasiImg) {
        super(locationX, locationY, lokasiImg);
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
        return true;
    }

    @Override
    public boolean isVisible() {
        return true;
    }
    
}
