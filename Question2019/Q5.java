
package Question2019;
/*
class Delivery{
    private String sender;
    private String recipient;
    private double weight;
   // protected static double totalCost;
    
    public Delivery(String sender, String recipient, double weight){
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }
    
    public double totalCost(){
        if(this.weight <= 5){
          //  totalCost += (2.8*weight);
            return 2.8*weight;
        }
        else if(this.weight > 5 && this.weight <= 20){
          //  totalCost += ((5*2.8) + (5.2*(weight-5)));
            return (5*2.8) + (5.2*(weight-5));
        }
        else if(this.weight > 20 && this.weight <= 50){
           // totalCost += ((5*2.8) + (5.2*15) + (7.0*(weight-20)));
            return (5*2.8) + (5.2*15) + (7.0*(weight-20));
        }
        else{
         //   totalCost += ((5*2.8) + (5.2*15) + (7.0*30) + (8.6*(weight-50)));
            return (5*2.8) + (5.2*15) + (7.0*30) + (8.6*(weight-50));
        }
    }
    
    @Override
    public String toString(){
        return "\nFrom: " + sender + " To: " + recipient + "\nWeight of package : " + weight + "\nShipping Cost: RM" + totalCost();
    }
}

class SpecialDelivery extends Delivery{
    
    private boolean weekendDelivery;
    private boolean nightDelivery;
    
    public SpecialDelivery(String sender, String recipient, double weight,boolean weekendDelivery, boolean nightDelivery) {
        super(sender, recipient, weight);
        this.weekendDelivery = weekendDelivery;
        this.nightDelivery = nightDelivery;
    }
    
    @Override
    public double totalCost(){
        double original = super.totalCost();
        if(weekendDelivery == true && nightDelivery == true){
       //     totalCost += ((original+50)*1.2);
            return (original+50)*1.2;
        }
        else if(weekendDelivery == true){
       //     totalCost += (original+50);
            return original+50;
        }else if(nightDelivery == true){
       //     totalCost += (original*1.2);
            return original*1.2;
        }else{
       //     totalCost += original;
            return original;
        }
    }
    
    @Override
    public String toString(){
        
        if (weekendDelivery == true && nightDelivery == true){
            return super.toString() + "\nWeekend Delivery" + "\nNight Time Delivery";
        }
        else if(weekendDelivery == true){
            return super.toString() + "\nWeekend Delivery";
        }
        else if(nightDelivery == true)
        {
            return super.toString() + "\nNight Time Delivery";
        }
        else{
            return null;
        }
    }
    
}

public class Q5 {
    public static void main(String[] args) {
        double totalCost = 0;
        Delivery [] delivery = new Delivery [2];
        delivery[0] = new Delivery("Ali", "Ahmad", 4.4);
        delivery[1] = new Delivery("Ah Chong", "Fatimah", 63.1);
        
        SpecialDelivery [] specialDelivery = new SpecialDelivery [2];
        specialDelivery[0] = new SpecialDelivery("FSKTM, UM", "FK,UM",32.5, true, false);
        specialDelivery[1] = new SpecialDelivery("Ang" , "Liew" , 19.0, true, true);
        
        for(Delivery deliveries : delivery){
            totalCost += deliveries.totalCost();
            System.out.print(deliveries.toString() + "\n");
        }
        
        for(SpecialDelivery specialDeliveries : specialDelivery){
            totalCost += specialDeliveries.totalCost();
            System.out.print(specialDeliveries.toString() + "\n");
        }
        
        System.out.print("\nThe total shipping cost is RM" + totalCost);
    }
}
*/