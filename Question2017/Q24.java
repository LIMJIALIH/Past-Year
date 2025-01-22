
package Question2017;
/*
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class DayOfTheWeek{
    private int h;
    private int q;
    private int m;
    private int y;
    private int J;
    private int K;
    
    public DayOfTheWeek(int q, int m, int y){
        this.q = q;
        this.m = m;
        this.y = y;
        
        if(m == 1){
            this.m = 13;
            this.y--;
        }else if(m == 2){
            this.m = 14;
            this.y--;
        }
       // System.out.println(this.q+"/"+ this.m +"/"+this.y);
        
        J = this.y / 100;
        K = this.y % 100;
        
         h = (this.q+ (13*(this.m+1)/5) + K + (K/4) + (J/4) + (5*J) )%7;
    }
    
    public boolean validDay(){
        switch (m){
            case 13, 3, 5, 7, 8, 10, 12 -> {
                if(q > 31)
                    return false;
            }
            case 4, 6, 9, 11 -> {
                if(q > 30)
                    return false;
            }
            case 14 -> {
                if(leapYear()){
                    if(q > 29)
                        return false;
                } else {
                    if(q > 28)
                        return false;
                }
            }

        }
        return true;
    }
    
    public boolean leapYear(){
        return (((m >= 13 ? y+1:y) % 4 == 0) && ((m >= 13 ? y+1:y) % 100 != 0)) || (m >= 13 ? y+1:y) % 400 == 0;
    }
    
    public void displayDay(){
        
       
        String day = switch (h){
            case 0 -> "Saturday";
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> "invalid Input";
        };
        
        if(validDay())
            System.out.println(q+"/"+ (m >= 13 ? m - 12:m) +"/"+ (m >= 13 ? y+1:y) + " is on " + day);
        else
            System.out.println(q+"/"+ (m >= 13 ? m - 12:m) +"/"+ (m >= 13 ? y+1:y) + " is invalid Input");
    
    }
}

public class Q24 {
    public static void main(String[] args) {
        try{
            ObjectInputStream reader = new ObjectInputStream(new FileInputStream("Q4.dat"));
            
            while(true){
                try{
                    int q = reader.readInt();
                    int m = reader.readInt();
                    int y = reader.readInt();
               //   System.out.printf("\n" + q + " / " + m + " / " + y);
               
                    DayOfTheWeek day = new DayOfTheWeek(q,m,y);
                    
                    day.displayDay();
                    
                }catch(EOFException e){
                    break;
                }
            }
            
            reader.close();
        }catch (FileNotFoundException e){
            System.out.print("\nFile not found");
        }catch (IOException e){
            System.out.print("\nError reading file");
        }
    }
}
*/