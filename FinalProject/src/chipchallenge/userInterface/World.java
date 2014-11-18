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
import chipchallenge.engine.obstacle.floorObs.shiftFloor.FinishFloor;
import chipchallenge.engine.obstacle.staticObs.Barrier;
import chipchallenge.engine.obstacle.staticObs.wall.NormalWall;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class World {
    private Obstacle [][] map;
    private Item[][] item;
    private Chip player;
    private int counterIC;
    public World(int level, Chip player)
    {
        counterIC=0;
        this.player=player;
        int x = 50;
        int y = 50;
        switch(level)
        {
            case 1 : 
                map = new Obstacle[10][12];
                item = new Item[10][12];
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
        x += map[8][9].getImg().getWidth(null);;

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
                
            case 2 : ;
        }
    }
    
    public Obstacle[][] getMap()
    {
        return map;
    }
    
    public Item[][] getItem()
    {
        return item;
    }
    
    public int getSumOfIC()
    {
        return counterIC;
    }
}
