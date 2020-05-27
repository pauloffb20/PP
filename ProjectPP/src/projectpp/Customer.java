
package projectpp;

import order.base.IAddress;
import order.base.ICustomer;

/**
 *
 * @author Paulo
 */
public class Customer extends Person implements ICustomer {
    
    private static int id = 1;
    private int customer_id;
    private IAddress billing_address;
    
    public Customer(String name, Address address) {
        super(name, address);
        this.billing_address = address;
        this.customer_id = id;
        id++;
    }

    @Override
    public IAddress getBillingAddress() {
        return billing_address;
    }

    @Override
    public int getCustomerId() {
       return customer_id;
    }

    @Override
    public void setBillingAddress(IAddress ia) {
        this.billing_address = ia;
    } 
    

    @Override
   public String toString(){
       String text = super.getName() + " " + customer_id + " " + super.getAddress() + " " + billing_address;
       return text;
   }   
}
