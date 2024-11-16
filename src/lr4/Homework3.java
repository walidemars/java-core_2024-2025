package lr4;

public class Homework3 {
    public static void main(String[] args) {

        int width = 12;
        int height = 23;
        int two = 2;

        int rectangle[][] = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                rectangle[i][j] = two;
            }
        }

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
