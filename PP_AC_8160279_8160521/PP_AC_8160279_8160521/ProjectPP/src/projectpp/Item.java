/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpp;

import order.packing.IItem;

/**
 *
 * @author Paulo Filipe Ferreira Brito
 * Nr: 8160279
 * Turma 3
 * @author Hugo Maia Alves
 * Nr: 8160521
 * Turma: 2
 */

public class Item extends Box implements IItem{
    
    private static int id = 1;
    private String reference = "Item:";
    private String description;

    /**
     *
     * @param description do tipo String
     * @param depth do tipo inteiro
     * @param height do tipo inteiro
     * @param lenght do tipo inteiro
     */
    public Item(String description, int depth, int height, int lenght){
        super(depth, height, lenght);
        this.description = description;
        this.reference = this.reference + id;
        id++;
    }
    
    /**
     * Método para obter reference de um item
     * @return reference do tipo String
     */
    @Override
    public String getReference() {
        return reference;
    }

    /**
     * Método para obter a description do item
     * @return description do tipo String
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * Método para alterar a descrição do item
     * @param string do tipo String
     */
    @Override
    public void setDescription(String string) {
        this.description = string;
    }

    
    /**
     * Método para imprimir a info do item
     * @return text do tipo String 
     */
    @Override
    public String toString(){
        String text = reference + " " + description + " " + super.getDepth() + " " + super.getHeight() + " " + super.getLenght() + " " + super.getVolume();
        return text;
    }    
}
