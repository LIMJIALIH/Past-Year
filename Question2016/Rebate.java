
package Question2016;

class Rebate extends CreditCard {
    
    public Rebate(String name, String number) {
        super(name, number, "Rebate Card");
    }
    
    public void getReward(String typePayment, double price){
        if(typePayment.equalsIgnoreCase("Fuel")){
            setReward(getReward() + (price*0.08));
        }else if(typePayment.equalsIgnoreCase("Utility")){
            setReward(getReward() + (price*0.05));
        }else if(typePayment.equalsIgnoreCase("Grocery")){
            setReward(getReward() + (price*0.02));
        }else if(typePayment.equalsIgnoreCase("Other")){
            setReward(getReward() + (price*0.002));
        }
    }
}
