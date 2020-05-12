
package supermarket;



import interfaces.HipermarketServices;

/**
 *
 * @author Paulo Brito
 * Aluno 8160279 
 * 
 * Class Hipermarket desenvolvida para o primeiro momneto de avaliação da 
 * disciplina de paradigmas de programação.
 * 
 */
public class Hipermarket extends Supermarket implements HipermarketServices {
    
    private double preçobatatas;
    private double preçocafe;
    private double totalpricebatatas;
    private double totalpricecafe;
    private double gasprice;
    private double totalpricegas;
    
    /**
     *
     * @param name
     * @param varnumber
     */
    public Hipermarket(String name, int varnumber) {
        super(name, varnumber);
        this.gasprice = 1.20;
        this.preçocafe = 0.60;
    }

    /**
     *
     * @return
     */
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
    public String toString(){
       
        String text = "Nome da Companhia:" + this.getname() + " " + "\n"+ "Preço dos produtos:" + "\n";
        text = text + "Coffe" + this.getCoffePrice() + "\n" + "Batatas:"+ this.getPreço_Batatas()+ "\n"+ "Gas" + this.getGasPrice() + "\n";
        return text;
    }
}
