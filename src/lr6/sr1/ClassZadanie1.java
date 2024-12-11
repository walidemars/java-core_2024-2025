package lr6.sr1;

class ClassZadanie1 {
    private char ch;
    private String str;

    ClassZadanie1(char ch) {
        this.ch = ch;
    }

    ClassZadanie1(String str) {
        this.str = str;
    }

    ClassZadanie1(char[] arrCh) {
        if (arrCh.length == 1) {
            this.ch = arrCh[0];
        }
        else {
            for (int i = 0; i < arrCh.length; i++) {
                this.str = new String(arrCh);
            }
        }
    }

    public char getValueChar() {
        return this.ch;
    }
    public String getValueString() {
        return this.str;
    }
}
