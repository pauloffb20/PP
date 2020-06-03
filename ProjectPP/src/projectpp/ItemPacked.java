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
     *
     * @return color do tipo Color
     */
    @Override
    public Color getColor() {
        return color;
    }

    /**
     *
     * @return item do tipo IItem
     */
    @Override
    public IItem getItem() {
       return item;
    }

    /**
     *
     * @return position do tipo IPosition
     */
    @Override
    public IPosition getPosition() {
        return position;
    }

    /**
     *
     * @param color do tipo Color
     * Método para alterar color
     */
    @Override
    public void setColor(Color color) {
       this.color = color;
    }

    /**
     *
     * @param ip do tipo IPosition
     * Método para alterar position
     */
    @Override
    public void setPosition(IPosition ip) {
        this.position = ip;
    }
    
    /**
     *
     * @return text do tipo String
     * Método para imprimir a info do ItemPacked
     */
    @Override
    public String toString() {
        String text = item.toString() + " " + color + " " + position.toString();
        return text;
    }
}
