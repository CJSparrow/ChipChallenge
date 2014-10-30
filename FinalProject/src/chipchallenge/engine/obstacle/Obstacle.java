package chipchallenge.engine.obstacle;

/**
 *
 * @author TampanCrew
 */
public abstract class Obstacle {
    private int x;
    private int y;
    private String imgLocation;
    public Obstacle(int locationX, int locationY, String lokasiImg)
    {
        this.x = locationX;
        this.y = locationY;
        imgLocation = lokasiImg;
    }
    public abstract boolean isVisible();
    public abstract boolean passAllow();
    public abstract boolean killAllow();
    public abstract boolean pushAllow();
    public String getImgLocation()
    {
        return imgLocation;
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
