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
 * class ini merepresentasikan water floor, dimana saat chip menginjak floor ini maka akan mati
 * @author TampanCrew
 */
public class WaterFloor extends Floor {
    /**
     * atribut image untuk water floor nya
     */
    private Image img2,img3,img4,img5,img6,img7,img8;
    /**
     * constructor class water floor 
     * @param locationX : posisi x water floor
     * @param locationY : posisi y water floor
     */
    public WaterFloor(int locationX, int locationY) {
        super(locationX, locationY);
        URL imgWaterFloorURL = getClass().getClassLoader().getResource("images/waterFloor.png");
        if (imgWaterFloorURL == null) {
            System.err.println("Couldn't find file: " + "images/waterFloor.png");
        } else {
            try {
                img = ImageIO.read(imgWaterFloorURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgWaterFloor2URL = getClass().getClassLoader().getResource("images/waterFloor2.png");
        if (imgWaterFloor2URL == null) {
            System.err.println("Couldn't find file: " + "images/waterFloor2.png");
        } else {
            try {
                img2 = ImageIO.read(imgWaterFloor2URL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgWaterFloor3URL = getClass().getClassLoader().getResource("images/waterFloor3.png");
        if (imgWaterFloor3URL == null) {
            System.err.println("Couldn't find file: " + "images/waterFloor3.png");
        } else {
            try {
                img3 = ImageIO.read(imgWaterFloor3URL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgWaterFloor4URL = getClass().getClassLoader().getResource("images/waterFloor4.png");
        if (imgWaterFloor4URL == null) {
            System.err.println("Couldn't find file: " + "images/waterFloor4.png");
        } else {
            try {
                img4 = ImageIO.read(imgWaterFloor4URL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgWaterFloor5URL = getClass().getClassLoader().getResource("images/waterFloor5.png");
        if (imgWaterFloor5URL == null) {
            System.err.println("Couldn't find file: " + "images/waterFloor5.png");
        } else {
            try {
                img5 = ImageIO.read(imgWaterFloor5URL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgWaterFloor6URL = getClass().getClassLoader().getResource("images/waterFloor6.png");
        if (imgWaterFloor6URL == null) {
            System.err.println("Couldn't find file: " + "images/waterFloor6.png");
        } else {
            try {
                img6 = ImageIO.read(imgWaterFloor6URL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgWaterFloor7URL = getClass().getClassLoader().getResource("images/waterFloor7.png");
        if (imgWaterFloor7URL == null) {
            System.err.println("Couldn't find file: " + "images/waterFloor7.png");
        } else {
            try {
                img7 = ImageIO.read(imgWaterFloor7URL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        URL imgWaterFloor8URL = getClass().getClassLoader().getResource("images/waterFloor8.png");
        if (imgWaterFloor8URL == null) {
            System.err.println("Couldn't find file: " + "images/waterFloor8.png");
        } else {
            try {
                img8 = ImageIO.read(imgWaterFloor8URL);
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
    public boolean killAllow() {
        return true;
    }
    
    /**
     * untuk merubah gambar water floornya, untuk dianimasikan
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
        else if(idx==6)
        {
            img=img7;
        }
        else if(idx==7)
        {
            img=img8;
        }
    }
}
