package timus;

import java.util.*;

public class task1545 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        List<String> kanjiList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String kanji = in.nextLine();
            kanjiList.add(kanji);
        }

        char inputChar = in.nextLine().charAt(0);

        for (String kanji : kanjiList) {
            if (kanji.charAt(0) == inputChar) {
                System.out.println(kanji);
            }
        }
    }
}
