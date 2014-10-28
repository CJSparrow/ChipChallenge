package chipchallenge.engine.obstacle.floorObs;

import chipchallenge.engine.obstacle.Obstacle;

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

    @Override
    public boolean pushAllow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
