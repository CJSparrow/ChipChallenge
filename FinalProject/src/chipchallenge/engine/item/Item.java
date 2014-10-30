package chipchallenge.engine.item;

/**
 *
 * @author TampanCrew
 */
public abstract class Item {
    private boolean isVisible;
    private String imgLocation;
    private int x;
    private int y;
    public Item(int locationX, int locationY)
    {
        this.x=locationX;
        this.y=locationY;
    }
    public abstract boolean canBeObtained();
    public void setVisible(boolean visible)
    {
        isVisible=visible;
    }
    public void setImageFileName(String lokasiImg)
    {
        imgLocation=lokasiImg;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public boolean getVisible()
    {
        return isVisible;
    }
    public String getImgLocation()
    {
        return imgLocation;
    }
}
