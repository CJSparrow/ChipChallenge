/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.userInterface;

import chipchallenge.engine.Chip;
import chipchallenge.engine.item.*;
import chipchallenge.engine.item.IntergratedCircuit;
import chipchallenge.engine.obstacle.Obstacle;
import chipchallenge.engine.obstacle.floorObs.PlainFloor;
import chipchallenge.engine.obstacle.floorObs.dangerousFloor.FireFloor;
import chipchallenge.engine.obstacle.floorObs.dangerousFloor.WaterFloor;
import chipchallenge.engine.obstacle.floorObs.shiftFloor.FinishFloor;
import chipchallenge.engine.obstacle.floorObs.triggerFloor.RemovalFloor;
import chipchallenge.engine.obstacle.staticObs.Barrier;
import chipchallenge.engine.obstacle.staticObs.wall.NormalWall;
import chipchallenge.engine.obstacle.staticObs.wall.RandomObstacle;
import chipchallenge.engine.obstacle.staticObs.wall.RandomWall;
import java.util.ArrayList;

/**
 * class ini merepresentasikan world sebagai engine untuk membuat level-level pada game ini
 * @author TampanCrew
 */
public class World {
    /**
     * array of obstacle merepresentasikan obstacle-obstacle yang berada di stage tsb
     */
    private Obstacle[][] map;
    /**
     * array of item merepresentasikan item-item yang berada di stage tsb
     */
    private Item[][] item;
    /**
     * merepresentasikan chip nya sebagai player
     */
    private Chip player;
    /**
     * untuk menandakan sudah berapa chip yang didapat/ masih tersisa di stage tsb
     */
    private int counterIC;
    /**
     * posisi x chip nya
     */
    private int posChipX;
    /**
     * posisi y chip nya
     */
    private int posChipY;
    /**
     * atribut dari finish floor, saat chip menginjak ini maka stage tersebut selesai
     */
    private FinishFloor ff;
    /**
     * arraylist dari water floor, merepresentasikan kumpulan water floor
     */
    private ArrayList<WaterFloor> arrOfWF = new ArrayList();
    /**
     * arraylist dari fire floor, merepresentasikan kumpulan fire floor
     */
    private ArrayList<FireFloor> arrOfFF = new ArrayList();
    
