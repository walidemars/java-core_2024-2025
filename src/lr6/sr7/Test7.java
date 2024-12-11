package lr6.sr7;

public class Test7 {
    public static void main(String[] args) {

        char[] arr = {'a', '2', 'c'};

        int[] Narr = ClassZadanie7.newArr(arr);

        System.out.println("Изначальный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nПреобразованный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Narr[i] + " ");
        }
    }
}
