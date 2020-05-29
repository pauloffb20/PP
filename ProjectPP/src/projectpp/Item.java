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
public class Item extends Box implements IItem{
    
    private static int id = 1;
    private String reference = "Item:";
    private String description;

    
    public Item(String description, int depth, int height, int lenght){
        super(depth, height, lenght);
        this.description = description;
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
    public String toString(){
        String text = reference + " " + description + " " + super.getDepth() + " " + super.getHeight() + " " + super.getLenght() + " " + super.getVolume();
        return text;
    }    
}
