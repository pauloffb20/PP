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
 * Nr: 8160521
 * Turma: 2
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
     * Método para obter x
     * @return x do tipo inteiro
     */
    @Override
    public int getX() {
        return x;
    }

    /**
     * Método para obter Y
     * @return y do tipo inteiro
     */
    @Override
    public int getY() {
        return y;
    }

    /**
     * Método para obter Z
     * @return z do tipo inteiro
     */
    @Override
    public int getZ() {
        return z;
    }

    /**
     * Método para alterar x
     * @param i do tipo inteiro
     * @throws PositionException devolve excepção caso número recebido seja negativo
     * 
     */
    @Override
    public void setX(int i) throws PositionException {
        if(i < 0)
        throw new PositionException("Invalid option : number negative") {};
         else 
            this.x = i;
                
    }

    /**
     * Método para alterar y
     * @param i do tipo inteiro
     * @throws PositionException devolve excepção caso número recebido seja negativo
     * 
     */
    @Override
    public void setY(int i) throws PositionException {
            if(i < 0)
        throw new PositionException("Invalid option : number negative") {};
         else 
            this.y = i;    
    }
    
    /**
     * Método para alterar z
     * @param i do tipo inteiro
     * @throws PositionException devolve excepção caso número recebido seja negativo
     * 
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
     * Método para imprimir os valores de x, y e z
     * @return text do tipo String
     */
    @Override
    public String toString() {
        String text = x + " " + y + " " + z;
        return text;
    }
}
