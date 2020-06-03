/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpp;

import order.base.IAddress;

/**
 *
 * @author Paulo Filipe Ferreira Brito
 * Nr: 8160279
 * Turma 3
 * @author Hugo Maia Alves
 * Nr: 8160521
 * Turma: 2
 */

public class Address implements IAddress{
    
    private String city;
    private String country;
    private int number;
    private String state;
    private String street;
    
    /**
     *
     * @param city do tipo String
     * @param country do tipo String
     * @param number do tipo inteiro
     * @param state do tipo String
     * @param street do tipo String
     */
    public Address(String city, String country, int number, String state, String street){
        this.city = city;
        this.country = country;
        this.number = number;
        this.state = state;
        this.street = street;
    }

    /**
     *
     * @return city do tipo String
     */
    @Override
    public String getCity() {
       return city;
    }

    /**
     *
     * @return country do tipo String
     */
    @Override
    public String getCountry() {
        return country;
    }

    /**
     *
     * @return number do tipo inteiro
     */
    @Override
    public int getNumber() {
        return number;
    }

    /**
     *
     * @return state do tipo String
     */
    @Override
    public String getState() {
        return state;
    }

    /**
     *
     * @return street do tipo String
     */
    @Override
    public String getStreet() {
        return street;
    }

    /**
     *
     * @param string do tipo String
     * Método para alterar city
     */
    @Override
    public void setCity(String string) {
       this.city = string;
    }

    /**
     *
     * @param string do tipo String
     * Método para alterar country
     */
    @Override
    public void setCountry(String string) {
        this.country = string;
    }

    /**
     *
     * @param i do tipo int
     * Método para alterar number
     */
    @Override
    public void setNumber(int i) {
        this.number = i;
    }

    /**
     *
     * @param string do tipo String
     * Método para alterar state
     */
    @Override
    public void setState(String string) {
       this.state = string;
    }

    /**
     *
     * @param string do tipo String
     * Método para alterar street
     */
    @Override
    public void setStreet(String string) {
        this.street = string;
    }    
    
    /**
     *
     * @return text do tipo String
     * Método para imprimir a morada
     */
    @Override
   public String toString(){
       String text =  "Country: " + country + "\n" + "City: " + city + "\n" + "Number:" + number + "\n" +"State: " + state + "\n" +"Street: " + street;
       return text;
   }   
}
