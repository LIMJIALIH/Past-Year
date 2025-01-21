
package Question2024;
/*
import java.util.Random;

public class Q4 {   //Main method here
    public static void main(String[] args) {
        
        int [][] seatingPlan = initializeSeatingPlan(); //Initialize the random seat inside a variable to pass to analyzeSeating
        analyzeSeating(seatingPlan);    //Analyse the random seat
        System.out.println("\nSeating Plan:");
        for(int i = 0 ; i<5 ; i++){
            for(int j = 0 ; j < 5 ; j++){
                System.out.print(seatingPlan[i][j] + " ");  //Display random seat form for debug porpose
            }
            System.out.print("\n");
        }
    }
    
    public static int[][] initializeSeatingPlan(){
                        
        Random rand = new Random();     //Initialize random variable
        int [][] seatingPlan = new int [5][5];  //Initialize the size of the 2D array
        for(int i = 0 ; i<5 ; i++){
            for(int j = 0 ; j<5 ; j++){
                seatingPlan[i][j] = rand.nextInt(0,2); //Insert random number 1 and 0 into the array row by row
            }
        }
        
        return seatingPlan; //return the seating plan
    }
    
    public static void analyzeSeating(int [][] seatingPlan){
        
        int totalNumSeat = 0;   //Calculate the total number of 1
        int numSeat = 0;        //Store the number of seat for a row than make comparism
        int maxNumSeat = 0;     //Store the maximum number of seat 
        int rows = 0;           //Detect the row with maximum number of seat
        
        for(int i = 0 ; i<5; i++){
            for(int j = 0 ; j<5 ; j++){
                if(seatingPlan[i][j] == 1){
                    totalNumSeat++;     //Count the number of 1 through a row for each row
                    numSeat++;          //Count the number of seat in 1 row only then reset to 0
                }
            }
            if(numSeat > maxNumSeat){
                    maxNumSeat = numSeat;       //Determine the row that have the most seat
                    rows = i;
                }
            numSeat = 0;
            
        }
        System.out.print("\nTotal Occupied Seats: " + totalNumSeat);
        System.out.print("\nRow with Most Occupied Seats: Row " + (rows+1));
    }
}
*/
