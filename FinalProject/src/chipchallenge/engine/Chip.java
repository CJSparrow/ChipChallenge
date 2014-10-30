package chipchallenge.engine;

import chipchallenge.engine.item.Item;

/**
 *
 * @author TampanCrew
 */
public class Chip {
    private Item[] inventory;
    private int chipRemain;
    private boolean isVisible;
    private String imgLocation;
    private int x;
    private int y;
    public Chip(int locationX, int locationY)
    {
        this.x=locationX;
        this.y=locationY;
    }
    public void walk()
    {
        
    }
    public void setVisible(boolean visible)
    {
        this.isVisible=visible;
    }
    public void setImageFileName(String lokasiImg)
    {
        this.imgLocation=lokasiImg;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public String getImgLocation()
    {
        return imgLocation;
    }
    public boolean getVisible()
    {
        return isVisible;
    }
    public Item[] getInventory()
    {
        return inventory;
    }
    public int getChipRemain()
    {
        return chipRemain;
    }
}
