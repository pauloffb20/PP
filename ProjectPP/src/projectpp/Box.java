/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpp;

import order.packing.IBox;

/**
 *
 * @author Paulo Filipe Ferreira Brito
 * Nr: 8160279
 * Turma 3
 * @author Hugo Maia Alves
 * Nr: 8160521
 * Turma: 2
 */
public abstract class Box implements IBox {
    
    private int depth;
    private int height;
    private int lenght;
    private int volume;
    
    /**
     *
     * @param depth valor inteiro
     * @param height valor inteiro
     * @param lenght valor inteiro
     */
    public Box (int depth, int height, int lenght){
        this.depth = depth;
        this.height = height;
        this.lenght = lenght;
        this.volume = depth*height*lenght;   
    }

    /**
     *
     * @return depth do tipo inteiro
     */
    @Override
    public int getDepth() {
        return depth;
    }

    /**
     *
     * @return height do tipo inteiro
     */
    @Override
    public int getHeight() {
        return height;
    }

    /**
     *
     * @return lenght do tipo inteiro
     */
    @Override
    public int getLenght() {
       return lenght;
    }

    /**
     *
     * @return volume do tipo inteiro
     */
    @Override
    public int getVolume() {
       return volume;
    }    
}
