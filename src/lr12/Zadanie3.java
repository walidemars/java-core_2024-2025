package lr12;

public class Zadanie3 {

    private static final Object lock = new Object();
    private static int number = 1;

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> {
            synchronized (lock) {
                while (number < 10) {
                    if(number % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    lock.notify();
                }
            }
        });

        Thread oddThread = new Thread(() -> {
            synchronized (lock) {
                while (number < 10) {
                    if(number % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    lock.notify();
                }
            }
        });

        evenThread.setName("Even Thread");
        oddThread.setName("Odd Thread");

        evenThread.start();
        oddThread.start();
    }
}
