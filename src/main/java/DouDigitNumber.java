public class DouDigitNumber {

    private static final int EXIST = 1;
    public static final String NO = "n";
    public static final String YES = "y";
    public static final int DOU_DIGIT = 2;
    private final char[] numbers ={'0','1','2','3','4','5','6','7','8','9'};

    public String isDouDigit(int number) {
        String isDouDigit = NO;
        if (isLowerThanDouDigits(number)) {
            isDouDigit =YES;
        }else{
            String strNumber = convertToString(Math.abs(number));
            int[] diffDigits = getDiffDigits(strNumber);
            if (getNumberOfDifferentDigits(diffDigits) <= DOU_DIGIT){
                isDouDigit = YES;
            }
        }
        return isDouDigit;
    }

    private int[] getDiffDigits(String strNumber) {
        int[] diffDigits = new int[numbers.length];
        for (int index = 0; index < strNumber.length(); index++){
            for (int num = 0; num < numbers.length ;num++){
                if (strNumber.charAt(index) == numbers[num]){
                    diffDigits[num] = EXIST;
                }
            }
        }
        return diffDigits;
    }

    private int getNumberOfDifferentDigits(int[] digits) {
        int count = 0;
        for (int num = 0; num < numbers.length; num++){
            if (digits[num] == EXIST){
                count++;
            }
        }
        return count;
    }

    private boolean isLowerThanDouDigits(int number) {
        return number < 100 && number > -100;
    }

    private String convertToString(int number) {
        return String.valueOf(number);
    }

}
