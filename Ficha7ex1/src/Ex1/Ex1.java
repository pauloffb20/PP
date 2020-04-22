package Ex1;

import Ex1.enumerations.Material;


public class Ex1 {


    public static void main(String[] args) {

        Mountainbike bike1 = new Mountainbike(1, "Dupla", 1, 2, "azul", 10.00, "Simples", Material.Carbono , 23.00, 2);
        Roadbike bike2 = new Roadbike("Adesivo", 1.00 , 2, 2, "azul", 10.00, "Simples", Material.Carbono , 23.00, 2);
        Utensilio garrafa = new Utensilio("Garrafa");
        Utensilio kit = new Utensilio("Kit");
        

        bike1.addutensilios(kit);
        bike1.addutensilios(garrafa);
        bike2.addobs("Olá");
        Catalogo catalogo = new Catalogo();
        catalogo.addbike(bike2);
        catalogo.addbike(bike1);
        bike1.remove(2);
        
        System.out.println(catalogo.print());
       //bike1.escrever();
       //bike1.printutensilio();
       //bike1.printutensilio();
       //bike2.escrever();
       //bike2.printobs();    
    }
}
