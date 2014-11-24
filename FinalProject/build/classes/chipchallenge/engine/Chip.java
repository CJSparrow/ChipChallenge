package chipchallenge.engine;

import chipchallenge.engine.item.FireShoes;
import chipchallenge.engine.item.Item;
import chipchallenge.engine.item.WaterShoes;
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
    private Image imgDown, imgUp, imgLeft, imgRight, imgBurned;

    public Chip(int locationX, int locationY) {
        this.x = locationX;
        this.y = locationY;
        URL imgChipDownURL = getClass().getClassLoader().getResource("images/chipDown.png");
        if (imgChipDownURL == null) {
            System.err.println("Couldn't find file: " + "images/chipDown.png");
        } else {
            try {
                imgDown = ImageIO.read(imgChipDownURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgChipUpURL = getClass().getClassLoader().getResource("images/chipUp.png");
        if (imgChipUpURL == null) {
            System.err.println("Couldn't find file: " + "images/chipUp.png");
        } else {
            try {
                imgUp = ImageIO.read(imgChipUpURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgChipLeftURL = getClass().getClassLoader().getResource("images/chipLeft.png");
        if (imgChipLeftURL == null) {
            System.err.println("Couldn't find file: " + "images/chipLeft.png");
        } else {
            try {
                imgLeft = ImageIO.read(imgChipLeftURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgChipRightURL = getClass().getClassLoader().getResource("images/chipRight.png");
        if (imgChipRightURL == null) {
            System.err.println("Couldn't find file: " + "images/chipRight.png");
        } else {
            try {
                imgRight = ImageIO.read(imgChipRightURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgChipBurnedURL = getClass().getClassLoader().getResource("images/chipBurned.png");
        if (imgChipBurnedURL == null) {
            System.err.println("Couldn't find file: " + "images/chipBurned.png");
        } else {
            try {
                imgBurned = ImageIO.read(imgChipBurnedURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        inventory = new Item[8];
    }

    public void setVisible(boolean visible) {
        this.isVisible = visible;
    }

    public void setImageFileName(String lokasiImg) {
        this.imgLocation = lokasiImg;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean getVisible() {
        return isVisible;
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void obtainedInventoryItem(Item newOne) {
        int i = 0;
        while (i < inventory.length) {
            if (inventory[i] == null) {
                inventory[i] = newOne;
                break;
            } else {
                i++;
            }
        }
    }

    public int getChipRemain() {
        return chipRemain;
    }

    public Image getImg(int idx) {
        Image imgReturned = null;
        if (idx == 1) {
            imgReturned = imgDown;
        }
        else if(idx==2)
        {
            imgReturned = imgUp;
        }
        else if(idx==3)
        {
            imgReturned = imgLeft;
        }
        else if(idx==4)
        {
            imgReturned = imgRight;
        }
        else if(idx==0)
        {
            imgReturned = imgBurned;
        }
        return imgReturned;
    }

    public void setChipRemain(int chip) {
        chipRemain = chip;
    }

    public boolean isChip() {
        return true;
    }

    public boolean immuneFire() {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {

            } else if (inventory[i].getClass().equals(FireShoes.class)) {
                return true;
            }
        }
        return false;
    }

    public boolean immuneWater() {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {

            } else if (inventory[i].getClass().equals(WaterShoes.class)) {
                return true;
            }
        }
        return false;
    }
}
