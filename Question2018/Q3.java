
package Question2018;
/*
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter font size: ");
        int fontsize = sc.nextInt();
        System.out.print("\nEnter font type: ");
        char fontType = sc.next().charAt(0);
        System.out.print("\nEnter format[1 - Vertical, 2 - Horizontal]: ");
        int format = sc.nextInt();
        display(fontsize, fontType, format);
    }
    
    public static void display(int fontsize, char fontType, int format){
        if(format == 1){
            char [][] size = new char [(fontsize*2)+3][fontsize+2];
            for(int i = 0 ; i<size.length ; i++){
                for(int j = 0 ; j<size[i].length ; j++){
                    if(i == 0 || i == (fontsize+1) || i == ((fontsize*2)+2)){
                        size[i][j] = fontType;
                    }
                    else if(j == 0 || j == size[i].length-1){
                        size[i][j] = fontType;
                    }else{
                        size[i][j] = ' ';
                    }
                }
            }
            
            for(int i = 0 ; i<size.length ; i++){
                for(int j = 0 ; j<size[i].length ; j++){
                    System.out.print(size[i][j]);
                }
                System.out.print("\n");
            }
        }
        
        if(format == 2){
            char [][] size = new char [fontsize+2][(fontsize*2)+3];
            for( int i = 0 ; i<size.length ; i++){
                for(int j = 0 ; j<size[i].length ; j++){
                    if(i == 0 || i == fontsize+1){
                        size[i][j] = fontType;
                    }
                    else if(j == 0 || j == fontsize+1 || j == ((fontsize*2)+2)){
                        size[i][j] = fontType;
                    }
                    else{
                        size[i][j] = ' ';
                    }
                }
            }
            
            for(int i = 0 ; i<size.length ; i++){
                for(int j = 0 ; j<size[i].length ; j++){
                    System.out.print(size[i][j]);
                }
                System.out.print("\n");
            }
        }
    }
}
*/