package chipchallenge.engine;

import chipchallenge.engine.item.FireShoes;
import chipchallenge.engine.item.Item;
import chipchallenge.engine.item.WaterShoes;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * merepresentasikan chip sebagai player dari game ini
 * @author TampanCrew
 */
public class Chip {
    /**
     * atribut array untuk menampung item - item yang didapatkan oleh chip selama di stage tersebut
     */
    private Item[] inventory;
    /**
     * atribut untuk menandakan berapa sisa chip dalam stage tersebut
     */
    private int chipRemain;
    /**
     * atribut untuk menandakan sesuatu apakah kelihatan atau tidak
     */
    private boolean isVisible;
    /**
     * atribut untuk memberi tahu posisi gambar/image nya
     */
    private String imgLocation;
    /**
     * atribut untuk posisi x
     */
    private int x;
    /**
     * atribut untuk posisi y
     */
    private int y;
    /**
     * imgDown  : untuk chip pada saat dia menghadap ke bawah
     * imgUp    : untuk chip pada saat dia menghadap ke atas
     * imgLeft  : untuk chip pada saat dia menghadap ke kiri
     * imgRight : untuk chip pada saat dia menghadap ke kanan
     * imgBurned: untuk chip pada saat dia menginjak api dan terbakar
     */
    private Image imgDown, imgUp, imgLeft, imgRight, imgBurned, imgSinked;
    
    /**
     * constructor untuk class chip
     * @param locationX : titik x untuk chip
     * @param locationY : titik y untuk chip
     */
    public Chip(int locationX, int locationY) {
        this.x = locationX;
        this.y = locationY;
        URL imgSinkedURL = getClass().getClassLoader().getResource("images/sink.png");
        if (imgSinkedURL == null) {
            System.err.println("Couldn't find file: " + "images/sink.png");
        } else {
            try {
                imgSinked = ImageIO.read(imgSinkedURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
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
        inventory = new Item[12];
    }
    
    /**
     * method untuk membuat chip menjadi terlihat atau tidak
     * @param visible : true jika terlihat, false jika tidak terlihat
     */
    public void setVisible(boolean visible) {
        this.isVisible = visible;
    }
    
    /**
     * method untuk merubah lokasi image dengan yang baru
     * @param lokasiImg : lokasi image yang baru
     */
    public void setImageFileName(String lokasiImg) {
        this.imgLocation = lokasiImg;
    }
    
    /**
     * mendapatkan posisi x chip nya
     * @return posisi x chip
     */
    public int getX() {
        return x;
    }
    
    /**
     * mendapatkan posisi y chip nya
     * @return posisi y chip
     */
    public int getY() {
        return y;
    }
    
    /**
     * method untuk menjalankan chip nya ke posisi tertentu
     * @param x : posisi x tujuannya
     * @param y : posisi y tujuannya
     */
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * method untuk mengecek apakah chip terlihat atau tidak
     * @return true : jika terlihat
     * false : jika tidak terlihat
     */
    public boolean getVisible() {
        return isVisible;
    }
    
    /**
     * method untuk mendapatkan isi dari inventory chipnya
     * @return array of item yang merupakan inventory dari chip
     */
    public Item[] getInventory() {
        return inventory;
    }
    
    /**
     * method untuk mendapatkan item baru dan memasukkan nya ke inventory
     * @param newOne : item baru yang didapatkan
     */
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
    
    /**
     * method untuk mendapatkan sisa chip dalam stage
     * @return sisa chip
     */
    public int getChipRemain() {
        return chipRemain;
    }
    
    /**
     * method untuk mendapatkan objek image pada index tertentu
     * @param idx : index yang akan diambil image nya
     * @return image pada idx
     */
    public Image getImg(int idx) {
        Image imgReturned = null;
        if (idx == 1) {
            imgReturned = imgDown;
        } else if (idx == 2) {
            imgReturned = imgUp;
        } else if (idx == 3) {
            imgReturned = imgLeft;
        } else if (idx == 4) {
            imgReturned = imgRight;
        } else if (idx == 0) {
            imgReturned = imgBurned;
        } else if (idx == 5)
        {
            imgReturned = imgSinked;
        }
        return imgReturned;
    }
    
    /**
     * method untuk mengatur sisa chip yang ada dalam stage
     * @param chip : sisa chip yang di set
     */
    public void setChipRemain(int chip) {
        chipRemain = chip;
    }
    
    /**
     * untuk menentukan apakah merupakan chip atau bukan
     * @return true : jika merupakan chip
     * false : jika bukan merupakan chip
     */
    public boolean isChip() {
        return true;
    }
    
    /**
     * method untuk menandakan apakah chip tahan api atau tidak(bisa berjalan di atas fire floor)
     * @return true : jika tahan api
     * false : jika tidak
     */
    public boolean immuneFire() {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {

            } else if (inventory[i].getClass().equals(FireShoes.class)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * method untuk menandakan apakah chip bisa berjalan di atas water floor atau tidak
     * @return true : jika tahan air
     * false : jika tidak
     */
    public boolean immuneWater() {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {

            } else if (inventory[i].getClass().equals(WaterShoes.class)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * method untuk mereset isi dari inventory chip nya
     */
    public void clearInventory() {
        inventory = new Item[8];
    }
}
