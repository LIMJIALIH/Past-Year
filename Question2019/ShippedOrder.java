
package Question2019;

public class ShippedOrder extends Order {
        
    public ShippedOrder(String customerName, String ID, int quantity, int unitPrice){
        super(customerName,ID,quantity,unitPrice);
    }
    
    @Override
    public double computeTotalPrice(){
        return super.computeTotalPrice()+4;
    }
    
    @Override
    public String toString(){
        return super.toString();
        //return String.format("\nCustomer Name: %s \nCustomer Id : %s \nQuantity ordered: %d \nUnit Price: %.2f \nTotal Price: %.2f",customerName,customerID,quantity,unitPrice,computeTotalPrice());
    }
}
