
package Question2018;
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q4 {
    public static void main(String[] args) {
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader("D:\\InputAndOutput\\Q4.txt"));
            
            String line;
            String winner = "";
            double winnerScore=0;
            double [] total = new double [4];
            String name;
            int countTotal = 0;
            double [] scores = new double [5];
            
            while((line = reader.readLine()) != null){
                //Get the score and name and degree
                String [] parts = line.split(",");
                name = parts[0];
                for(int i = 1 ; i<parts.length-1 ; i++){
                    scores [i-1] = Double.parseDouble(parts[i]);
                } 
                int degree = Integer.parseInt(parts[6]);
                //Check for the highest and lowest scores
                double lowest = 100;
                double highest = 0;
                int countLowest = 0;
                int countHighest = 0;
                
                for(int i = 0 ; i<scores.length ; i++){
                    
                    if(scores[i]>highest){
                        highest = scores[i];
                        
                    }
                    if(scores[i]<lowest){
                        lowest = scores[i];
                    }
                }
                
                for(int i = 0 ; i<scores.length ; i++){
                    if(scores[i] == lowest && countLowest == 0){
                        scores[i] = 0;
                        countLowest++;
                    }
                    if(scores[i] == highest && countHighest == 0){
                        scores[i] = 0;
                        countHighest++;
                    }
                }
                
                for(int i = 0 ; i<scores.length ; i++){
                    total[countTotal]+=scores[i];
                }
                
                total[countTotal] = total[countTotal]*degree;
                
                System.out.print("\n" + name + " score " + total[countTotal] + "\n");
                
                if(total[countTotal] > winnerScore){
                    winnerScore = total[countTotal];
                    winner = name;
                }
                
                countTotal++;
                
            }
            
            System.out.print("\n" + winner + " is the winner");
            
            reader.close();
        }catch(FileNotFoundException e){
            System.out.print("\nThe file cannot be found");
        }catch(IOException e){
            System.out.print("\nError in reading the file");
        }
    }
}
*/