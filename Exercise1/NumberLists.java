package Exercise1;
import java.util.Scanner;

public class NumberLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers(show output by enter non-integer value): ");

        int[] numbers = new int[1];
        int size = 0;

        while (input.hasNextInt()) {
            if (size == numbers.length) {

                int[] newArray = new int[numbers.length * 2];
                System.arraycopy(numbers, 0, newArray, 0, numbers.length);
                numbers = newArray;
            }
            numbers[size++] = input.nextInt();
        }

        System.out.println("The numbers that you inputted are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}
