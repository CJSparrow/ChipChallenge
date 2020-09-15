/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.floorObs.dangerousFloor;

import chipchallenge.engine.obstacle.floorObs.Floor;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * class ini merepresentasikan fire floor, dimana saat chip menginjak floor ini maka akan mati
 * @author TampanCrew
 */
public class FireFloor extends Floor{
    /**
     * atribut image untuk fire floor nya
     */
    private Image img1,img2,img3,img4,img5,img6;
    /**
     * constructor class fire floor 
     * @param locationX : posisi x fire floor
     * @param locationY : posisi y fire floor
     */
    public FireFloor(int locationX, int locationY) {
        super(locationX, locationY);
        URL imgFireFloor1URL = getClass().getClassLoader().getResource("images/fireFloor1.png");
        if (imgFireFloor1URL == null) {
            System.err.println("Couldn't find file: " + "images/fireFloor1.png");
        } else {
            try {
                img = ImageIO.read(imgFireFloor1URL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgFireFloor2URL = getClass().getClassLoader().getResource("images/fireFloor2.png");
        if (imgFireFloor2URL == null) {
            System.err.println("Couldn't find file: " + "images/fireFloor2.png");
        } else {
            try {
                img2 = ImageIO.read(imgFireFloor2URL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgFireFloor3URL = getClass().getClassLoader().getResource("images/fireFloor3.png");
        if (imgFireFloor3URL == null) {
            System.err.println("Couldn't find file: " + "images/fireFloor3.png");
        } else {
            try {
                img3 = ImageIO.read(imgFireFloor3URL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgFireFloor4URL = getClass().getClassLoader().getResource("images/fireFloor4.png");
        if (imgFireFloor4URL == null) {
            System.err.println("Couldn't find file: " + "images/fireFloor4.png");
        } else {
            try {
                img4 = ImageIO.read(imgFireFloor4URL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgFireFloor5URL = getClass().getClassLoader().getResource("images/fireFloor5.png");
        if (imgFireFloor5URL == null) {
            System.err.println("Couldn't find file: " + "images/fireFloor5.png");
        } else {
            try {
                img5 = ImageIO.read(imgFireFloor5URL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgFireFloor6URL = getClass().getClassLoader().getResource("images/fireFloor6.png");
        if (imgFireFloor6URL == null) {
            System.err.println("Couldn't find file: " + "images/fireFloor6.png");
        } else {
            try {
                img6 = ImageIO.read(imgFireFloor6URL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * untuk menandakan apakah floor ini mematikan / tidak
     * @return true : jika mematikan
     * false : jika aman
     */
    @Override
    public boolean killAllow()
    {
        return true;
    }
    /**
     * untuk merubah gambar fire floornya, untuk dianimasikan
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
