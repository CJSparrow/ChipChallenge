package chipchallenge.engine.obstacle.staticObs;

/**
 *
 * @author TampanCrew
 */
public abstract class Obstacle {
    public Obstacle()
    {
        
    }
    public abstract boolean setVisible();
    public abstract boolean passAllow();
    public abstract boolean killAllow();
}
