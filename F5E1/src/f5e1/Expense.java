/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f5e1;

public class Expense {
    protected int nr;
    protected String type;
    protected float amount;

    public Expense(int nr, String type, float amount){
        this.nr = nr;
        this.type = type;
        this.amount = amount;
    }    
}
