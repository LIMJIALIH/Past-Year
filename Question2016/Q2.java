
package Question2016;
/*
import java.util.Scanner;
import java.util.Random;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int countP = 0;
        int countC = 0;
     while(true){
         
         if(countP == 3 || countC == 3){
             if(countP == 3){
                 System.out.print("\nPlayer wins the game.");
                 break;
             }
             else{
                 System.out.print("\nComputer wins the game.");
                 break;
             }
         }
         
         System.out.print("\nEnter 1.Paper 2.Scissor 3.Rock: ");
         int option = sc.nextInt();
         int optionCom = rand.nextInt(1,4);
         String output = "";
         String outputComp = "";
            
         if(option == 1){
             output = "Paper";
            }else if(option == 2){
             output = "Scissor";
            }else if(option == 3){
             output = "Rock";
            }
         
            if(optionCom == 1){
             outputComp = "Paper";
            }else if(optionCom == 2){
             outputComp = "Scissor";
            }else if(optionCom == 3){
             outputComp = "Rock";
            }
         System.out.print("\nPlayer : " + output + " ---- Computer : " + outputComp);
         if(option == 1 && optionCom == 3){
             countP++;
             System.out.print("\nPlayer win " + countP + " time(s)");
         }
         if(option == 1 && optionCom == 1){
             System.out.print("\n");
         }
         if(option == 1 && optionCom == 2){
             countC++;
             System.out.print("\nComputer win " + countC + " time(s)");
         }
         if(option == 2 && optionCom == 1){
             countP++;
             System.out.print("\nPlayer win " + countP + " time(s)");
         }
         if(option == 2 && optionCom == 2){
             System.out.print("\n");
         }
         if(option == 2 && optionCom == 3){
             countC++;
             System.out.print("\nComputer win " + countC + " time(s)");
         }
         if(option == 3 && optionCom == 1){
             countC++;
             System.out.print("\nComputer win " + countC + " time(s)");
         }
         if(option == 3 && optionCom == 2){
             countP++;
             System.out.print("\nPlayer win " + countP + " time(s)");
         }
         if(option == 3 && optionCom == 3){
             System.out.print("\n");
         }
        }
    }
}
*/