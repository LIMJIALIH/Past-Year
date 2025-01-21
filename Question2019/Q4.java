
package Question2019;
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q4 {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("D:\\InputAndOutput\\myAmbition.txt"));
            String line;
            String content = "";
            
            while((line = reader.readLine()) != null){
                content = line;
                
            }
            
            String [] sentences = content.split("\\.");
            int totalWords = 0;
            
            int [] alphabet = new int [26];
            char [] alphabets = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
            
            for(int i = 0 ; i<sentences.length ; i++){
                String [] words = sentences[i].split(" ");
                for(int j = 0 ; j<words.length ; j++){
                    if(!words[j].isEmpty()){
                        totalWords++;
                        for(int z = 0 ; z<words[j].length();z++){
                            for(int k = 0 ; k<alphabets.length ; k++){
                                if(words[j].toUpperCase().charAt(z) == alphabets[k]){
                                    alphabet[k]++;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            
            System.out.print("\nNumber of sentences :" + sentences.length);
            System.out.print("\nNumber of words :" + totalWords + "\n");
            for(int i = 0 ; i<alphabets.length ; i++){
                System.out.print(alphabets[i] + " : " + alphabet[i] + " ");
                if((i+1)%7==0){
                    System.out.print("\n");
                }
            }
            
        }catch (FileNotFoundException e){
            System.out.print("\nFile not found");
        }catch (IOException e){
            System.out.print("\nError in reading the file");
        }
    }
}
*/