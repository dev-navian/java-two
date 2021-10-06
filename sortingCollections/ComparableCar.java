package sortingCollections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableCar implements Comparable<ComparableCar> {
    private String name;
    private int id;

    // defining the constructor
    public ComparableCar(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // setting a getter of the car id
    public int getId() {
        return this.id;
    }

    // overriding the compare to method
    @Override
    public int compareTo(ComparableCar newComparableCar) {

        if (this.getId() == newComparableCar.getId())
            return 0;
        else if (this.getId() > newComparableCar.getId())
            // sort in ascending order (1)
            return 1;
        else
            // sort in descending order (-1)
            return -1;
    }

    public static void main(String[] args) {
        ComparableCar comparableCar1 = new ComparableCar("Nissan", 20);
        ComparableCar comparableCar2 = new ComparableCar("Audi", 43);
        ComparableCar comparableCar3 = new ComparableCar("Jaguar", 18);
        ComparableCar comparableCar4 = new ComparableCar("Mercedes", 55);
        ComparableCar comparableCar5 = new ComparableCar("Toyota", 36);

        ArrayList<ComparableCar> arr = new ArrayList<ComparableCar>();
        arr.add(comparableCar1);
        arr.add(comparableCar2);
        arr.add(comparableCar3);
        arr.add(comparableCar4);
        arr.add(comparableCar5);

        // printing the values in the arr array
        for (ComparableCar c: arr) {
            System.out.println(c.id);
        }

        System.out.println("====================");

        // sorting the values based on the Compare To method
        Collections.sort(arr);

        // printing the values
        for (ComparableCar c: arr) {
            System.out.println(c.id);
        }

    }
}
