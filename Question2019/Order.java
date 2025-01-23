
package Question2019;

public class Order {
     protected String customerName;
     protected String customerID;
     protected int quantity;
     protected double unitPrice;
     
     public Order(){
         this.customerName = null;
         this.customerID = null;
         this.quantity = 0;
         this.unitPrice = 0;
     }
     
     public Order(String customerName, String ID, int quantity, int unitPrice){
         this.customerName = customerName;
         this.customerID = ID;
         this.quantity = quantity;
         this.unitPrice = unitPrice;
     }
     
     public void setQuantity(int quantity){
         this.quantity = quantity;
     }
     
     public void setUnitPrice(int unitPrice){
         this.unitPrice = unitPrice;
     }
     
     public int getQuantity(){
         return quantity;
     }
     
     public double getUnitPrice(){
         return unitPrice;
     }
     
     public double computeTotalPrice(){
         return quantity*unitPrice;
     }
     
     @Override
     public String toString(){
         return String.format("\nCustomer Name: %s \nCustomer Id : %s \nQuantity ordered: %d \nUnit Price: %.2f \nTotal Price: %.2f",customerName,customerID,quantity,unitPrice,computeTotalPrice());
     }
}
