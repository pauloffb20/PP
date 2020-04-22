
package pizzariia;

public class Pizzariia {

  public static void main(String[] args) {

     Ingrediente frango = new Ingrediente(1,"Carne de frango",Origem.origem.Animal.getorigem(),20.00);
     Ingrediente tomate = new Ingrediente(2,"Tomate", Origem.origem.Vegetal.getorigem() ,10.00);
     Ingrediente sal = new Ingrediente(3,"Sal",Origem.origem.Mineral.getorigem(), 10.00);
     Ingrediente cogumelos = new Ingrediente(4,"Cogumelos",Origem.origem.Vegetal.getorigem(), 10.00);
     Ingrediente pimenta = new Ingrediente(3,"Pimenta",Origem.origem.Mineral.getorigem(), 10.00);
     Ingrediente massa = new Ingrediente(3,"Massa",Origem.origem.Mineral.getorigem(), 10.00);
     Pizza pizza1 = new Pizza(1,"Pizza1",Descricao.descricao.Big.getdescricao(), 12.00);
     Pizza pizza2 = new Pizza(2, "Pizza2",Descricao.descricao.Big.getdescricao(), 12.00);
     Pizza[] pizzas = new Pizza[]{pizza1, pizza2};
     

    pizza1.add(sal);
    pizza1.add(frango);
    pizza2.add(tomate);
    pizza2.add(pimenta);

    
    for(Pizza pizza : pizzas){
        pizza.getinfopizza();
    }
    

    }
    
}
