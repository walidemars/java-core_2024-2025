package lr12;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Zadanie6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(500);
        }
        System.out.println("Исходный массив: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        int cores = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(cores);

        int chunkSize = arr.length / cores;

        Future<Integer>[] futures = new Future[cores];
        for (int i = 0; i < cores; i++){
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, arr.length);

            futures[i] = executor.submit(() -> {
                int localSum = 0;
                for (int j = start; j < end; j++){
                    localSum = arr[j];
                }
                return localSum;
            });
        }

        int totalSum = 0;
        for (Future<Integer> future : futures) {
            totalSum += future.get();
        }
        executor.shutdown();

        System.out.println("Сумма элементов массива: " + totalSum);
    }
}
