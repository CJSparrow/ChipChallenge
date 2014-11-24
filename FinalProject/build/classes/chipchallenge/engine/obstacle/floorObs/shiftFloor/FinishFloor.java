/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.floorObs.shiftFloor;

import chipchallenge.engine.obstacle.floorObs.Floor;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * Class ini merepresentasikan finish floor, dimana pada saat chip menginjak floor ini maka stage akan berakhir
 * @author TampanCrew
 */
public class FinishFloor extends Floor{
    /**
     * atribut image untuk finish floor
     */
    private Image img2, img3, img4, img5, img6;
    /**
     * constructor dr class finish floor
     * @param locationX : posisi x dari finish floor
     * @param locationY : posisi y dari finish floor
     */
    public FinishFloor(int locationX, int locationY) {
        super(locationX, locationY);
        URL imgFinishFloorURL = getClass().getClassLoader().getResource("images/finishFloor.png");
        if (imgFinishFloorURL == null) {
            System.err.println("Couldn't find file: " + "images/finishFloor.png");
        } else {
            try {
                img = ImageIO.read(imgFinishFloorURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgFinishFloor2URL = getClass().getClassLoader().getResource("images/finishFloor2.png");
        if (imgFinishFloor2URL == null) {
            System.err.println("Couldn't find file: " + "images/finishFloor2.png");
        } else {
            try {
                img2 = ImageIO.read(imgFinishFloor2URL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgFinishFloor3URL = getClass().getClassLoader().getResource("images/finishFloor3.png");
        if (imgFinishFloor3URL == null) {
            System.err.println("Couldn't find file: " + "images/finishFloor3.png");
        } else {
            try {
                img3 = ImageIO.read(imgFinishFloor3URL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgFinishFloor4URL = getClass().getClassLoader().getResource("images/finishFloor4.png");
        if (imgFinishFloor4URL == null) {
            System.err.println("Couldn't find file: " + "images/finishFloor4.png");
        } else {
            try {
                img4 = ImageIO.read(imgFinishFloor4URL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgFinishFloor5URL = getClass().getClassLoader().getResource("images/finishFloor5.png");
        if (imgFinishFloor5URL == null) {
            System.err.println("Couldn't find file: " + "images/finishFloor5.png");
        } else {
            try {
                img5 = ImageIO.read(imgFinishFloor5URL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgFinishFloor6URL = getClass().getClassLoader().getResource("images/finishFloor6.png");
        if (imgFinishFloor6URL == null) {
            System.err.println("Couldn't find file: " + "images/finishFloor6.png");
        } else {
            try {
                img6 = ImageIO.read(imgFinishFloor6URL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * menandakan apakah sudah berada di finish atau belum
     * @return true jika sudah finish
     * false jika belum finish
     */
    @Override
    public boolean isFinish()
    {
        return true;
    }
    
    /**
     * untuk merubah image finish floor nya, untuk di animasikan
     * @param idx : pilihan image nya
     */
    public void setImg(int idx)
    {
        if(idx==0)
        {
            img=img;
        }
        else if(idx==1)
        {
            img=img2;
        }
        else if(idx==2)
        {
            img=img3;
        }
        else if(idx==3)
        {
            img=img4;
        }
        else if(idx==4)
        {
            img=img5;
        }
        else if(idx==5)
        {
            img=img6;
        }
    }
}
