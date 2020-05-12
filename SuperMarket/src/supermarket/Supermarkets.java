/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

/**
 *
 * @author Paulo
 */
public class Supermarkets {
    private Company[] supermarkets; 
    private int max_supermarkets;
    private int counter;
    
    /**
     *
     */
    public Supermarkets(){
        this.counter = 0;
        this.max_supermarkets = 20;
        this.supermarkets = new Company[max_supermarkets];
    }
    
    /**
     *
     * @param supermarket
     */
    public void add(Company supermarket){
      if(counter < max_supermarkets){  
        this.supermarkets[counter] = supermarket;
        counter++;}
        else{
                this.max_supermarkets = this.max_supermarkets + 10;
                this.supermarkets[counter] = supermarket;
                counter++;}
                }
    
    /**
     *
     * @param nr
     */
    public void remove(int nr){
       
        this.supermarkets[nr] = null;
        for (int i = nr; i < counter - 1; i++) {
            this.supermarkets[i] = this.supermarkets[i + 1];
        }
        this.counter--;
    }
      
      public String toString(){
    String text = "";
      for(int i = 0 ; i < counter; i++){
          text = text + this.supermarkets[i].toString();
          text = text + "\n";
      }  
      return text;
    }
    
    
    
    
}
