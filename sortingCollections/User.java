package sortingCollections;

import java.util.Comparator;

public class User {
    private int id;
    private String name;

    // constructor
    public User (int id, String name) {
        this.id = id;
        this.name = name;
    }

    // getter of user id
    public int getId() {
        return this.id;
    }

    // getter of user name
    public String getName() {
        return this.name;
    }

}

// defining a comparator class for ordering elements
class UserIdComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        // ascending order
        return user1.getId() - user2.getId();

        // descending order
        // return user2.getId() - user1.getId();
    }
}