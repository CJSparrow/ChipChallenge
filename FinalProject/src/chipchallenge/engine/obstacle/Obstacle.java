package chipchallenge.engine.obstacle;

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
    public abstract boolean pushAllow();
}
