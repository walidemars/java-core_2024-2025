package lr9;
// Вывести число Фибоначчи, заданное его номером в
//последовательности.
public class example5 {

    public static int fibonaci(int n){
        System.out.println("fib " + n); // вывод последовательности обхода рекурсивного дерева
        if (n == 0){
           // System.out.println("fib " + n);
            return 0;
        } else if (n == 1) {
            //System.out.println("fib " + n);
            return 1;
        } else {

            return fibonaci(n - 1) + fibonaci(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonaci(5));
    }
}
// дополнительно вывести в консоль последовательность обхода
//дерева рекурсивных вызовов.