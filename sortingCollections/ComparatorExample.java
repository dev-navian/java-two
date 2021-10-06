package sortingCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();

        User userOne = new User(23, "Adrian");
        User userTwo = new User(17, "Joanna");
        User userThree = new User(41, "Liam");
        User userFour = new User(8, "Meghan");
        User userFive = new User(52, "Collins");

        users.add(userOne);
        users.add(userTwo);
        users.add(userThree);
        users.add(userFour);
        users.add(userFive);

        for (User newUser: users) {
            System.out.println(newUser.getId() + " " + newUser.getName());
        }

        System.out.println("=========================");

        // overloading the collections.sort method to compare elements
        Collections.sort(users, new UserIdComparator());

        for (User newUser: users) {
            System.out.println(newUser.getId() + " " + newUser.getName());
        }
    }
}
