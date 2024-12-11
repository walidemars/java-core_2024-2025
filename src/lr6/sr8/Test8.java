package lr6.sr8;

public class Test8 {
    public static void main(String[] args) {

        int[] arr = {2, 15, 8, 3};
        System.out.println("Массив:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\nСреднее значение элементов массива " + ClassZadanie8.avOfArr(arr));
    }
}
