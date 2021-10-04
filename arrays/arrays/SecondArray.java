package arrays;

import java.util.Arrays;

public class SecondArray {
    public int[] numbers = {7, 14, 48, 32, 28, 19};

    public void revealContent() {
        System.out.println(Arrays.toString(numbers));
    }

    public void sortArray() {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
