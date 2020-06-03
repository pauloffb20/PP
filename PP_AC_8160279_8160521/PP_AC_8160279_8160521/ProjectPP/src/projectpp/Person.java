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
 * Nr: 8160521
 * Turma: 2
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
     * Método para obter address
     * @return address do tipo IAddress
     */
    @Override
    public IAddress getAddress() {
        return address;
    }

    /**
     * Método para obter name
     * @return name do tipo String
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Método para alterar address
     * @param ia do tipo IAddress
     */
    @Override
    public void setAddress(IAddress ia) {
        this.address = ia;
    }

    /**
     * Método para alterar o name
     * @param string do tipo String
     * 
     */
    @Override
    public void setName(String string) {
        this.name = string;
    }
    
    /**
     * Método para imprimir a info de uma pessoa
     * @return text do tipo String 
     * 
     */
    @Override
    public String toString() {
        String text = name + " " + address;
        return text;
    }
    
}
