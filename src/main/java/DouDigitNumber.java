public class DouDigitNumber {

    private static final int EXIST = 1;
    public static final String NO = "n";
    public static final String YES = "y";
    public static final int DOU_DIGIT = 2;
    private final char[] numbers ={'0','1','2','3','4','5','6','7','8','9'};

    public String isDouDigit(int number) {
        if (isLowerThanDouDigits(number)) return YES;

        String strNumber = toString(Math.abs(number));
        int[] digits = new int[10];
        String isDouDigit = NO;
        for (int index = 0; index < strNumber.length();index++){
            for (int num = 0; num < digits.length ;num++){
                if (strNumber.charAt(index) == numbers[num]){
                    digits[num] = EXIST;
                }
            }
        }

        if (getNumberOfDifferentDigits(digits) <= DOU_DIGIT){
            isDouDigit = YES;
        }
        return isDouDigit;
    }

    private int getNumberOfDifferentDigits(int[] digits) {
        int count = 0;
        for (int num = 0; num < 10; num++){
            if (digits[num] == EXIST){
                count++;
            }
        }
        return count;
    }

    private boolean isLowerThanDouDigits(int number) {
        return number < 100 && number > -100;
    }

    private String toString(int number) {
        return String.valueOf(number);
    }
}
