import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DouDigitNumberTest {

    @Test
    void should_return_y_Given_Zero() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = 0;

        String result = douDigitNumber.isDouDigit(number);

        Assertions.assertEquals("y",result);
    }

    @Test
    void should_return_y_Given_10() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = 10;

        String result = douDigitNumber.isDouDigit(number);

        Assertions.assertEquals("y",result);
    }

    @Test
    void should_return_y_Given_15() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = 15;

        String result = douDigitNumber.isDouDigit(number);

        Assertions.assertEquals("y",result);
    }

    @Test
    void should_return_y_Given_30() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = 30;

        String result = douDigitNumber.isDouDigit(number);

        Assertions.assertEquals("y",result);
    }

    @Test
    void should_return_y_Given_99() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = 99;

        String result = douDigitNumber.isDouDigit(number);

        Assertions.assertEquals("y",result);
    }

    @Test
    void should_return_y_Given_100() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = 100;

        String result = douDigitNumber.isDouDigit(number);

        Assertions.assertEquals("y",result);
    }

    @Test
    void should_return_y_Given_101() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = 101;

        String result = douDigitNumber.isDouDigit(number);

        Assertions.assertEquals("y",result);
    }

    @Test
    void should_return_y_Given_110() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = 110;

        String result = douDigitNumber.isDouDigit(number);

        Assertions.assertEquals("y",result);
    }

    @Test
    void should_return_y_Given_115() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = 115;

        String result = douDigitNumber.isDouDigit(number);

        Assertions.assertEquals("y",result);
    }

    @Test
    void should_return_n_Given_120() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = 120;

        String result = douDigitNumber.isDouDigit(number);

        Assertions.assertEquals("n",result);
    }

    @Test
    void should_return_y_Given_121() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = 121;

        String result = douDigitNumber.isDouDigit(number);

        Assertions.assertEquals("y",result);
    }

    @Test
    void should_return_n_Given_123() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = 123;

        String result = douDigitNumber.isDouDigit(number);

        Assertions.assertEquals("n",result);
    }

    @Test
    void should_return_n_Given_450() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = 450;

        String result = douDigitNumber.isDouDigit(number);

        Assertions.assertEquals("n",result);
    }

    @Test
    void should_return_y_Given_negative_33333() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = -33333;

        String result = douDigitNumber.isDouDigit(number);

        Assertions.assertEquals("y",result);
    }

    @Test
    void should_return_n_Given_negative_123456789() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = 123456789;

        String result = douDigitNumber.isDouDigit(number);

        Assertions.assertEquals("n",result);
    }

    @Test
    void should_return_n_Given_negative_1234567893() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = 1234567893;

        String result = douDigitNumber.isDouDigit(number);

        Assertions.assertEquals("n",result);
    }

    @Test
    void should_return_y_Given_negative_454545() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = 454545;

        String result = douDigitNumber.isDouDigit(number);

        Assertions.assertEquals("y",result);
    }

    @Test
    void should_return_12_Given_negative_1112121() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = 1112121;

        String result = douDigitNumber.isDouDigit(number);
        List diffDigits = douDigitNumber.getDiffDigits(number);
        List<Integer> expectedDiffDigits = new ArrayList<>();
        expectedDiffDigits.add(1);
        expectedDiffDigits.add(2);
        Assertions.assertEquals("y",result);
        Assertions.assertEquals(expectedDiffDigits,diffDigits);
    }

    @Test
    void should_return_45678_Given_negative_4654587() {
        DouDigitNumber douDigitNumber = new DouDigitNumber();
        int number = -4654587;
        String result = douDigitNumber.isDouDigit(number);
        List diffDigits = douDigitNumber.getDiffDigits(number);
        List<Integer> expectedDiffDigits = new ArrayList<>();
        expectedDiffDigits.add(4);
        expectedDiffDigits.add(5);
        expectedDiffDigits.add(6);
        expectedDiffDigits.add(7);
        expectedDiffDigits.add(8);
        Assertions.assertEquals("n",result);
        Assertions.assertEquals(expectedDiffDigits,diffDigits);
    }


}
