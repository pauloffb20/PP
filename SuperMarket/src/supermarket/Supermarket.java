
package supermarket;

import interfaces.MarketServices;
import supermarket.Company;

/**
 *
 * @author Paulo
 */
public class Supermarket extends Company implements MarketServices {

    private double preçobatatas;
    private double totalpricebatatas;

    /**
     *
     * @param name
     * @param varnumber
     */
    public Supermarket(String name, int varnumber) {
        super(name, varnumber);
        this.preçobatatas = 1.00;
    }

    /**
     *
     * @param quantidade
     * @return
     */
    @Override
    public double getTotalPrice(int quantidade) {
        this.totalpricebatatas = this.preçobatatas * quantidade;
        return this.totalpricebatatas;
    }

    /**
     *
     * @return
     */
    @Override
    public double getPreço_Batatas() {
        return this.preçobatatas;
    }

    /**
     *
     * @param newprice
     */
    @Override
    public void setPreço_Batatas(double newprice) {
        this.preçobatatas = newprice;
    }
    
    
    @Override
    public String toString(){
        String text = "Nome da Companhia:" + this.getname() + " " + "\n"+ "Preço dos produtos:" + "\n";
        text = text + "Batatas:" + this.getPreço_Batatas()+ "\n";
        return text;
    }

}
