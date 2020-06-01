/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpp;


import order.base.ICustomer;
import order.base.IPerson;
import order.base.OrderStatus;
import order.exceptions.ContainerException;
import order.exceptions.OrderException;
import order.exceptions.PositionException;
import order.packing.IContainer;
import shippingorder.IShippingOrder;

/**
 *
 * @author Paulo Filipe Ferreira Brito
 * Nr: 8160279
 * Turma 3
 * @author Hugo Maia Alves
 */

public class ShippingOrder implements IShippingOrder{
    
    private static int id = 1;
    private int orderid;
    private final int max = 5;
    private int nr_containers;
    private IContainer[] containers;
    private OrderStatus status;
    private ICustomer customer;
    private IPerson destination;

    
    public ShippingOrder(ICustomer customer, IPerson person){
        this.orderid = id;
        id++;
        this.nr_containers = 0;
        this.containers = new Container[max];
        this.status = OrderStatus.IN_TREATMENT;
        this.customer = customer;
        this.destination = person;
    }

    @Override
    public boolean addContainer(IContainer ic) throws OrderException, ContainerException {

        if (status != OrderStatus.IN_TREATMENT) {
            throw new OrderException("ERROR: You can't add because order is not in treatment") {
            };
        } else if (ic == null) {
            throw new ContainerException("ERROR: You can't add null parameter") {
            };
        } else if (ic.isClosed() == false) {
            throw new ContainerException("ERROR: You can't add because container is open ") {
            };
        } else {
            for (int i = 0; i < nr_containers; i++) {
                if (this.containers[i].equals(ic)) {
                    return false;
                }
            }
        }

        if (nr_containers < max) {
            this.containers[nr_containers] = ic;
            nr_containers += 1;
            return true;
        } else {
            this.containers = new Container[nr_containers + 10];
            this.containers[nr_containers] = ic;
            nr_containers += 1;
            return true;
        }
    }


    @Override
    public boolean removeContainer(IContainer ic) throws OrderException, ContainerException {

        if (status != OrderStatus.IN_TREATMENT) {
            throw new OrderException("ERROR : Impossivel to remove because order is not in treatment") {
            };
        } else if (ic == null) {
            throw new ContainerException("ERROR : Impossivel to remove nulls") {
            };
        } else {
            for (int i = 0; i < nr_containers; i++) {
                if (containers[i].equals(ic)) {

                    this.containers[i] = null;

                    for (int j = i; j < nr_containers - 1; j++) {
                        this.containers[j] = this.containers[j + 1];
                    }

                    this.nr_containers--;
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public boolean existsContainer(IContainer ic) {

        for (int i = 0; i < nr_containers; i++) { 
            if (containers[i].equals(ic)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int findContainer(String string) {
        int pos;

        for (int i = 0; i < nr_containers; i++) { // percorremos array
            if (containers[i].getReference().equals(string)) {
                pos = i;
                return pos;
            }
        }
        return -1;
    }

    @Override
    public IPerson getDestination() {
        return destination;
    }

    @Override
    public void setDestination(IPerson ip) {
       this.destination = ip;
    }

    @Override
    public ICustomer getCustomer() {
        return customer;
    }

    @Override
    public OrderStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(OrderStatus os) throws OrderException, ContainerException, PositionException {
        if(os == OrderStatus.IN_TREATMENT){
           this.status = OrderStatus.AWAITS_TREATMENT; 
        } else if(os == OrderStatus.CLOSED){
            this.status = OrderStatus.IN_TREATMENT;
        } else if (os == OrderStatus.SHIPPED) {
            validate();
            this.status = OrderStatus.CLOSED;
        } else {
            throw new OrderException("ERROR : The current status is not compatible with the status to change") {
            };
        }
    }

    @Override
    public int getId() {
       return orderid;
    }

    @Override
    public IContainer[] getContainers() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void validate() throws ContainerException, PositionException {
        for (int i = 0; i < nr_containers-1; i++) {
            try {
                this.containers[i].validate();
            } catch (ContainerException | PositionException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public String summary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }       
}
