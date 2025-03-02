package lr9.zadanie7;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UseLinkedList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество человек стоящих в кругу: ");
        int N = in.nextInt();

        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        int index = 0;
        while(list.size() > 1) {
            index = (index + 1) % list.size();
            System.out.println("Вычеркиваем: " + list.remove(index));
        }
        System.out.println("Последний оставшийся: " + list.get(0));
    }
}
