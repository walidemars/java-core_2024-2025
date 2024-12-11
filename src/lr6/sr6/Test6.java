package lr6.sr6;

public class Test6 {
    public static void main(String[] args) {
        System.out.println("Количество элементов меньше размера массива");
        int[] arr = {4, 12, 0, 5};
        int[] newAr = ClassZadanie6.newAr(arr, 3);
        for (int i = 0; i < newAr.length; i++) {
            System.out.print(newAr[i] + " ");
        }

        System.out.println("\nКоличество элементов больше размера массива");
        newAr = ClassZadanie6.newAr(arr, 5);
        for (int i = 0; i < newAr.length; i++) {
            System.out.print(newAr[i] + " ");
        }

    }
}
