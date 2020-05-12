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
public class Main {

    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket("supermarket", 1);
        Hipermarket hipermarket = new Hipermarket("Hipermarket1", 2);
        Hipermarket hipermarket2 = new Hipermarket("Hipermarket2", 3);
        Supermarkets supermarkets = new Supermarkets();
        
       supermarkets.add(hipermarket);
       supermarkets.add(hipermarket2);
       supermarkets.add(supermarket);
       System.out.println(supermarkets.toString());
       supermarkets.remove(0);
       System.out.println(supermarkets.toString());
       System.out.println(hipermarket2.getCoffeTotal(5));    
    }    
}
