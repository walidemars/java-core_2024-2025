package lr4;

public class Homework4 {
    public static void main(String[] args) {

        int width = 12;
        int height = 12;
        int two = 2;

        int rectangle[][] = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                rectangle[i][j] = two;
            }
        }

        outer: for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + rectangle[i][j]);
            }
        }
    }
}
