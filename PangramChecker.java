import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase to make it case-insensitive

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create an array to mark the presence of each letter from 'a' to 'z'
        boolean[] lettersPresent = new boolean[26];
        int totalLetters = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                if (!lettersPresent[index]) {
                    lettersPresent[index] = true;
                    totalLetters++;
                }
            }
        }

        return totalLetters == 26;
    }
}
