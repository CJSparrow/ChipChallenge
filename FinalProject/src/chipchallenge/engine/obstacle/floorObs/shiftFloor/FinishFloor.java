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
 *
 * @author
 */
public class FinishFloor extends Floor{
    private Image img2, img3, img4, img5, img6;
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

    
    @Override
    public boolean isFinish()
    {
        return true;
    }
    
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
