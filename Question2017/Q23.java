
package Question2017;
/*
import java.util.Scanner;
import java.util.Random;
public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("\nEnter the number of random integer: ");
        int numArray = sc.nextInt();
        
        int [] num = new int [numArray];
        
        
        for(int i = 0 ; i<num.length ; i++){
            num[i] = rand.nextInt(10001);
        }
        
        displayArray(num);
        
        int minimum = getMin(num);
        
        System.out.print("\nMinimum Number : " + minimum);
        
        approximation(num);
        
        reverse(num);
    }
    
    public static void displayArray(int [] num){
        System.out.print("The random integer : ");
        for(int i = 0  ; i<num.length ; i++){
            System.out.print(num[i] + " ");
        }
    }
    
    public static int getMin(int [] num){
        int min = num[0];
        
        for(int i = 0 ; i<num.length ; i++){
            if(num[i] < min){
                min = num[i];
            }
        }
        return min;
    }
    
    public static void approximation(int [] num){
        int [] number = new int [5];
        System.out.print("\nThe approximation of the integer to the nearest hundred :");
        for(int i = 0 ; i<num.length ; i++){
            number[i] = (int)(Math.round(num[i]/100.0))*100;
            System.out.print(" " + number[i]);
        }
    }
    
    public static void reverse(int [] num){
        System.out.print("\nThe random integer in reverse order : ");
        
        for(int i = 0 ; i<num.length ; i++){
            
            String number = Integer.toString(num[i]);
            
            for(int j = number.length()-1 ; j>=0 ; j--){
                System.out.print(number.charAt(j));
            }
            
            System.out.print(" ");
        }
    }
}
*/