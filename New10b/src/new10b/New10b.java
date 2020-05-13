/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new10b;

/**
 *
 * @author Paulo
 */
public class New10b {


    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket("supermarket", 1);
        Continente hipermarket = new Continente("Hipermarket1", 2);
        Continente hipermarket2 = new Continente("Hipermarket2", 3);
        Jumbo hipermarketjumbo = new Jumbo("Jumbo", 4);
        Supermarkets supermarkets = new Supermarkets();
        
       supermarkets.add(hipermarket);
       supermarkets.add(hipermarket2);
       supermarkets.add(hipermarketjumbo);
       supermarkets.add(supermarket);
       hipermarket.getpoints(12.0);
       hipermarketjumbo.getpoints(12.00);
       hipermarket.setPreço_Batatas(2);
   

     
       
       System.out.println(supermarkets.toString());
       //supermarkets.remove(0);
       //System.out.println(supermarkets.toString());
       //System.out.println(hipermarket2.getCoffeTotal(5));  
        
    } 
}
