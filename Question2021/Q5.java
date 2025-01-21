
package Question2021;
/*
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        // Input 3 numbers between 1 and 9
        int[] numbers = new int[3];
        System.out.println("Enter 3 numbers [1-9]:");
        for (int i = 0; i < 3; i++) {
            do {
                numbers[i] = scanner.nextInt();
                if (numbers[i] < 1 || numbers[i] > 9) {
                    System.out.println("Invalid input. Enter a number between 1 and 9.");
                }
            } while (numbers[i] < 1 || numbers[i] > 9);
        }

        // Define operators
        char[] operators = {'+', '-', '*', '/'};

        System.out.println("\nResults:");
        boolean found = false;

        // Try all operator combinations and all parenthesized groupings
        for (char op1 : operators) {
            for (char op2 : operators) {
                // Test different groupings
                if (checkExpression(numbers[0], numbers[1], numbers[2], op1, op2, true)) found = true; // (a op1 b) op2 c
                if (checkExpression(numbers[0], numbers[1], numbers[2], op1, op2, false)) found = true; // a op1 (b op2 c)
            }
        }

        if (!found) {
            System.out.println("No Solution");
        }
    }

    // Evaluate and print expressions
    private static boolean checkExpression(int a, int b, int c, char op1, char op2, boolean groupFirst) {
        double result;
        String expression;

        if (groupFirst) {
            // (a op1 b) op2 c
            double intermediate = applyOperator(a, b, op1);
            result = applyOperator(intermediate, c, op2);
            expression = "(" + a + " " + op1 + " " + b + ") " + op2 + " " + c;
        } else {
            // a op1 (b op2 c)
            double intermediate = applyOperator(b, c, op2);
            result = applyOperator(a, intermediate, op1);
            expression = a + " " + op1 + " (" + b + " " + op2 + " " + c + ")";
        }

        // Check if the result equals 18
        if (Math.abs(result - 18) < 0.00001) { // Allow for floating-point precision
            System.out.println(expression + " = 18");
            return true;
        }
        return false;
    }

    // Apply a single operator
    private static double applyOperator(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return b != 0 ? a / b : Double.MAX_VALUE; // Avoid division by zero
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
*/