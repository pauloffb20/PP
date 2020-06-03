
package projectpp;

import order.base.IAddress;
import order.base.ICustomer;

/**
 *
 * @author Paulo Filipe Ferreira Brito
 * Nr: 8160279
 * Turma 3
 * @author Hugo Maia Alves
 * Nr: 8160521
 * Turma: 2
 */
public class Customer extends Person implements ICustomer {
    
    private static int id = 1;
    private int customer_id;
    private IAddress billing_address;
    
    /**
     *
     * @param name do tipo String
     * @param address do tipo Address
     */
    public Customer(String name, Address address) {
        super(name, address);
        this.billing_address = address;
        this.customer_id = id;
        id++;
    }

    /**
     * Método para obter o billing_address
     * @return billing_address do tipo IAddress
     */
    @Override
    public IAddress getBillingAddress() {
        return billing_address;
    }

    /**
     *Método para obter o customer id
     * @return customer_id do tipo inteiro
     */
    @Override
    public int getCustomerId() {
       return customer_id;
    }

    /**
     * Método para alterar o billing address
     * @param ia do tipo IAddress
     */
    @Override
    public void setBillingAddress(IAddress ia) {
        this.billing_address = ia;
    } 
    

    /**
     * Método para imprimir a info do customer
     * @return text do tipo String 
     */
    @Override
   public String toString(){
       String text = "Customer ID: " + getCustomerId() + "\n" + "Nome: " + super.getName() + "\n" + "Address: " + "\n" + super.getAddress();
       return text;
   }   
}
