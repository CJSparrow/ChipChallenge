package chipchallenge.engine;

import chipchallenge.engine.item.Item;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

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
    private Image img;
    public Chip(int locationX, int locationY)
    {
        this.x=locationX;
        this.y=locationY;
        URL imgChipURL = getClass().getClassLoader().getResource("images/chipDown.png");
        if (imgChipURL == null) {
            System.err.println("Couldn't find file: " + "images/chipDown.png");
        } else {
            try {
                img = ImageIO.read(imgChipURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        inventory = new Item[8];
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
    public void move(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public boolean getVisible()
    {
        return isVisible;
    }
    public Item[] getInventory()
    {
        return inventory;
    }
    public void obtainedInventoryItem(Item newOne)
    {
        int i = 0;
        while(i<inventory.length)
        {
            if(inventory[i]==null)
            {
                inventory[i]=newOne;
                break;
            }
            else
            {
                i++;
            }
        }
    }
    public int getChipRemain()
    {
        return chipRemain;
    }
    public Image getImg()
    {
        Image imgReturned = null;
        return img;
    }
    public void setChipRemain(int chip)
    {
        chipRemain=chip;
    }
    public boolean isChip()
    {
        return true;
    }
}
