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
 * @author Paulo Filipe Ferreira Brito
 * Nr: 8160279
 * Turma 3
 * @author Hugo Maia Alves
 */
public class Person implements IPerson{
    
    private String name;
    private IAddress address;

    /**
     *
     * @param name do tipo String
     * @param address do tipo Address
     */
    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }

    /**
     *
     * @return address do tipo IAddress
     */
    @Override
    public IAddress getAddress() {
        return address;
    }

    /**
     *
     * @return name do tipo String
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     *
     * @param ia do tipo IAddress
     * Método para alterar address
     */
    @Override
    public void setAddress(IAddress ia) {
        this.address = ia;
    }

    /**
     *
     * @param string do tipo String
     * Método para alterar o name
     */
    @Override
    public void setName(String string) {
        this.name = string;
    }
    
    /**
     *
     * @return text do tipo String 
     * Método para imprimir a info de uma pessoa
     */
    @Override
    public String toString() {
        String text = name + " " + address;
        return text;
    }
    
}