    /**
     * constructor dari class world
     * @param level : menandakan level yang saat ini sedang dimainkan
     * @param player : untuk memasukkan chip sebagai player
     */
    public World(int level, Chip player) {
        counterIC = 0;
        this.player = player;
        int x = 50;
        int y = 50;
        switch (level) {
            //LEVEL 1
            case 1:
                map = new Obstacle[10][10];
                item = new Item[10][10];
                posChipX = 1;
                posChipY = 1;
                //BARIS 1
                map[0][0] = new NormalWall(x, y);
                x += map[0][0].getImg().getWidth(null);
                map[0][1] = new NormalWall(x, y);
                x += map[0][1].getImg().getWidth(null);
                map[0][2] = new NormalWall(x, y);
                x += map[0][2].getImg().getWidth(null);
                map[0][3] = new NormalWall(x, y);
                x += map[0][3].getImg().getWidth(null);
                map[0][4] = new NormalWall(x, y);
                x += map[0][4].getImg().getWidth(null);
                map[0][5] = new NormalWall(x, y);
                x += map[0][5].getImg().getWidth(null);
                map[0][6] = new NormalWall(x, y);
                x += map[0][6].getImg().getWidth(null);
                map[0][7] = new NormalWall(x, y);
                x += map[0][7].getImg().getWidth(null);
                map[0][8] = new NormalWall(x, y);
                x += map[0][8].getImg().getWidth(null);
                map[0][9] = new NormalWall(x, y);
                x += map[0][9].getImg().getWidth(null);

                //BARIS 2
                x = 50;
                y += map[0][0].getImg().getHeight(null);
                map[1][0] = new NormalWall(x, y);
                x += map[1][0].getImg().getWidth(null);
                map[1][1] = new PlainFloor(x, y);
                x += map[1][1].getImg().getWidth(null);
                map[1][2] = new NormalWall(x, y);
                x += map[1][2].getImg().getWidth(null);
                map[1][3] = new FinishFloor(x, y);
                ff = (FinishFloor) map[1][3];
                x += map[1][3].getImg().getWidth(null);
                map[1][4] = new PlainFloor(x, y);
                x += map[1][4].getImg().getWidth(null);
                map[1][5] = new Barrier(x, y, player);
                x += map[1][5].getImg().getWidth(null);
                map[1][6] = new PlainFloor(x, y);
                x += map[1][6].getImg().getWidth(null);
                map[1][7] = new PlainFloor(x, y);
                x += map[1][7].getImg().getWidth(null);
                map[1][8] = new PlainFloor(x, y);
                x += map[1][8].getImg().getWidth(null);
                map[1][9] = new NormalWall(x, y);
                x += map[1][9].getImg().getWidth(null);

                //BARIS 3
                x = 50;
                y += map[1][0].getImg().getHeight(null);
                map[2][0] = new NormalWall(x, y);
                x += map[2][0].getImg().getWidth(null);
                map[2][1] = new PlainFloor(x, y);
                x += map[2][1].getImg().getWidth(null);
                map[2][2] = new NormalWall(x, y);
                x += map[2][2].getImg().getWidth(null);
                map[2][3] = new PlainFloor(x, y);
                x += map[2][3].getImg().getWidth(null);
                map[2][4] = new PlainFloor(x, y);
                x += map[2][4].getImg().getWidth(null);
                map[2][5] = new NormalWall(x, y);
                x += map[2][5].getImg().getWidth(null);
                map[2][6] = new NormalWall(x, y);
                x += map[2][6].getImg().getWidth(null);
                map[2][7] = new NormalWall(x, y);
                x += map[2][7].getImg().getWidth(null);
                map[2][8] = new PlainFloor(x, y);
                x += map[2][8].getImg().getWidth(null);
                map[2][9] = new NormalWall(x, y);
                x += map[2][9].getImg().getWidth(null);

                //BARIS 4
                x = 50;
                y += map[2][0].getImg().getHeight(null);
                map[3][0] = new NormalWall(x, y);
                x += map[3][0].getImg().getWidth(null);
                map[3][1] = new PlainFloor(x, y);
                x += map[3][1].getImg().getWidth(null);
                map[3][2] = new NormalWall(x, y);
                x += map[3][2].getImg().getWidth(null);
                map[3][3] = new NormalWall(x, y);
                x += map[3][3].getImg().getWidth(null);
                map[3][4] = new NormalWall(x, y);
                x += map[3][4].getImg().getWidth(null);
                map[3][5] = new NormalWall(x, y);
                x += map[3][5].getImg().getWidth(null);
                map[3][6] = new PlainFloor(x, y);
                x += map[3][6].getImg().getWidth(null);
                map[3][7] = new PlainFloor(x, y);
                x += map[3][7].getImg().getWidth(null);
                map[3][8] = new PlainFloor(x, y);
                x += map[3][8].getImg().getWidth(null);
                map[3][9] = new NormalWall(x, y);
                x += map[3][9].getImg().getWidth(null);

                //BARIS 5
                x = 50;
                y += map[3][0].getImg().getHeight(null);
                map[4][0] = new NormalWall(x, y);
                x += map[4][0].getImg().getWidth(null);
                map[4][1] = new PlainFloor(x, y);
                x += map[4][1].getImg().getWidth(null);
                map[4][2] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[4][2]);
                x += map[4][2].getImg().getWidth(null);
                map[4][3] = new PlainFloor(x, y);
                x += map[4][3].getImg().getWidth(null);
                map[4][4] = new PlainFloor(x, y);
                item[4][4] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[4][4].getImg().getWidth(null);
                map[4][5] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[4][5]);
                x += map[4][5].getImg().getWidth(null);
                map[4][6] = new PlainFloor(x, y);
                x += map[4][6].getImg().getWidth(null);
                map[4][7] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[4][7]);
                x += map[4][7].getImg().getWidth(null);
                map[4][8] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[4][8]);
                x += map[4][8].getImg().getWidth(null);
                map[4][9] = new NormalWall(x, y);
                x += map[4][9].getImg().getWidth(null);

                //BARIS 6
                x = 50;
                y += map[4][0].getImg().getHeight(null);
                map[5][0] = new NormalWall(x, y);
                x += map[5][0].getImg().getWidth(null);
                map[5][1] = new PlainFloor(x, y);
                x += map[5][1].getImg().getWidth(null);
                map[5][2] = new PlainFloor(x, y);
                item[5][2] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[5][2].getImg().getWidth(null);
                map[5][3] = new PlainFloor(x, y);
                x += map[5][3].getImg().getWidth(null);
                map[5][4] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[5][4]);
                x += map[5][4].getImg().getWidth(null);
                map[5][5] = new PlainFloor(x, y);
                item[5][5] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[5][5].getImg().getWidth(null);
                map[5][6] = new PlainFloor(x, y);
                x += map[5][6].getImg().getWidth(null);
                map[5][7] = new PlainFloor(x, y);
                x += map[5][7].getImg().getWidth(null);
                map[5][8] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[5][8]);
                x += map[5][8].getImg().getWidth(null);
                map[5][9] = new NormalWall(x, y);
                x += map[5][9].getImg().getWidth(null);

                //BARIS 7
                x = 50;
                y += map[5][0].getImg().getHeight(null);
                map[6][0] = new NormalWall(x, y);
                x += map[6][0].getImg().getWidth(null);
                map[6][1] = new PlainFloor(x, y);
                x += map[6][1].getImg().getWidth(null);
                map[6][2] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[6][2]);
                x += map[6][2].getImg().getWidth(null);
                map[6][3] = new PlainFloor(x, y);
                x += map[6][3].getImg().getWidth(null);
                map[6][4] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[6][4]);
                x += map[6][4].getImg().getWidth(null);
                map[6][5] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[6][5]);
                x += map[6][5].getImg().getWidth(null);
                map[6][6] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[6][6]);
                x += map[6][6].getImg().getWidth(null);
                map[6][7] = new PlainFloor(x, y);
                x += map[6][7].getImg().getWidth(null);
                map[6][8] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[6][8]);
                x += map[6][8].getImg().getWidth(null);
                map[6][9] = new NormalWall(x, y);
                x += map[6][9].getImg().getWidth(null);

                //BARIS 8
                x = 50;
                y += map[6][0].getImg().getHeight(null);
                map[7][0] = new NormalWall(x, y);
                x += map[7][0].getImg().getWidth(null);
                map[7][1] = new PlainFloor(x, y);
                x += map[7][1].getImg().getWidth(null);
                map[7][2] = new PlainFloor(x, y);
                x += map[7][2].getImg().getWidth(null);
                map[7][3] = new PlainFloor(x, y);
                x += map[7][3].getImg().getWidth(null);
                map[7][4] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[7][4]);
                x += map[7][4].getImg().getWidth(null);
                map[7][5] = new PlainFloor(x, y);
                x += map[7][5].getImg().getWidth(null);
                map[7][6] = new PlainFloor(x, y);
                x += map[7][6].getImg().getWidth(null);
                map[7][7] = new PlainFloor(x, y);
                x += map[7][7].getImg().getWidth(null);
                map[7][8] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[7][8]);
                x += map[7][8].getImg().getWidth(null);
                map[7][9] = new NormalWall(x, y);
                x += map[7][9].getImg().getWidth(null);

                //BARIS 9
                x = 50;
                y += map[7][0].getImg().getHeight(null);
                map[8][0] = new NormalWall(x, y);
                x += map[8][0].getImg().getWidth(null);
                map[8][1] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[8][1]);
                x += map[8][1].getImg().getWidth(null);
                map[8][2] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[8][2]);
                x += map[8][2].getImg().getWidth(null);
                map[8][3] = new PlainFloor(x, y);
                x += map[8][3].getImg().getWidth(null);
                map[8][4] = new PlainFloor(x, y);
                x += map[8][4].getImg().getWidth(null);
                map[8][5] = new PlainFloor(x, y);
                x += map[8][5].getImg().getWidth(null);
                map[8][6] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[8][6]);
                x += map[8][6].getImg().getWidth(null);
                map[8][7] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[8][7]);
                x += map[8][7].getImg().getWidth(null);
                map[8][8] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[8][8]);
                x += map[8][8].getImg().getWidth(null);
                map[8][9] = new NormalWall(x, y);
                x += map[8][9].getImg().getWidth(null);
                ;

                //BARIS 10
                x = 50;
                y += map[8][0].getImg().getHeight(null);
                map[9][0] = new NormalWall(x, y);
                x += map[9][0].getImg().getWidth(null);
                map[9][1] = new NormalWall(x, y);
                x += map[9][1].getImg().getWidth(null);
                map[9][2] = new NormalWall(x, y);
                x += map[9][2].getImg().getWidth(null);
                map[9][3] = new NormalWall(x, y);
                x += map[9][3].getImg().getWidth(null);
                map[9][4] = new NormalWall(x, y);
                x += map[9][4].getImg().getWidth(null);
                map[9][5] = new NormalWall(x, y);
                x += map[9][5].getImg().getWidth(null);
                map[9][6] = new NormalWall(x, y);
                x += map[9][6].getImg().getWidth(null);
                map[9][7] = new NormalWall(x, y);
                x += map[9][7].getImg().getWidth(null);
                map[9][8] = new NormalWall(x, y);
                x += map[9][8].getImg().getWidth(null);
                map[9][9] = new NormalWall(x, y);
                x += map[9][9].getImg().getWidth(null);
                break;

            //LEVEL 2    
            case 2:
                map = new Obstacle[12][15];
                item = new Item[12][15];
                posChipX = 8;
                posChipY = 7;
                x = 50;
                y = 50;

                //BARIS 1
                map[0][0] = new NormalWall(x, y);
                x += map[0][0].getImg().getWidth(null);
                map[0][1] = new NormalWall(x, y);
                x += map[0][1].getImg().getWidth(null);
                map[0][2] = new NormalWall(x, y);
                x += map[0][2].getImg().getWidth(null);
                map[0][3] = new NormalWall(x, y);
                x += map[0][3].getImg().getWidth(null);
                map[0][4] = new NormalWall(x, y);
                x += map[0][4].getImg().getWidth(null);
                map[0][5] = new NormalWall(x, y);
                x += map[0][5].getImg().getWidth(null);
                map[0][6] = new NormalWall(x, y);
                x += map[0][6].getImg().getWidth(null);
                map[0][7] = new NormalWall(x, y);
                x += map[0][7].getImg().getWidth(null);
                map[0][8] = new NormalWall(x, y);
                x += map[0][8].getImg().getWidth(null);
                map[0][9] = new NormalWall(x, y);
                x += map[0][9].getImg().getWidth(null);
                map[0][10] = new NormalWall(x, y);
                x += map[0][10].getImg().getWidth(null);
                map[0][11] = new NormalWall(x, y);
                x += map[0][11].getImg().getWidth(null);
                map[0][12] = new NormalWall(x, y);
                x += map[0][12].getImg().getWidth(null);
                map[0][13] = new NormalWall(x, y);
                x += map[0][13].getImg().getWidth(null);
                map[0][14] = new NormalWall(x, y);
                x += map[0][14].getImg().getWidth(null);

                //BARIS 2
                x = 50;
                y += map[0][0].getImg().getHeight(null);
                map[1][0] = new NormalWall(x, y);
                x += map[1][0].getImg().getWidth(null);
                map[1][1] = new PlainFloor(x, y);
                x += map[1][1].getImg().getWidth(null);
                map[1][2] = new PlainFloor(x, y);
                item[1][2] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[1][2].getImg().getWidth(null);
                map[1][3] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[1][3]);
                x += map[1][3].getImg().getWidth(null);
                map[1][4] = new PlainFloor(x, y);
                x += map[1][4].getImg().getWidth(null);
                map[1][5] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[1][5]);
                x += map[1][5].getImg().getWidth(null);
                map[1][6] = new PlainFloor(x, y);
                x += map[1][6].getImg().getWidth(null);
                map[1][7] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[1][7]);
                x += map[1][7].getImg().getWidth(null);
                map[1][8] = new PlainFloor(x, y);
                x += map[1][8].getImg().getWidth(null);
                map[1][9] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[1][9]);
                x += map[1][9].getImg().getWidth(null);
                map[1][10] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[1][10]);
                x += map[1][10].getImg().getWidth(null);
                map[1][11] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[1][11]);
                x += map[1][11].getImg().getWidth(null);
                map[1][12] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[1][12]);
                x += map[1][12].getImg().getWidth(null);
                map[1][13] = new PlainFloor(x, y);
                x += map[1][13].getImg().getWidth(null);
                map[1][14] = new NormalWall(x, y);
                x += map[1][14].getImg().getWidth(null);

                //BARIS 3
                x = 50;
                y += map[1][0].getImg().getHeight(null);
                map[2][0] = new NormalWall(x, y);
                x += map[2][0].getImg().getWidth(null);
                map[2][1] = new PlainFloor(x, y);
                x += map[2][1].getImg().getWidth(null);
                map[2][2] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[2][2]);
                x += map[2][2].getImg().getWidth(null);
                map[2][3] = new PlainFloor(x, y);
                x += map[2][3].getImg().getWidth(null);
                map[2][4] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[2][4]);
                x += map[2][4].getImg().getWidth(null);
                map[2][5] = new PlainFloor(x, y);
                x += map[2][5].getImg().getWidth(null);
                map[2][6] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[2][6]);
                x += map[2][6].getImg().getWidth(null);
                map[2][7] = new PlainFloor(x, y);
                x += map[2][7].getImg().getWidth(null);
                map[2][8] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[2][8]);
                x += map[2][8].getImg().getWidth(null);
                map[2][9] = new PlainFloor(x, y);
                x += map[2][9].getImg().getWidth(null);
                map[2][10] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[2][10]);
                x += map[2][10].getImg().getWidth(null);
                map[2][11] = new PlainFloor(x, y);
                x += map[2][11].getImg().getWidth(null);
                map[2][12] = new PlainFloor(x, y);
                x += map[2][12].getImg().getWidth(null);
                map[2][13] = new PlainFloor(x, y);
                x += map[2][13].getImg().getWidth(null);
                map[2][14] = new NormalWall(x, y);
                x += map[2][14].getImg().getWidth(null);

                //BARIS 4
                x = 50;
                y += map[2][0].getImg().getHeight(null);
                map[3][0] = new NormalWall(x, y);
                x += map[3][0].getImg().getWidth(null);
                map[3][1] = new PlainFloor(x, y);
                x += map[3][1].getImg().getWidth(null);
                map[3][2] = new PlainFloor(x, y);
                x += map[3][2].getImg().getWidth(null);
                map[3][3] = new PlainFloor(x, y);
                x += map[3][3].getImg().getWidth(null);
                map[3][4] = new PlainFloor(x, y);
                x += map[3][4].getImg().getWidth(null);
                map[3][5] = new PlainFloor(x, y);
                x += map[3][5].getImg().getWidth(null);
                map[3][6] = new PlainFloor(x, y);
                x += map[3][6].getImg().getWidth(null);
                map[3][7] = new PlainFloor(x, y);
                x += map[3][7].getImg().getWidth(null);
                map[3][8] = new PlainFloor(x, y);
                x += map[3][8].getImg().getWidth(null);
                map[3][9] = new PlainFloor(x, y);
                x += map[3][9].getImg().getWidth(null);
                map[3][10] = new PlainFloor(x, y);
                x += map[3][10].getImg().getWidth(null);
                map[3][11] = new PlainFloor(x, y);
                x += map[3][11].getImg().getWidth(null);
                map[3][12] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[3][12]);
                x += map[3][12].getImg().getWidth(null);
                map[3][13] = new PlainFloor(x, y);
                x += map[3][13].getImg().getWidth(null);
                map[3][14] = new NormalWall(x, y);
                x += map[3][14].getImg().getWidth(null);

                //BARIS 5
                x = 50;
                y += map[3][0].getImg().getHeight(null);
                map[4][0] = new NormalWall(x, y);
                x += map[4][0].getImg().getWidth(null);
                map[4][1] = new PlainFloor(x, y);
                x += map[4][1].getImg().getWidth(null);
                map[4][2] = new PlainFloor(x, y);
                x += map[4][2].getImg().getWidth(null);
                map[4][3] = new PlainFloor(x, y);
                x += map[4][3].getImg().getWidth(null);
                map[4][4] = new PlainFloor(x, y);
                x += map[4][4].getImg().getWidth(null);
                map[4][5] = new PlainFloor(x, y);
                x += map[4][5].getImg().getWidth(null);
                map[4][6] = new PlainFloor(x, y);
                x += map[4][6].getImg().getWidth(null);
                map[4][7] = new PlainFloor(x, y);
                x += map[4][7].getImg().getWidth(null);
                map[4][8] = new PlainFloor(x, y);
                x += map[4][8].getImg().getWidth(null);
                map[4][9] = new PlainFloor(x, y);
                x += map[4][9].getImg().getWidth(null);
                map[4][10] = new PlainFloor(x, y);
                x += map[4][10].getImg().getWidth(null);
                map[4][11] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[4][11]);
                x += map[4][11].getImg().getWidth(null);
                map[4][12] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[4][12]);
                x += map[4][12].getImg().getWidth(null);
                map[4][13] = new PlainFloor(x, y);
                x += map[4][13].getImg().getWidth(null);
                map[4][14] = new NormalWall(x, y);
                x += map[4][14].getImg().getWidth(null);

                //BARIS 6
                x = 50;
                y += map[4][0].getImg().getHeight(null);
                map[5][0] = new NormalWall(x, y);
                x += map[5][0].getImg().getWidth(null);
                map[5][1] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[5][1]);
                x += map[5][1].getImg().getWidth(null);
                map[5][2] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[5][2]);
                x += map[5][2].getImg().getWidth(null);
                map[5][3] = new PlainFloor(x, y);
                x += map[5][3].getImg().getWidth(null);
                map[5][4] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[5][4]);
                x += map[5][4].getImg().getWidth(null);
                map[5][5] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[5][5]);
                x += map[5][5].getImg().getWidth(null);
                map[5][6] = new PlainFloor(x, y);
                x += map[5][6].getImg().getWidth(null);
                map[5][7] = new PlainFloor(x, y);
                x += map[5][7].getImg().getWidth(null);
                map[5][8] = new PlainFloor(x, y);
                x += map[5][8].getImg().getWidth(null);
                map[5][9] = new PlainFloor(x, y);
                x += map[5][9].getImg().getWidth(null);
                map[5][10] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[5][10]);
                x += map[5][10].getImg().getWidth(null);
                map[5][11] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[5][11]);
                x += map[5][11].getImg().getWidth(null);
                map[5][12] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[5][12]);
                x += map[5][12].getImg().getWidth(null);
                map[5][13] = new PlainFloor(x, y);
                x += map[5][13].getImg().getWidth(null);
                map[5][14] = new NormalWall(x, y);
                x += map[5][14].getImg().getWidth(null);

                //BARIS 7
                x = 50;
                y += map[5][0].getImg().getHeight(null);
                map[6][0] = new NormalWall(x, y);
                x += map[6][0].getImg().getWidth(null);
                map[6][1] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[6][1]);
                x += map[6][1].getImg().getWidth(null);
                map[6][2] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[6][2]);
                x += map[6][2].getImg().getWidth(null);
                map[6][3] = new PlainFloor(x, y);
                item[6][3] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[6][3].getImg().getWidth(null);
                map[6][4] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[6][4]);
                x += map[6][4].getImg().getWidth(null);
                map[6][5] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[6][5]);
                x += map[6][5].getImg().getWidth(null);
                map[6][6] = new PlainFloor(x, y);
                x += map[6][6].getImg().getWidth(null);
                map[6][7] = new PlainFloor(x, y);
                x += map[6][7].getImg().getWidth(null);
                map[6][8] = new PlainFloor(x, y);
                x += map[6][8].getImg().getWidth(null);
                map[6][9] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[6][9]);
                x += map[6][9].getImg().getWidth(null);
                map[6][10] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[6][10]);
                x += map[6][10].getImg().getWidth(null);
                map[6][11] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[6][11]);
                x += map[6][11].getImg().getWidth(null);
                map[6][12] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[6][12]);
                x += map[6][12].getImg().getWidth(null);
                map[6][13] = new PlainFloor(x, y);
                x += map[6][13].getImg().getWidth(null);
                map[6][14] = new NormalWall(x, y);
                x += map[6][14].getImg().getWidth(null);

                //BARIS 8
                x = 50;
                y += map[6][0].getImg().getHeight(null);
                map[7][0] = new NormalWall(x, y);
                x += map[7][0].getImg().getWidth(null);
                map[7][1] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[7][1]);
                x += map[7][1].getImg().getWidth(null);
                map[7][2] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[7][2]);
                x += map[7][2].getImg().getWidth(null);
                map[7][3] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[7][3]);
                x += map[7][3].getImg().getWidth(null);
                map[7][4] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[7][4]);
                x += map[7][4].getImg().getWidth(null);
                map[7][5] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[7][5]);
                x += map[7][5].getImg().getWidth(null);
                map[7][6] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[7][6]);
                x += map[7][6].getImg().getWidth(null);
                map[7][7] = new PlainFloor(x, y);
                x += map[7][7].getImg().getWidth(null);
                map[7][8] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[7][8]);
                x += map[7][8].getImg().getWidth(null);
                map[7][9] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[7][9]);
                x += map[7][9].getImg().getWidth(null);
                map[7][10] = new PlainFloor(x, y);
                item[7][10] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[7][10].getImg().getWidth(null);
                map[7][11] = new PlainFloor(x, y);
                x += map[7][11].getImg().getWidth(null);
                map[7][12] = new PlainFloor(x, y);
                x += map[7][12].getImg().getWidth(null);
                map[7][13] = new PlainFloor(x, y);
                x += map[7][13].getImg().getWidth(null);
                map[7][14] = new NormalWall(x, y);
                x += map[7][14].getImg().getWidth(null);

                //BARIS 9
                x = 50;
                y += map[7][0].getImg().getHeight(null);
                map[8][0] = new NormalWall(x, y);
                x += map[8][0].getImg().getWidth(null);
                map[8][1] = new NormalWall(x, y);
                x += map[8][1].getImg().getWidth(null);
                map[8][2] = new NormalWall(x, y);
                x += map[8][2].getImg().getWidth(null);
                map[8][3] = new NormalWall(x, y);
                x += map[8][3].getImg().getWidth(null);
                map[8][4] = new NormalWall(x, y);
                x += map[8][4].getImg().getWidth(null);
                map[8][5] = new NormalWall(x, y);
                x += map[8][5].getImg().getWidth(null);
                map[8][6] = new PlainFloor(x, y);
                x += map[8][6].getImg().getWidth(null);
                map[8][7] = new PlainFloor(x, y);
                x += map[8][7].getImg().getWidth(null);
                map[8][8] = new PlainFloor(x, y);
                x += map[8][8].getImg().getWidth(null);
                map[8][9] = new NormalWall(x, y);
                x += map[8][9].getImg().getWidth(null);
                map[8][10] = new NormalWall(x, y);
                x += map[8][10].getImg().getWidth(null);
                map[8][11] = new NormalWall(x, y);
                x += map[8][11].getImg().getWidth(null);
                map[8][12] = new NormalWall(x, y);
                x += map[8][12].getImg().getWidth(null);
                map[8][13] = new NormalWall(x, y);
                x += map[8][13].getImg().getWidth(null);
                map[8][14] = new NormalWall(x, y);
                x += map[8][14].getImg().getWidth(null);

                //BARIS 10
                x = 50;
                y += map[8][0].getImg().getHeight(null);
                map[9][0] = new NormalWall(x, y);
                x += map[9][0].getImg().getWidth(null);
                map[9][1] = new PlainFloor(x, y);
                x += map[9][1].getImg().getWidth(null);
                map[9][2] = new PlainFloor(x, y);
                x += map[9][2].getImg().getWidth(null);
                map[9][3] = new PlainFloor(x, y);
                x += map[9][3].getImg().getWidth(null);
                map[9][4] = new PlainFloor(x, y);
                x += map[9][4].getImg().getWidth(null);
                map[9][5] = new PlainFloor(x, y);
                x += map[9][5].getImg().getWidth(null);
                map[9][6] = new PlainFloor(x, y);
                x += map[9][6].getImg().getWidth(null);
                map[9][7] = new Barrier(x, y, player);
                x += map[9][7].getImg().getWidth(null);
                map[9][8] = new PlainFloor(x, y);
                x += map[9][8].getImg().getWidth(null);
                map[9][9] = new PlainFloor(x, y);
                x += map[9][9].getImg().getWidth(null);
                map[9][10] = new PlainFloor(x, y);
                x += map[9][10].getImg().getWidth(null);
                map[9][11] = new PlainFloor(x, y);
                x += map[9][11].getImg().getWidth(null);
                map[9][12] = new PlainFloor(x, y);
                x += map[9][12].getImg().getWidth(null);
                map[9][13] = new PlainFloor(x, y);
                x += map[9][13].getImg().getWidth(null);
                map[9][14] = new NormalWall(x, y);
                x += map[9][14].getImg().getWidth(null);

                //BARIS 11
                x = 50;
                y += map[9][0].getImg().getHeight(null);
                map[10][0] = new NormalWall(x, y);
                x += map[10][0].getImg().getWidth(null);
                map[10][1] = new PlainFloor(x, y);
                item[10][1] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[10][1].getImg().getWidth(null);
                map[10][2] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[10][2]);
                x += map[10][2].getImg().getWidth(null);
                map[10][3] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[10][3]);
                x += map[10][3].getImg().getWidth(null);
                map[10][4] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[10][4]);
                x += map[10][4].getImg().getWidth(null);
                map[10][5] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[10][5]);
                x += map[10][5].getImg().getWidth(null);
                map[10][6] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[10][6]);
                x += map[10][6].getImg().getWidth(null);
                map[10][7] = new Barrier(x, y, player);
                x += map[10][7].getImg().getWidth(null);
                map[10][8] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[10][8]);
                x += map[10][8].getImg().getWidth(null);
                map[10][9] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[10][9]);
                x += map[10][9].getImg().getWidth(null);
                map[10][10] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[10][10]);
                x += map[10][10].getImg().getWidth(null);
                map[10][11] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[10][11]);
                x += map[10][11].getImg().getWidth(null);
                map[10][12] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[10][12]);
                x += map[10][12].getImg().getWidth(null);
                map[10][13] = new PlainFloor(x, y);
                item[10][13] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[10][13].getImg().getWidth(null);
                map[10][14] = new NormalWall(x, y);
                x += map[10][14].getImg().getWidth(null);

                //BARIS 12
                x = 50;
                y += map[10][0].getImg().getHeight(null);
                map[11][0] = new NormalWall(x, y);
                x += map[11][0].getImg().getWidth(null);
                map[11][1] = new NormalWall(x, y);
                x += map[11][1].getImg().getWidth(null);
                map[11][2] = new NormalWall(x, y);
                x += map[11][2].getImg().getWidth(null);
                map[11][3] = new NormalWall(x, y);
                x += map[11][3].getImg().getWidth(null);
                map[11][4] = new NormalWall(x, y);
                x += map[11][4].getImg().getWidth(null);
                map[11][5] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[11][5]);
                x += map[11][5].getImg().getWidth(null);
                map[11][6] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[11][6]);
                x += map[11][6].getImg().getWidth(null);
                map[11][7] = new FinishFloor(x, y);
                ff = (FinishFloor) map[11][7];
                x += map[11][7].getImg().getWidth(null);
                map[11][8] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[11][8]);
                x += map[11][8].getImg().getWidth(null);
                map[11][9] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[11][9]);
                x += map[11][9].getImg().getWidth(null);
                map[11][10] = new NormalWall(x, y);
                x += map[11][10].getImg().getWidth(null);
                map[11][11] = new NormalWall(x, y);
                x += map[11][11].getImg().getWidth(null);
                map[11][12] = new NormalWall(x, y);
                x += map[11][12].getImg().getWidth(null);
                map[11][13] = new NormalWall(x, y);
                x += map[11][13].getImg().getWidth(null);
                map[11][14] = new NormalWall(x, y);
                x += map[11][14].getImg().getWidth(null);
                break;

            //Level3
            case 3:
                map = new Obstacle[12][20];
                item = new Item[12][20];
                posChipX = 10;
                posChipY = 10;

                //BARIS 1
                for (int i = 0; i < 20; i++) {
                    map[0][i] = new NormalWall(x, y);
                    x += map[0][i].getImg().getWidth(null);
                }

                //BARIS 2
                x = 50;
                y += map[0][0].getImg().getHeight(null);
                map[1][0] = new NormalWall(x, y);
                x += map[1][0].getImg().getWidth(null);
                map[1][1] = new PlainFloor(x, y);
                x += map[1][1].getImg().getWidth(null);
                map[1][2] = new PlainFloor(x, y);
                x += map[1][2].getImg().getWidth(null);
                map[1][3] = new PlainFloor(x, y);
                x += map[1][3].getImg().getWidth(null);
                map[1][4] = new PlainFloor(x, y);
                x += map[1][4].getImg().getWidth(null);
                map[1][5] = new PlainFloor(x, y);
                x += map[1][5].getImg().getWidth(null);
                map[1][6] = new PlainFloor(x, y);
                x += map[1][6].getImg().getWidth(null);
                map[1][7] = new PlainFloor(x, y);
                x += map[1][7].getImg().getWidth(null);
                map[1][8] = new PlainFloor(x, y);
                x += map[1][8].getImg().getWidth(null);
                map[1][9] = new PlainFloor(x, y);
                x += map[1][9].getImg().getWidth(null);
                map[1][10] = new PlainFloor(x, y);
                item[1][10] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[1][10].getImg().getWidth(null);
                map[1][11] = new PlainFloor(x, y);
                x += map[1][11].getImg().getWidth(null);
                map[1][12] = new PlainFloor(x, y);
                x += map[1][12].getImg().getWidth(null);
                map[1][13] = new PlainFloor(x, y);
                x += map[1][13].getImg().getWidth(null);
                map[1][14] = new PlainFloor(x, y);
                x += map[1][14].getImg().getWidth(null);
                map[1][15] = new PlainFloor(x, y);
                x += map[1][15].getImg().getWidth(null);
                map[1][16] = new PlainFloor(x, y);
                x += map[1][16].getImg().getWidth(null);
                map[1][17] = new NormalWall(x, y);
                x += map[1][17].getImg().getWidth(null);
                map[1][18] = new PlainFloor(x, y);
                item[1][18] = new FireShoes(x, y);
                x += map[1][18].getImg().getWidth(null);
                map[1][19] = new NormalWall(x, y);
                x += map[1][19].getImg().getWidth(null);

                //BARIS 3
                x = 50;
                y += map[1][0].getImg().getHeight(null);
                map[2][0] = new NormalWall(x, y);
                x += map[2][0].getImg().getWidth(null);
                map[2][1] = new PlainFloor(x, y);
                x += map[2][1].getImg().getWidth(null);
                map[2][2] = new NormalWall(x, y);
                x += map[2][2].getImg().getWidth(null);
                map[2][3] = new NormalWall(x, y);
                x += map[2][3].getImg().getWidth(null);
                map[2][4] = new NormalWall(x, y);
                x += map[2][4].getImg().getWidth(null);
                map[2][5] = new NormalWall(x, y);
                x += map[2][5].getImg().getWidth(null);
                map[2][6] = new NormalWall(x, y);
                x += map[2][6].getImg().getWidth(null);
                map[2][7] = new NormalWall(x, y);
                x += map[2][7].getImg().getWidth(null);
                map[2][8] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[2][8]);
                x += map[2][8].getImg().getWidth(null);
                map[2][9] = new NormalWall(x, y);
                x += map[2][9].getImg().getWidth(null);
                map[2][10] = new NormalWall(x, y);
                x += map[2][10].getImg().getWidth(null);
                map[2][11] = new NormalWall(x, y);
                x += map[2][11].getImg().getWidth(null);
                map[2][12] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[2][12]);
                x += map[2][12].getImg().getWidth(null);
                map[2][13] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[2][13]);
                x += map[2][13].getImg().getWidth(null);
                map[2][14] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[2][14]);
                x += map[2][14].getImg().getWidth(null);
                map[2][15] = new PlainFloor(x, y);
                x += map[2][15].getImg().getWidth(null);
                map[2][16] = new PlainFloor(x, y);
                x += map[2][16].getImg().getWidth(null);
                map[2][17] = new NormalWall(x, y);
                x += map[2][17].getImg().getWidth(null);
                map[2][18] = new PlainFloor(x, y);
                x += map[2][18].getImg().getWidth(null);
                map[2][19] = new NormalWall(x, y);
                x += map[2][19].getImg().getWidth(null);

                //BARIS 4
                x = 50;
                y += map[2][0].getImg().getHeight(null);
                map[3][0] = new NormalWall(x, y);
                x += map[3][0].getImg().getWidth(null);
                map[3][1] = new PlainFloor(x, y);
                x += map[3][1].getImg().getWidth(null);
                map[3][2] = new PlainFloor(x, y);
                x += map[3][2].getImg().getWidth(null);
                map[3][3] = new PlainFloor(x, y);
                x += map[3][3].getImg().getWidth(null);
                map[3][4] = new NormalWall(x, y);
                x += map[3][4].getImg().getWidth(null);
                map[3][5] = new PlainFloor(x, y);
                item[3][5] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[3][5].getImg().getWidth(null);
                map[3][6] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[3][6]);
                x += map[3][6].getImg().getWidth(null);
                map[3][7] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[3][7]);
                x += map[3][7].getImg().getWidth(null);
                map[3][8] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[3][8]);
                x += map[3][8].getImg().getWidth(null);
                map[3][9] = new NormalWall(x, y);
                x += map[3][9].getImg().getWidth(null);
                map[3][10] = new FinishFloor(x, y);
                ff = (FinishFloor) map[3][10];
                x += map[3][10].getImg().getWidth(null);
                map[3][11] = new NormalWall(x, y);
                x += map[3][11].getImg().getWidth(null);
                map[3][12] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[3][12]);
                x += map[3][12].getImg().getWidth(null);
                map[3][13] = new PlainFloor(x, y);
                item[3][13] = new WaterShoes(x, y);
                x += map[3][13].getImg().getWidth(null);
                map[3][14] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[3][14]);
                x += map[3][14].getImg().getWidth(null);
                map[3][15] = new PlainFloor(x, y);
                x += map[3][15].getImg().getWidth(null);
                map[3][16] = new NormalWall(x, y);
                x += map[3][16].getImg().getWidth(null);
                map[3][17] = new NormalWall(x, y);
                x += map[3][17].getImg().getWidth(null);
                map[3][18] = new PlainFloor(x, y);
                x += map[3][18].getImg().getWidth(null);
                map[3][19] = new NormalWall(x, y);
                x += map[3][19].getImg().getWidth(null);

                //BARIS 5
                x = 50;
                y += map[3][0].getImg().getHeight(null);
                map[4][0] = new NormalWall(x, y);
                x += map[4][0].getImg().getWidth(null);
                map[4][1] = new PlainFloor(x, y);
                x += map[4][1].getImg().getWidth(null);
                map[4][2] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[4][2]);
                x += map[4][2].getImg().getWidth(null);
                map[4][3] = new PlainFloor(x, y);
                x += map[4][3].getImg().getWidth(null);
                map[4][4] = new NormalWall(x, y);
                x += map[4][4].getImg().getWidth(null);
                map[4][5] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[4][5]);
                x += map[4][5].getImg().getWidth(null);
                map[4][6] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[4][6]);
                x += map[4][6].getImg().getWidth(null);
                map[4][7] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[4][7]);
                x += map[4][7].getImg().getWidth(null);
                map[4][8] = new PlainFloor(x, y);
                x += map[4][8].getImg().getWidth(null);
                map[4][9] = new NormalWall(x, y);
                x += map[4][9].getImg().getWidth(null);
                map[4][10] = new PlainFloor(x, y);
                x += map[4][10].getImg().getWidth(null);
                map[4][11] = new NormalWall(x, y);
                x += map[4][11].getImg().getWidth(null);
                map[4][12] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[4][12]);
                x += map[4][12].getImg().getWidth(null);
                map[4][13] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[4][13]);
                x += map[4][13].getImg().getWidth(null);
                map[4][14] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[4][14]);
                x += map[4][14].getImg().getWidth(null);
                map[4][15] = new PlainFloor(x, y);
                x += map[4][15].getImg().getWidth(null);
                map[4][16] = new PlainFloor(x, y);
                x += map[4][16].getImg().getWidth(null);
                map[4][17] = new PlainFloor(x, y);
                x += map[4][17].getImg().getWidth(null);
                map[4][18] = new PlainFloor(x, y);
                x += map[4][18].getImg().getWidth(null);
                map[4][19] = new NormalWall(x, y);
                x += map[4][19].getImg().getWidth(null);

                //BARIS 6
                x = 50;
                y += map[4][0].getImg().getHeight(null);
                map[5][0] = new NormalWall(x, y);
                x += map[5][0].getImg().getWidth(null);
                map[5][1] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[5][1]);
                x += map[5][1].getImg().getWidth(null);
                map[5][2] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[5][2]);
                x += map[5][2].getImg().getWidth(null);
                map[5][3] = new PlainFloor(x, y);
                x += map[5][3].getImg().getWidth(null);
                map[5][4] = new PlainFloor(x, y);
                x += map[5][4].getImg().getWidth(null);
                map[5][5] = new PlainFloor(x, y);
                x += map[5][5].getImg().getWidth(null);
                map[5][6] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[5][6]);
                x += map[5][6].getImg().getWidth(null);
                map[5][7] = new PlainFloor(x, y);
                item[5][7] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[5][7].getImg().getWidth(null);
                map[5][8] = new PlainFloor(x, y);
                x += map[5][8].getImg().getWidth(null);
                map[5][9] = new NormalWall(x, y);
                x += map[5][9].getImg().getWidth(null);
                map[5][10] = new Barrier(x, y, player);
                x += map[5][10].getImg().getWidth(null);
                map[5][11] = new NormalWall(x, y);
                x += map[5][11].getImg().getWidth(null);
                map[5][12] = new PlainFloor(x, y);
                x += map[5][12].getImg().getWidth(null);
                map[5][13] = new PlainFloor(x, y);
                x += map[5][13].getImg().getWidth(null);
                map[5][14] = new PlainFloor(x, y);
                x += map[5][14].getImg().getWidth(null);
                map[5][15] = new PlainFloor(x, y);
                x += map[5][15].getImg().getWidth(null);
                map[5][16] = new NormalWall(x, y);
                x += map[5][16].getImg().getWidth(null);
                map[5][17] = new NormalWall(x, y);
                x += map[5][17].getImg().getWidth(null);
                map[5][18] = new PlainFloor(x, y);
                x += map[5][18].getImg().getWidth(null);
                map[5][19] = new NormalWall(x, y);
                x += map[5][19].getImg().getWidth(null);

                //BARIS 7
                x = 50;
                y += map[5][0].getImg().getHeight(null);
                map[6][0] = new NormalWall(x, y);
                x += map[6][0].getImg().getWidth(null);
                map[6][1] = new PlainFloor(x, y);
                item[6][1] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[6][1].getImg().getWidth(null);
                map[6][2] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[6][2]);
                x += map[6][2].getImg().getWidth(null);
                map[6][3] = new PlainFloor(x, y);
                x += map[6][3].getImg().getWidth(null);
                map[6][4] = new PlainFloor(x, y);
                x += map[6][4].getImg().getWidth(null);
                map[6][5] = new PlainFloor(x, y);
                x += map[6][5].getImg().getWidth(null);
                map[6][6] = new NormalWall(x, y);
                x += map[6][6].getImg().getWidth(null);
                map[6][7] = new PlainFloor(x, y);
                x += map[6][7].getImg().getWidth(null);
                map[6][8] = new PlainFloor(x, y);
                x += map[6][8].getImg().getWidth(null);
                map[6][9] = new NormalWall(x, y);
                x += map[6][9].getImg().getWidth(null);
                map[6][10] = new PlainFloor(x, y);
                x += map[6][10].getImg().getWidth(null);
                map[6][11] = new NormalWall(x, y);
                x += map[6][11].getImg().getWidth(null);
                map[6][12] = new NormalWall(x, y);
                x += map[6][12].getImg().getWidth(null);
                map[6][13] = new NormalWall(x, y);
                x += map[6][13].getImg().getWidth(null);
                map[6][14] = new NormalWall(x, y);
                x += map[6][14].getImg().getWidth(null);
                map[6][15] = new NormalWall(x, y);
                x += map[6][15].getImg().getWidth(null);
                map[6][16] = new NormalWall(x, y);
                x += map[6][16].getImg().getWidth(null);
                map[6][17] = new PlainFloor(x, y);
                x += map[6][17].getImg().getWidth(null);
                map[6][18] = new PlainFloor(x, y);
                x += map[6][18].getImg().getWidth(null);
                map[6][19] = new NormalWall(x, y);
                x += map[6][19].getImg().getWidth(null);

                //BARIS 8
                x = 50;
                y += map[6][0].getImg().getHeight(null);
                map[7][0] = new NormalWall(x, y);
                x += map[7][0].getImg().getWidth(null);
                map[7][1] = new NormalWall(x, y);
                x += map[7][1].getImg().getWidth(null);
                map[7][2] = new NormalWall(x, y);
                x += map[7][2].getImg().getWidth(null);
                map[7][3] = new NormalWall(x, y);
                x += map[7][3].getImg().getWidth(null);
                map[7][4] = new NormalWall(x, y);
                x += map[7][4].getImg().getWidth(null);
                map[7][5] = new PlainFloor(x, y);
                x += map[7][5].getImg().getWidth(null);
                map[7][6] = new PlainFloor(x, y);
                x += map[7][6].getImg().getWidth(null);
                map[7][7] = new PlainFloor(x, y);
                x += map[7][7].getImg().getWidth(null);
                map[7][8] = new PlainFloor(x, y);
                x += map[7][8].getImg().getWidth(null);
                map[7][9] = new PlainFloor(x, y);
                x += map[7][9].getImg().getWidth(null);
                map[7][10] = new PlainFloor(x, y);
                x += map[7][10].getImg().getWidth(null);
                map[7][11] = new PlainFloor(x, y);
                x += map[7][11].getImg().getWidth(null);
                map[7][12] = new PlainFloor(x, y);
                x += map[7][12].getImg().getWidth(null);
                map[7][13] = new PlainFloor(x, y);
                x += map[7][13].getImg().getWidth(null);
                map[7][14] = new PlainFloor(x, y);
                x += map[7][14].getImg().getWidth(null);
                map[7][15] = new PlainFloor(x, y);
                x += map[7][15].getImg().getWidth(null);
                map[7][16] = new PlainFloor(x, y);
                x += map[7][16].getImg().getWidth(null);
                map[7][17] = new PlainFloor(x, y);
                x += map[7][17].getImg().getWidth(null);
                map[7][18] = new NormalWall(x, y);
                x += map[7][18].getImg().getWidth(null);
                map[7][19] = new NormalWall(x, y);
                x += map[7][19].getImg().getWidth(null);

                //BARIS 9
                x = 50;
                y += map[7][0].getImg().getHeight(null);
                map[8][0] = new NormalWall(x, y);
                x += map[8][0].getImg().getWidth(null);
                map[8][1] = new PlainFloor(x, y);
                x += map[8][1].getImg().getWidth(null);
                map[8][2] = new PlainFloor(x, y);
                x += map[8][2].getImg().getWidth(null);
                map[8][3] = new PlainFloor(x, y);
                x += map[8][3].getImg().getWidth(null);
                map[8][4] = new PlainFloor(x, y);
                x += map[8][4].getImg().getWidth(null);
                map[8][5] = new PlainFloor(x, y);
                x += map[8][5].getImg().getWidth(null);
                map[8][6] = new NormalWall(x, y);
                x += map[8][6].getImg().getWidth(null);
                map[8][7] = new NormalWall(x, y);
                x += map[8][7].getImg().getWidth(null);
                map[8][8] = new NormalWall(x, y);
                x += map[8][8].getImg().getWidth(null);
                map[8][9] = new NormalWall(x, y);
                x += map[8][9].getImg().getWidth(null);
                map[8][10] = new PlainFloor(x, y);
                x += map[8][10].getImg().getWidth(null);
                map[8][11] = new NormalWall(x, y);
                x += map[8][11].getImg().getWidth(null);
                map[8][12] = new NormalWall(x, y);
                x += map[8][12].getImg().getWidth(null);
                map[8][13] = new NormalWall(x, y);
                x += map[8][13].getImg().getWidth(null);
                map[8][14] = new NormalWall(x, y);
                x += map[8][14].getImg().getWidth(null);
                map[8][15] = new NormalWall(x, y);
                x += map[8][15].getImg().getWidth(null);
                map[8][16] = new NormalWall(x, y);
                x += map[8][16].getImg().getWidth(null);
                map[8][17] = new PlainFloor(x, y);
                x += map[8][17].getImg().getWidth(null);
                map[8][18] = new PlainFloor(x, y);
                x += map[8][18].getImg().getWidth(null);
                map[8][19] = new NormalWall(x, y);
                x += map[8][19].getImg().getWidth(null);

                //BARIS 10
                x = 50;
                y += map[8][0].getImg().getHeight(null);
                map[9][0] = new NormalWall(x, y);
                x += map[9][0].getImg().getWidth(null);
                map[9][1] = new PlainFloor(x, y);
                x += map[9][1].getImg().getWidth(null);
                map[9][2] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[9][2]);
                x += map[9][2].getImg().getWidth(null);
                map[9][3] = new PlainFloor(x, y);
                x += map[9][3].getImg().getWidth(null);
                map[9][4] = new PlainFloor(x, y);
                x += map[9][4].getImg().getWidth(null);
                map[9][5] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[9][5]);
                x += map[9][5].getImg().getWidth(null);
                map[9][6] = new NormalWall(x, y);
                x += map[9][6].getImg().getWidth(null);
                map[9][7] = new PlainFloor(x, y);
                item[9][7] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[9][7].getImg().getWidth(null);
                map[9][8] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[9][8]);
                x += map[9][8].getImg().getWidth(null);
                map[9][9] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[9][9]);
                x += map[9][9].getImg().getWidth(null);
                map[9][10] = new PlainFloor(x, y);
                x += map[9][10].getImg().getWidth(null);
                map[9][11] = new NormalWall(x, y);
                x += map[9][11].getImg().getWidth(null);
                map[9][12] = new PlainFloor(x, y);
                item[9][12] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[9][12].getImg().getWidth(null);
                map[9][13] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[9][13]);
                x += map[9][13].getImg().getWidth(null);
                map[9][14] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[9][14]);
                x += map[9][14].getImg().getWidth(null);
                map[9][15] = new PlainFloor(x, y);
                x += map[9][15].getImg().getWidth(null);
                map[9][16] = new PlainFloor(x, y);
                x += map[9][16].getImg().getWidth(null);
                map[9][17] = new PlainFloor(x, y);
                x += map[9][17].getImg().getWidth(null);
                map[9][18] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[9][18]);
                x += map[9][18].getImg().getWidth(null);
                map[9][19] = new NormalWall(x, y);
                x += map[9][19].getImg().getWidth(null);

                //BARIS 11
                x = 50;
                y += map[9][0].getImg().getHeight(null);
                map[10][0] = new NormalWall(x, y);
                x += map[10][0].getImg().getWidth(null);
                map[10][1] = new PlainFloor(x, y);
                item[10][1] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[10][1].getImg().getWidth(null);
                map[10][2] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[10][2]);
                x += map[10][2].getImg().getWidth(null);
                map[10][3] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[10][3]);
                x += map[10][3].getImg().getWidth(null);
                map[10][4] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[10][4]);
                x += map[10][4].getImg().getWidth(null);
                map[10][5] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[10][5]);
                x += map[10][5].getImg().getWidth(null);
                map[10][6] = new NormalWall(x, y);
                x += map[10][6].getImg().getWidth(null);
                map[10][7] = new PlainFloor(x, y);
                x += map[10][7].getImg().getWidth(null);
                map[10][8] = new PlainFloor(x, y);
                x += map[10][8].getImg().getWidth(null);
                map[10][9] = new PlainFloor(x, y);
                x += map[10][9].getImg().getWidth(null);
                map[10][10] = new PlainFloor(x, y);
                x += map[10][10].getImg().getWidth(null);
                map[10][11] = new NormalWall(x, y);
                x += map[10][11].getImg().getWidth(null);
                map[10][12] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[10][12]);
                x += map[10][12].getImg().getWidth(null);
                map[10][13] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[10][13]);
                x += map[10][13].getImg().getWidth(null);
                map[10][14] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[10][14]);
                x += map[10][14].getImg().getWidth(null);
                map[10][15] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[10][15]);
                x += map[10][15].getImg().getWidth(null);
                map[10][16] = new PlainFloor(x, y);
                x += map[10][16].getImg().getWidth(null);
                map[10][17] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[10][17]);
                x += map[10][17].getImg().getWidth(null);
                map[10][18] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[10][18]);
                x += map[10][18].getImg().getWidth(null);
                map[10][19] = new NormalWall(x, y);
                x += map[10][19].getImg().getWidth(null);

                //BARIS 12
                x = 50;
                y += map[10][0].getImg().getHeight(null);
                for (int i = 0; i < 20; i++) {
                    map[11][i] = new NormalWall(x, y);
                    x += map[11][i].getImg().getWidth(null);
                }
                break;
            case 4:
                map = new Obstacle[12][20];
                item = new Item[12][20];
                posChipX = 10;
                posChipY = 1;

                //BARIS 1
                for (int i = 0; i < 20; i++) {
                    map[0][i] = new NormalWall(x, y);
                    x += map[0][i].getImg().getWidth(null);
                }

                //BARIS 2
                x = 50;
                y += map[0][0].getImg().getHeight(null);
                map[1][0] = new NormalWall(x, y);
                x += map[1][0].getImg().getWidth(null);
                map[1][1] = new PlainFloor(x, y);
                item[1][1] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[1][1].getImg().getWidth(null);
                map[1][2] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[1][2]);
                x += map[1][2].getImg().getWidth(null);
                map[1][3] = new PlainFloor(x, y);
                x += map[1][3].getImg().getWidth(null);
                map[1][4] = new PlainFloor(x, y);
                x += map[1][4].getImg().getWidth(null);
                map[1][5] = new PlainFloor(x, y);
                x += map[1][5].getImg().getWidth(null);
                map[1][6] = new PlainFloor(x, y);
                x += map[1][6].getImg().getWidth(null);
                map[1][7] = new PlainFloor(x, y);
                item[1][7] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[1][7].getImg().getWidth(null);
                map[1][8] = new NormalWall(x, y);
                x += map[1][8].getImg().getWidth(null);
                map[1][9] = new RemovalFloor(x, y);
                x += map[1][9].getImg().getWidth(null);
                map[1][10] = new NormalWall(x, y);
                x += map[1][10].getImg().getWidth(null);
                map[1][11] = new PlainFloor(x, y);
                item[1][11] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[1][11].getImg().getWidth(null);
                map[1][12] = new PlainFloor(x, y);
                x += map[1][12].getImg().getWidth(null);
                map[1][13] = new PlainFloor(x, y);
                x += map[1][13].getImg().getWidth(null);
                map[1][14] = new PlainFloor(x, y);
                x += map[1][14].getImg().getWidth(null);
                map[1][15] = new PlainFloor(x, y);
                x += map[1][15].getImg().getWidth(null);
                map[1][16] = new PlainFloor(x, y);
                item[1][16] = new WaterShoes(x, y);
                x += map[1][16].getImg().getWidth(null);
                map[1][17] = new NormalWall(x, y);
                x += map[1][17].getImg().getWidth(null);
                map[1][18] = new FinishFloor(x, y);
                ff = (FinishFloor) map[1][18];
                x += map[1][18].getImg().getWidth(null);
                map[1][19] = new NormalWall(x, y);
                x += map[1][19].getImg().getWidth(null);

                //BARIS 3
                x = 50;
                y += map[1][0].getImg().getHeight(null);
                map[2][0] = new NormalWall(x, y);
                x += map[2][0].getImg().getWidth(null);
                map[2][1] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[2][1]);
                x += map[2][1].getImg().getWidth(null);
                map[2][2] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[2][2]);
                x += map[2][2].getImg().getWidth(null);
                map[2][3] = new PlainFloor(x, y);
                x += map[2][3].getImg().getWidth(null);
                map[2][4] = new NormalWall(x, y);
                x += map[2][4].getImg().getWidth(null);
                map[2][5] = new NormalWall(x, y);
                x += map[2][5].getImg().getWidth(null);
                map[2][6] = new PlainFloor(x, y);
                x += map[2][6].getImg().getWidth(null);
                map[2][7] = new NormalWall(x, y);
                x += map[2][7].getImg().getWidth(null);
                map[2][8] = new NormalWall(x, y);
                x += map[2][8].getImg().getWidth(null);
                map[2][9] = new PlainFloor(x, y);
                x += map[2][9].getImg().getWidth(null);
                map[2][10] = new NormalWall(x, y);
                x += map[2][10].getImg().getWidth(null);
                map[2][11] = new NormalWall(x, y);
                x += map[2][11].getImg().getWidth(null);
                map[2][12] = new PlainFloor(x, y);
                x += map[2][12].getImg().getWidth(null);
                map[2][13] = new NormalWall(x, y);
                x += map[2][13].getImg().getWidth(null);
                map[2][14] = new PlainFloor(x, y);
                x += map[2][14].getImg().getWidth(null);
                map[2][15] = new NormalWall(x, y);
                x += map[2][15].getImg().getWidth(null);
                map[2][16] = new NormalWall(x, y);
                x += map[2][16].getImg().getWidth(null);
                map[2][17] = new NormalWall(x, y);
                x += map[2][17].getImg().getWidth(null);
                map[2][18] = new PlainFloor(x, y);
                x += map[2][18].getImg().getWidth(null);
                map[2][19] = new NormalWall(x, y);
                x += map[2][19].getImg().getWidth(null);

                //BARIS 4
                x = 50;
                y += map[2][0].getImg().getHeight(null);
                map[3][0] = new NormalWall(x, y);
                x += map[3][0].getImg().getWidth(null);
                map[3][1] = new PlainFloor(x, y);
                x += map[3][1].getImg().getWidth(null);
                map[3][2] = new PlainFloor(x, y);
                x += map[3][2].getImg().getWidth(null);
                map[3][3] = new PlainFloor(x, y);
                x += map[3][3].getImg().getWidth(null);
                map[3][4] = new PlainFloor(x, y);
                x += map[3][4].getImg().getWidth(null);
                map[3][5] = new PlainFloor(x, y);
                x += map[3][5].getImg().getWidth(null);
                map[3][6] = new PlainFloor(x, y);
                x += map[3][6].getImg().getWidth(null);
                map[3][7] = new PlainFloor(x, y);
                x += map[3][7].getImg().getWidth(null);
                map[3][8] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[3][8]);
                x += map[3][8].getImg().getWidth(null);
                map[3][9] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[3][9]);
                x += map[3][9].getImg().getWidth(null);
                map[3][10] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[3][10]);
                x += map[3][10].getImg().getWidth(null);
                map[3][11] = new PlainFloor(x, y);
                x += map[3][11].getImg().getWidth(null);
                map[3][12] = new PlainFloor(x, y);
                x += map[3][12].getImg().getWidth(null);
                map[3][13] = new NormalWall(x, y);
                x += map[3][13].getImg().getWidth(null);
                map[3][14] = new PlainFloor(x, y);
                x += map[3][14].getImg().getWidth(null);
                map[3][15] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[3][15]);
                x += map[3][15].getImg().getWidth(null);
                map[3][16] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[3][16]);
                x += map[3][16].getImg().getWidth(null);
                map[3][17] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[3][17]);
                x += map[3][17].getImg().getWidth(null);
                map[3][18] = new Barrier(x, y, player);
                x += map[3][18].getImg().getWidth(null);
                map[3][19] = new NormalWall(x, y);
                x += map[3][19].getImg().getWidth(null);

                //BARIS 5
                x = 50;
                y += map[3][0].getImg().getHeight(null);
                map[4][0] = new NormalWall(x, y);
                x += map[4][0].getImg().getWidth(null);
                map[4][1] = new NormalWall(x, y);
                x += map[4][1].getImg().getWidth(null);
                map[4][2] = new NormalWall(x, y);
                x += map[4][2].getImg().getWidth(null);
                map[4][3] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[4][3]);
                x += map[4][3].getImg().getWidth(null);
                map[4][4] = new PlainFloor(x, y);
                x += map[4][4].getImg().getWidth(null);
                map[4][5] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[4][5]);
                x += map[4][5].getImg().getWidth(null);
                map[4][6] = new PlainFloor(x, y);
                x += map[4][6].getImg().getWidth(null);
                map[4][7] = new NormalWall(x, y);
                x += map[4][7].getImg().getWidth(null);
                map[4][8] = new NormalWall(x, y);
                x += map[4][8].getImg().getWidth(null);
                map[4][9] = new RemovalFloor(x, y);
                x += map[4][9].getImg().getWidth(null);
                map[4][10] = new NormalWall(x, y);
                x += map[4][10].getImg().getWidth(null);
                map[4][11] = new NormalWall(x, y);
                x += map[4][11].getImg().getWidth(null);
                map[4][12] = new PlainFloor(x, y);
                x += map[4][12].getImg().getWidth(null);
                map[4][13] = new NormalWall(x, y);
                x += map[4][13].getImg().getWidth(null);
                map[4][14] = new NormalWall(x, y);
                x += map[4][14].getImg().getWidth(null);
                map[4][15] = new NormalWall(x, y);
                x += map[4][15].getImg().getWidth(null);
                map[4][16] = new NormalWall(x, y);
                x += map[4][16].getImg().getWidth(null);
                map[4][17] = new NormalWall(x, y);
                x += map[4][17].getImg().getWidth(null);
                map[4][18] = new NormalWall(x, y);
                x += map[4][18].getImg().getWidth(null);
                map[4][19] = new NormalWall(x, y);
                x += map[4][19].getImg().getWidth(null);

                //BARIS 6
                x = 50;
                y += map[4][0].getImg().getHeight(null);
                map[5][0] = new NormalWall(x, y);
                x += map[5][0].getImg().getWidth(null);
                map[5][1] = new PlainFloor(x, y);
                item[5][1] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[5][1].getImg().getWidth(null);
                map[5][2] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[5][2]);
                x += map[5][2].getImg().getWidth(null);
                map[5][3] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[5][3]);
                x += map[5][3].getImg().getWidth(null);
                map[5][4] = new PlainFloor(x, y);
                x += map[5][4].getImg().getWidth(null);
                map[5][5] = new RemovalFloor(x, y);
                x += map[5][5].getImg().getWidth(null);
                map[5][6] = new PlainFloor(x, y);
                x += map[5][6].getImg().getWidth(null);
                map[5][7] = new PlainFloor(x, y);
                x += map[5][7].getImg().getWidth(null);
                map[5][8] = new PlainFloor(x, y);
                x += map[5][8].getImg().getWidth(null);
                map[5][9] = new PlainFloor(x, y);
                x += map[5][9].getImg().getWidth(null);
                map[5][10] = new PlainFloor(x, y);
                x += map[5][10].getImg().getWidth(null);
                map[5][11] = new PlainFloor(x, y);
                x += map[5][11].getImg().getWidth(null);
                map[5][12] = new PlainFloor(x, y);
                x += map[5][12].getImg().getWidth(null);
                map[5][13] = new PlainFloor(x, y);
                x += map[5][13].getImg().getWidth(null);
                map[5][14] = new PlainFloor(x, y);
                x += map[5][14].getImg().getWidth(null);
                map[5][15] = new PlainFloor(x, y);
                x += map[5][15].getImg().getWidth(null);
                map[5][16] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[5][16]);
                x += map[5][16].getImg().getWidth(null);
                map[5][17] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[5][17]);
                x += map[5][17].getImg().getWidth(null);
                map[5][18] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[5][18]);
                x += map[5][18].getImg().getWidth(null);
                map[5][19] = new NormalWall(x, y);
                x += map[5][19].getImg().getWidth(null);

                //BARIS 7
                x = 50;
                y += map[5][0].getImg().getHeight(null);
                map[6][0] = new NormalWall(x, y);
                x += map[6][0].getImg().getWidth(null);
                map[6][1] = new NormalWall(x, y);
                x += map[6][1].getImg().getWidth(null);
                map[6][2] = new NormalWall(x, y);
                x += map[6][2].getImg().getWidth(null);
                map[6][3] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[6][3]);
                x += map[6][3].getImg().getWidth(null);
                map[6][4] = new PlainFloor(x, y);
                x += map[6][4].getImg().getWidth(null);
                map[6][5] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[6][5]);
                x += map[6][5].getImg().getWidth(null);
                map[6][6] = new PlainFloor(x, y);
                x += map[6][6].getImg().getWidth(null);
                map[6][7] = new NormalWall(x, y);
                x += map[6][7].getImg().getWidth(null);
                map[6][8] = new NormalWall(x, y);
                x += map[6][8].getImg().getWidth(null);
                map[6][9] = new RemovalFloor(x, y);
                x += map[6][9].getImg().getWidth(null);
                map[6][10] = new NormalWall(x, y);
                x += map[6][10].getImg().getWidth(null);
                map[6][11] = new NormalWall(x, y);
                x += map[6][11].getImg().getWidth(null);
                map[6][12] = new PlainFloor(x, y);
                x += map[6][12].getImg().getWidth(null);
                map[6][13] = new PlainFloor(x, y);
                item[6][13] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[6][13].getImg().getWidth(null);
                map[6][14] = new NormalWall(x, y);
                x += map[6][14].getImg().getWidth(null);
                map[6][15] = new PlainFloor(x, y);
                x += map[6][15].getImg().getWidth(null);
                map[6][16] = new PlainFloor(x, y);
                x += map[6][16].getImg().getWidth(null);
                map[6][17] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[6][17]);
                x += map[6][17].getImg().getWidth(null);
                map[6][18] = new PlainFloor(x, y);
                item[6][18] = new FireShoes(x, y);
                x += map[6][18].getImg().getWidth(null);
                map[6][19] = new NormalWall(x, y);
                x += map[6][19].getImg().getWidth(null);

                //BARIS 8
                x = 50;
                y += map[6][0].getImg().getHeight(null);
                map[7][0] = new NormalWall(x, y);
                x += map[7][0].getImg().getWidth(null);
                map[7][1] = new PlainFloor(x, y);
                x += map[7][1].getImg().getWidth(null);
                map[7][2] = new PlainFloor(x, y);
                x += map[7][2].getImg().getWidth(null);
                map[7][3] = new PlainFloor(x, y);
                x += map[7][3].getImg().getWidth(null);
                map[7][4] = new PlainFloor(x, y);
                x += map[7][4].getImg().getWidth(null);
                map[7][5] = new PlainFloor(x, y);
                x += map[7][5].getImg().getWidth(null);
                map[7][6] = new PlainFloor(x, y);
                x += map[7][6].getImg().getWidth(null);
                map[7][7] = new PlainFloor(x, y);
                x += map[7][7].getImg().getWidth(null);
                map[7][8] = new NormalWall(x, y);
                x += map[7][8].getImg().getWidth(null);
                map[7][9] = new PlainFloor(x, y);
                x += map[7][9].getImg().getWidth(null);
                map[7][10] = new NormalWall(x, y);
                x += map[7][10].getImg().getWidth(null);
                map[7][11] = new PlainFloor(x, y);
                x += map[7][11].getImg().getWidth(null);
                map[7][12] = new PlainFloor(x, y);
                x += map[7][12].getImg().getWidth(null);
                map[7][13] = new NormalWall(x, y);
                x += map[7][13].getImg().getWidth(null);
                map[7][14] = new RemovalFloor(x, y);
                x += map[7][14].getImg().getWidth(null);
                map[7][15] = new NormalWall(x, y);
                x += map[7][15].getImg().getWidth(null);
                map[7][16] = new NormalWall(x, y);
                x += map[7][16].getImg().getWidth(null);
                map[7][17] = new NormalWall(x, y);
                x += map[7][17].getImg().getWidth(null);
                map[7][18] = new NormalWall(x, y);
                x += map[7][18].getImg().getWidth(null);
                map[7][19] = new NormalWall(x, y);
                x += map[7][19].getImg().getWidth(null);

                //BARIS 9
                x = 50;
                y += map[7][0].getImg().getHeight(null);
                map[8][0] = new NormalWall(x, y);
                x += map[8][0].getImg().getWidth(null);
                map[8][1] = new PlainFloor(x, y);
                x += map[8][1].getImg().getWidth(null);
                map[8][2] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[8][2]);
                x += map[8][2].getImg().getWidth(null);
                map[8][3] = new PlainFloor(x, y);
                x += map[8][3].getImg().getWidth(null);
                map[8][4] = new PlainFloor(x, y);
                x += map[8][4].getImg().getWidth(null);
                map[8][5] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[8][5]);
                x += map[8][5].getImg().getWidth(null);
                map[8][6] = new PlainFloor(x, y);
                x += map[8][6].getImg().getWidth(null);
                map[8][7] = new PlainFloor(x, y);
                x += map[8][7].getImg().getWidth(null);
                map[8][8] = new PlainFloor(x, y);
                x += map[8][8].getImg().getWidth(null);
                map[8][9] = new PlainFloor(x, y);
                x += map[8][9].getImg().getWidth(null);
                map[8][10] = new PlainFloor(x, y);
                x += map[8][10].getImg().getWidth(null);
                map[8][11] = new PlainFloor(x, y);
                x += map[8][11].getImg().getWidth(null);
                map[8][12] = new PlainFloor(x, y);
                x += map[8][12].getImg().getWidth(null);
                map[8][13] = new NormalWall(x, y);
                x += map[8][13].getImg().getWidth(null);
                map[8][14] = new PlainFloor(x, y);
                x += map[8][14].getImg().getWidth(null);
                map[8][15] = new PlainFloor(x, y);
                x += map[8][15].getImg().getWidth(null);
                map[8][16] = new PlainFloor(x, y);
                x += map[8][16].getImg().getWidth(null);
                map[8][17] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[8][17]);
                x += map[8][17].getImg().getWidth(null);
                map[8][18] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[8][18]);
                x += map[8][18].getImg().getWidth(null);
                map[8][19] = new NormalWall(x, y);
                x += map[8][19].getImg().getWidth(null);

                //BARIS 10
                x = 50;
                y += map[8][0].getImg().getHeight(null);
                map[9][0] = new NormalWall(x, y);
                x += map[9][0].getImg().getWidth(null);
                map[9][1] = new PlainFloor(x, y);
                x += map[9][1].getImg().getWidth(null);
                map[9][2] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[9][2]);
                x += map[9][2].getImg().getWidth(null);
                map[9][3] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[9][3]);
                x += map[9][3].getImg().getWidth(null);
                map[9][4] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[9][4]);
                x += map[9][4].getImg().getWidth(null);
                map[9][5] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[9][5]);
                x += map[9][5].getImg().getWidth(null);
                map[9][6] = new PlainFloor(x, y);
                x += map[9][6].getImg().getWidth(null);
                map[9][7] = new NormalWall(x, y);
                x += map[9][7].getImg().getWidth(null);
                map[9][8] = new NormalWall(x, y);
                x += map[9][8].getImg().getWidth(null);
                map[9][9] = new PlainFloor(x, y);
                x += map[9][9].getImg().getWidth(null);
                map[9][10] = new NormalWall(x, y);
                x += map[9][10].getImg().getWidth(null);
                map[9][11] = new NormalWall(x, y);
                x += map[9][11].getImg().getWidth(null);
                map[9][12] = new PlainFloor(x, y);
                x += map[9][12].getImg().getWidth(null);
                map[9][13] = new NormalWall(x, y);
                x += map[9][13].getImg().getWidth(null);
                map[9][14] = new PlainFloor(x, y);
                x += map[9][14].getImg().getWidth(null);
                map[9][15] = new NormalWall(x, y);
                x += map[9][15].getImg().getWidth(null);
                map[9][16] = new NormalWall(x, y);
                x += map[9][16].getImg().getWidth(null);
                map[9][17] = new NormalWall(x, y);
                x += map[9][17].getImg().getWidth(null);
                map[9][18] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[9][18]);
                x += map[9][18].getImg().getWidth(null);
                map[9][19] = new NormalWall(x, y);
                x += map[9][19].getImg().getWidth(null);

                //BARIS 11
                x = 50;
                y += map[9][0].getImg().getHeight(null);
                map[10][0] = new NormalWall(x, y);
                x += map[10][0].getImg().getWidth(null);
                map[10][1] = new PlainFloor(x, y);
                x += map[10][1].getImg().getWidth(null);
                map[10][2] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[10][2]);
                x += map[10][2].getImg().getWidth(null);
                map[10][3] = new PlainFloor(x, y);
                item[10][3] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[10][3].getImg().getWidth(null);
                map[10][4] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[10][4]);
                x += map[10][4].getImg().getWidth(null);
                map[10][5] = new PlainFloor(x, y);
                x += map[10][5].getImg().getWidth(null);
                map[10][6] = new PlainFloor(x, y);
                x += map[10][6].getImg().getWidth(null);
                map[10][7] = new PlainFloor(x, y);
                item[10][7] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[10][7].getImg().getWidth(null);
                map[10][8] = new NormalWall(x, y);
                x += map[10][8].getImg().getWidth(null);
                map[10][9] = new RemovalFloor(x, y);
                x += map[10][9].getImg().getWidth(null);
                map[10][10] = new NormalWall(x, y);
                x += map[10][10].getImg().getWidth(null);
                map[10][11] = new PlainFloor(x, y);
                item[10][11] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[10][11].getImg().getWidth(null);
                map[10][12] = new PlainFloor(x, y);
                x += map[10][12].getImg().getWidth(null);
                map[10][13] = new PlainFloor(x, y);
                x += map[10][13].getImg().getWidth(null);
                map[10][14] = new PlainFloor(x, y);
                x += map[10][14].getImg().getWidth(null);
                map[10][15] = new PlainFloor(x, y);
                x += map[10][15].getImg().getWidth(null);
                map[10][16] = new PlainFloor(x, y);
                x += map[10][16].getImg().getWidth(null);
                map[10][17] = new NormalWall(x, y);
                x += map[10][17].getImg().getWidth(null);
                map[10][18] = new PlainFloor(x, y);
                item[10][18] = new WaterShoes(x, y);
                x += map[10][18].getImg().getWidth(null);
                map[10][19] = new NormalWall(x, y);
                x += map[10][19].getImg().getWidth(null);

                //BARIS 12
                x = 50;
                y += map[10][0].getImg().getHeight(null);
                for (int i = 0; i < 20; i++) {
                    map[11][i] = new NormalWall(x, y);
                    x += map[11][i].getImg().getWidth(null);
                }
                break;
            case 5:
                map = new Obstacle[12][20];
                item = new Item[12][20];
                posChipX = 1;
                posChipY = 6;

                //BARIS 1
                for (int i = 0; i < 20; i++) {
                    map[0][i] = new NormalWall(x, y);
                    x += map[0][i].getImg().getWidth(null);
                }

                //BARIS 2
                x = 50;
                y += map[0][0].getImg().getHeight(null);
                map[1][0] = new NormalWall(x, y);
                x += map[1][0].getImg().getWidth(null);
                map[1][1] = new PlainFloor(x, y);
                item[1][1] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[1][1].getImg().getWidth(null);
                map[1][2] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[1][2]);
                x += map[1][2].getImg().getWidth(null);
                map[1][3] = new PlainFloor(x, y);
                x += map[1][3].getImg().getWidth(null);
                map[1][4] = new PlainFloor(x, y);
                x += map[1][4].getImg().getWidth(null);
                map[1][5] = new RemovalFloor(x, y);
                x += map[1][5].getImg().getWidth(null);
                map[1][6] = new PlainFloor(x, y);
                x += map[1][6].getImg().getWidth(null);
                map[1][7] = new NormalWall(x, y);
                x += map[1][7].getImg().getWidth(null);
                map[1][8] = new NormalWall(x, y);
                x += map[1][8].getImg().getWidth(null);
                map[1][9] = new PlainFloor(x, y);
                item[1][9] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[1][9].getImg().getWidth(null);
                map[1][10] = new NormalWall(x, y);
                x += map[1][10].getImg().getWidth(null);
                map[1][11] = new NormalWall(x, y);
                x += map[1][11].getImg().getWidth(null);
                map[1][12] = new PlainFloor(x, y);
                x += map[1][12].getImg().getWidth(null);
                map[1][13] = new RemovalFloor(x, y);
                x += map[1][13].getImg().getWidth(null);
                map[1][14] = new PlainFloor(x, y);
                x += map[1][14].getImg().getWidth(null);
                map[1][15] = new NormalWall(x, y);
                x += map[1][15].getImg().getWidth(null);
                map[1][16] = new PlainFloor(x, y);
                x += map[1][16].getImg().getWidth(null);
                map[1][17] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[1][17].getImg().getWidth(null);
                map[1][18] = new PlainFloor(x, y);
                item[1][18] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[1][18].getImg().getWidth(null);
                map[1][19] = new NormalWall(x, y);
                x += map[1][19].getImg().getWidth(null);

                //BARIS 3
                x = 50;
                y += map[1][0].getImg().getHeight(null);
                map[2][0] = new NormalWall(x, y);
                x += map[2][0].getImg().getWidth(null);
                map[2][1] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[2][1]);
                x += map[2][1].getImg().getWidth(null);
                map[2][2] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[2][2]);
                x += map[2][2].getImg().getWidth(null);
                map[2][3] = new PlainFloor(x, y);
                x += map[2][3].getImg().getWidth(null);
                map[2][4] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[2][4]);
                x += map[2][4].getImg().getWidth(null);
                map[2][5] = new NormalWall(x, y);
                x += map[2][5].getImg().getWidth(null);
                map[2][6] = new PlainFloor(x, y);
                x += map[2][6].getImg().getWidth(null);
                map[2][7] = new PlainFloor(x, y);
                x += map[2][7].getImg().getWidth(null);
                map[2][8] = new PlainFloor(x, y);
                x += map[2][8].getImg().getWidth(null);
                map[2][9] = new PlainFloor(x, y);
                x += map[2][9].getImg().getWidth(null);
                map[2][10] = new PlainFloor(x, y);
                x += map[2][10].getImg().getWidth(null);
                map[2][11] = new PlainFloor(x, y);
                x += map[2][11].getImg().getWidth(null);
                map[2][12] = new PlainFloor(x, y);
                x += map[2][12].getImg().getWidth(null);
                map[2][13] = new NormalWall(x, y);
                x += map[2][13].getImg().getWidth(null);
                map[2][14] = new PlainFloor(x, y);
                x += map[2][14].getImg().getWidth(null);
                map[2][15] = new PlainFloor(x, y);
                x += map[2][15].getImg().getWidth(null);
                map[2][16] = new PlainFloor(x, y);
                x += map[2][16].getImg().getWidth(null);
                map[2][17] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[2][17].getImg().getWidth(null);
                map[2][18] = new RandomObstacle(x, y, new PlainFloor(x, y));
                x += map[2][18].getImg().getWidth(null);
                map[2][19] = new NormalWall(x, y);
                x += map[2][19].getImg().getWidth(null);

                //BARIS 4
                x = 50;
                y += map[2][0].getImg().getHeight(null);
                map[3][0] = new NormalWall(x, y);
                x += map[3][0].getImg().getWidth(null);
                map[3][1] = new PlainFloor(x, y);
                x += map[3][1].getImg().getWidth(null);
                map[3][2] = new PlainFloor(x, y);
                x += map[3][2].getImg().getWidth(null);
                map[3][3] = new PlainFloor(x, y);
                x += map[3][3].getImg().getWidth(null);
                map[3][4] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[3][4]);
                x += map[3][4].getImg().getWidth(null);
                map[3][5] = new NormalWall(x, y);
                x += map[3][5].getImg().getWidth(null);
                map[3][6] = new PlainFloor(x, y);
                x += map[3][6].getImg().getWidth(null);
                map[3][7] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[3][7].getImg().getWidth(null);
                map[3][8] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[3][8].getImg().getWidth(null);
                map[3][9] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[3][9].getImg().getWidth(null);
                map[3][10] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[3][10].getImg().getWidth(null);
                map[3][11] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[3][11].getImg().getWidth(null);
                map[3][12] = new PlainFloor(x, y);
                x += map[3][12].getImg().getWidth(null);
                map[3][13] = new NormalWall(x, y);
                x += map[3][13].getImg().getWidth(null);
                map[3][14] = new PlainFloor(x, y);
                x += map[3][14].getImg().getWidth(null);
                map[3][15] = new NormalWall(x, y);
                x += map[3][15].getImg().getWidth(null);
                map[3][16] = new PlainFloor(x, y);
                x += map[3][16].getImg().getWidth(null);
                map[3][17] = new PlainFloor(x, y);
                x += map[3][17].getImg().getWidth(null);
                map[3][18] = new PlainFloor(x, y);
                x += map[3][18].getImg().getWidth(null);
                map[3][19] = new NormalWall(x, y);
                x += map[3][19].getImg().getWidth(null);

                //BARIS 5
                x = 50;
                y += map[3][0].getImg().getHeight(null);
                map[4][0] = new NormalWall(x, y);
                x += map[4][0].getImg().getWidth(null);
                map[4][1] = new NormalWall(x, y);
                x += map[4][1].getImg().getWidth(null);
                map[4][2] = new NormalWall(x, y);
                x += map[4][2].getImg().getWidth(null);
                map[4][3] = new PlainFloor(x, y);
                x += map[4][3].getImg().getWidth(null);
                map[4][4] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[4][4]);
                x += map[4][4].getImg().getWidth(null);
                map[4][5] = new NormalWall(x, y);
                x += map[4][5].getImg().getWidth(null);
                map[4][6] = new PlainFloor(x, y);
                x += map[4][6].getImg().getWidth(null);
                map[4][7] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[4][7].getImg().getWidth(null);
                map[4][8] = new Barrier(x, y, player);
                x += map[4][8].getImg().getWidth(null);
                map[4][9] = new Barrier(x, y, player);
                x += map[4][9].getImg().getWidth(null);
                map[4][10] = new Barrier(x, y, player);
                x += map[4][10].getImg().getWidth(null);
                map[4][11] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[4][11].getImg().getWidth(null);
                map[4][12] = new PlainFloor(x, y);
                x += map[4][12].getImg().getWidth(null);
                map[4][13] = new NormalWall(x, y);
                x += map[4][13].getImg().getWidth(null);
                map[4][14] = new PlainFloor(x, y);
                x += map[4][14].getImg().getWidth(null);
                map[4][15] = new PlainFloor(x, y);
                x += map[4][15].getImg().getWidth(null);
                map[4][16] = new PlainFloor(x, y);
                x += map[4][16].getImg().getWidth(null);
                map[4][17] = new NormalWall(x, y);
                x += map[4][17].getImg().getWidth(null);
                map[4][18] = new NormalWall(x, y);
                x += map[4][18].getImg().getWidth(null);
                map[4][19] = new NormalWall(x, y);
                x += map[4][19].getImg().getWidth(null);

                //BARIS 6
                x = 50;
                y += map[4][0].getImg().getHeight(null);
                map[5][0] = new NormalWall(x, y);
                x += map[5][0].getImg().getWidth(null);
                map[5][1] = new PlainFloor(x, y);
                item[5][1] = new WaterShoes(x, y);
                x += map[5][1].getImg().getWidth(null);
                map[5][2] = new PlainFloor(x, y);
                x += map[5][2].getImg().getWidth(null);
                map[5][3] = new PlainFloor(x, y);
                x += map[5][3].getImg().getWidth(null);
                map[5][4] = new PlainFloor(x, y);
                x += map[5][4].getImg().getWidth(null);
                map[5][5] = new NormalWall(x, y);
                x += map[5][5].getImg().getWidth(null);
                map[5][6] = new PlainFloor(x, y);
                x += map[5][6].getImg().getWidth(null);
                map[5][7] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[5][7].getImg().getWidth(null);
                map[5][8] = new Barrier(x, y, player);
                x += map[5][8].getImg().getWidth(null);
                map[5][9] = new FinishFloor(x, y);
                ff = (FinishFloor) map[5][9];
                x += map[5][9].getImg().getWidth(null);
                map[5][10] = new Barrier(x, y, player);
                x += map[5][10].getImg().getWidth(null);
                map[5][11] = new RandomObstacle(x, y, new PlainFloor(x, y));
                x += map[5][11].getImg().getWidth(null);
                map[5][12] = new PlainFloor(x, y);
                x += map[5][12].getImg().getWidth(null);
                map[5][13] = new NormalWall(x, y);
                x += map[5][13].getImg().getWidth(null);
                map[5][14] = new PlainFloor(x, y);
                x += map[5][14].getImg().getWidth(null);
                map[5][15] = new NormalWall(x, y);
                x += map[5][15].getImg().getWidth(null);
                map[5][16] = new PlainFloor(x, y);
                x += map[5][16].getImg().getWidth(null);
                map[5][17] = new PlainFloor(x, y);
                x += map[5][17].getImg().getWidth(null);
                map[5][18] = new PlainFloor(x, y);
                item[5][18] = new FireShoes(x, y);
                x += map[5][18].getImg().getWidth(null);
                map[5][19] = new NormalWall(x, y);
                x += map[5][19].getImg().getWidth(null);

                //BARIS 7
                x = 50;
                y += map[5][0].getImg().getHeight(null);
                map[6][0] = new NormalWall(x, y);
                x += map[6][0].getImg().getWidth(null);
                map[6][1] = new NormalWall(x, y);
                x += map[6][1].getImg().getWidth(null);
                map[6][2] = new NormalWall(x, y);
                x += map[6][2].getImg().getWidth(null);
                map[6][3] = new PlainFloor(x, y);
                x += map[6][3].getImg().getWidth(null);
                map[6][4] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[6][4]);
                x += map[6][4].getImg().getWidth(null);
                map[6][5] = new NormalWall(x, y);
                x += map[6][5].getImg().getWidth(null);
                map[6][6] = new PlainFloor(x, y);
                x += map[6][6].getImg().getWidth(null);
                map[6][7] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[6][7].getImg().getWidth(null);
                map[6][8] = new Barrier(x, y, player);
                x += map[6][8].getImg().getWidth(null);
                map[6][9] = new Barrier(x, y, player);
                x += map[6][9].getImg().getWidth(null);
                map[6][10] = new Barrier(x, y, player);
                x += map[6][10].getImg().getWidth(null);
                map[6][11] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[6][11].getImg().getWidth(null);
                map[6][12] = new PlainFloor(x, y);
                x += map[6][12].getImg().getWidth(null);
                map[6][13] = new NormalWall(x, y);
                x += map[6][13].getImg().getWidth(null);
                map[6][14] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[6][14]);
                x += map[6][14].getImg().getWidth(null);
                map[6][15] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[6][15]);
                x += map[6][15].getImg().getWidth(null);
                map[6][16] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[6][16]);
                x += map[6][16].getImg().getWidth(null);
                map[6][17] = new NormalWall(x, y);
                x += map[6][17].getImg().getWidth(null);
                map[6][18] = new NormalWall(x, y);
                x += map[6][18].getImg().getWidth(null);
                map[6][19] = new NormalWall(x, y);
                x += map[6][19].getImg().getWidth(null);

                //BARIS 8
                x = 50;
                y += map[6][0].getImg().getHeight(null);
                map[7][0] = new NormalWall(x, y);
                x += map[7][0].getImg().getWidth(null);
                map[7][1] = new PlainFloor(x, y);
                x += map[7][1].getImg().getWidth(null);
                map[7][2] = new PlainFloor(x, y);
                x += map[7][2].getImg().getWidth(null);
                map[7][3] = new PlainFloor(x, y);
                x += map[7][3].getImg().getWidth(null);
                map[7][4] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[7][4]);
                x += map[7][4].getImg().getWidth(null);
                map[7][5] = new NormalWall(x, y);
                x += map[7][5].getImg().getWidth(null);
                map[7][6] = new PlainFloor(x, y);
                x += map[7][6].getImg().getWidth(null);
                map[7][7] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[7][7].getImg().getWidth(null);
                map[7][8] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[7][8].getImg().getWidth(null);
                map[7][9] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[7][9].getImg().getWidth(null);
                map[7][10] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[7][10].getImg().getWidth(null);
                map[7][11] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[7][11].getImg().getWidth(null);
                map[7][12] = new PlainFloor(x, y);
                x += map[7][12].getImg().getWidth(null);
                map[7][13] = new NormalWall(x, y);
                x += map[7][13].getImg().getWidth(null);
                map[7][14] = new PlainFloor(x, y);
                x += map[7][14].getImg().getWidth(null);
                map[7][15] = new PlainFloor(x, y);
                x += map[7][15].getImg().getWidth(null);
                map[7][16] = new PlainFloor(x, y);
                x += map[7][16].getImg().getWidth(null);
                map[7][17] = new PlainFloor(x, y);
                x += map[7][17].getImg().getWidth(null);
                map[7][18] = new PlainFloor(x, y);
                x += map[7][18].getImg().getWidth(null);
                map[7][19] = new NormalWall(x, y);
                x += map[7][19].getImg().getWidth(null);

                //BARIS 9
                x = 50;
                y += map[7][0].getImg().getHeight(null);
                map[8][0] = new NormalWall(x, y);
                x += map[8][0].getImg().getWidth(null);
                map[8][1] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[8][1]);
                x += map[8][1].getImg().getWidth(null);
                map[8][2] = new PlainFloor(x, y);
                x += map[8][2].getImg().getWidth(null);
                map[8][3] = new PlainFloor(x, y);
                x += map[8][3].getImg().getWidth(null);
                map[8][4] = new PlainFloor(x, y);
                x += map[8][4].getImg().getWidth(null);
                map[8][5] = new NormalWall(x, y);
                x += map[8][5].getImg().getWidth(null);
                map[8][6] = new PlainFloor(x, y);
                x += map[8][6].getImg().getWidth(null);
                map[8][7] = new PlainFloor(x, y);
                x += map[8][7].getImg().getWidth(null);
                map[8][8] = new PlainFloor(x, y);
                x += map[8][8].getImg().getWidth(null);
                map[8][9] = new PlainFloor(x, y);
                x += map[8][9].getImg().getWidth(null);
                map[8][10] = new PlainFloor(x, y);
                x += map[8][10].getImg().getWidth(null);
                map[8][11] = new PlainFloor(x, y);
                x += map[8][11].getImg().getWidth(null);
                map[8][12] = new PlainFloor(x, y);
                x += map[8][12].getImg().getWidth(null);
                map[8][13] = new NormalWall(x, y);
                x += map[8][13].getImg().getWidth(null);
                map[8][14] = new PlainFloor(x, y);
                x += map[8][14].getImg().getWidth(null);
                map[8][15] = new NormalWall(x, y);
                x += map[8][15].getImg().getWidth(null);
                map[8][16] = new PlainFloor(x, y);
                x += map[8][16].getImg().getWidth(null);
                map[8][17] = new PlainFloor(x, y);
                x += map[8][17].getImg().getWidth(null);
                map[8][18] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[8][18]);
                x += map[8][18].getImg().getWidth(null);
                map[8][19] = new NormalWall(x, y);
                x += map[8][19].getImg().getWidth(null);

                //BARIS 10
                x = 50;
                y += map[8][0].getImg().getHeight(null);
                map[9][0] = new NormalWall(x, y);
                x += map[9][0].getImg().getWidth(null);
                map[9][1] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[9][1]);
                x += map[9][1].getImg().getWidth(null);
                map[9][2] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[9][2]);
                x += map[9][2].getImg().getWidth(null);
                map[9][3] = new PlainFloor(x, y);
                x += map[9][3].getImg().getWidth(null);
                map[9][4] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[9][4]);
                x += map[9][4].getImg().getWidth(null);
                map[9][5] = new RemovalFloor(x, y);
                x += map[9][5].getImg().getWidth(null);
                map[9][6] = new PlainFloor(x, y);
                x += map[9][6].getImg().getWidth(null);
                map[9][7] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[9][7].getImg().getWidth(null);
                map[9][8] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[9][8].getImg().getWidth(null);
                map[9][9] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[9][9].getImg().getWidth(null);
                map[9][10] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[9][10].getImg().getWidth(null);
                map[9][11] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[9][11].getImg().getWidth(null);
                map[9][12] = new PlainFloor(x, y);
                x += map[9][12].getImg().getWidth(null);
                map[9][13] = new PlainFloor(x, y);
                x += map[9][13].getImg().getWidth(null);
                map[9][14] = new PlainFloor(x, y);
                x += map[9][14].getImg().getWidth(null);
                map[9][15] = new PlainFloor(x, y);
                x += map[9][15].getImg().getWidth(null);
                map[9][16] = new PlainFloor(x, y);
                x += map[9][16].getImg().getWidth(null);
                map[9][17] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[9][17]);
                x += map[9][17].getImg().getWidth(null);
                map[9][18] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[9][18]);
                x += map[9][18].getImg().getWidth(null);
                map[9][19] = new NormalWall(x, y);
                x += map[9][19].getImg().getWidth(null);

                //BARIS 11
                x = 50;
                y += map[9][0].getImg().getHeight(null);
                map[10][0] = new NormalWall(x, y);
                x += map[10][0].getImg().getWidth(null);
                map[10][1] = new PlainFloor(x, y);
                item[10][1] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[10][1].getImg().getWidth(null);
                map[10][2] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[10][2]);
                x += map[10][2].getImg().getWidth(null);
                map[10][3] = new WaterFloor(x, y);
                arrOfWF.add((WaterFloor) map[10][3]);
                x += map[10][3].getImg().getWidth(null);
                map[10][4] = new PlainFloor(x, y);
                item[10][4] = new FireShoes(x, y);
                x += map[10][4].getImg().getWidth(null);
                map[10][5] = new NormalWall(x, y);
                x += map[10][5].getImg().getWidth(null);
                map[10][6] = new PlainFloor(x, y);
                x += map[10][6].getImg().getWidth(null);
                map[10][7] = new PlainFloor(x, y);
                x += map[10][7].getImg().getWidth(null);
                map[10][8] = new RandomObstacle(x, y, new NormalWall(x, y));
                x += map[10][8].getImg().getWidth(null);
                map[10][9] = new PlainFloor(x, y);
                item[10][9] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[10][9].getImg().getWidth(null);
                map[10][10] = new RandomObstacle(x, y, new PlainFloor(x, y));
                x += map[10][10].getImg().getWidth(null);
                map[10][11] = new PlainFloor(x, y);
                x += map[10][11].getImg().getWidth(null);
                map[10][12] = new PlainFloor(x, y);
                x += map[10][12].getImg().getWidth(null);
                map[10][13] = new NormalWall(x, y);
                x += map[10][13].getImg().getWidth(null);
                map[10][14] = new PlainFloor(x, y);
                x += map[10][14].getImg().getWidth(null);
                map[10][15] = new NormalWall(x, y);
                x += map[10][15].getImg().getWidth(null);
                map[10][16] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[10][16]);
                x += map[10][16].getImg().getWidth(null);
                map[10][17] = new FireFloor(x, y);
                arrOfFF.add((FireFloor) map[10][17]);
                x += map[10][17].getImg().getWidth(null);
                map[10][18] = new PlainFloor(x, y);
                item[10][18] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[10][18].getImg().getWidth(null);
                map[10][19] = new NormalWall(x, y);
                x += map[10][19].getImg().getWidth(null);

                //BARIS 12
                x = 50;
                y += map[10][0].getImg().getHeight(null);
                for (int i = 0; i < 20; i++) {
                    map[11][i] = new NormalWall(x, y);
                    x += map[11][i].getImg().getWidth(null);
                }
                break;
        }
    }
    
    /**
     * method untuk mendapatkan kumpulan obstacle dalam stage tsb
     * @return array of obstacle(kumpulan obstacle)
     */
    public Obstacle[][] getMap() {
        return map;
    }
    
    /**
     * mendapatkan kumpulan item dalam stage tsb
     * @return array of item(kumpulan item)
     */
    public Item[][] getItem() {
        return item;
    }
    
    /**
     * mendapatkan total jumlah IC dalam 1 stage
     * @return total IC dalam 1 stage
     */
    public int getSumOfIC() {
        return counterIC;
    }
    
    /**
     * untuk mengetahui posisi x chip nya pada saat ini
     * @return posisi x dari chipnya
     */
    public int getPosChipX() {
        return posChipX;
    }
    
    /**
     * untuk mengetahui posisi y chip nya pada saat ini
     * @return posisi y dari chipnya
     */
    public int getPosChipY() {
        return posChipY;
    }
    
    /**
     * mendapatkan kumpulan firefloor dalam 1 stage
     * @return kumpulan fire floor(arraylist) dalam 1 stage
     */
    public ArrayList<FireFloor> getArrOfFF() {
        return arrOfFF;
    }
    
    /**
     * mendapatkan objek finish floor dalam 1 stage
     * @return objek finish floor
     */
    public FinishFloor getFinishFloor() {
        return ff;
    }
    
    /**
     * mendapatkan kumpulan water floor dalam 1 stage
     * @return kumpulan water floor(arraylist) dalam 1 stage
     */
    public ArrayList<WaterFloor> getArrOfWF() {
        return arrOfWF;
    }
}