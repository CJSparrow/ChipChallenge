package chipchallenge.engine.obstacle;

import java.awt.Image;

/**
 * class ini merepresentasikan obstacle yang membuat rintangan bagi chip
 * @author TampanCrew
 */
public abstract class Obstacle {
    /**
     * posisi x dari obstacle
     */
    protected int x;
    /**
     * posisi y dari obstacle
     */
    protected int y;
    /**
     * Objek image untuk menampilkan obstacle nya
     */
    protected Image img;
    /**
     * constructor dari class obstacle
     * @param locationX : posisi x dari obstacle nya
     * @param locationY : posisi y dari obstacle nya
     */
    public Obstacle(int locationX, int locationY)
    {
        this.x = locationX;
        this.y = locationY;
    }
    /**
     * method abstract yang menandakan apakah obstacle ada / tidak
     * @return true : jika ada
     * false : jika tidak ada
     */
    public abstract boolean isVisible();
    /**
     * method abstract yang menandakan apakah obstacle bisa dilewati / tidak
     * @return true : jika bisa dilewati
     * false : jika tidak bisa dilewati
     */
    public abstract boolean passAllow();
    /**
     * method abstract yang menandakan apakah obstacle bisa membunuh chip / tidak
     * @return true : jika mematikan
     * false : jika aman
     */
    public abstract boolean killAllow();
    /**
     * untuk menandakan apakah sudah berada di kotak finish atau belum
     * @return true : jika sudah ada di finish
     * false : jika belum finish
     */
    public boolean isFinish()
    {
        return false;
    }
    /**
     * menandakan apakah obstacle bisa didorong atau tidak
     * @return true : jika bisa didorong
     * false : jika tidak bisa didorong
     */
    public abstract boolean pushAllow();
    public Image getImg()
    {
        return img;
    }
    public void setImg(int idx)
    {
        img=img;
    }
    /**
     * mendapatkan posisi x dari obstacle
     * @return posisi x obstacle
     */
    public int getX()
    {
        return x;
    }
    /**
     * mendapatkan posisi y dari obstacle
     * @return posisi y obstacle
     */
    public int getY()
    {
        return y;
    }
}
