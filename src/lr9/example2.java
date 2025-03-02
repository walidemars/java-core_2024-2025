package lr9;
//Вывести последовательность, представленную
//предыдущем примере, в обратном порядке. На рисунке 2 представлен
//результат выполнения примера 2
public class example2 {
    public static void Recursion(int x){
        if((2 * x + 1) < 20){
            Recursion(2 * x + 1);
        }
        System.out.println("x = " + x);
    }

    public static void main(String[] args) {
        Recursion(1);
    }
}
