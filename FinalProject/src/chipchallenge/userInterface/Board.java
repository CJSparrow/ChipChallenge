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
    private int iC;
    private boolean alive;
    private boolean isFinish;
    private int level = 1;
    private int score = 0;
    private World world;

    public Board() {
        setPreferredSize(new Dimension(1360,720));
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        player = new Chip(0, 0);
        alive = true;
        isFinish = false;
        world = new World(level, player);
        map = world.getMap();
        item = world.getItem();
        iC = world.getSumOfIC();
        player.setChipRemain(iC);
        posX = world.getPosChipX();
        posY = world.getPosChipY();
        player.move(map[posX][posY].getX(),map[posX][posY].getY());
    }

    public void resetStatus() {
        alive = true;
        isFinish = false;
        player = new Chip(0, 0);
        world = new World(level, player);
        map = world.getMap();
        item = world.getItem();
        iC = world.getSumOfIC();
        player.setChipRemain(iC);
        posX = world.getPosChipX();
        posY = world.getPosChipY();
        player.move(map[posX][posY].getX(),map[posX][posY].getY());
        score = 0;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.white);
        if (alive) {
            if (isFinish) {
                Graphics2D g2 = (Graphics2D) g;
                g2.fillRect(50, 50, 500, 500);
                g2.setColor(Color.yellow);
                g2.drawString("FINISH!", 285, 275);
                g2.drawString("Your Score Is " + score, 265, 300);
                level++;
            } else {
            }
        }
        if (alive == false || isFinish == false) {
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
            score++;
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (alive) {
            if (isFinish) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    resetStatus();
                }
            } else {
                //left
                if (ke.getKeyCode() == 37) {
                    posY--;
                    if (map[posX][posY].passAllow()) {
                        player.move(map[posX][posY].getX(), map[posX][posY].getY());
                        if (item[posX][posY] == null) {
                        } else {
                            if (item[posX][posY].canBeObtained()) {
                                player.obtainedInventoryItem(item[posX][posY]);
                            } else {
                                iC--;
                                player.setChipRemain(iC);

                            }
                            item[posX][posY] = null;
                        }
                    } else {
                        posY++;
                    }

                }
                //up
                if (ke.getKeyCode() == 38) {
                    posX--;
                    if (map[posX][posY].passAllow()) {
                        player.move(map[posX][posY].getX(), map[posX][posY].getY());
                        if (item[posX][posY] == null) {
                        } else {
                            if (item[posX][posY].canBeObtained()) {
                                player.obtainedInventoryItem(item[posX][posY]);
                            } else {
                                iC--;
                                player.setChipRemain(iC);

                            }
                            item[posX][posY] = null;
                        }
                    } else {
                        posX++;
                    }

                }
                //right
                if (ke.getKeyCode() == 39) {
                    posY++;
                    if (map[posX][posY].passAllow()) {
                        player.move(map[posX][posY].getX(), map[posX][posY].getY());
                        if (item[posX][posY] == null) {
                        } else {
                            if (item[posX][posY].canBeObtained()) {
                                player.obtainedInventoryItem(item[posX][posY]);
                            } else {
                                iC--;
                                player.setChipRemain(iC);

                            }
                            item[posX][posY] = null;
                        }
                    } else {
                        posY--;
                    }

                }
                //down
                if (ke.getKeyCode() == 40) {
                    posX++;
                    if (map[posX][posY].passAllow()) {
                        player.move(map[posX][posY].getX(), map[posX][posY].getY());
                        if (item[posX][posY] == null) {
                        } else {
                            if (item[posX][posY].canBeObtained()) {
                                player.obtainedInventoryItem(item[posX][posY]);
                            } else {
                                iC--;
                                player.setChipRemain(iC);

                            }
                            item[posX][posY] = null;
                        }
                    } else {
                        posX--;
                    }

                }
                if (ke.getKeyCode() == KeyEvent.VK_SPACE) {
                    //  player.setChipRemain(0);
                    // isFinish = true;
                }
                if (map[posX][posY].killAllow()) {
                    alive = false;
                }
                if (map[posX][posY].isFinish()) {
                    isFinish = true;
                }
            }
        } else {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                resetStatus();
            }
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chip's Challenge");
        frame.setContentPane(new Board());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
