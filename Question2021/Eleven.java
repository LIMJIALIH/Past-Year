
package Question2021;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Eleven {
    protected int [] integer;
    private String fileName;
    
    public Eleven(String fileName){
        this.fileName = fileName;
        int number = 0;
        try{
        ObjectInputStream reader = new ObjectInputStream(new FileInputStream(fileName));
        while(true){
        try{
            reader.readInt();
            number++;
            }catch(EOFException e){
                break;
            }
        }
        
        reader = new ObjectInputStream(new FileInputStream(fileName));
        integer = new int [number];
        int i = 0;
        while(true){
            try{
                integer[i] = reader.readInt();
                i++;
            }catch(EOFException e){
                break;
            }
        }
        }catch(FileNotFoundException e){
            System.out.print("\nFile not found.");
        }catch(IOException e){
            System.out.print("\nError in reading the file");
        }
    }
    
    abstract public String divide();
}
