package timus;

import java.util.Scanner;

public class task1197 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        String getCell[] = new String[test];

        int moves[][] = {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {1, -2},{-1, 2}, {-1, -2}};

        int avMoves = 0;

        for (int i = 0; i < test; i++) {
            getCell[i] = in.next();
        }

        for (int i = 0; i < test; i++) {
            char row = getCell[i].charAt(0);
            char column = getCell[i].charAt(1);

            for (int r = 0; r < moves.length; r++) {

                if (row + moves[r][0] >= 'a' && row + moves[r][0] <= 'h' && column + moves[r][1] >= '1' && column + moves[r][1] <= '8') {
                    avMoves++;
                }
            }
            System.out.println(avMoves);
            avMoves = 0;
        }
    }
}
