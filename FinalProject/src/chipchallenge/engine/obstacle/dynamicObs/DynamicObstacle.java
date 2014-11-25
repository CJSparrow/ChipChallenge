package chipchallenge.engine.obstacle.dynamicObs;

import chipchallenge.engine.obstacle.Obstacle;

/**
 *
 * @author TampanCrew
 */
public class DynamicObstacle extends Obstacle{

    public DynamicObstacle(int locationX, int locationY) {
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
        return true;
    }

    @Override
    public boolean isVisible() {
        return true;
    }
    public void setPosition(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
}
