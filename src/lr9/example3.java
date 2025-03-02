package lr9;
//Код вывода параметра перед вхождением в рекурсивный вызов
//и после него, показан на рисунке 3
public class example3 {

    private static int step = 0;

    public static void Recursion(int x){
        space();
        System.out.println("" + x + "-> ");
        step++;
        if ((2 * x + 1) < 20){
            Recursion(2 * x + 1);
        }
        step--;
        space();
        System.out.println("" + x + "-> ");
    }

    public static void space(){
        for(int i = 0; i < step; i++){
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Recursion(1);
    }
}
