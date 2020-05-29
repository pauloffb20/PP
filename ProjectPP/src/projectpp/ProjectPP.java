/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpp;


import java.util.Arrays;
import order.exceptions.ContainerException;
import order.exceptions.PositionException;
import order.packing.Color;


/**
 *
 * @author Paulo
 */
public class ProjectPP {

    public static void main(String[] args) throws PositionException, ContainerException {

        Address address = new Address("Porto", "Portugal", 83, "porte", "Rua do monte");
        Address address2 = new Address("Lisboa", "Portugal", 88, "porte", "Rua das flores");
        Customer customer = new Customer("Paulo", address);
        Customer customer2 = new Customer("Bruno", address2);
        Item item = new Item( "É uma bola de futebol", 2, 2, 2);
        Item item2 = new Item( "É um boneco", 4, 4, 4);
        Item item3 = new Item( "É um armário", 6, 6, 6);
                                  //depth height  lenght
        Position position = new Position(0, 5, 0);
        Position position2 = new Position(0, 0, 0);
        Position position3 = new Position(8, 7, 4);
        ItemPacked item_packed = new ItemPacked(Color.black, item, position);
        Container container = new Container(6, 6, 6);
        Person catia = new Person("Cátia", address);
        
        
        //testanto os métodos da class Customer
        System.out.println(customer.getName());
        System.out.println(customer.getCustomerId());
        System.out.println(customer.getAddress());
        System.out.println(customer.getBillingAddress());
        System.out.println(customer.toString());
        customer.setAddress(address2);
        customer.setBillingAddress(address2);
        System.out.println(customer.toString());
        System.out.println(customer2.toString());
        
        
        //testanto os métodos da class item
        System.out.println(item.getReference());
        System.out.println(item.getDescription());
        System.out.println(item.toString());
        System.out.println(item2.getReference());
        System.out.println(item2.getDescription());
        System.out.println(item2.toString());
        
        //testanto os métodos da class itemPacked
        System.out.println(item_packed.getItem());
        System.out.println(item_packed.getColor());
        System.out.println(item_packed.getPosition());

        
        //testanto os método sets da class position devendo lançar excepção se alguma coordenada for negativa
        try {
            position.setX(-22);
        } catch (PositionException e) {
            System.out.println(e.getMessage());
        }
        try {
            position.setY(-22);
        } catch (PositionException e) {
            System.out.println(e.getMessage());
        }
        try {
            position.setZ(-22);
        } catch (PositionException e) {
            System.out.println(e.getMessage());
        }

        //testando o método getPosition da classe itemPacked
        System.out.println(item_packed.getPosition());

        //Teste ao método add da classe Container em vista o sucesso de adição
        try {
            System.out.println(container.addItem(item, position, Color.silver));
        } catch (ContainerException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(container.addItem(item2, position2, Color.silver));
        } catch (ContainerException e) {
            System.out.println(e.getMessage());
        }
        
        // Teste aos métodos getNumberOfItems e getRemainingVolume da class Container
        System.out.println(container.getNumberOfItems());
        System.out.println(container.getRemainingVolume());
        
        //Teste do volume ocupado por os items adicionados
        System.out.println("Volume : " + container.getOccupiedVolume()); 
    
        
        try {
            System.out.println(container.addItem(item3, position3, Color.silver));
        } catch (ContainerException e) {
            System.out.println(e.getMessage());
        } 
        
        // Testar o método validate com preposito de lançar a excepção de volume excedido
        try {
            container.validate();
        } catch (PositionException | ContainerException e) {
            System.out.println(e.getMessage());
        }

        //Teste ao método add da classe Container em vista a devolução de uma expeção da adição
        try {
            System.out.println(container.addItem(item, position, Color.silver));
        } catch (ContainerException e) {
            System.out.println(e.getMessage());
        } 
                
        System.out.println(container.getNumberOfItems());
        
        //Teste ao método removeItem da class Container com prespectiva que encontre e remova o item
        try {
            container.removeItem(item3);
        } catch (ContainerException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println(container.getNumberOfItems());
        
        //Teste ao método getItem com sucesso da class container
        System.out.println(container.getItem("Item:1"));
        System.out.println(container.getItem("Item:2"));
        
        //Teste ao método getItem para quando o item pedido não existe no container
        System.out.println(container.getItem("Item:3"));
        
        //Teste ao método removeItem com objetivo de lançar excepção de que o item não existe no container
        try {
            container.removeItem(item3);
        } catch (ContainerException e) {
            System.out.println(e.getMessage());
        }
        
        //Teste ao método getPackedItems da class Container
        System.out.println(Arrays.toString(container.getPackedItems())); // NAO SEI SE ESTA CORRETO, E SE PUDEMOS USAR ARRAYS.TOSTRING 
        
        //Teste a obter a referencia do container
        System.out.println(container.getReference()); 
        

        Order order = new Order(customer, customer);
        Order order2 = new Order(customer, catia);
        Order order3 = new Order(customer2, customer);
        
        // testar o metodos getId, getStatus, getCustomer e getDestination na class Order
        System.out.println(order.getId());
        System.out.println(order.getStatus());
        System.out.println(order.getCustomer());
        System.out.println("Destination:" + order.getDestination());
        System.out.println(order2.getId());
        System.out.println(order2.getStatus());
        System.out.println(order2.getCustomer());
        System.out.println("Destination:" + order2.getDestination());
        System.out.println(order3.getId());
        System.out.println(order3.getStatus());
        System.out.println(order3.getCustomer());
        System.out.println("Destination:" + order3.getDestination());  
        order.setDestination(catia);
        System.out.println(order.getId());
        System.out.println(order.getStatus());
        System.out.println(order.getCustomer());
        System.out.println("Destination:" + order.getDestination());
        
        //Teste do método close (que utiliza o método validate, ou seja, é um teste ao validate basicamente) de forma passar sem gerar excepçoes
        try {
            container.close();
        } catch (PositionException | ContainerException e) {
            System.out.println(e.getMessage());
        }

        //Teste do método isClosed da class Container(true)
        System.out.println(container.isClosed());

        
        
        
        
        
        
        
        
        
        
    } 
}
