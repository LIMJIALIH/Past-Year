
package Question2017;
/*
import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter number of teams: ");
        int team = sc.nextInt();
        
        String [] name = new String[team];
        int [] score = new int [team];
        sc.nextLine();
        for(int i = 0 ; i<name.length ; i++){
            System.out.printf("Enter team %d name: ",(i+1));
            name[i] = sc.nextLine();
            
            
            System.out.printf("Enter team %d score: ",(i+1));
            score[i] = sc.nextInt();
            sc.nextLine();
        }
        
        System.out.print("List of team with the highest team score first\n");
        
        for(int i = 0 ; i<name.length ; i++){
            for(int j = 0 ; j<name.length-1 ; j++){
                if(score[j]<score[j+1]){
                    int tempScore = score[j];
                    score[j] = score[j+1];
                    score[j+1] = tempScore;
                    
                    String tempName = name[j];
                    name[j] = name[j+1];
                    name[j+1] = tempName;
                }
            }
        }
        
        for(int i = 0 ; i<name.length ; i++){
            System.out.printf("%s (%d) | ",name[i],score[i]);
        }
    }
}
*/