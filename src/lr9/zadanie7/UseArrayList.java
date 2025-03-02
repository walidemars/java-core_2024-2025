package lr9.zadanie7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество человек стоящих в кругу: ");
        int N = in.nextInt();

        List<Integer> circle = new ArrayList<>();
        for(int i = 1; i <= N; i++){
            circle.add(i);
        }

        int current = 0;
        while (circle.size() > 1){
            current = (current + 1) % circle.size();
            System.out.println("Вычеркиваем: " + circle.remove(current));
        }

        System.out.println("Последний оставшийся: " + circle.get(0));
    }
}
