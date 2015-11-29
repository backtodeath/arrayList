import java.util.Scanner;

/**
 * Created by backtodeath on 29.11.2015.
 **/
public class ShiftedArray {
    private static final String INPUT_ARRAY_SIZE = "Please enter the size of array: ";
    private static final String INPUT_SHIFTING_NUMBER = "Please enter the number for shifting: ";
    private static final String ERROR = "Error: entered number is not valid! ";

    public int[] getShiftedArray() {
        int arraySize = getEnteredNumber(INPUT_ARRAY_SIZE);
        int numberToShift = getEnteredNumber(INPUT_SHIFTING_NUMBER);
        int[] array = fillArray(arraySize);
        return shiftArrayOnNumber(array, numberToShift);
    }

    public int[] fillArray(int arraySize) {
        int[] arrayToFill = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arrayToFill[i] = i + 1;
        }
        return arrayToFill;
    }

    public int getEnteredNumber(String message) {
        long enteredNumber = 0;
        boolean isEnteredNumberNotOk = true;
        while (isEnteredNumberNotOk) {
            System.out.println(message);
            try {
                Scanner sc = new Scanner(System.in);
                enteredNumber = sc.nextInt();
                if (enteredNumber < 1 || enteredNumber > Integer.MAX_VALUE) {
                    System.out.println(ERROR);
                    continue;
                }
                isEnteredNumberNotOk = false;
            } catch (Exception e) {
                System.out.println(ERROR);
            }
        }
        return (int) enteredNumber;
    }

    public static int[] shiftArrayOnNumber(int[] array, int numberToShift) {
        for (int i = 0; i < numberToShift; i++) {
            int firstElement = array[0];
            System.arraycopy(array, 1, array, 0, array.length - 1);
            array[array.length - 1] = firstElement;
        }
        return array;
    }
}
