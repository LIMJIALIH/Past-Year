
package Question2016;

class CreditCard {
    private String name;
    private String number;
    private String type;
    
    public CreditCard(String name, String number, String type){
        this.name = name;
        this.number = number;
        this.type = type;
    }
    
    private double reward =0;
    
    public void setReward(double reward){
        this.reward = reward;
    }
    
    public double getReward(){
        return reward;
    }
    
    @Override
    public String toString(){
        return "Credit Card : " + name + " (" + number + ")" + "\nCard Type : " + type + "\nTotal Cash Reward : " + reward;
    }
}
