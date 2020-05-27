/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpp;

import order.base.IAddress;
import order.base.IPerson;


/**
 *
 * @author Paulo
 */
public class Person implements IPerson{
    
    private String name;
    private IAddress address;


    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }

    /**
     *
     * @return
     */
    @Override
    public IAddress getAddress() {
        return address;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAddress(IAddress ia) {
        this.address = ia;
    }

    @Override
    public void setName(String string) {
        this.name = string;
    }
    
    @Override
    public String toString() {
        String text = name + " " + address;
        return text;
    } 
    
}
