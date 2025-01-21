
package Question2017;
/*
import java.io.*;
import java.util.Random;
public class Q3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] number = new int [6];
        for(int i = 0 ; i<6 ; i+=2){
            number[i] = rand.nextInt(65,91);
            number[i+1] = rand.nextInt(97,123);
        }
        System.out.print("\nThe string generated is: ");
        for(int i = 0 ; i<number.length; i++){
            System.out.print((char)number[i]);
        }
        
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
            for(int i = 0 ; i<number.length ; i++){
                writer.write(number[i]);
                writer.write("\n");
            }
            writer.close();
        }catch(IOException e){
            System.out.print("\nError in writing the file.");
        }
        sorted(number,'>');
        sorted(number,'<');
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
                String line;
                System.out.print("\nOriginal string from file: ");
                while((line = reader.readLine()) != null){
                    System.out.print(line);
                }
                reader.close();
                
            }catch(FileNotFoundException e){
                System.out.print("\nError in finding the file");
            }catch(IOException e){
                System.out.print("\nError in reading the file");
            }
    }
    public static void sorted(int number[], char sortedWay){
        if(sortedWay == '>'){
            System.out.print("\nString sorted in ascending order: ");
        for(int i = 0 ; i<number.length ; i++){
            for(int j = 0 ; j<number.length ; j++){
                if(number[j]>number[i]){
                    int temp = number[j];
                    number[j] = number[i];
                    number[i] = temp;
                    }
                }
            }
        for(int i = 0 ; i<number.length ; i++){
            System.out.print((char)number[i]);
            }
        }
        else{
            System.out.print("\nString sorted in decending order: ");
            for(int i = 0 ; i<number.length ; i++){
                for(int j = 0 ; j<number.length ; j++){
                    if(number[j]<number[i]){
                        int temp = number[j];
                        number[j] = number[i];
                        number[i] = temp;
                    }
                }
            }
            for(int i = 0 ;i<number.length ; i++){
                System.out.print((char)number[i]);
            }
        }
    }
}
*/