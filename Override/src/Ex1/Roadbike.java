/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import Ex1.enumerations.Material;

public class Roadbike extends Bike {
    private String headlebelt;
    private double size;
    private String[] obs;
    private int counter = 0;
    private int max = 50;
    
    public Roadbike(String headlebelt, double size, int id, int numbergear, String color, double diametro, String travoes, Material material, double price, int garantia){
        super(id,numbergear,color,diametro, travoes,material,price,garantia);
        this.headlebelt = headlebelt;
        this.size = size;
        this.obs = new String[max];
    }

   public void addobs(String observation){
       if(counter < max ){
           obs[counter] = observation;
           counter += 1;
       } else {
           System.out.println("Atingiu max de linhas");
       }  
   }
       
    public void removeobs(int nr) {
        this.obs[nr] = null;
        for (int i = nr; i < counter - 1; i++) {
            this.obs[i] = this.obs[i + 1];
        }
        this.counter--;
    }  
    
    @Override
     public String toString() {
        String text = "Test";
        for (int i = 0; i < counter; i++) {
        text = text + " " + obs[i];
        
        }   
        text += "\n";
        return text;
}
}
