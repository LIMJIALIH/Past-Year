
package Question2024;
/*

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Q5 {
    public static void main(String[] args) {
        String [][] info = new String [4][4];
        try{
            BufferedReader reader = new BufferedReader(new FileReader("D:\\InputAndOutput\\participants.txt"));
            String line;
            int i = 0;
            while((line = reader.readLine()) != null){
                String realAddress = "";
                String [] parts = line.split(",");
                String name = parts[0].trim();
                String gender = parts[1].trim();
                String age = parts[2].trim();
                String address = parts[3].trim().toUpperCase();
                String [] addressPart = address.split(" ");
                for(int j = 0 ; j<addressPart.length ; j++){
                    realAddress += addressPart[j];
                }
                info[i][0] = name;
                info[i][1] = gender;
                info[i][2] = age;
                info[i][3] = realAddress;
                i++;
            }
        }catch(FileNotFoundException e){
            System.out.print("\nFile not found.");
        }catch(IOException e){
            System.out.print("\nError when reading the file.");
        }
        
        for(int j = 0 ; j<4 ; j++){
            for(int z = 0 ; z<4 ; z++){
                System.out.printf("%-15s",info[j][z]);
            }
            System.out.print("\n");
        }
        
        //Check for the participant pairs
        boolean pairs = false;
        int grp = 0;
        String [][] seat = new String [4][4];
        for(int i = 0 ; i<4 ; i++){
            for(int j = i+1 ; j<4 ; j++){
                if(info[i][3].equals(info[j][3])){
                    System.out.print("\nParticipants " + i + " and " + j + " are in pairs.");
                    pairs = true;
                }else{
                    System.out.print("\nParticipants " + i + " and " + j + " are not in pairs.");
                    pairs = false;
                }
                if(pairs == true){
                    if(grp == 0){
                        seat[grp][0] = info[i][0];
                        seat[grp][1] = info[i][1];
                        seat[grp][2] = info[i][2];
                        seat[grp][3] = info[i][3];
                        seat[grp+2][0] = info[j][0];
                        seat[grp+2][1] = info[j][1];
                        seat[grp+2][2] = info[j][2];
                        seat[grp+2][3] = info[j][3];
                    }
                    else{
                        seat[grp][0] = info[i][0];
                        seat[grp][1] = info[i][1];
                        seat[grp][2] = info[i][2];
                        seat[grp][3] = info[i][3];
                        seat[grp+2][0] = info[j][0];
                        seat[grp+2][1] = info[j][1];
                        seat[grp+2][2] = info[j][2];
                        seat[grp+2][3] = info[j][3];
                    }
                    grp++;
                }
            }
        }
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("grouping.txt"));
            writer.write("Seat A : " + seat[0][0] + ", " + seat[0][2] + " years old\n");
            writer.write("Seat B : " + seat[1][0] + ", " + seat[1][2] + " years old\n");
            writer.write("Seat C : " + seat[2][0] + ", " + seat[2][2] + " years old\n");
            writer.write("Seat D : " + seat[3][0] + ", " + seat[3][2] + " years old\n");
            writer.close();
        }catch(IOException e){
            System.out.print("\nError in writing the file.");
        }
    }
}
*/