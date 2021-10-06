package generics;

public class Main {

    public static void main (String[] args) {

        // person
        Person<String> personOne = new Person<>("Jane");
        Person<String> personTwo = new Person<>("Arthur");

        System.out.println(personOne.name);
        System.out.println(personTwo.name);
        personOne.printType();
        personTwo.printType();

        System.out.println();

        // vehicle
        Vehicle<String, Integer> vehicleOne = new Vehicle<>("Tacoma", 2020);
        Vehicle<String, Integer> vehicleTwo = new Vehicle<>("Audi", 2018);

        System.out.println(vehicleOne.make + " " + vehicleOne.model);
        System.out.println(vehicleTwo.make + " " + vehicleTwo.model);
        System.out.println(vehicleOne.getMake());
        System.out.println(vehicleTwo.getModel());


    }
}
