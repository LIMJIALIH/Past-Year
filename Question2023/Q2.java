package Question2023;
/*
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
        System.out.print("\nEnter the number of students: ");
        int student = sc.nextInt();
        while(true){
            if(student<=10 && student>=0){
                break;
            }
            else{
                System.out.print("Error!!!");
                System.out.print("Enter the number of students: ");
                student = sc.nextInt();
            }
        }
        
        int [] students = new int [student];
        int [][] info = new int [student][];
        for(int i = 0 ; i<students.length ; i++){
            System.out.print("Enter the number of subjects for student " + (i+1) + ":");
            int subject = sc.nextInt();
            
            while(true){
                if(subject>=0 && subject<=10){
                    break;
                }
                else{
                    System.out.print("\nError!!!");
                    System.out.print("Enter the number of subjects for student " + (i+1) + ":");
                    subject = sc.nextInt();
                }
            }
            
            info[i] = new int [subject];
            
            for(int j = 0 ; j<info[i].length ; j++){
                System.out.print("Student (" + (i+1) + ") Enter mark for Subject " + (j+1) + ":");
                int mark = sc.nextInt();
                
                while(true){
                    if(mark>=0 && mark<=100){
                        break;
                    }
                    else{
                        System.out.print("Error");
                        System.out.print("Student (" + (i+1) + ") Enter mark for Subject " + (j+1) + ":");
                        mark = sc.nextInt();
                    }
                }
                
                info[i][j] = mark;
            }
            
        }
        int total = 0;
        int average = 0;
        int highestStudent = 0;
        int highest = Integer.MIN_VALUE;
        System.out.print("List of Students (" + info.length + " students)");
        for(int i = 0 ; i<info.length ; i++){
            System.out.print("\nStudent " + (i+1));
            for(int j = 0 ; j<info[i].length ; j++){
                System.out.print("\nSubject " + (j+1) + ":" + info[i][j]);
                total += info[i][j];
                
            }
            average = total/info[i].length;
            System.out.print("\nAverage Marks: " + average);
            if(average>highest){
                highest = average;
                highestStudent = (i+1);
            }
            total = 0;
        }
        System.out.print("\nStudent " + highestStudent + " has the highest average, with " + highest + " marks");
    }
}
*/