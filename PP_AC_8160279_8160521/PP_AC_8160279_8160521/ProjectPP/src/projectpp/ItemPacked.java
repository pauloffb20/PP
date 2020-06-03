/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpp;

import order.packing.Color;
import order.packing.IItem;
import order.packing.IItemPacked;
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

public class ItemPacked implements IItemPacked{
    
    private Color color;
    private IItem item;
    private IPosition position;

    /**
     *
     * @param color do tipo Color
     * @param item do tipo IItem
     * @param position do tipo IPosition
     */
    public ItemPacked(Color color, IItem item, IPosition position) {
        this.color = color;
        this.item = item;
        this.position = position;
    }

    /**
     * Método para obter color
     * @return color do tipo Color
     */
    @Override
    public Color getColor() {
        return color;
    }

    /**
     * Método para obter item
     * @return item do tipo IItem
     */
    @Override
    public IItem getItem() {
       return item;
    }

    /**
     * Método para obter position
     * @return position do tipo IPosition
     */
    @Override
    public IPosition getPosition() {
        return position;
    }

    /**
     * Método para alterar color
     * @param color do tipo Color 
     */
    @Override
    public void setColor(Color color) {
       this.color = color;
    }

    /**
     * Método para alterar position
     * @param ip do tipo IPosition 
     */
    @Override
    public void setPosition(IPosition ip) {
        this.position = ip;
    }
    
    /**
     * Método para imprimir a info do ItemPacked
     * @return text do tipo String 
     */
    @Override
    public String toString() {
        String text = item.toString() + " " + color + " " + position.toString();
        return text;
    }
}
