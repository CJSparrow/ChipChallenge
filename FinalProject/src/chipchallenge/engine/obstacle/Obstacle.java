package chipchallenge.engine.obstacle;

import java.awt.Image;

/**
 *
 * @author TampanCrew
 */
public abstract class Obstacle {
    private int x;
    private int y;
    protected Image img;
    public Obstacle(int locationX, int locationY)
    {
        this.x = locationX;
        this.y = locationY;
    }
    public abstract boolean isVisible();
    public abstract boolean passAllow();
    public abstract boolean killAllow();
    public boolean isFinish()
    {
        return false;
    }
    public abstract boolean pushAllow();
    public Image getImg()
    {
        return img;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
}
