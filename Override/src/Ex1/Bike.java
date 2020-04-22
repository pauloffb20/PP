
package Ex1;

import Ex1.enumerations.Material;


public class Bike {
    
    private int id;
    private int numbergear;
    private String color;
    private double diametro;
    private String travoes;
    private Material material;
    private double price;
    private int garantia;
    
    public Bike(int id, int numbergear, String color, double diametro, String travoes, Material material, double price, int garantia) {
        this.id = id;
        this.numbergear = numbergear;
        this.color = color;
        this.diametro = diametro;
        this.travoes = travoes;
        this.material = material;
        this.price = price;
        this.garantia = garantia;
    }

    public int setid() {
        return id;
    }

    public int setnumbergear() {
        return numbergear;
    }

    public String setcolor() {
        return color;
    }

    public double setdiametro() {
        return diametro;
    }
    
    public String settravoes(){
        return travoes;
    }
    
    public double setprice() {
        return price;
    }
        public int setgarantia(){
        return garantia;     
    }
        
    @Override
   public String toString(){
   return id + " " + price + " " + color;     
   }    
}
