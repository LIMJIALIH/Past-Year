
package Question2019;

public class Pizza {
    
    private String size;
    private int numOfCheeseTopping;
    private int numOfBeefTopping;
    private int numOfChickenTopping;
    
    public Pizza(String size, int numOfCheeseTopping, int numOfBeefTopping, int numOfChickenTopping){
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfBeefTopping = numOfBeefTopping;
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    public String getSize(){
        return size;
    }
    
    public int getNumOfCheeseTopping(){
        return numOfCheeseTopping;
    }
    
    public int getNumOfBeefTopping(){
        return numOfBeefTopping;
    }
    
    public int getNumOfChickenTopping(){
        return numOfChickenTopping;
    }
    
    public void setSize(String size){
        this.size = size;
    }
    
    public void setNumOfCheeseTopping(int numOfCheeseTopping){
        this.numOfCheeseTopping = numOfCheeseTopping;
    }
    
    public void setNumOfBeefTopping(int numOfBeefTopping){
        this.numOfBeefTopping = numOfBeefTopping;
    }
    
    public void setNumOfChickenTopping(int numOfChickenTopping){
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    public double computeCost(){
        double total = 0;
        if(size.equalsIgnoreCase("Small")){
            total += 10;
            if(numOfCheeseTopping > 0){
                total += (2*numOfCheeseTopping);
            }
            if(numOfBeefTopping > 0){
                total += (2*numOfBeefTopping);
            }
            if((numOfChickenTopping > 0)){
                total += (2*numOfChickenTopping);
            }
        }
        else if(size.equalsIgnoreCase("Medium")){
            total += 12;
            if(numOfCheeseTopping > 0){
                total += (2*numOfCheeseTopping);
            }
            if(numOfBeefTopping > 0){
                total += (2*numOfBeefTopping);
            }
            if((numOfChickenTopping > 0)){
                total += (2*numOfChickenTopping);
            }
        }
        else if(size.equalsIgnoreCase("Large")){
            total += 14;
            if(numOfCheeseTopping > 0){
                total += (2*numOfCheeseTopping);
            }
            if(numOfBeefTopping > 0){
                total += (2*numOfBeefTopping);
            }
            if((numOfChickenTopping > 0)){
                total += (2*numOfChickenTopping);
            }
        }
        return total;
    }
    
    public void display(){
        System.out.print("\nSize of Pizza: " + size);
        System.out.print("\nNumber of Toppings of Cheese: " + numOfCheeseTopping);
        System.out.print("\nNumber of Toppings of Beef: " + numOfBeefTopping);
        System.out.print("\nNumber of Toppings of Chicken: " + numOfChickenTopping);
        System.out.print("\nTotal Cost of this Pizza: $" + computeCost());
    }
}
