package lr5.sr5;

public class Class5zadanie {
    private int number;

    Class5zadanie(int n) {
        number = n;
    }

    void setNumber (int n) {
        if (n < 100) number = n;
        else number = 100;
    }

    void setNumber() {
        number = 0;
    }

    int getNumber() {
        return number;
    }

}
