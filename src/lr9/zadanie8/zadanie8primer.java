package lr9.zadanie8;

import java.util.Scanner;

public class zadanie8primer {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество элементов для добавления в список");
        int numbOfElements = in.nextInt();
        int[] data = new int[numbOfElements];

        zadanie8 headCycleList = new zadanie8();
        for(int i = 0; i < data.length; i++){
            System.out.println("Введите значение элемента " + (i+1) + ": ");
            data[i] = in.nextInt();
        }

        System.out.println("\nС ИСПОЛЬЗОВАНИЕМ ЦИКЛОВ:");

        zadanie8 tailCycleList = new zadanie8();

        headCycleList.createHead(data);
        tailCycleList.createTail(data);
        String headList = headCycleList.toString();
        String tailList = tailCycleList.toString();

        System.out.println("Список элементов с головы: " + headList);

        System.out.println("Список элементов с хвоста: " + tailList);

        System.out.println("\nВведите элемент для вставки в начало списка: ");
        int newelement = in.nextInt();
        headCycleList.AddFirst(newelement);
        System.out.println("Список элементов с головы: " + headCycleList);

        System.out.println("\nВведите элемент для вставки в конец списка: ");
        newelement = in.nextInt();
        headCycleList.AddLast(newelement);
        System.out.println("Список элементов с головы: " + headCycleList);

        System.out.println("\nВведите элемент для вставки по индексу: ");
        newelement = in.nextInt();
        System.out.println("Введите индекс: ");
        int index = in.nextInt();
        headCycleList.Insert(index, newelement);
        System.out.println("Список элементов с головы: " + headCycleList);

        System.out.println("\nУдаление первого элемента");
        headCycleList.RemoveFirst();
        System.out.println("Список элементов с головы: " + headCycleList);

        System.out.println("\nУдаление последнего элемента");
        headCycleList.RemoveLast();
        System.out.println("Список элементов с головы: " + headCycleList);

        System.out.println("\nУдаление элемента по индексу");
        System.out.println("Введите индекс: ");
        index = in.nextInt();
        headCycleList.Remove(index);
        System.out.println("Список элементов с головы: " + headCycleList);


        System.out.println("\nС ИСПОЛЬЗОВАНИЕМ РЕКУРСИИ:");
        zadanie8 headRecList = new zadanie8();
        zadanie8 tailRecList = new zadanie8();

        headRecList.CreateHeadRec(data);
        tailRecList.CreateHeadRec(data);
        System.out.println("\nВывод с помощью рекурсии");
        System.out.println("\nСписок элементов с головы: " + headRecList.toStringRec());
        System.out.println("\nСписок элементов с хвоста: " + tailRecList.toStringRec());
    }
}
