package Question2019;
/*
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter genome string [quit to stop] : ");
            String genome = sc.next();

            // Exit condition
            if (genome.equalsIgnoreCase("quit")) {
                break;
            }

            // Check if the length of the genome string is a multiple of 3
            if (!check(genome)) {
                System.out.println("\nNo gene is found");
                continue;
            }

            // Split genome into parts starting with "ATG"
            String[] parts = genome.split("ATG");

            for (int i = 1; i < parts.length; i++) { // Start from index 1 to skip the part before the first "ATG"
                // Split further at "TAG", "TAA", or "TGA"
                String[] triplets = parts[i].split("(TAG|TAA|TGA)");

                // Check if there is valid content
                if (triplets.length > 0 && !triplets[0].isEmpty() && (parts[i].contains("TAG") || parts[i].contains("TAA") || parts[i].contains("TGA"))) {
                System.out.println(triplets[0]);
            }
                else{
                    System.out.print("\nNo gene is found");
                }
            }
        }
    }

    // Check if genome string length is a multiple of 3
    public static boolean check(String genome) {
        return genome.length() % 3 == 0;
    }
}
*/