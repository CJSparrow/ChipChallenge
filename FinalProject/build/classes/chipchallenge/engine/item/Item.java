package chipchallenge.engine.item;

import java.awt.Image;

/**
 *
 * @author TampanCrew
 */
public abstract class Item {
    private boolean isVisible;
    private String imgLocation;
    private int x;
    private int y;
    protected Image img;
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
    public Image getImg()
    {
        return img;
    }
    public boolean isChip()
    {
        return false;
    }
}
