package trainings.bfs.week1.day3.hw.hw1;

public class CCValidation {

    /**
     * Return true if the card number is valid
     */
    public static boolean isValid(long number) {
        if (CCValidation.getSize(number) >= 13 && CCValidation.getSize(number) <= 16) {
            if (CCValidation.prefixMatched(number, 4) || CCValidation.prefixMatched(number, 5) || CCValidation.prefixMatched(number, 37) || CCValidation.prefixMatched(number, 6)) {
                return ((CCValidation.sumOfDoubleEvenPlace(number) + CCValidation.sumOfOddPlace(number)) % 10) == 0;
            }
        }
        return false;
    }

    /**
     * Get the result from Step B
     */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        number /= 10;
        while (number != 0) {
            sum += CCValidation.getDigit((int)(number % 10) * 2);
            number /= 100;
        }
        return sum;
    }

    /**
     * Return this number if it is a single digit, otherwise, return the sum of the two digits
     */
    public static int getDigit(int number) {
        if (CCValidation.getSize(number) == 1) {
            return number;
        } else  {
            return (number / 10) + (number % 10);
        }
    }

    /**
     * Return sum of odd-place digits in number
     */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 100;
        }
        return sum;
    }

    /**
     * Return true if the digit d is a prefix for number
     */
    public static boolean prefixMatched(long number, int d) {
        int lenD = CCValidation.getSize(d);
        if (CCValidation.getPrefix(number, lenD) == d) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Return the number of digits in d
     */
    public static int getSize(long d) {
        //return String.valueOf(d).length();
        return (int) (Math.log10(d) + 1);
    }

    /**
     * Return the first k number of digits from number. If the number of digits in number is less
     * than k, return number.
     */
    public static long getPrefix(long number, int k) {
        String strNumber = Long.toString(number);
        if (strNumber.length() < k) {
            return number;
        }
        String strPrefix = strNumber.substring(0, k);
        return Long.parseLong(strPrefix);
    }

    // main method
    public static void main(String[] args) {

        long number1 = 4388576018402626L;
        long number2 = 4388576018410707L;

        System.out.println(CCValidation.isValid(number1)); // false
        System.out.println(CCValidation.isValid(number2)); // true
        System.out.println(CCValidation.isValid(438857601841L)); // false
        System.out.println(CCValidation.isValid(43885760184107075L)); // false

        System.out.println("---");

        // Testing
        System.out.println(CCValidation.sumOfDoubleEvenPlace(number1));
        System.out.println(CCValidation.getDigit(16));
        System.out.println(CCValidation.sumOfOddPlace(number1));
        System.out.println(CCValidation.prefixMatched(number1, 43));
        System.out.println(CCValidation.getSize(number1));
        System.out.println(CCValidation.getPrefix(number1, 2));
    }
}
