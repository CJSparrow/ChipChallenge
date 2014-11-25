/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.item;

/**
 * class ini merepresentasikan sepatu yang bisa berupa fireshoes atau watershoes
 * dimana class-class tersebut dapat merubah kemampuan dari chip
 * @author TampanCrew
 */
public class Shoes extends Item{
    
    /**
     * constructor dari class shoes
     * @param locationX : posisi x dari shoes
     * @param locationY : posisi y dari shoes
     */
    public Shoes(int locationX, int locationY) {
        super(locationX, locationY);
        this.setVisible(true);
    }
    
    /**
     * method yang menandakan apakah item ini bisa diambil atau tidak
     * @return true : jika dapat diambil
     * false : jika tidak dapat diambil 
     */
    @Override
    public boolean canBeObtained() {
        return true;
    }
    
}
