package lr5.sr6;

public class Class6zadanie {
    private int max = 0;
    private int min = 0;

    Class6zadanie(int a, int b) {
        min = Math.min(a, b);
        max = Math.max(a, b);
    }

    Class6zadanie(int a) {
        min = Math.min(a, min);
        max = Math.max(a,  max);
    }

    Class6zadanie() {
        min = 0;
        max = 0;
    }

    public void setMaxMin(int a, int b) {
        min = Math.min(Math.min(a, b), min);
        max = Math.max(Math.max(a, b), max);
    }

    public void setMaxMin(int a) {
        min = Math.min(a, min);
        max = Math.max(a,  max);
    }

    public void showMaxMin() {
        System.out.println("Значение max: " + max + "\nЗначение min: " + min);
    }

}
