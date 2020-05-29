/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpp;

import order.packing.IBox;

/**
 *
 * @author Paulo
 */
public class Box implements IBox {
    
    private int depth;
    private int height;
    private int lenght;
    private int volume;
    
    public Box (int depth, int height, int lenght){
        this.depth = depth;
        this.height = height;
        this.lenght = lenght;
        this.volume = depth*height*lenght;   
    }

    @Override
    public int getDepth() {
        return depth;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getLenght() {
       return lenght;
    }

    @Override
    public int getVolume() {
       return volume;
    }    
}
