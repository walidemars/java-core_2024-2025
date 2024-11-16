package lr4;

public class Homework7 {
    public static void main(String[] args) {

        int rows = 5;
        int columns = 5;
        int z;

        int originalArr[][] = new int[rows][columns];
        int counter = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i % 2 == 1) {
                    for (int k = columns - 1; k > -1; k--) {
                        j = columns - 1;
                        originalArr[i][k] = counter;
                        counter++;
                    }
                }
                else {
                    originalArr[i][j] = counter;
                    counter++;
                }
            }
        }

        System.out.println("Созданный массив: ");

        for (int i = 0; i < rows; i++) {
            System.out.print("номер строки " + i + ": ");
            z = 0;
            for (int j = 0; j < columns; j++) {
                System.out.print(originalArr[i][j] + " ");
                z += 1;
            }
            System.out.println(" Количество символов в строке " + z);
        }
        System.out.println();
    }
}
