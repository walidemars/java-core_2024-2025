package timus;

import java.util.Scanner;

public class task2100 {
    final static int COST_ONE_PERSON = 100;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int price = 200;

        int numberOfFriends = in.nextInt();

        int counterFriends = 2 + numberOfFriends;


        price += numberOfFriends * COST_ONE_PERSON;

        String friend;

        for (int i = 0; i < numberOfFriends; i++) {
            friend = in.next();

            if (friend.contains("+")) {
                price += COST_ONE_PERSON;
                counterFriends++;
            }
        }

        if (counterFriends == 13) {
            price += COST_ONE_PERSON;
            System.out.println(price);
        }
        else {
            System.out.println(price);
        }
    }
}
