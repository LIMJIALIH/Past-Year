
package Question2018;
/*
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Q23 {
    public static void main(String[] args) {
        
        String [] name = new String [10];
        int [] marks = new int [10];
        int absent = 0;
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader("student.txt"));
            
            String line;
            int count = 0;
            while((line = reader.readLine()) != null){
                String [] info = line.split(":");
                name[count] = info[0].trim();
                marks[count] = Integer.parseInt(info[1].trim());
                count++;
            }
            
            reader.close();
            
            int highest = marks[0];
            String Hname = name[0];
            int lowest = marks[0];
            String Lname = name[0];
            
            for(int i = 0 ; i<name.length ; i++){
                if(marks[i]>highest){
                    highest = marks[i];
                    Hname = name[i];
                }
                if(marks[i]<lowest && marks[i]>0){
                    lowest = marks[i];
                    Lname = name[i];
                }
                if(marks[i] == -1){
                    absent++;
                }
            }
            System.out.print("\nThe student with the highest mark: " + Hname + " " + highest);
            System.out.print("\nThe student with the lowest mark: " + Lname + " " + lowest);
            System.out.print("\nThe number of students who were absent from the exam: " + absent);
            
//            for(int i = 0 ; i<name.length ; i++){
//                System.out.print("\n" + name[i]);
//                System.out.print("\n" + marks[i]);
//            }
        }catch(FileNotFoundException e){
            System.out.print("\nFile Not Found");
        }catch(IOException e){
            System.out.print("\nError in reading the file");
        }
    }
}
*/