package lr6.sr6;

public class ClassZadanie6 {

    static int[] newAr(int[] arr, int a) {

        if (a >= arr.length) {
            return arr;
        }
        else {
            int[] newArr = new int[a];
            for (int i = 0; i < a; i++) {
                newArr[i] = arr[i];
            }
            return newArr;
        }
    }
}
