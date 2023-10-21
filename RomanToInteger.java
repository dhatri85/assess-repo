import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase(); // Convert input to uppercase for case insensitivity

        int result = romanToInt(romanNumeral);

        if (result != -1) {
            System.out.println("Integer value: " + result);
        } else {
            System.out.println("Invalid Roman numeral input.");
        }
    }

    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int numericValue = 0;

            switch (currentChar) {
                case 'I':
                    numericValue = 1;
                    break;
                case 'V':
                    numericValue = 5;
                    break;
                case 'X':
                    numericValue = 10;
                    break;
                case 'L':
                    numericValue = 50;
                    break;
                case 'C':
                    numericValue = 100;
                    break;
                case 'D':
                    numericValue = 500;
                    break;
                case 'M':
                    numericValue = 1000;
                    break;
                default:
                    return -1; // Invalid Roman numeral
            }

            if (numericValue < prevValue) {
                result -= numericValue;
            } else {
                result += numericValue;
            }

            prevValue = numericValue;
        }

        return result;
    }
}
