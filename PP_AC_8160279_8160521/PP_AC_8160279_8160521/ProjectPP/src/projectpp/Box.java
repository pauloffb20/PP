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
     *Método para obter a depth
     * @return depth do tipo inteiro
     */
    @Override
    public int getDepth() {
        return depth;
    }

    /**
     * Método para obter height
     * @return height do tipo inteiro
     */
    @Override
    public int getHeight() {
        return height;
    }

    /**
     * Método para obter lenght
     * @return lenght do tipo inteiro
     */
    @Override
    public int getLenght() {
       return lenght;
    }

    /**
     *Método para obter volume
     * @return volume do tipo inteiro
     */
    @Override
    public int getVolume() {
       return volume;
    }    
}
