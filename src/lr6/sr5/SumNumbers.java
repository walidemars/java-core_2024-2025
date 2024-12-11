package lr6.sr5;

public class SumNumbers {
    private int numb;

    SumNumbers(int n) {
        if (n > 0) this.numb = n;
        else {
            this.numb = -1;
            System.out.println("Число должно быть больше 0");
        }
    }

    SumNumbers() {
        this.numb = -1;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int n) {
        if (n > 0) this.numb = n;
        else {
            this.numb = -1;
            System.out.println("Число должно быть больше 0");
        }
    }

    public int calcSumN() {
        int n = this.numb;
        int sum = 0;

        if (n > 0) {

            while (n > 0) {
                sum += n*n;
                n--;
            }
            return sum;
        }
        else {
            return sum = 0;
        }
    }
}
