package lr9;

import java.util.*;

public class example8 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();


        long time1 = getRunningTimeList(arrayList);
        long time2 = getRunningTimeSet(hashSet);
        long time3 = getRunningTimeSet(sortedSet);

        System.out.println("Время выполнения операции добавления arrayList = "
                + time1);
        System.out.println("Время выполнения операции добавления hashSet = "
                + time2);
        System.out.println("Время выполнения операции добавления sortedSet = "
                + time3);
    }
    private static long getRunningTimeList(List<Integer> list) {

// блок кода в котором выполняется операция dобавления
        for (int i = 0; i < 8000000; i++) {
            list.add(i);
        }
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        for (int i = 0; i < 8000000; i++) {
            System.out.println(list.get(0));
        }

// точка окончания отсчета времени выполнени программы
        long end = System.currentTimeMillis();
// вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }



    private static long getRunningTimeSet(HashSet<Integer> set) {

// блок кода в котором выполняется операция dобавления
        for (int i = 0; i < 8000000; i++) {
            set.add(i);
        }
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        for (long i = 0; i < 8000000; i++) {
            System.out.println(set.iterator());
        }
// точка окончания отсчета времени выполнени программы
        long end = System.currentTimeMillis();
// вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }



    private static long getRunningTimeSet(SortedSet<Integer> set) {

// блок кода в котором выполняется операция dобавления
        for (int i = 0; i < 8000000; i++) {
            set.add(i);
        }
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        for (long i = 0; i < 8000000; i++) {
            System.out.println(set.first());
        }

// точка окончания отсчета времени выполнени программы
        long end = System.currentTimeMillis();
// вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }
}
