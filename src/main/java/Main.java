import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by backtodeath on 29.11.2015.
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int arraySize = sc.nextInt();

        System.out.print("Enter the number to shift array: ");
        int numberToShift = sc.nextInt();

        int array[] = fillArray(arraySize);

        int shiftedArray[] = shiftArrayOnNumber(array, numberToShift);
        System.out.println("Shifted array is: " + Arrays.toString(shiftedArray));
    }

    private static int[] fillArray(int arraySize) {
        int arrayToFill[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arrayToFill[i] = i + 1;
        }
        return arrayToFill;
    }

    private static int[] shiftArrayOnNumber(int[] array, int numberToShift) {
        for (int i = 0; i < numberToShift; i++) {
            int firstElement = array[0];
            System.arraycopy(array, 1, array, 0, array.length - 1);
            array[array.length - 1] = firstElement;
        }
        return array;
    }
}
