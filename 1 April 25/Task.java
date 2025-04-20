import java.util.Random;

public class Task {
    public static void main(String[] args) {
        int arraySize = 9;
        int[] numberArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            numberArray[i] = i + 1;
        }

        System.out.println("Number Array:");
        System.out.println("1 2 3 4 5 6 7 8 9");
        shuffleArray(numberArray);

        System.out.println("Shuffled Number Array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(numberArray[i] + " ");
        }

        int num1 = numberArray[0];
        int num2 = numberArray[1];

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        double division = (double) num1 / num2;

        System.out.println("\nArithmetic Operations:");
        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);
    }

    public static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}