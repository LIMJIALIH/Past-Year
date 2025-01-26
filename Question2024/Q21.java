package Question2024;

import java.util.ArrayList;
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int game = 1;

        while (true) {
            System.out.println("\nGame " + game + ":\nTic-Tac-Toe Board:");
            ArrayList<ArrayList<Character>> tictactoe = new ArrayList<>();
            String[] input = new String[3];
            boolean hasEmpty = false;
            String winner = null;

            for (int i = 0; i < 3; i++) {
                input[i] = sc.next();
                if (input[i].equals("#")) {
                    break;
                }

                ArrayList<Character> row = new ArrayList<>();
                for (char cell : input[i].toCharArray()) {
                    row.add(cell);
                    if (cell == '.') {
                        hasEmpty = true;
                    }
                }
                tictactoe.add(row);
            }

            for (int i = 0; i < 3; i++) {
                if (tictactoe.get(i).get(0) == tictactoe.get(i).get(1) && tictactoe.get(i).get(1) == tictactoe.get(i).get(2) && tictactoe.get(i).get(0) != '.') {
                    winner = String.valueOf(tictactoe.get(i).get(0));
                }
            }

            for (int i = 0; i < 3; i++) {
                if (tictactoe.get(0).get(i) == tictactoe.get(1).get(i) && tictactoe.get(1).get(i) == tictactoe.get(2).get(i) && tictactoe.get(0).get(i) != '.') {
                    winner = String.valueOf(tictactoe.get(0).get(i));
                }
            }

            if (tictactoe.get(0).get(0) == tictactoe.get(1).get(1) && tictactoe.get(1).get(1) == tictactoe.get(2).get(2) && tictactoe.get(0).get(0) != '.') {
                winner = String.valueOf(tictactoe.get(0).get(0));
            }
            if (tictactoe.get(0).get(2) == tictactoe.get(1).get(1) && tictactoe.get(1).get(1) == tictactoe.get(2).get(0) && tictactoe.get(0).get(2) != '.') {
                winner = String.valueOf(tictactoe.get(0).get(2));
            }

            String result;
            if (winner != null) {
                result = "Winner: " + winner;
            } else if (hasEmpty) {
                result = "Winner: None (ongoing)";
            } else {
                result = "Winner: Draw";
            }

            for (ArrayList<Character> row : tictactoe) {
                for (char cell : row) {
                    System.out.print((cell == '.' ? ' ' : cell) + " ");
                }
                System.out.println();
            }
            System.out.println(result);

            if ("Winner: None (ongoing)".equals(result)) {
                break;
            }

            sc.nextLine(); 
            String next = sc.nextLine();
            if (!next.equals("#")) {
                break;
            }
            game++;
        }

    }
}
