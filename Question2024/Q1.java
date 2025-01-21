
package Question2024;

/*
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int positive = 0;
        int negative = 0;
        int zero = 0;
        
        while(true){
            System.out.print("\nPlease enter a number or type X to end:");
            String input = sc.next();
            if(input.equals("X")){
                break;
            }
            else{
                int number = Integer.parseInt(input);
                if(number>0){
                    positive++;
                }else if(number<0){
                    negative++;
                }else{
                    zero++;
                }
            }
        }
        System.out.print("\nNumber of positive number: " + positive + "\nNumber of negative number: " + negative + "\nNumber of zero number: " + zero);
    }
    
}
*/
/*
import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nPlease input number of n:");
        int n = sc.nextInt();
        double total = 1;
        
        for(int i = 2 ; i<= n ; i++){
            total = total + (1.0/i);
        }
        
        System.out.print("\nTotal is " + total);
    
    }
}
*/
/*
import java.util.Scanner;
public class  Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nPlease enter a number n:");
        int n = sc.nextInt();
        
        double total = 0;
        for(int i = 1 ; i<=n ; i++){
            total += (1.0/i);
        }
        
        System.out.print("\n" + total);
    }
}
*/