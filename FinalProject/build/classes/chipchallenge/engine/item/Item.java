package chipchallenge.engine.item;

import java.awt.Image;

/**
 * merupakan abstract class yang merepresentasikan item-item pada game
 * @author TampanCrew
 */
public abstract class Item {
    /**
     * atribut untuk menandakan apakah item bisa terlihat atau tidak
     */
    private boolean isVisible;
    /**
     * lokasi dari image untuk item ini
     */
    private String imgLocation;
    /**
     * posisi x dari item
     */
    private int x;
    /**
     * posisi y dari item
     */
    private int y;
    /**
     * atribut Image untuk menampilkan item
     */
    protected Image img;
    
    /**
     * constructor dari class item
     * @param locationX : posisi x awal dari item
     * @param locationY : posisi y awal dari item
     */
    public Item(int locationX, int locationY)
    {
        this.x=locationX;
        this.y=locationY;
    }
    
    /**
     * method abstract yang menandakan apakah item ini bisa diambil atau tidak
     */
    public abstract boolean canBeObtained();
    
    /**
     * method untuk mengatur apakah item ini bisa terlihat atau tidak
     * @param visible : true jika bisa terlihat
     * false jika tidak bisa terlihat
     */
    public void setVisible(boolean visible)
    {
        isVisible=visible;
    }
    /**
     * method untuk mengatur / merubah nama file dari image nya
     * @param lokasiImg : nama file yang baru
     */
    public void setImageFileName(String lokasiImg)
    {
        imgLocation=lokasiImg;
    }
    
    /**
     * untuk mendapatkan posisi x dari item
     * @return posisi x dari item
     */
    public int getX()
    {
        return x;
    }
    /**
     * untuk mendapatkan posisi y dari item
     * @return posisi y dari item
     */
    public int getY()
    {
        return y;
    }
    /**
     * untuk mendapatkan status terlihat atau tidaknya item
     * @return true : jika terlihat
     * false : jika tidak terlihat
     */
    public boolean getVisible()
    {
        return isVisible;
    }
    /**
     * untuk mendapatkan lokasi image item tersebut
     * @return lokasi image nya
     */
    public String getImgLocation()
    {
        return imgLocation;
    }
    /**
     * untuk mendapatkan objek image dari item
     * @return objek image
     */
    public Image getImg()
    {
        return img;
    }
    /**
     * untuk menentukan apakah merupakan chip atau bukan
     * @return true : jika merupakan chip
     * false : jika bukan chip
     */
    public boolean isChip()
    {
        return false;
    }
}
