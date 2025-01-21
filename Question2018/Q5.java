
package Question2018;
/*
abstract class Fruit{
    protected String name;
    protected String type;
    
    public Fruit(String name, String type){
        this.name = name;
        this.type = type;
    }
    
    public abstract double totalPrice();
    
    @Override
    public String toString(){
        return type + " " + name;
    }
}

class Apple extends Fruit{
    
    private int quantity;
    
    public Apple(String name, String type, int quantity) {
        super(name, type);
        this.quantity = quantity;
    }

    @Override
    public double totalPrice() {
        if(type.equalsIgnoreCase("Green")){
            return quantity*1.2;
        }else if(type.equalsIgnoreCase("Red")){
            return quantity*1.8;
        }
        return 0;
    }
    
    @Override
    public String toString(){
        return super.toString() + " - " + quantity + " = RM" + totalPrice();
    }
}

class WaterMelon extends Fruit{

    private double weight;
    
    public WaterMelon(String name, String type, double weight) {
        super(name, type);
        this.weight = weight;
    }

    @Override
    public double totalPrice() {
        if(type.equalsIgnoreCase("Local")){
            if(weight<2){
                return 2.25*2;
            }else if(weight >= 2 && weight<=5){
                return 1.95*weight;
            }else if(weight > 5){
                return 1.65*weight;
            }
        }else if(type.equalsIgnoreCase("Imported")){
            if(weight<2){
                return 3.75*2;
            }else if(weight >= 2 && weight<=5){
                return 3.45*weight;
            }else if(weight > 5){
                return 3.15*weight;
            }
        }
        return 0; 
    }
    
    @Override
    public String toString(){
        return super.toString() + " - " + weight + "kg = RM" + totalPrice();
    }
}
public class Q5 {
    public static void main(String[] args) {
        
        Apple redApple = new Apple("Apple", "Red", 8);
        Apple greenApple = new Apple("Apple", "Green", 11);
        
        WaterMelon localWatermelon = new WaterMelon("Watermelon", "Local", 7.6);
        WaterMelon importedWatermelon = new WaterMelon("Watermelon", "Imported", 4.0);
        
        Fruit cheapestFruit = redApple;
        Fruit [] fruits = {redApple,greenApple, localWatermelon,importedWatermelon};
        double cheapest = redApple.totalPrice();
        for(Fruit fruit : fruits){
            if(fruit.totalPrice() < cheapest){
                cheapest = fruit.totalPrice();
                cheapestFruit = fruit;
            }
        }
        System.out.print("\n" + redApple.toString());
        System.out.print("\n" + greenApple.toString());
        System.out.print("\n" + importedWatermelon.toString());
        System.out.print("\n" + localWatermelon.toString());
        System.out.print("\nThe cheapest item is");
        System.out.print("\n" + cheapestFruit.toString());
    }
}
*/

