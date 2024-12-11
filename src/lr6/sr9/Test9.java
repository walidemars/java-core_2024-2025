package lr6.sr9;

public class Test9 {
    public static void main(String[] args) {
        char[] arr = {'A', 'b', '2', 'u', 'д'};
        char[] newArr = ClassZadanie9.arrCh(arr);

        System.out.println("Изначальный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nПреобразованный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
