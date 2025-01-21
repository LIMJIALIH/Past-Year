
package Question2024;
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class CheckPairing {
    public static void main(String[] args) {
        String [][] content = new String [4][4];
            
        try{
            BufferedReader reader = new BufferedReader(new FileReader("participants.txt"));
            
            String line;
            int i = 0;
            
            while((line = reader.readLine()) != null){
                String [] parts = line.split(",");
                for(int j = 0 ; j<content[i].length ; j++){
                    content[i][j] = parts[j];
                }
                i++;
            }
            
            for(int j = 0 ; j<4 ; j++){
                 System.out.printf("\n%-15s%-5s%-5s%-40s",content[j][0],content[j][1],content[j][2],content[j][3]);
            }
            
            for(int j = 0 ; j<4 ; j++){
                content[j][3] = content[j][3].toUpperCase().replace(" ", "");
            }
            
            for(int j = 0 ; j<4 ; j++){
                for(int z = (j+1) ; z<4 ; z++){
                    if(verify(content[j][3],content[z][3])){
                        System.out.print("\nParticipant " + (j+1) + " and " + (z+1) + " are in pairs.");
                    }else{
                        System.out.print("\nParticipants are not in pairs, cannot proceed.");
                    }
                }
            }
            
        }catch(FileNotFoundException e){
            System.out.print("\nFile not found");
        }catch(IOException e){
            System.out.print("\nError in reading the file");
        }
        
        try{
            String [][] arranged = new String [4][2];
            BufferedWriter writer = new BufferedWriter(new FileWriter("grouping.txt"));
            int z = 0;
            for(int i = 0 ; i<4 ; i++){
                for(int j = (i+1) ; j<4 ; j++){
                    if(verify(content[i][3],content[j][3])){
                        arranged [z][0] = content[i][0];
                        arranged [z][1] = content[i][2];
                        arranged [z+2][0] = content[j][0];
                        arranged [z+2][1] = content[j][2];
                        z++;
                    }
                }
                
            }
            char [] word = {'A','B','C','D'};
            
            for(int i = 0 ; i<arranged.length;i++){
                writer.write("Seat " + word[i] + " : " + arranged[i][0] + ", " + arranged[i][1] + " years old\n");
            }
            writer.close();
        }catch(IOException e){
            System.out.print("\nError in writing the file");
        }
    }
    
    public static boolean verify(String address1, String address2){
        if(address1.equalsIgnoreCase(address2)){
            return true;
        }else{
            return false;
        }
    }
}
*/