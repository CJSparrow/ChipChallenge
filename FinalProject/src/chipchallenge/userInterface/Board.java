package chipchallenge.userInterface;

import chipchallenge.engine.*;
import chipchallenge.engine.item.*;
import chipchallenge.engine.obstacle.Obstacle;
import chipchallenge.engine.obstacle.floorObs.*;
import chipchallenge.engine.obstacle.floorObs.dangerousFloor.FireFloor;
import chipchallenge.engine.obstacle.floorObs.shiftFloor.*;
import chipchallenge.engine.obstacle.staticObs.*;
import chipchallenge.engine.obstacle.staticObs.wall.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import java.awt.*;

/**
 *
 * @author TampanCrew
 */
public class Board extends JPanel implements KeyListener {

    private Obstacle[][] map;
    private Item[][] item;
    private Chip player;
    private int posX;
    private int posY;
    private int chip = 3;
    private boolean alive;

    public Board() {
        setPreferredSize(new Dimension(1080, 720));
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        map = new Obstacle[10][10];
        item = new Item[10][10];
        int x = 50;
        int y = 50;
        posX = 1;
        posY = 1;
        player = new Chip(x + 50, y + 50);
        player.setChipRemain(chip);
        alive = true;

        //BARIS 1
        map[0][0] = new NormalWall(x, y);
        x += map[0][0].getImg().getWidth(this);
        map[0][1] = new NormalWall(x, y);
        x += map[0][1].getImg().getWidth(this);
        map[0][2] = new NormalWall(x, y);
        x += map[0][2].getImg().getWidth(this);
        map[0][3] = new NormalWall(x, y);
        x += map[0][3].getImg().getWidth(this);
        map[0][4] = new NormalWall(x, y);
        x += map[0][4].getImg().getWidth(this);
        map[0][5] = new NormalWall(x, y);
        x += map[0][5].getImg().getWidth(this);
        map[0][6] = new NormalWall(x, y);
        x += map[0][6].getImg().getWidth(this);
        map[0][7] = new NormalWall(x, y);
        x += map[0][7].getImg().getWidth(this);
        map[0][8] = new NormalWall(x, y);
        x += map[0][8].getImg().getWidth(this);
        map[0][9] = new NormalWall(x, y);
        x += map[0][9].getImg().getWidth(this);

        //BARIS 2
        x = 50;
        y += map[0][0].getImg().getHeight(this);
        map[1][0] = new NormalWall(x, y);
        x += map[1][0].getImg().getWidth(this);
        map[1][1] = new PlainFloor(x, y);
        x += map[1][1].getImg().getWidth(this);
        map[1][2] = new NormalWall(x, y);
        x += map[1][2].getImg().getWidth(this);
        map[1][3] = new FinishFloor(x, y);
        x += map[1][3].getImg().getWidth(this);
        map[1][4] = new PlainFloor(x, y);
        x += map[1][4].getImg().getWidth(this);
        map[1][5] = new Barrier(x, y, player);
        x += map[1][5].getImg().getWidth(this);
        map[1][6] = new PlainFloor(x, y);
        x += map[1][6].getImg().getWidth(this);
        map[1][7] = new PlainFloor(x, y);
        x += map[1][7].getImg().getWidth(this);
        map[1][8] = new PlainFloor(x, y);
        x += map[1][8].getImg().getWidth(this);
        map[1][9] = new NormalWall(x, y);
        x += map[1][9].getImg().getWidth(this);

        //BARIS 3
        x = 50;
        y += map[1][0].getImg().getHeight(this);
        map[2][0] = new NormalWall(x, y);
        x += map[2][0].getImg().getWidth(this);
        map[2][1] = new PlainFloor(x, y);
        x += map[2][1].getImg().getWidth(this);
        map[2][2] = new NormalWall(x, y);
        x += map[2][2].getImg().getWidth(this);
        map[2][3] = new PlainFloor(x, y);
        x += map[2][3].getImg().getWidth(this);
        map[2][4] = new PlainFloor(x, y);
        x += map[2][4].getImg().getWidth(this);
        map[2][5] = new NormalWall(x, y);
        x += map[2][5].getImg().getWidth(this);
        map[2][6] = new NormalWall(x, y);
        x += map[2][6].getImg().getWidth(this);
        map[2][7] = new NormalWall(x, y);
        x += map[2][7].getImg().getWidth(this);
        map[2][8] = new PlainFloor(x, y);
        x += map[2][8].getImg().getWidth(this);
        map[2][9] = new NormalWall(x, y);
        x += map[2][9].getImg().getWidth(this);

        //BARIS 4
        x = 50;
        y += map[2][0].getImg().getHeight(this);
        map[3][0] = new NormalWall(x, y);
        x += map[3][0].getImg().getWidth(this);
        map[3][1] = new PlainFloor(x, y);
        x += map[3][1].getImg().getWidth(this);
        map[3][2] = new NormalWall(x, y);
        x += map[3][2].getImg().getWidth(this);
        map[3][3] = new NormalWall(x, y);
        x += map[3][3].getImg().getWidth(this);
        map[3][4] = new NormalWall(x, y);
        x += map[3][4].getImg().getWidth(this);
        map[3][5] = new NormalWall(x, y);
        x += map[3][5].getImg().getWidth(this);
        map[3][6] = new PlainFloor(x, y);
        x += map[3][6].getImg().getWidth(this);
        map[3][7] = new PlainFloor(x, y);
        x += map[3][7].getImg().getWidth(this);
        map[3][8] = new PlainFloor(x, y);
        x += map[3][8].getImg().getWidth(this);
        map[3][9] = new NormalWall(x, y);
        x += map[3][9].getImg().getWidth(this);

        //BARIS 5
        x = 50;
        y += map[3][0].getImg().getHeight(this);
        map[4][0] = new NormalWall(x, y);
        x += map[4][0].getImg().getWidth(this);
        map[4][1] = new PlainFloor(x, y);
        x += map[4][1].getImg().getWidth(this);
        map[4][2] = new FireFloor(x, y);
        x += map[4][2].getImg().getWidth(this);
        map[4][3] = new PlainFloor(x, y);
        x += map[4][3].getImg().getWidth(this);
        map[4][4] = new PlainFloor(x, y);
        item[4][4] = new IntergratedCircuit(x, y);
        x += map[4][4].getImg().getWidth(this);
        map[4][5] = new FireFloor(x, y);
        x += map[4][5].getImg().getWidth(this);
        map[4][6] = new PlainFloor(x, y);
        x += map[4][6].getImg().getWidth(this);
        map[4][7] = new FireFloor(x, y);
        x += map[4][7].getImg().getWidth(this);
        map[4][8] = new FireFloor(x, y);
        x += map[4][8].getImg().getWidth(this);
        map[4][9] = new NormalWall(x, y);
        x += map[4][9].getImg().getWidth(this);

        //BARIS 6
        x = 50;
        y += map[4][0].getImg().getHeight(this);
        map[5][0] = new NormalWall(x, y);
        x += map[5][0].getImg().getWidth(this);
        map[5][1] = new PlainFloor(x, y);
        x += map[5][1].getImg().getWidth(this);
        map[5][2] = new PlainFloor(x, y);
        item[5][2] = new IntergratedCircuit(x, y);
        x += map[5][2].getImg().getWidth(this);
        map[5][3] = new PlainFloor(x, y);
        x += map[5][3].getImg().getWidth(this);
        map[5][4] = new FireFloor(x, y);
        x += map[5][4].getImg().getWidth(this);
        map[5][5] = new PlainFloor(x, y);
        item[5][5] = new IntergratedCircuit(x, y);
        x += map[5][5].getImg().getWidth(this);
        map[5][6] = new PlainFloor(x, y);
        x += map[5][6].getImg().getWidth(this);
        map[5][7] = new PlainFloor(x, y);
        x += map[5][7].getImg().getWidth(this);
        map[5][8] = new FireFloor(x, y);
        x += map[5][8].getImg().getWidth(this);
        map[5][9] = new NormalWall(x, y);
        x += map[5][9].getImg().getWidth(this);

        //BARIS 7
        x = 50;
        y += map[5][0].getImg().getHeight(this);
        map[6][0] = new NormalWall(x, y);
        x += map[6][0].getImg().getWidth(this);
        map[6][1] = new PlainFloor(x, y);
        x += map[6][1].getImg().getWidth(this);
        map[6][2] = new FireFloor(x, y);
        x += map[6][2].getImg().getWidth(this);
        map[6][3] = new PlainFloor(x, y);
        x += map[6][3].getImg().getWidth(this);
        map[6][4] = new FireFloor(x, y);
        x += map[6][4].getImg().getWidth(this);
        map[6][5] = new FireFloor(x, y);
        x += map[6][5].getImg().getWidth(this);
        map[6][6] = new FireFloor(x, y);
        x += map[6][6].getImg().getWidth(this);
        map[6][7] = new PlainFloor(x, y);
        x += map[6][7].getImg().getWidth(this);
        map[6][8] = new FireFloor(x, y);
        x += map[6][8].getImg().getWidth(this);
        map[6][9] = new NormalWall(x, y);
        x += map[6][9].getImg().getWidth(this);

        //BARIS 8
        x = 50;
        y += map[6][0].getImg().getHeight(this);
        map[7][0] = new NormalWall(x, y);
        x += map[7][0].getImg().getWidth(this);
        map[7][1] = new PlainFloor(x, y);
        x += map[7][1].getImg().getWidth(this);
        map[7][2] = new PlainFloor(x, y);
        x += map[7][2].getImg().getWidth(this);
        map[7][3] = new PlainFloor(x, y);
        x += map[7][3].getImg().getWidth(this);
        map[7][4] = new FireFloor(x, y);
        x += map[7][4].getImg().getWidth(this);
        map[7][5] = new PlainFloor(x, y);
        x += map[7][5].getImg().getWidth(this);
        map[7][6] = new PlainFloor(x, y);
        x += map[7][6].getImg().getWidth(this);
        map[7][7] = new PlainFloor(x, y);
        x += map[7][7].getImg().getWidth(this);
        map[7][8] = new FireFloor(x, y);
        x += map[7][8].getImg().getWidth(this);
        map[7][9] = new NormalWall(x, y);
        x += map[7][9].getImg().getWidth(this);

        //BARIS 9
        x = 50;
        y += map[7][0].getImg().getHeight(this);
        map[8][0] = new NormalWall(x, y);
        x += map[8][0].getImg().getWidth(this);
        map[8][1] = new FireFloor(x, y);
        x += map[8][1].getImg().getWidth(this);
        map[8][2] = new FireFloor(x, y);
        x += map[8][2].getImg().getWidth(this);
        map[8][3] = new PlainFloor(x, y);
        x += map[8][3].getImg().getWidth(this);
        map[8][4] = new PlainFloor(x, y);
        x += map[8][4].getImg().getWidth(this);
        map[8][5] = new PlainFloor(x, y);
        x += map[8][5].getImg().getWidth(this);
        map[8][6] = new FireFloor(x, y);
        x += map[8][6].getImg().getWidth(this);
        map[8][7] = new FireFloor(x, y);
        x += map[8][7].getImg().getWidth(this);
        map[8][8] = new FireFloor(x, y);
        x += map[8][8].getImg().getWidth(this);
        map[8][9] = new NormalWall(x, y);
        x += map[8][9].getImg().getWidth(this);

        //BARIS 10
        x = 50;
        y += map[8][0].getImg().getHeight(this);
        map[9][0] = new NormalWall(x, y);
        x += map[9][0].getImg().getWidth(this);
        map[9][1] = new NormalWall(x, y);
        x += map[9][1].getImg().getWidth(this);
        map[9][2] = new NormalWall(x, y);
        x += map[9][2].getImg().getWidth(this);
        map[9][3] = new NormalWall(x, y);
        x += map[9][3].getImg().getWidth(this);
        map[9][4] = new NormalWall(x, y);
        x += map[9][4].getImg().getWidth(this);
        map[9][5] = new NormalWall(x, y);
        x += map[9][5].getImg().getWidth(this);
        map[9][6] = new NormalWall(x, y);
        x += map[9][6].getImg().getWidth(this);
        map[9][7] = new NormalWall(x, y);
        x += map[9][7].getImg().getWidth(this);
        map[9][8] = new NormalWall(x, y);
        x += map[9][8].getImg().getWidth(this);
        map[9][9] = new NormalWall(x, y);
        x += map[9][9].getImg().getWidth(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.white);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == null) {

                } else {
                    if (map[i][j].isVisible()) {
                        g.drawImage(map[i][j].getImg(), map[i][j].getX(), map[i][j].getY(), null);
                    } else {
                        Floor newFloor = new PlainFloor(map[i][j].getX(), map[i][j].getY());
                        g.drawImage(newFloor.getImg(), newFloor.getX(), newFloor.getY(), null);
                    }
                }
                if (item[i][j] == null) {
                    
                } else {
                    g.drawImage(item[i][j].getImg(), item[i][j].getX(), item[i][j].getY(), null);
                }
            }
        }
        g.drawImage(player.getImg(), player.getX(), player.getY(), null);
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        //left
        if (ke.getKeyCode() == 37) {
            if (alive) {
                posY--;
                if (map[posX][posY].passAllow()) {
                    player.move(map[posX][posY].getX(), map[posX][posY].getY());
                    if (item[posX][posY] == null) {
                        System.out.println("a");
                    } else{
                        item[posX][posY] = null;
                        chip--;
                        player.setChipRemain(chip);
                    }
                } else {
                    posY++;
                }
                if (map[posX][posY].killAllow()) {
                    alive = false;
                }
            }
        }
        //up
        if (ke.getKeyCode() == 38) {
            if (alive) {
                posX--;
                if (map[posX][posY].passAllow()) {
                    player.move(map[posX][posY].getX(), map[posX][posY].getY());
                    if (item[posX][posY] == null) {
                        System.out.println("a");
                    } else {
                        item[posX][posY] = null;
                        chip--;
                        player.setChipRemain(chip);
                    }
                } else {
                    posX++;
                }
                if (map[posX][posY].killAllow()) {
                    alive = false;
                }
            }
        }
        //right
        if (ke.getKeyCode() == 39) {
            posY++;
            if (alive) {
                if (map[posX][posY].passAllow()) {
                    player.move(map[posX][posY].getX(), map[posX][posY].getY());
                    if (item[posX][posY] == null) {
                        System.out.println("a");
                    } else  {
                        item[posX][posY] = null;
                        chip--;
                        player.setChipRemain(chip);
                    }
                } else {
                    posY--;
                }
                if (map[posX][posY].killAllow()) {
                    alive = false;
                }
            }
        }
        //down
        if (ke.getKeyCode() == 40) {
            if (alive) {
                posX++;
                if (map[posX][posY].passAllow()) {
                    player.move(map[posX][posY].getX(), map[posX][posY].getY());
                    if (item[posX][posY] == null) {
                        System.out.println("a");
                    } else{
                        item[posX][posY] = null;
                        chip--;
                        player.setChipRemain(chip);
                    }
                } else {
                    posX--;
                }
                if (map[posX][posY].killAllow()) {
                    alive = false;
                }
            }
        }
        if (ke.getKeyCode() == KeyEvent.VK_SPACE) {
            player.setChipRemain(0);
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chip's Challenge");
        frame.setContentPane(new Board());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
