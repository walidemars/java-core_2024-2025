package timus;

import java.util.*;
import java.io.*;

public class task1196 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Set<Integer> teacherDates = new HashSet<>();

        for (int i = 0; i < N; i++) {
            teacherDates.add(Integer.parseInt(reader.readLine()));
        }

        int M = Integer.parseInt(reader.readLine());
        int count = 0;

        for (int i = 0; i < M; i++) {
            int studentDate = Integer.parseInt(reader.readLine());
            if (teacherDates.contains(studentDate)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
