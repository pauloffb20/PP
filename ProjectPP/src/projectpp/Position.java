/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpp;

import order.exceptions.PositionException;
import order.packing.IPosition;

/**
 *
 * @author Paulo Filipe Ferreira Brito
 * Nr: 8160279
 * Turma 3
 * @author Hugo Maia Alves
 */
public class Position implements IPosition{
    private int x, y, z;
    
    /**
     *
     * @param x do tipo inteiro
     * @param y do tipo inteiro
     * @param z do tipo inteiro
     */
    public Position(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     *
     * @return x do tipo inteiro
     */
    @Override
    public int getX() {
        return x;
    }

    /**
     *
     * @return y do tipo inteiro
     */
    @Override
    public int getY() {
        return y;
    }

    /**
     *
     * @return z do tipo inteiro
     */
    @Override
    public int getZ() {
        return z;
    }

    /**
     *
     * @param i do tipo inteiro
     * @throws PositionException devolve excepção caso número recebido seja negativo
     * Método para alterar x
     */
    @Override
    public void setX(int i) throws PositionException {
        if(i < 0)
        throw new PositionException("Invalid option : number negative") {};
         else 
            this.x = i;
                
    }

    /**
     *
     * @param i do tipo inteiro
     * @throws PositionException devolve excepção caso número recebido seja negativo
     * Método para alterar y
     */
    @Override
    public void setY(int i) throws PositionException {
            if(i < 0)
        throw new PositionException("Invalid option : number negative") {};
         else 
            this.y = i;    
    }
    
    /**
     *
     * @param i do tipo inteiro
     * @throws PositionException devolve excepção caso número recebido seja negativo
     * Método para alterar z
     */
    @Override
    public void setZ(int i) throws PositionException {
        if (i < 0) {
            throw new PositionException("Invalid option : number negative") {
            };
        } else {
            this.z = i;
        }
    }

    /**
     *
     * @return text do tipo String
     * Método para imprimir os valores de x, y e z
     * 
     */
    @Override
    public String toString() {
        String text = x + " " + y + " " + z;
        return text;
    }
}
