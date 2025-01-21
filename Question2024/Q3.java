
package Question2024;
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class OAIRecord{
    private String doi;
    private String title;
    private String subject;
    protected String author1;
    protected String author2;
    protected String author3;
    protected String author4;
    protected String author5;
    protected String author6;
    protected String author7;
    protected String author8;
    private String keyword;
    private String status;
    private OAIRecord [] record;
    
    public OAIRecord(int size){
        OAIRecord [] record = new OAIRecord[size];
    }
    
    public OAIRecord(String doi, String title,String subject,String author1,String author2,String author3,String author4, String author5,String author6,String author7,String author8,String keyword,String status){
        this.doi = doi;
        this.title = title;
        this.subject = subject;
        this.author1 = author1;
        this.author2 = author2;
        this.author3 = author3;
        this.author4 = author4;
        this.author5 = author5;
        this.author6 = author6;
        this.author7 = author7;
        this.author8 = author8;
        this.keyword = keyword;
        this.status = status;
    }
    
    public String getStatus(){
        return status;
    }
    
    
    
    @Override
    public String toString(){
        return "DOI: " + this.doi + "\t" + this.title + "{" + author1 + author2 + author3 + author4 + author5 + author6 + author7 + author8 + "} " + keyword + " " + status;
    }

    
    
}


public class Q3 {
    public static void main(String[] args) {
        String inputFile = "oaiset.csv";
        OAIRecord [] data = new OAIRecord[50];
        System.out.print("\nLoading Dataset...");
        loadRecord(inputFile, data);
        System.out.print("\nThe curated record is as follow:");
        printRecord(cleanRecord(data));
        System.out.println("\nThe summary report is as follow.");
        reportData(cleanRecord(data));
    }
    
    public static void loadRecord(String inputFile, OAIRecord [] data){
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            int i = 0;
            while((line = reader.readLine()) != null && i<50){
                String [] parts = line.split(",");
                String doi = parts[0];
                String title = parts[1];
                String subject = parts[2];
                String author1 = parts[3];
                String author2 = parts[4];
                String author3 = parts[5];
                String author4 = parts[6];
                String author5 = parts[7];
                String author6 = parts[8];
                String author7 = parts[9];
                String author8 = parts[10];
                String keyword = parts[11];
                String status = parts[12];
                data[i] = new OAIRecord(doi,title,subject,author1,author2,author3,author4,author5,author6,author7,author8,keyword,status);
                i++;
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.print("\nFile cannot be found:" + e.getMessage());
        }catch(IOException e){
            System.out.print("\nError when reading the file: " + e.getMessage());
        }
    }
    
    public static OAIRecord[] cleanRecord(OAIRecord[] data) {
    int count = 0;

    // Count valid records
    for (OAIRecord record : data) {
        if (record != null && !record.getStatus().equalsIgnoreCase("deleted")) {
            count++;
        }
    }

    // Create a new array for valid records
    OAIRecord[] cleanedData = new OAIRecord[count];
    int index = 0;

    // Copy valid records into the new array
    for (OAIRecord record : data) {
        if (record != null && !record.getStatus().equalsIgnoreCase("deleted")) {
            cleanedData[index++] = record;
        }
    }

    return cleanedData;
}
    
    public static void printRecord(OAIRecord [] data){
        for(OAIRecord datas : data){
            System.out.println(datas);
        }
    }
    
    public static void reportData(OAIRecord[] data) {
    int[] authorCounts = new int[12]; // 12 authors
    String[] authorNames = {
        "Abd Rahim Nasruddin", "Abdullah Noorhidawati", "Ahmad Danial Azzahari", 
        "Aikhbari Azam", "Azanee Nur Mohd Arif Fadzillah", "Shatti Mahmood Asghar", 
        "Chai Lay Ching", "Chan Chee Seng", "Hasanurzaman Md.", 
        "Hussain Hazreena", "Ibrahim Shaliza", "Lee Yean Kee"
    };

    // Count publications for each author
    for (OAIRecord record : data) {
        if (record != null) {
            String[] authors = {
                record.author1, record.author2, record.author3, record.author4, 
                record.author5, record.author6, record.author7, record.author8
            };

            for (String author : authors) {
                if (author != null && !author.trim().isEmpty()) {
                    for (int i = 0; i < authorNames.length; i++) {
                        if (author.equalsIgnoreCase(authorNames[i])) {
                            authorCounts[i]++;
                        }
                    }
                }
            }
        }
    }

    // Print the summary report
    for (int i = 0; i < authorNames.length; i++) {
        if (authorCounts[i] > 0) {
            System.out.println(authorNames[i] + ": " + authorCounts[i] + " publications");
        }
    }
}
}
*/
/*
import java.util.Scanner;

class ArithMeticException extends Exception{
    
    public ArithMeticException(String message){
        super(message);
    }
    
    public static void calculationError(int num) throws ArithMeticException{
        if(num == 0){
        throw new ArithMeticException ("You cannot divide a number by 0");
        }
    }
}


public class Q3{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nPlease enter a number for division:");
                int number = sc.nextInt();
            try{
                ArithMeticException.calculationError(number);
                System.out.print("\nValid number");
                
            }catch(ArithMeticException e){
                System.out.print("\nYou divide a number with 0 " + e.getMessage());
            }
        }
    }
*/
/*
public class Q3{
    public static void main(String[] args) {
        try{
            int result = 10/2;
            try{
                String [] name = new String [3];
                System.out.print("\nName:" + name[4]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.print("\nCaught ArrayIndexOutOfBoundsException : " + e.getMessage());
            }
        }catch(ArithmeticException e){
            System.out.print("\nCaught ArithmeticException: " + e.getMessage());
        }
        finally{
            System.out.print("\nThis is in finally block");
        }
    }
}
*/