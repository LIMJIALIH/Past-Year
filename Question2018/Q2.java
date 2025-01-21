
package Question2018;
/*
import java.util.Scanner;
import java.util.Random;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("\nEnter N number: ");
        int size = sc.nextInt();
        
        int [] randNumber = new int [size];
        int [] grp = new int[3];
        
        System.out.print("\nThe random numbers are:");
        
        for( int i = 0 ; i<randNumber.length ; i++){
            randNumber[i] = rand.nextInt(50,151);
            System.out.print(randNumber[i] + " ");
        }
        
        for(int i = 0 ; i<randNumber.length ; i++){
            String wordNum = String.valueOf(randNumber[i]);
            char lastChar = wordNum.charAt(wordNum.length()-1);
            int digit = Character.getNumericValue(lastChar);
            if(digit>= 0 && digit<=3){
                grp[0]++;
            }else if(digit>= 4 && digit<=6){
                grp[1]++;
            }else{
                grp[2]++;
            }
            wordNum = "";
        }
        
        System.out.print("\nGroup AAA:" + grp[0]);
        System.out.print("\nGroup AA:" + grp[1]);
        System.out.print("\nGroup A:" + grp[2] );
    }
}
*/