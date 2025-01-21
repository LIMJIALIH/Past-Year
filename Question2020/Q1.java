
package Question2020;
/*
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        System.out.println("This program changes all the odd numbers in the array into even numbers.");
        Scanner s = new Scanner(System.in);
        int size = 5;
        int [] num = new int[size];
        System.out.print("Enter five integer numbers: ");
        for(int i = 0 ; i<size; i++){
            num[i] = s.nextInt();
        }
        convert(num);
        System.out.print("\nThe numbers are: ");
        for(int i = 0 ; i<size;i++){
            System.out.print( num[i] + " ");
        }
        System.out.println();
        
    }
    public static void convert(int [] a){
        for(int i= 0 ; i<a.length ;i++){
            if(a[i]%2 == 1){
                a[i]+=1;
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Q1 {
    static char direction;
    static int degree, minute, second;

    public static void main(String[] args) {
        double[] latitude = new double[2];
        double[] longitude = new double[2];

        System.out.println("Enter Location 1:");
        latitude[0] = requestCoordinate("Latitude");
        longitude[0] = requestCoordinate("Longitude");

        System.out.println("\nEnter Location 2:");
        latitude[1] = requestCoordinate("Latitude");
        longitude[1] = requestCoordinate("Longitude");

        calculateDistance(latitude, longitude);
    }

    public static double requestCoordinate(String type) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter direction for " + type + " [N, S, E, W]: ");
        direction = sc.next().toUpperCase().charAt(0);

        System.out.print("Enter Degree, Minute, and Second (space-separated): ");
        degree = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();

        return convertDegree();
    }

    public static double convertDegree() {
        double decimalDegree = degree + (minute / 60.0) + (second / 3600.0);

        // Adjust for direction
        if (direction == 'S' || direction == 'W') {
            decimalDegree = -decimalDegree;
        }
        return Math.toRadians(decimalDegree); // Convert to radians
    }

    public static void calculateDistance(double[] latitude, double[] longitude) {
        final double R = 6371; // Earth's radius in kilometers

        // Haversine formula
        double dLat = latitude[1] - latitude[0];
        double dLon = longitude[1] - longitude[0];
        double a = Math.pow(Math.sin(dLat / 2), 2)
                + Math.cos(latitude[0]) * Math.cos(latitude[1]) * Math.pow(Math.sin(dLon / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a),Math.sqrt(1-a));
        double distance = R * c;

        System.out.printf("\nDistance: %.2f KM%n", distance);
    }
}
*/
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q1{
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("raw.txt"));
            String line;
            int num2 = 0;
            int num4 = 0;
            int num6 = 0;
            int num8 = 0;
            int num10 = 0;
            int largest = 0;
            int mode = 0;
            
            while((line = reader.readLine())!= null){
                    int data = Integer.parseInt(line);
                    if(data == 2){
                        num2++;
                    }else if(data == 4){
                        num4++;
                    }else if(data == 6){
                        num6++;
                    }else if(data == 8){
                        num8++;
                    }else if(data == 10){
                        num10++;
                    }
                    if(num2 > largest){
                        largest = num2;
                        mode = data;
                    }else if(num4 > largest){
                        largest = num4;
                        mode = data;
                    }else if(num6 > largest){
                        largest = num6;
                        mode = data;
                    }else if(num8 > largest){
                        largest = num8;
                        mode = data;
                    }else if(num10 > largest){
                        largest = num10;
                        mode = data;
                    }
            }
            reader.close();
            System.out.print("\nFrequency Distribution Table");
            System.out.print("\n2 : " + num2);
            System.out.print("\n4 : " + num4);
            System.out.print("\n6 : " + num6);
            System.out.print("\n8 : " + num8);
            System.out.print("\n10 : " + num10);
            System.out.print("\nThe mode of the dataset is : " + mode);
            
        }catch(FileNotFoundException e){
            System.out.print("\nThe file doesnt exist");
        }catch(IOException e){
            
        }
    }
}
*/
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Q1{
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("D:\\InputAndOutput\\sampleLog.txt"));
            int numOfRecord = 0;
            String record;
            
            System.out.print("\nReading from log file...");
            while((record = reader.readLine())!= null){
                numOfRecord++;
            }
            
            String [][] recordFound = new String [numOfRecord][22];
            reader = new BufferedReader(new FileReader("D:\\InputAndOutput\\sampleLog.txt"));
            for(int i = 0 ; i<numOfRecord ; i++){
                record = reader.readLine();
                String [] attributes = record.split(" ");
                for(int j = 0 ; j<attributes.length ; j++){
                    recordFound[i][j] = attributes[j];
                }
            }
            
            System.out.print("\n*******************************");
            System.out.print("\nRecords read from log file");
            for(int i = 0 ; i<numOfRecord ; i++){
                System.out.print("\nRecord " + (i+1) + " :");
                if(recordFound[i][1].charAt(9) == 'Q'){
                    for(int j = 0 ; j<2 ; j++){
                        System.out.print("\n" + recordFound[i][j]);
                    }
                }else if(recordFound[i][1].charAt(9) == 'S'){
                    for(int j = 0 ; j<15 ; j++){
                        System.out.print("\n" + recordFound[i][j]);
                    }
                }else if(recordFound[i][1].charAt(9) == 'E'){
                    for(int j = 0 ; j<22 ;j++){
                        System.out.print("\n" + recordFound[i][j]);
                    }
                }
            }
            System.out.print("\nTotal records read: " + numOfRecord);
            
            
            String [] users = new String [numOfRecord];
            int [] jobSubmitted = new int [numOfRecord];
            int numOfuser = 0;
            
            for(int i = 0 ; i<recordFound.length ; i++){
                if(recordFound[i][1].charAt(9) == 'S'){
                    String user = recordFound[i][1].substring(recordFound[i][1].indexOf("user=")+5);
                    int userIndex = findUser(users, user, numOfuser);
                    if(userIndex == -1){
                        users[numOfuser] = user;
                        jobSubmitted[numOfuser]++;
                        numOfuser++;
                    }else{
                        jobSubmitted[userIndex]++;
                    }
                }
            }
            System.out.print("\n*******************************");
            System.out.println("Print user submission stat");
            System.out.println();
            System.out.printf("%-20s%s\n","User","Jobs Submitted");
            System.out.printf("%-20s%s\n","----","--------------");
            
            for (int i = 0; i < numOfuser; i++) {
                System.out.printf("%-20s%s\n",users[i],jobSubmitted[i]);
            }
            System.out.println();
            
            
            System.out.print("\n*******************************");
            System.out.print("\nPrint jobs status");
            
            System.out.printf("\n%-15s%-25s%-30s%s\n","Job ID","Submitted (queue)","Started (start time)","Exited (end time/error)");
            System.out.printf("\n%-15s%-25s%-30s%s\n","------","-----------------","--------------------","-----------------------");

            for(int i =0 ; i<recordFound.length;i++){
                if(recordFound[i][1].charAt(9) == 'S'){
                    String jobID = recordFound[i][1].substring(11,16);
                    String queue = recordFound[i][4].substring(6);
                    String startTime = recordFound[i][8].substring(6);
                    String exited = getString(recordFound, i,jobID);
                    System.out.printf("%-15s%-25s%-30s%s\n",jobID,"Y (" + queue + ")","Y (" + startTime + ")",exited);
                
                }
                
            }
            System.out.print("\n*******************************");
        }catch(FileNotFoundException e){
            System.out.print("\nFile cannot be found");
        }catch(IOException e){
            System.out.print("\nError in reading the file");
        }
    }
    public static String getString(String [][] recordFound, int i,String jobID){
        String excited = "null";
        for(int j = 0 ; j<recordFound.length ; j++){
            if(recordFound[j][1].charAt(9) == 'E' && recordFound[j][1].substring(11,16).equals(jobID)){
                if(Arrays.toString(recordFound[j]).contains("Exit_status")){
                    excited = "Error: Exit Status " + recordFound[j][17].substring(12);
                }else{
                    excited = recordFound[j][16].substring(4);
                }
            }
        }
        return excited;
    }
    
    public static int  findUser(String [] users, String user, int numOfuser){
        for(int i = 0; i<numOfuser;i++){
            if(users[i].equals(user)){
                return i;
            }
        }
        return -1;
    }
}
*/
/*
class Cloud{
    protected String cloudPackage;
    private double totalCost;
    
    public Cloud(String cloudPackage){
        this.cloudPackage = cloudPackage;
    }
    
    public void setTotalCost(double totalCost){
        this.totalCost = totalCost;
    }
    
    public double getTotalCost(){
        return totalCost;
    }
    
    @Override
    public String toString(){
        return "Cloud Package:" + this.cloudPackage + "\nTotal Cost: " + this.totalCost;
    }
}

class Job{
    private String name;
    private int numOfTasks;
    private int memory;
    
    public String getName(){
        return name;
    }
   
    public int getNumOfTasks(){
        return numOfTasks;
    }
    
    public int getMemory(){
        return memory;
    }
    
    public Job(String name, int numOfTasks, int memory){
        this.name = name;
        this.numOfTasks = numOfTasks;
        this.memory = memory;
    }
    
    @Override 
    public String toString(){
        return "\nName: " + this.name + "\nNumber of tasks: " + this.numOfTasks + "\nMemory: " + this.memory;
    }
}

class CloudPackage extends Cloud{
    private int numOfCore;
    private int memory;
    private double pricePerHour;
    
    public CloudPackage(String cloudPackage, int numOfCore, int memory, double pricePerHour) {
        super(cloudPackage);
        this.numOfCore = numOfCore;
        this.memory = memory;
        this.pricePerHour = pricePerHour;
    }
    
    public boolean check(Job job){
        if(this.memory>=job.getMemory()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public double totalCost(Job job){
        return (double) job.getNumOfTasks()/this.numOfCore *pricePerHour;
    }
    
}

public class Q1{
    public static void main(String[] args) {
    
        Job job1 = new Job("J1",252,20);
        Job job2 = new Job("J2",108,10);
        Job job3 = new Job("J3",72,25);
        Job [] jobs = {job1, job2, job3};
        
        CloudPackage [] cloudPackages = new CloudPackage[4];
        cloudPackages[0] = new CloudPackage("P2-15",4,15,1.24);
        cloudPackages[1] = new CloudPackage("P2-30",6,30,2.11);
        cloudPackages[2] = new CloudPackage("R5-20",4,20,1.38);
        cloudPackages[3] = new CloudPackage("R6-20",6,20,1.88);
        
        CloudPackage [] bestPackage = new CloudPackage[3];
        
        for (int i = 0; i < jobs.length; i++) {
            for (CloudPackage cloudPackage : cloudPackages) {
                if (cloudPackage.check(jobs[i])) {
                    if (bestPackage[i] == null || cloudPackage.totalCost(jobs[i]) < bestPackage[i].totalCost(jobs[i])) {
                        bestPackage[i] = cloudPackage;
                        bestPackage[i].setTotalCost(cloudPackage.totalCost(jobs[i]));
                    }
                }
            }
        }
        
        for(int i = 0 ; i<jobs.length;i++){
            System.out.print(jobs[i].toString());
            System.out.print(bestPackage[i].toString());
        }
    }
}*/
