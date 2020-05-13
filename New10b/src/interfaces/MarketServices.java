/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Paulo
 */
public interface MarketServices {
    
    public double getPreço_Batatas();
    public void setPreço_Batatas(double newprice);
    public double getTotalPrice(int quantidade);
}
