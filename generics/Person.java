package generics;

public class Person<T> {
    T name;

    public Person(T name) {
        this.name = name;
    }

    // printing out the type of object of T
    void printType() {
        System.out.println(name.getClass().getName());
    }
}
