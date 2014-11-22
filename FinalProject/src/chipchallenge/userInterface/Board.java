package chipchallenge.userInterface;

import chipchallenge.engine.*;
import chipchallenge.engine.item.*;
import chipchallenge.engine.obstacle.Obstacle;
import chipchallenge.engine.obstacle.floorObs.*;
import chipchallenge.engine.obstacle.floorObs.dangerousFloor.FireFloor;
import chipchallenge.engine.obstacle.floorObs.dangerousFloor.WaterFloor;
import chipchallenge.engine.obstacle.floorObs.shiftFloor.*;
import chipchallenge.engine.obstacle.staticObs.*;
import chipchallenge.engine.obstacle.staticObs.wall.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import java.awt.*;
import java.util.ArrayList;

/**
 * class ini merepresentasikan papan permainan nya dari chip's challenge
 *
 * @author TampanCrew
 */
public class Board extends JPanel implements ActionListener, KeyListener {

    /**
     * array 2 dimensi yang merepresentasikan posisi dari obstacle-obstacle
     * dalam board
     */
    private Obstacle[][] map;
    /**
     * array 2 dimensi yang merepresentasikan posisi dari item-item dalam board
     */
    private Item[][] item;
    /**
     * merepresentasikan player yang akan kita mainkan
     */
    private Chip player;
    /**
     * posisi x dari player nya
     */
    private int posX;
    /**
     * posisi y dari player nya
     */
    private int posY;
    /**
     * jumlah IC yang ada dalam board
     */
    private int iC;
    /**
     * atribut boolean untuk menandakan apakah player masih hidup atau tidak
     */
    private boolean alive;
    /**
     * atribut boolean untuk menandakan apakah player sudah mencapai finsih atau
     * belum
     */
    private boolean isFinish;
    /**
     * untuk menandakan sudah ada di level berapa
     */
    private int level = 1;
    /**
     * skor dari setiap level
     */
    private int score = 0;
    /**
     * objek dari class world
     */
    private World world;

    private int idxImgChip = 1;

    private int idxImgFireFloor = 1;

    private Timer timer;

    private int i = 0;

    private Font fonts;

    private ArrayList<FireFloor> arrOfFF = new ArrayList();
    
    private FinishFloor ff;

    /**
     * constructor dari class board inisialisasi atribut dan menentukan ukuran
     * awal board
     */
    public Board() {
        setPreferredSize(new Dimension(1360, 720));
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
        player.move(map[posX][posY].getX(), map[posX][posY].getY());
        timer = new Timer(60, this);
        timer.start();
        fonts = new Font("Times New Roman", 100, 15);
        arrOfFF=world.getArrOfFF();
        ff=world.getFinishFloor();
    }

    /**
     * method untuk mereset permainan kembali ke awal (pada level yang sama)
     */
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
        player.move(map[posX][posY].getX(), map[posX][posY].getY());
        score = 0;
        idxImgChip = 1;
        arrOfFF=world.getArrOfFF();
        ff=world.getFinishFloor();
        timer.start();
    }

    /**
     * untuk menggambar semua unsur boardnya dan juga menampilkan score
     *
     * @param g
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.white);
        if (alive) {
            if (isFinish) {
                Graphics2D g2 = (Graphics2D) g;
                g2.fillRect(50, 50, 500, 500);
                g2.setColor(Color.yellow);
                g2.setFont(fonts);
                g2.drawString("FINISH!", 285, 275);
                g2.drawString("Your Score Is " + score, 265, 300);
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
            g.drawImage(player.getImg(idxImgChip), player.getX(), player.getY(), null);
            score++;
        }
    }

    /**
     * method untuk melakukan sesuatu saat tombol pada keyboard ditekan
     *
     * @param ke : event yang akan dilakukan, misalnya pada kasus ini event nya
     * yaitu untuk bergerak 4 arah(atas,bawah,kiri,kanan)
     */
    @Override
    public void keyPressed(KeyEvent ke) {
        if (alive) {
            if (isFinish) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    level++;
                    resetStatus();
                }
            } else {
                //left
                if (ke.getKeyCode() == 37) {
                    posY--;
                    if (map[posX][posY].passAllow()) {
                        idxImgChip = 3;
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
                        idxImgChip = 2;
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
                        idxImgChip = 4;
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
                        idxImgChip = 1;
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
                    if (map[posX][posY].getClass().equals(new FireFloor(0, 0).getClass())) {
                        if (player.immuneFire()) {

                        } else {
                            idxImgChip = 0;
                            alive = false;
                        }
                    } else if (map[posX][posY].getClass().equals(new WaterFloor(0, 0).getClass())) {
                        if (player.immuneWater()) {

                        } else {
                            alive = false;
                        }
                    }
                    if (alive == false) {
                        timer.stop();
                    }
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
    
    /**
     * method override untuk membuat animasi nya
     * @param ae : action event
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        // animasi api
        if (i % 6 == 0) {
            int j = 0;
            while (j < arrOfFF.size()) {
                arrOfFF.get(j).setImg(i % 6);
                j++;
            }
        } else if (i % 6 == 1) {
            int j = 0;
            while (j < arrOfFF.size()) {
                arrOfFF.get(j).setImg(i % 6);
                j++;
            }
        } else if (i % 6 == 2) {
            int j = 0;
            while (j < arrOfFF.size()) {
                arrOfFF.get(j).setImg(i % 6);
                j++;
            }
        } else if (i % 6 == 3) {
            int j = 0;
            while (j < arrOfFF.size()) {
                arrOfFF.get(j).setImg(i % 6);
                j++;
            }
        } else if (i % 6 == 4) {
            int j = 0;
            while (j < arrOfFF.size()) {
                arrOfFF.get(j).setImg(i % 6);
                j++;
            }
        } else if (i % 6 == 5) {
            int j = 0;
            while (j < arrOfFF.size()) {
                arrOfFF.get(j).setImg(i % 6);
                j++;
            }
        }
        if(i%4==0)
        {
            ff.setImg(i%4);
        }
        else if(i%4==1)
        {
            ff.setImg(i%4);
        }
        else if(i%4==2)
        {
            ff.setImg(i%4);
        }
        else if(i%4==3)
        {
            ff.setImg(i%4);
        }
        i++;
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
