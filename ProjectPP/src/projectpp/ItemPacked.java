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
 * @author Paulo
 */
public class ItemPacked implements IItemPacked{
    
    private Color color;
    private IItem item;
    private IPosition position;

    public ItemPacked(Color color, IItem item, IPosition position) {
        this.color = color;
        this.item = item;
        this.position = position;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public IItem getItem() {
       return item;
    }

    @Override
    public IPosition getPosition() {
        return position;
    }

    @Override
    public void setColor(Color color) {
       this.color = color;
    }

    @Override
    public void setPosition(IPosition ip) {
        this.position = (Position) ip;
    }
    
    @Override
    public String toString() {
        String text = item.toString() + " " + color + " " + position.toString();
        return text;
    }
}
