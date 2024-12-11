package lr6.sr4;

public class DoubleFac {
    private int numb;

    DoubleFac(int n) {
        if (n > 0) this.numb = n;
        else {
            this.numb = -1;
            System.out.println("Число должно быть больше 0");
        }
    }

    DoubleFac() {
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

    public int calcDFac() {
        int fac = 1;
        int n = this.numb;

        if (n > 0) {

            while (n > 0) {
                fac *= n;
                n = n - 2;
            }
            return fac;
        }
        else {
            return fac = 0;
        }
    }
}
