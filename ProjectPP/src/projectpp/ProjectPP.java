/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpp;


import java.io.IOException;
import java.util.Arrays;
import order.base.OrderStatus;
import order.exceptions.ContainerException;
import order.exceptions.OrderException;
import order.exceptions.PositionException;
import order.packing.Color;


/**
 *
 * @author Paulo Filipe Ferreira Brito
 * Nr: 8160279
 * Turma 3
 * @author Hugo Maia Alves
 * Nr: 8160521
 * Turma: 2
 */
public class ProjectPP {

    public static void main(String[] args) {

        Address address = new Address("Porto", "Portugal", 83, "state2", "Rua do monte");
        Address address2 = new Address("Lisboa", "Portugal", 88, "State1", "Rua das flores");
        Customer customer = new Customer("Paulo", address);
        Customer customer2 = new Customer("Bruno", address2);
        Item item = new Item( "É uma bola de futebol", 2, 2, 2);
        Item item2 = new Item( "É um boneco", 2, 2, 2);
        Item item3 = new Item( "É um armário", 6, 6, 6);
        Item item4 = new Item( "É um tijolo", 2, 2, 2);
        Position position = new Position(5, 0, 1);
        Position position2 = new Position(5, 1, 1);
        Position position3 = new Position(8, 7, 4);
        ItemPacked item_packed = new ItemPacked(Color.black, item, position);
        Container container = new Container(6, 6, 6);
        Container container2 = new Container(5, 5, 5);
        Person catia = new Person("Cátia", address);
        
        
        //testanto os métodos da class Customer
        System.out.println("Name:" + customer.getName());
        System.out.println("Id: " + customer.getCustomerId());
        System.out.println(customer.getAddress() + "\n");
        System.out.println("Billing Address: " + "\n" + customer.getBillingAddress() + "\n");
        System.out.println("Customer info:" + "\n" +customer.toString() + "\n");
        customer.setAddress(address2);
        customer.setBillingAddress(address2);
        System.out.println("New info customer: \n" + customer.toString() + "\n");
        System.out.println(customer2.toString() + "\n");
  
        //testanto os métodos da class item
        System.out.println(item.getReference());
        System.out.println(item.getDescription());
        System.out.println(item.toString() + "\n");
        System.out.println(item2.getReference());
        System.out.println(item2.getDescription());
        System.out.println(item2.toString() + "\n");

        
        //testanto os métodos da class itemPacked
        System.out.println(item_packed.getItem());
        System.out.println("Cor:" + item_packed.getColor());
        System.out.println("Position:" + item_packed.getPosition() + "\n");

        
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
        
        System.out.println("\n");

        //Teste ao método addItem da classe Container em vista o sucesso de adição
        try {
            System.out.println("Success add? " + container.addItem(item, position, Color.silver));
        } catch (ContainerException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Success add? " + container.addItem(item2, position2, Color.silver));
        } catch (ContainerException e) {
            System.out.println(e.getMessage());
        }
        
        //Teste ao método addItem da classe Container em vista lançar uma excepção de ter enviado um null
        try {
            System.out.println(container.addItem(item2, null, Color.silver));
        } catch (ContainerException e) {
            System.out.println(e.getMessage());
        }
        
        
        // Teste aos métodos getNumberOfItems e getRemainingVolume da class Container
        System.out.println("Number of items: " + container.getNumberOfItems());
        System.out.println("Remaining volume: " + container.getRemainingVolume());
        
        //Teste do volume ocupado por os items adicionados
        System.out.println("Volume : " + container.getOccupiedVolume());
        

        try {
            System.out.println("Success add? " + container.addItem(item3, position3, Color.silver));
        } catch (ContainerException e) {
            System.out.println(e.getMessage());
        } 
        
        try {
            System.out.println("Success add? " + container2.addItem(item4, position2, Color.silver));
        } catch (ContainerException e) {
            System.out.println(e.getMessage());
        } 
        
        System.out.println("Number of items:" + container.getNumberOfItems());
        
        
        // Testar o método validate com preposito de lançar a excepção de volume excedido
        try {
            container.validate();
        } catch (PositionException | ContainerException e) {
            System.out.println(e.getMessage());
        } 
           
        System.out.println("\n");
       
        //Teste ao método removeItem da class Container com prespectiva que encontre e remova o item
        try {
            System.out.println("Success remove? " + container.removeItem(item3));
        } catch (ContainerException e) {
            System.out.println(e.getMessage());
        }

        //Teste ao método removeItem da class Container com prespectiva que lance excepção devido a receber um null
        try {
            System.out.println(container.removeItem(null));
        } catch (ContainerException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Number of items:" + container.getNumberOfItems() + "\n");
        
        
        //Teste ao método getItem com sucesso da class container
        System.out.println(container.getItem("Item:1"));
        System.out.println(container.getItem("Item:2"));
        
        //Teste ao método getItem para quando o item pedido não existe no container
        System.out.println(container.getItem("Item:3"));
        
        //Teste ao método removeItem com objetivo de lançar excepção de que o item não existe no container
        try {
            System.out.println("Success remove? " + container.removeItem(item4));
        } catch (ContainerException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\n");
                
        //Teste a obter a referencia do container
        System.out.println(container.getReference()); 
        
        //Teste do método validate de forma a gerar excepção de overlapping       
        try {
            container.validate();
        } catch (PositionException | ContainerException e) {
            System.out.println(e.getMessage());
        }
        
        //Teste do método isClosed da class Container(false)
        System.out.println("Container closed? " + container.isClosed());
        
        //Teste ao método setX da class Position de forma alterar com sucesso x
        try {
            position2.setX(2);
        } catch (PositionException e) {
            System.out.println(e.getMessage());
        }
        
        //Teste do método validate de forma passar sem gerar excepçoes
        try {
            container.validate();
        } catch (PositionException | ContainerException e) {
            System.out.println(e.getMessage());
        }
        
        //Teste do método isClosed da class Container(true)
        System.out.println("Container closed? " +  container.isClosed());
        System.out.println("\n");

        ShippingOrder order = new ShippingOrder(customer, customer);
        ShippingOrder order2 = new ShippingOrder(customer, catia);
        ShippingOrder order3 = new ShippingOrder(customer2, customer);

        // testar o metodos getId, getStatus, getCustomer e getDestination na class ShippingOrder
        System.out.println("Order id:" + order.getId());
        System.out.println("Status:" + order.getStatus());
        System.out.println("Customer:" + order.getCustomer());
        System.out.println("Destination: \n" + order.getDestination());
        System.out.println("\n");

        System.out.println("Order id:" + order2.getId());
        System.out.println("Status:" + order2.getStatus());
        System.out.println("Customer:" + order2.getCustomer());
        System.out.println("Destination: \n" + order2.getDestination());
        System.out.println("\n");

        System.out.println("Order id:" + order3.getId());
        System.out.println("Status:" + order3.getStatus());
        System.out.println("Customer:" + order3.getCustomer());
        System.out.println("Destination: \n" + order3.getDestination());
        System.out.println("\n");

        //Teste ao método setDestination da class ShippingOrder
        order.setDestination(catia);

        System.out.println("Order id:" + order.getId());
        System.out.println("Status:" + order.getStatus());
        System.out.println("Customer:" + order.getCustomer());
        System.out.println("Destination: \n" + order.getDestination());
        System.out.println("\n");
        
        //Teste ao método close da class Container de forma fechar o container com sucesso
        try {
            container.close();
        } catch (ContainerException | PositionException ex) {
            System.out.println(ex.getMessage());
        }
        
        //Teste ao método isClosed da class Container com proposito de que retorne true por o container se encontrar fechado
        System.out.println("Container is closed? " + container.isClosed());

        //Adição com sucesso de um container 
        try{
            System.out.println("Success add of container? " + order.addContainer(container));
        } catch(ContainerException | OrderException e){
            System.out.println(e.getMessage());
        }
        
        
        //Teste ao método existsContainer da class ShippingOrder com proposito de retornar false por não existir
        System.out.println("Container exists? " + order.existsContainer(container2));
        //Teste ao método findContainer da class ShippinOrder com proposito de retornar -1 significando que o container não se encontra em nenhuma posição 
        System.out.println("Container position in coleccion? " + order.findContainer("Container:2"));
        
        System.out.println("\n");
        
        //Teste ao método setStatus da class ShippingOrder com proposito de devolver uma excepção de status incompativeis para alteração
        try {
            order.setStatus(OrderStatus.AWAITS_TREATMENT);
        } catch (OrderException | ContainerException | PositionException o) {
            System.out.println(o.getMessage());
        }
        
        //Teste ao método setStatus com sucesso
        try {
            order2.setStatus(OrderStatus.IN_TREATMENT);
        } catch (OrderException | ContainerException | PositionException o) {
            System.out.println(o.getMessage());
        }
        
        System.out.println("Status:" + order2.getStatus());

        //Teste ao método addContainer da class ShippingOrder com o proposito de devolver uma exceção de que o container a ser adicionado está aberto
        try{
            System.out.println(order.addContainer(container2));
        } catch(ContainerException | OrderException e){
            System.out.println(e.getMessage());
        } 
        
        //Teste ao método close da class Container de forma fechar o container com sucesso
        try {
            container2.close();
        } catch (ContainerException | PositionException ex) {
            System.out.println(ex.getMessage());
        }
        
        //Teste ao método addContainer com proposito de adicionar com sucesso o container
        try {
            System.out.println("Success add of container? " + order.addContainer(container2));
        } catch (ContainerException | OrderException e) {
            System.out.println(e.getMessage());
        }        
        
        //Teste ao método addContainer com preposito de retornar false derivado a já existir o container na order
        try {
            System.out.println("Success add of container? " + order.addContainer(container2));
        } catch (ContainerException | OrderException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\n");
        
        //Teste ao método getContainers da class ShippingOrder de forma mostrar os Containers presentes na order (CORRIGIR)
        System.out.println(Arrays.toString(order.getContainers()));
        
        System.out.println("\n");
        
       
        Export export1 = new Export();
        
        //Teste ao método export da class Export
        try {
            export1.export(order);
        } catch (IOException e) {
            System.out.println(e);
        } 
        
        System.out.println("\n");
        
        //Teste ao método toString da class Container
        System.out.println(container.toString());
        //Teste ao método summary da class ShippingOrder
        System.out.println(order.summary());
    }
}
