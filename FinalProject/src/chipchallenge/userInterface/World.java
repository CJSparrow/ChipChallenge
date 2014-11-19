/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.userInterface;

import chipchallenge.engine.Chip;
import chipchallenge.engine.item.IntergratedCircuit;
import chipchallenge.engine.item.Item;
import chipchallenge.engine.obstacle.Obstacle;
import chipchallenge.engine.obstacle.floorObs.PlainFloor;
import chipchallenge.engine.obstacle.floorObs.dangerousFloor.FireFloor;
import chipchallenge.engine.obstacle.floorObs.dangerousFloor.WaterFloor;
import chipchallenge.engine.obstacle.floorObs.shiftFloor.FinishFloor;
import chipchallenge.engine.obstacle.staticObs.Barrier;
import chipchallenge.engine.obstacle.staticObs.wall.NormalWall;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class World {

    private Obstacle[][] map;
    private Item[][] item;
    private Chip player;
    private int counterIC;
    private int posChipX;
    private int posChipY;

    public World(int level, Chip player) {
        counterIC = 0;
        this.player = player;
        int x = 50;
        int y = 50;
        switch (level) {
            //LEVEL 1
            case 1:
                map = new Obstacle[10][12];
                item = new Item[10][12];
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
                x += map[4][2].getImg().getWidth(null);
                map[4][3] = new PlainFloor(x, y);
                x += map[4][3].getImg().getWidth(null);
                map[4][4] = new PlainFloor(x, y);
                item[4][4] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[4][4].getImg().getWidth(null);
                map[4][5] = new FireFloor(x, y);
                x += map[4][5].getImg().getWidth(null);
                map[4][6] = new PlainFloor(x, y);
                x += map[4][6].getImg().getWidth(null);
                map[4][7] = new FireFloor(x, y);
                x += map[4][7].getImg().getWidth(null);
                map[4][8] = new FireFloor(x, y);
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
                x += map[6][2].getImg().getWidth(null);
                map[6][3] = new PlainFloor(x, y);
                x += map[6][3].getImg().getWidth(null);
                map[6][4] = new FireFloor(x, y);
                x += map[6][4].getImg().getWidth(null);
                map[6][5] = new FireFloor(x, y);
                x += map[6][5].getImg().getWidth(null);
                map[6][6] = new FireFloor(x, y);
                x += map[6][6].getImg().getWidth(null);
                map[6][7] = new PlainFloor(x, y);
                x += map[6][7].getImg().getWidth(null);
                map[6][8] = new FireFloor(x, y);
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
                x += map[7][4].getImg().getWidth(null);
                map[7][5] = new PlainFloor(x, y);
                x += map[7][5].getImg().getWidth(null);
                map[7][6] = new PlainFloor(x, y);
                x += map[7][6].getImg().getWidth(null);
                map[7][7] = new PlainFloor(x, y);
                x += map[7][7].getImg().getWidth(null);
                map[7][8] = new FireFloor(x, y);
                x += map[7][8].getImg().getWidth(null);
                map[7][9] = new NormalWall(x, y);
                x += map[7][9].getImg().getWidth(null);

                //BARIS 9
                x = 50;
                y += map[7][0].getImg().getHeight(null);
                map[8][0] = new NormalWall(x, y);
                x += map[8][0].getImg().getWidth(null);
                map[8][1] = new FireFloor(x, y);
                x += map[8][1].getImg().getWidth(null);
                map[8][2] = new FireFloor(x, y);
                x += map[8][2].getImg().getWidth(null);
                map[8][3] = new PlainFloor(x, y);
                x += map[8][3].getImg().getWidth(null);
                map[8][4] = new PlainFloor(x, y);
                x += map[8][4].getImg().getWidth(null);
                map[8][5] = new PlainFloor(x, y);
                x += map[8][5].getImg().getWidth(null);
                map[8][6] = new FireFloor(x, y);
                x += map[8][6].getImg().getWidth(null);
                map[8][7] = new FireFloor(x, y);
                x += map[8][7].getImg().getWidth(null);
                map[8][8] = new FireFloor(x, y);
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
            case 2 :
                map = new Obstacle[12][15];
                item = new Item[12][15];
                posChipX = 8;
                posChipY = 7;
                x = 50;
                y = 50;

                //BARIS 1
                map[0][0] = new NormalWall(x, y);
                x += map[0][0].getImg().getWidth(null);
                map[0][1] = new PlainFloor(x, y);
                x += map[0][1].getImg().getWidth(null);
                map[0][2] = new FireFloor(x, y);
                x += map[0][2].getImg().getWidth(null);
                map[0][3] = new PlainFloor(x, y);
                x += map[0][3].getImg().getWidth(null);
                map[0][4] = new FireFloor(x, y);
                x += map[0][4].getImg().getWidth(null);
                map[0][5] = new PlainFloor(x, y);
                x += map[0][5].getImg().getWidth(null);
                map[0][6] = new FireFloor(x, y);
                x += map[0][6].getImg().getWidth(null);
                map[0][7] = new PlainFloor(x, y);
                x += map[0][7].getImg().getWidth(null);
                map[0][8] = new FireFloor(x, y);
                x += map[0][8].getImg().getWidth(null);
                map[0][9] = new PlainFloor(x, y);
                x += map[0][9].getImg().getWidth(null);
                map[0][10] = new FireFloor(x, y);
                x += map[0][10].getImg().getWidth(null);
                map[0][11] = new FireFloor(x, y);
                x += map[0][11].getImg().getWidth(null);
                map[0][12] = new FireFloor(x, y);
                x += map[0][12].getImg().getWidth(null);
                map[0][13] = new PlainFloor(x, y);
                item[0][13] = new IntergratedCircuit(x, y);
                counterIC++;
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
                x += map[1][3].getImg().getWidth(null);
                map[1][4] = new PlainFloor(x, y);
                x += map[1][4].getImg().getWidth(null);
                map[1][5] = new FireFloor(x, y);
                x += map[1][5].getImg().getWidth(null);
                map[1][6] = new PlainFloor(x, y);
                x += map[1][6].getImg().getWidth(null);
                map[1][7] = new FireFloor(x, y);
                x += map[1][7].getImg().getWidth(null);
                map[1][8] = new PlainFloor(x, y);
                x += map[1][8].getImg().getWidth(null);
                map[1][9] = new FireFloor(x, y);
                x += map[1][9].getImg().getWidth(null);
                map[1][10] = new FireFloor(x, y);
                x += map[1][10].getImg().getWidth(null);
                map[1][11] = new FireFloor(x, y);
                x += map[1][11].getImg().getWidth(null);
                map[1][12] = new FireFloor(x, y);
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
                x += map[2][2].getImg().getWidth(null);
                map[2][3] = new PlainFloor(x, y);
                x += map[2][3].getImg().getWidth(null);
                map[2][4] = new FireFloor(x, y);
                x += map[2][4].getImg().getWidth(null);
                map[2][5] = new PlainFloor(x, y);
                x += map[2][5].getImg().getWidth(null);
                map[2][6] = new FireFloor(x, y);
                x += map[2][6].getImg().getWidth(null);
                map[2][7] = new PlainFloor(x, y);
                x += map[2][7].getImg().getWidth(null);
                map[2][8] = new FireFloor(x, y);
                x += map[2][8].getImg().getWidth(null);
                map[2][9] = new PlainFloor(x, y);
                x += map[2][9].getImg().getWidth(null);
                map[2][10] = new FireFloor(x, y);
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
                x += map[4][11].getImg().getWidth(null);
                map[4][12] = new WaterFloor(x, y);
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
                x += map[5][1].getImg().getWidth(null);
                map[5][2] = new WaterFloor(x, y);
                x += map[5][2].getImg().getWidth(null);
                map[5][3] = new PlainFloor(x, y);
                x += map[5][3].getImg().getWidth(null);
                map[5][4] = new WaterFloor(x, y);
                x += map[5][4].getImg().getWidth(null);
                map[5][5] = new WaterFloor(x, y);
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
                x += map[5][10].getImg().getWidth(null);
                map[5][11] = new WaterFloor(x, y);
                x += map[5][11].getImg().getWidth(null);
                map[5][12] = new WaterFloor(x, y);
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
                x += map[6][1].getImg().getWidth(null);
                map[6][2] = new WaterFloor(x, y);
                x += map[6][2].getImg().getWidth(null);
                map[6][3] = new PlainFloor(x, y);
                item[6][3] = new IntergratedCircuit(x, y);
                counterIC++;
                x += map[6][3].getImg().getWidth(null);
                map[6][4] = new WaterFloor(x, y);
                x += map[6][4].getImg().getWidth(null);
                map[6][5] = new WaterFloor(x, y);
                x += map[6][5].getImg().getWidth(null);
                map[6][6] = new PlainFloor(x, y);
                x += map[6][6].getImg().getWidth(null);
                map[6][7] = new PlainFloor(x, y);
                x += map[6][7].getImg().getWidth(null);
                map[6][8] = new PlainFloor(x, y);
                x += map[6][8].getImg().getWidth(null);
                map[6][9] = new WaterFloor(x, y);
                x += map[6][9].getImg().getWidth(null);
                map[6][10] = new WaterFloor(x, y);
                x += map[6][10].getImg().getWidth(null);
                map[6][11] = new WaterFloor(x, y);
                x += map[6][11].getImg().getWidth(null);
                map[6][12] = new WaterFloor(x, y);
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
                x += map[7][1].getImg().getWidth(null);
                map[7][2] = new WaterFloor(x, y);
                x += map[7][2].getImg().getWidth(null);
                map[7][3] = new WaterFloor(x, y);
                x += map[7][3].getImg().getWidth(null);
                map[7][4] = new WaterFloor(x, y);
                x += map[7][4].getImg().getWidth(null);
                map[7][5] = new WaterFloor(x, y);
                x += map[7][5].getImg().getWidth(null);
                map[7][6] = new WaterFloor(x, y);
                x += map[7][6].getImg().getWidth(null);
                map[7][7] = new PlainFloor(x, y);
                x += map[7][7].getImg().getWidth(null);
                map[7][8] = new WaterFloor(x, y);
                x += map[7][8].getImg().getWidth(null);
                map[7][9] = new WaterFloor(x, y);
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
                x += map[10][2].getImg().getWidth(null);
                map[10][3] = new WaterFloor(x, y);
                x += map[10][3].getImg().getWidth(null);
                map[10][4] = new WaterFloor(x, y);
                x += map[10][4].getImg().getWidth(null);
                map[10][5] = new WaterFloor(x, y);
                x += map[10][5].getImg().getWidth(null);
                map[10][6] = new WaterFloor(x, y);
                x += map[10][6].getImg().getWidth(null);
                map[10][7] = new Barrier(x, y, player);
                x += map[10][7].getImg().getWidth(null);
                map[10][8] = new WaterFloor(x, y);
                x += map[10][8].getImg().getWidth(null);
                map[10][9] = new WaterFloor(x, y);
                x += map[10][9].getImg().getWidth(null);
                map[10][10] = new WaterFloor(x, y);
                x += map[10][10].getImg().getWidth(null);
                map[10][11] = new WaterFloor(x, y);
                x += map[10][11].getImg().getWidth(null);
                map[10][12] = new WaterFloor(x, y);
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
                x += map[11][5].getImg().getWidth(null);
                map[11][6] = new WaterFloor(x, y);
                x += map[11][6].getImg().getWidth(null);
                map[11][7] = new FinishFloor(x, y);
                x += map[11][7].getImg().getWidth(null);
                map[11][8] = new WaterFloor(x, y);
                x += map[11][8].getImg().getWidth(null);
                map[11][9] = new WaterFloor(x, y);
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
                
            default : break;
        }
    }

    public Obstacle[][] getMap() {
        return map;
    }

    public Item[][] getItem() {
        return item;
    }

    public int getSumOfIC() {
        return counterIC;
    }

    public int getPosChipX() {
        return posChipX;
    }

    public int getPosChipY() {
        return posChipY;
    }
}
