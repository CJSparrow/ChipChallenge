package chipchallenge.engine.obstacle.floorObs;

import chipchallenge.engine.obstacle.Obstacle;
import java.awt.Image;

/**
 * class yang merepresentasikan lantai tempat chip berjalan
 * @author TampanCrew
 */
public class Floor extends Obstacle {
    /**
     * constructor dari class floor
     * @param locationX : posisi x lantainya
     * @param locationY : posisi y lantainya
     */
    public Floor(int locationX, int locationY) {
        super(locationX, locationY);
    }

    /**
     * untuk menandakan apakah floor nya ada / tidak
     * @return true : jika ada
     * false : jika tidak terdapat floor
     */
    @Override
    public boolean isVisible() {
        return true;
    }
    /**
     * untuk menandakan apakah floor bisa dilewati / tidak
     * @return true jika bisa dilewati
     * false jika tidak bisa dilewati
     */
    @Override
    public boolean passAllow() {
        return true;
    }
    /**
     * untuk menandakan apakah floor mematikan atau tidak
     * @return true jika mematikan
     * false jika aman
     */
    @Override
    public boolean killAllow() {
        return false;
    }
    /**
     * menandakan apakah floor dapat didorong oleh chip / tidak
     * @return true jika bisa didorong oleh chip
     * false : jika tidak bisa
     */
    @Override
    public boolean pushAllow() {
        return false;
    }
    /**
     * menandakan apakah sudah mencapai finish / belum
     * @return true jika sudah sampai finish
     * false jika belum sampai finish
     */
    @Override
    public boolean isFinish()
    {
        return false;
    }
}
