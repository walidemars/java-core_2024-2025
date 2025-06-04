package timus;

import java.util.*;

public class task1496 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        Map<String, Integer> submissions = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String teamName = in.nextLine();
            submissions.put(teamName, submissions.getOrDefault(teamName, 0) + 1);
        }

        List<String> spamAccounts = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : submissions.entrySet()) {
            if (entry.getValue() > 1) {
                spamAccounts.add(entry.getKey());
            }
        }

        for (String account : spamAccounts) {
            System.out.println(account);
        }
    }
}
