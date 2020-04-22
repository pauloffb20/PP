
package Ex1;

import Ex1.enumerations.Material;

public class Mountainbike extends Bike {
    private int nrutensilios = 5;
    private int counter = 0;
    private int lights;
    private String suspension;
    private Utensilio[] utensilios;
   
    
    public Mountainbike(int lights, String suspension,int id, int numbergear, String color, double diametro, String travoes, Material material, double price, int garantia){
 
        super(id,numbergear,color,diametro,travoes, material, price,garantia);
        this.lights = lights;
        this.suspension = suspension;
        this.utensilios = new Utensilio[nrutensilios];
    }
    
        public void addutensilios(Utensilio utensilio) {
        if (counter < nrutensilios ) {
            this.utensilios[counter] = utensilio;
            counter += 1;
        } else {
            System.out.println("Já antigiu o máximo de ferramentas.");
        }
        }
        
 public void remove(int nrutil){
        this.utensilios[nrutil] = null;
        for(int i = nrutil; i < counter-1; i++){
            this.utensilios[i] = this.utensilios[i+1];
        }
        this.counter--;
    }        
        
 public String printutensilio() {
        String text = this.escrever();
        for (int i = 0; i < counter; i++) {
            text = text + " " + utensilios[i].print();
        }
        return text;
    }
}
