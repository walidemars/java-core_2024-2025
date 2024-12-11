package lr6.sr9;

public class ClassZadanie9 {

    static char[] arrCh(char[] arr) {

        char[] newArr = new char[arr.length];

        int j = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            newArr[i] = arr[j];
            newArr[j] = temp;
            j--;
        }

        if (arr.length % 2 != 0) {
            newArr[arr.length / 2] = arr[arr.length / 2];
        }
        return newArr;

    }
}
