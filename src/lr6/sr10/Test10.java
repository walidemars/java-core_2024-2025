package lr6.sr10;

public class Test10 {
    public static void main(String[] args) {

        int[] arr = ClassZadanie10.maxAndMin(4);

        System.out.println("Максимальное и минимальное значения:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
