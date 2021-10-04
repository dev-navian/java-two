package tests;
import arrays.FirstArray;

import static org.junit.jupiter.api.Assertions.assertEquals;
import arrays.SecondArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Tests {
    FirstArray firstArray = new FirstArray();
    SecondArray secondArray = new SecondArray();

    @Test
    // checking for the validity of the length of the first array
    void checkFirstArrayLength() {
        assertEquals(firstArray.values.length, 5);
    }

    @Test
    void checkSecondArrayLength() {
        assertEquals(secondArray.numbers.length, 6);
    }


}
