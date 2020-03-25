/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f5e1;

public class User {
    protected final int size = 31;
    protected int id = 0;
    protected static int nextid = 0;
    protected String nome;
    protected String mail;
    protected String birddate;
    protected Expense[] expenses = new Expense[size];
    
    public User(String nome, String mail, String birddate, Expense[] expenses){
        this.id = nextid++;
        this.nome = nome;
        this.mail = mail;
        this.birddate = birddate;
        this.expenses = expenses;
    }    
}
