/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;


public interface GasServices {
    
    public double getGasPrice();
    public  void setGasPrice(double price);
    public  double getGasTotalPrice(int litros);
    
}
