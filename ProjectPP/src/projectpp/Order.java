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
 * @author Paulo
 */

public class Order implements IShippingOrder{
    
    private static int id = 1;
    private int orderid;
    private final int max = 5;
    private Container[] containers;
    private OrderStatus status;
    private ICustomer customer;
    private IPerson destination;

    
    public Order(ICustomer customer, IPerson person){
        this.orderid = id;
        id++;
        this.containers = new Container[max];
        this.status = OrderStatus.AWAITS_TREATMENT;
        this.customer = customer;
        this.destination = person;
    }

    @Override
    public boolean addContainer(IContainer ic) throws OrderException, ContainerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeContainer(IContainer ic) throws OrderException, ContainerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existsContainer(IContainer ic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int findContainer(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String summary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
