import java.util.Arrays;
import java.util.Scanner;

public class NumberReader {
    private int[] array = new int[10];

    public int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        if (number <= 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }

        return number;
    }

    public void fillArray() {
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = readNumber();
                System.out.println(Arrays.toString(array));
            } catch (NegativeNumberException e) {
                array[i] = 0;
                System.out.println(Arrays.toString(array));
                System.out.println(e.getMessage());
            }
        }
    }
}