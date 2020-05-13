
package new10b;

import interfaces.HipermarketServices;

/**
 *
 * @author Paulo
 */
public abstract class Hipermarket extends Supermarket implements HipermarketServices{
    
    private double preçobatatas;
    private double preçocafe;
    private double totalpricecafe;
    private double gasprice;
    private double totalpricegas;
    private double total;
    private double annualrate;
    
    public Hipermarket(String name, int varnumber) {
        super(name, varnumber);
        this.gasprice = 1.20;
        this.preçocafe = 0.60;
        this.preçobatatas = 1;
    }
    
  abstract int getpoints(double compra);
    
       @Override
    public double getPreço_Batatas() {
        return this.preçobatatas;
    }
    
       @Override
    public void setPreço_Batatas(double newprice) {
        this.preçobatatas = newprice;
    }
    
      @Override
    public double getCoffePrice() {
        return this.preçocafe;
    }

    /**
     *
     * @param newprice 
     */
    @Override
    public void setCoffePrice(double newprice) {
        this.preçocafe = newprice;
    }

    /**
     *
     * @param coffees
     * @return
     */
    @Override
    public double getCoffeTotal(int coffees) {
        this.totalpricecafe = this.preçocafe*coffees;
        return totalpricecafe;
    }

    /**
     *
     * @return
     */
    @Override
    public double getGasPrice() {
        return  this.gasprice;
    }

    /**
     *
     * @param price
     */
    @Override
    public void setGasPrice(double price) {
        this.gasprice = price;
    }

    /**
     *
     * @param litros
     * @return
     */
    @Override
    public double getGasTotalPrice(int litros) {
       this.totalpricegas = this.gasprice*litros;
       return this.totalpricegas;
    }

    @Override
    public double getAnnualrate() {
        return annualrate;
    }

    @Override
    public void setAnnualrate(double rate) {
        this.annualrate = rate;
    }
    

    @Override
    public double computMontlyPayment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
