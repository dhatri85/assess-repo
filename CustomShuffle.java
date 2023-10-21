import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CustomShuffle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the array separated by spaces:");
        String input = scanner.nextLine();
        String[] inputElements = input.split(" ");
        int n = inputElements.length;
        int[] inputArray = new int[n];

        for (int i = 0; i < n; i++) {
            inputArray[i] = Integer.parseInt(inputElements[i]);
        }

        shuffleArray(inputArray);
        System.out.println("Shuffled array: " + Arrays.toString(inputArray));
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random rand = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}

