package lr6.sr8;

public class ClassZadanie8 {

    static int avOfArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum/arr.length;
    }
}
