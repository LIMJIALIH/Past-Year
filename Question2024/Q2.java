
package Question2024;
/*
class Book{
    private String title;
    private String author;
    private int yearPublished;
    
    public Book(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public int getYearPublished(){
        return yearPublished;
    }
    
}

public class Q2 {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "Henry", 1997);
        System.out.print("\nTitle:" + book1.getTitle() + "\nAuthor:" + book1.getAuthor() + "\nYear Published: " + book1.getYearPublished());
    }
}
*/

/*
import java.util.Scanner;
class InvalidAgeException extends Exception{
    
    public InvalidAgeException(String message){
        super(message);
    }
    
    public static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be older than 18. Age provided: " + age);
        }
    }
    
}

public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nPlease enter your age:");
        int age = sc.nextInt();
        
        try{
            InvalidAgeException.checkAge(age);
            System.out.print("\nValid Age");
        }catch(InvalidAgeException e){
            System.out.print("\nException caught: " + e.getMessage());
        }
    }
}
*/

/*
interface Playable{
    public void play();
}

class Guitar implements Playable{

    @Override
    public void play() {
        System.out.print("\nPlaying guitar.");
    }
    
}

class Piano implements Playable{
    
    @Override
    public void play(){
        System.out.print("\nPlaying piano.");
    }
}

public class Q2{
    public static void main(String[] args) {
        Playable [] play = new Playable [2];
        play[0] = new Guitar();
        play[1] = new Piano();
        
        for(Playable plays : play){
            plays.play();
        }
    }
}
*/
/*
class InvalidAgeException extends Exception{
    
    public InvalidAgeException(String message){
        super(message);
    }
    
    public static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age less than 18.");
        }
        else{
            System.out.print("\nValid Age.");
        }
    }
}

public class Q2{
    public static void main(String[] args) {
        int age = 18;
        try{
            
            InvalidAgeException.checkAge(age);
            
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
*/