public class Main {

    public static void main(String[] args) {
        String[][] strings = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};

        try {
            int sumArray = ArrayValueCalculator.doCalc(strings);
            System.out.println("Sum of all array elements = " + sumArray);
        } catch (ArraySizeException | ArrayDataException e) {
            e.printStackTrace();
        }
    }
}
