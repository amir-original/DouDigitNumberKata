import java.util.ArrayList;
import java.util.List;

public class DouDigitNumber {

    private static final int EXIST = 1;
    private static final String NO = "n";
    private static final String YES = "y";
    private static final int DOU_DIGIT = 2;
    private final char[] numbers ={'0','1','2','3','4','5','6','7','8','9'};

    public String isDouDigit(int number) {
        String isDouDigit = NO;
        if (isLowerThanDouDigits(number)) {
            isDouDigit =YES;
        } else{
            int numberOfDiffDigits = getDiffDigits(number).size();
            if (numberOfDiffDigits <= DOU_DIGIT){
                isDouDigit = YES;
            }
        }
        return isDouDigit;
    }

    public List<Integer> getDiffDigits(int number){
        String strNumber = convertToString(Math.abs(number));
        int[] existDigits = getExistDigits(strNumber);
        List<Integer> diffDigits = new ArrayList<>();
        for (int num = 0; num < numbers.length; num++){
            if (existDigits[num] == EXIST){
                diffDigits.add(num);
            }
        }
        return diffDigits;
    }

    private int[] getExistDigits(String strNumber) {
        int[] existDigits = new int[numbers.length];
        for (int index = 0; index < strNumber.length(); index++){
            for (int num = 0; num < numbers.length ;num++){
                if (strNumber.charAt(index) == numbers[num]){
                    existDigits[num] = EXIST;
                }
            }
        }
        return existDigits;
    }

    private boolean isLowerThanDouDigits(int number) {
        return number < 100 && number > -100;
    }

    private String convertToString(int number) {
        return String.valueOf(number);
    }

}
