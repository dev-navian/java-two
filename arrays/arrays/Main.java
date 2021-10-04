package arrays;

public class Main {

    public static void main(String[] args) {
        FirstArray myArray = new FirstArray();
        SecondArray secondArray = new SecondArray();

        myArray.values[0] = 2;
        myArray.values[1] = 4;
        myArray.values[2] = 6;
        myArray.values[3] = 8;
        myArray.values[4] = 10;

        // printing out the content of the array
        myArray.revealContent();
        secondArray.sortArray();

    }
}
