package lr12;

public class Zadanie4 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++){
            int finalI = i;
            Thread thread = new Thread(() ->{
                Thread.currentThread().setName("Thread " + finalI);
                System.out.println(Thread.currentThread().getName());
            });
            thread.start();
            thread.join();
        }
    }
}
