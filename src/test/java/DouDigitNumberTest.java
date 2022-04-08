import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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


}
