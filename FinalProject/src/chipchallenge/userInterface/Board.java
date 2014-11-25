package chipchallenge.userInterface;

import chipchallenge.engine.*;
import chipchallenge.engine.item.*;
import chipchallenge.engine.obstacle.Obstacle;
import chipchallenge.engine.obstacle.dynamicObs.DynamicObstacle;
import chipchallenge.engine.obstacle.floorObs.*;
import chipchallenge.engine.obstacle.floorObs.dangerousFloor.FireFloor;
import chipchallenge.engine.obstacle.floorObs.dangerousFloor.WaterFloor;
import chipchallenge.engine.obstacle.floorObs.shiftFloor.*;
import chipchallenge.engine.obstacle.floorObs.triggerFloor.RemovalFloor;
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
     * total skor dari setiap level
     */
    private int totalScore = 0;
    
    /**
     * total bonus yang didapatkan dari waktu sisa dalam 1 stage
     */
    private int timeBonusScore = 5000;
    
    /**
     * skor yang didapatkan saat mengambil IC dalam 1 stage
     */
    private int icScore = 0;

    /**
     * objek dari class world
     */
    private World world;
    
    /**
     * atribut untuk menentukan akan menggunakan image mana untuk chip nya, dibutuhkan untuk animasi
     */
    private int idxImgChip = 1;
    
    /**
     * atribut untuk menentukan akan menggunakan image mana untuk fire floor nya, dibutuhkan untuk animasi
     */
    private int idxImgFireFloor = 1;
    
    /**
     * atribut timer untuk animasi
     */
    private Timer timer;

    private int i = 0;
    
    /**
     * atribut tulisan(font) pada saat finish
     */
    private Font finishFont;
    
    /**
     * atribut tulisan(font) untuk inventory nya
     */
    private Font inventoryFont;
    
    /**
     * atribut arraylist untuk menampung fire floor
     */
    private ArrayList<FireFloor> arrOfFF = new ArrayList();
    
    /**
     * atribut arraylist untuk menampung water floor
     */
    private ArrayList<WaterFloor> arrOfWF = new ArrayList();
    
    /**
     * objek dari finish floor, yaitu floor yang akan mengakhiri permainan
     */
    private FinishFloor ff;

    private InventoryLayout layout = new InventoryLayout();
    
    /**
     * untuk layout lebar
     */
    private int widthLayout;
    
    /**
     * untuk layout tinggi
     */
    private int heightLayout;
    
    /**
     * atribut untuk menandakan apakah chip bisa bergerak atau tidak
     */
    private boolean canMove = false;

    /**
     * constructor dari class board inisialisasi atribut dan menentukan ukuran
     * awal board
     */
    public Board() {
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
        finishFont = new Font("Times New Roman", 100, 15);
        inventoryFont = new Font("Comic Sans MS",2,26);
        arrOfFF = world.getArrOfFF();
        arrOfWF = world.getArrOfWF();
        ff = world.getFinishFloor();
        setPreferredSize(new Dimension(1360, 720));
        setBackground(Color.black);
    }

    /**
     * method untuk mereset status pemain dan map ke untuk level selanjutnya.
     */
    public void resetStatus() {
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
        idxImgChip = 1;
        arrOfFF = world.getArrOfFF();
        arrOfWF = world.getArrOfWF();
        ff = world.getFinishFloor();
        player.clearInventory();
        timer.start();
    }
    
    /**
     * untuk menggambar semua unsur boardnya dan juga menampilkan score
     * @param g : Graphics
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
            widthLayout = 96 + (map[0][map[0].length - 1].getX());
            heightLayout = 48 * (map.length / 2-2);
        if (alive) {
            if (isFinish) {
                timer.stop();
                totalScore += timeBonusScore + icScore;
            } else {
            }
        }
        else
        {
            timer.stop();
        }
//        if (isFinish == false) {
            // gambar map dan item
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
            // gambar layout inventory
            g.setFont(inventoryFont);
            g.setColor(Color.yellow);
            g.drawString("INVENTORY", (168 + (map[0][map[0].length - 1].getX())), (48 * ((map.length / 2)-3)));
            g.drawImage(layout.getImg(), widthLayout, heightLayout, null);
            int jkl = 0;
            while (jkl < player.getInventory().length) {
                if (player.getInventory()[jkl] != null) {
                    g.drawImage(player.getInventory()[jkl].getImg(), widthLayout, heightLayout, null);
                    jkl++;
                    if (jkl == 5) {
                        heightLayout += 48;
                        widthLayout = 48 * (map[0].length + 4);
                    } else {
                        widthLayout += 48;
                    }
                } else {
                    break;
                }
            }
            g.drawString("Chip Remain : "+player.getChipRemain(), (144 + (map[0][map[0].length - 1].getX())), (48 * ((map.length / 2)+3)));
            g.drawString("Time Bonus Score : "+timeBonusScore, (144 + (map[0][map[0].length - 1].getX())), (48 * ((map.length / 2)+4)));
            g.drawString("Intergrated Circuit Score : "+icScore, (144 + (map[0][map[0].length - 1].getX())), (48 * ((map.length / 2)+5)));
            g.drawString("Total Score : "+totalScore, (144 + (map[0][map[0].length - 1].getX())), (48 * ((map.length / 2)+6)));
            //gambar player
            g.drawImage(player.getImg(idxImgChip), player.getX(), player.getY(), null);
//        }
    }

    /**
     * method untuk melakukan sesuatu(event) saat tombol pada keyboard ditekan
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
                        canMove = true;
                    } else {
                        posY++;
                    }

                }
                //up
                else if (ke.getKeyCode() == 38) {
                    posX--;
                    if (map[posX][posY].passAllow()) {
                        idxImgChip = 2;
                        canMove = true;
                    } else {
                        posX++;
                    }

                }
                //right
                else if (ke.getKeyCode() == 39) {
                    posY++;
                    if (map[posX][posY].passAllow()) {
                        idxImgChip = 4;
                        canMove = true;
                    } else {
                        posY--;
                    }

                }
                //down
                else if (ke.getKeyCode() == 40) {
                    posX++;
                    if (map[posX][posY].passAllow()) {
                        idxImgChip = 1;
                        canMove = true;
                    } else {
                        posX--;
                    }

                }
                else if (ke.getKeyCode() == KeyEvent.VK_SPACE) {
                    //  player.setChipRemain(0);
                    // isFinish = true;
                }
                if (map[posX][posY].killAllow()) {
                    if (map[posX][posY].getClass().equals(FireFloor.class)) {
                        if (player.immuneFire()) {

                        } else {
                            idxImgChip = 0;
                            alive = false;
                        }
                    } else if (map[posX][posY].getClass().equals(WaterFloor.class)) {
                        if (player.immuneWater()) {

                        } else {
                            idxImgChip = 5;
                            alive = false;
                        }
                    }
                }
                if (canMove) {
                    player.move(map[posX][posY].getX(), map[posX][posY].getY());
                    if(map[posX][posY].getClass().equals(RemovalFloor.class))
                    {
                        player.clearInventory();
                    }
                    if (item[posX][posY] == null) {
                    } else {
                        if (item[posX][posY].canBeObtained()) {
                            player.obtainedInventoryItem(item[posX][posY]);
                        } else {
                            iC--;
                            icScore += 250;
                            player.setChipRemain(iC);
                        }
                        item[posX][posY] = null;
                    }
                    canMove = false;
                }
                if (map[posX][posY].isFinish()) {
                    isFinish = true;
                }
            }
        } else {
            totalScore = 0;
            timeBonusScore = 5000;
            icScore = 0;
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                resetStatus();
            }
        }
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
        if (i % 8 == 0) {
            int j = 0;
            while (j < arrOfWF.size()) {
                arrOfWF.get(j).setImg(i % 8);
                j++;
            }
        } else if (i % 8 == 1) {
            int j = 0;
            while (j < arrOfWF.size()) {
                arrOfWF.get(j).setImg(i % 8);
                j++;
            }
        } else if (i % 8 == 2) {
            int j = 0;
            while (j < arrOfWF.size()) {
                arrOfWF.get(j).setImg(i % 8);
                j++;
            }
        } else if (i % 8 == 3) {
            int j = 0;
            while (j < arrOfWF.size()) {
                arrOfWF.get(j).setImg(i % 8);
                j++;
            }
        } else if (i % 8 == 4) {
            int j = 0;
            while (j < arrOfWF.size()) {
                arrOfWF.get(j).setImg(i % 8);
                j++;
            }
        } else if (i % 8 == 5) {
            int j = 0;
            while (j < arrOfWF.size()) {
                arrOfWF.get(j).setImg(i % 8);
                j++;
            }
        } else if (i % 8 == 6) {
            int j = 0;
            while (j < arrOfWF.size()) {
                arrOfWF.get(j).setImg(i % 8);
                j++;
            }
        } else if (i % 8 == 7) {
            int j = 0;
            while (j < arrOfWF.size()) {
                arrOfWF.get(j).setImg(i % 8);
                j++;
            }
        }
        // animasi finishFloor
        if (i % 6 == 0) {
            ff.setImg(i % 6);
        } else if (i % 6 == 1) {
            ff.setImg(i % 6);
        } else if (i % 6 == 2) {
            ff.setImg(i % 6);
        } else if (i % 6 == 3) {
            ff.setImg(i % 6);
        } else if (i % 6 == 4) {
            ff.setImg(i % 6);
        } else if (i % 6 == 5) {
            ff.setImg(i % 6);
        }
        i++;
        timeBonusScore--;
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
    public void keyReleased(KeyEvent ke) {
    }

}
