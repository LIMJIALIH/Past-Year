
package Question2016;

public class Point extends CreditCard{
    
    public Point(String name, String number) {
        super(name, number, "Point Reward Card");
    }
    
    public void getReward(String day, double price){
        if(day.equalsIgnoreCase("Friday")){
            setReward(getReward() + Math.floor(price)*2/100);
        }else if(day.equalsIgnoreCase("Saturday")){
            setReward(getReward() + Math.floor(price)*3/100);
        }else if(day.equalsIgnoreCase("Sunday")){
            setReward(getReward() + Math.floor(price)*4/100);
        }else{
            setReward(getReward() + Math.floor(price)/100);
        }
    }
}
