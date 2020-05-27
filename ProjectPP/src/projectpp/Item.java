/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpp;

import order.packing.IItem;

/**
 *
 * @author Paulo
 */
public class Item implements IItem{
    
    private static int id = 1;
    private String reference = "Item:";
    private String description;
    private int depth;
    private int height;
    private int lenght;
    private int volume;
    
    public Item(String description, int depth, int height, int lenght, int volume){
        this.description = description;
        this.depth = depth;
        this.height = height;
        this.lenght = lenght;
        this.volume = volume;
        this.reference = this.reference + id;
        id++;
    }
    
    @Override
    public String getReference() {
        return reference;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String string) {
        this.description = string;
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
    
    @Override
    public String toString(){
        String text = reference + " " + description + " " + depth + " " + height + " " + lenght + " " + volume;
        return text;
    }    
}
