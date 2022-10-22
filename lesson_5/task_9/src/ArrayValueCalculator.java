import java.util.Arrays;
import java.util.Objects;

public class ArrayValueCalculator {

    public static int doCalc(String[][] strings) throws ArraySizeException, NumberFormatException, ArrayDataException {
        if (isCorrectArraySize(strings, 4)) {
            throw new ArraySizeException("array size is not 4X4");
        }

        int sum = 0;
        int[][] numArray = new int[strings.length][strings.length];

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                try {
                    numArray[i][j] = Integer.parseInt(strings[i][j]);
                    sum += numArray[i][j];
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("array element [" + i + "] [" + j + "] contains symbol or text", e);
                }
            }
        }

        return sum;
    }

    public static boolean isCorrectArraySize(String[][] array, int arraySize) {
        if (array.length != arraySize) {
            return true;
        }

        for (String[] strings : array) {
            if (strings.length != arraySize) {
                return true;
            }
        }

        return false;
    }
}
