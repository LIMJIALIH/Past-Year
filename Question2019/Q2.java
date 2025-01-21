
package Question2019;
/*
import java.util.Random;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter N :");
        int n = sc.nextInt();
        int [][] matrix = generateMatrix(n);
        int [][] matrixB = generateMatrix(n);
        System.out.print("\nMatrix A\n");
        displayMatrix(matrix);
        System.out.print("\nMatrix B\n");
        displayMatrix(matrixB);
        int [][] sumMatrix = addMatrix(matrix, matrixB, n);
        System.out.print("\nMatrix A + B\n");
        displayMatrix(sumMatrix);
        int [][] multipleMatrix = multiplyMatrix(matrix, matrixB, n);
        System.out.print("\nMatrix A x B\n");
        displayMatrix(multipleMatrix);
        
    }
    
    public static int[][] generateMatrix(int n){
        Random rand = new Random();
        int [][] matrix = new int [n][n];
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }
    
    public static void displayMatrix(int matrix[][]){
        for(int i = 0 ;i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    
    public static int[][] addMatrix(int [][] matrixA, int [][] matrixB, int n){
        int [][] sumMatrix = new int [n][n];
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return sumMatrix;
    }
    
    public static int[][] multiplyMatrix(int[][] matrixA, int[][] matrixB, int n) {
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {          
            for (int j = 0; j < n; j++) {      
                result[i][j] = 0;              
                for (int k = 0; k < n; k++) {  
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }
}
*/