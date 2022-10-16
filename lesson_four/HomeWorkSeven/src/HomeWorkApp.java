public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

        int a = 50;
        int b = 6;
        System.out.println(sumLimits(a, b));

        int c = 0;
        valueNumber(c);

        int d = -400;
        System.out.println(valueReverse(d));

        String string = "It's a beautiful day!";
        int e = 5;
        stringsCount(string, e);

        int year = 2022;
        leapYear(year);
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 3;
        int b = 2;
        int sum = a + b;
        String result = (sum >= 0) ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(result);
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else
            System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a = 100;
        int b = 200;
        String result = (a >= b) ? "a >= b" : "a < b";
        System.out.println(result);
    }

    public static boolean sumLimits(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    public static void valueNumber(int c) {
        String result = (c >= 0) ? "Число положительное" : "Число отрицательное";
        System.out.println(result);
    }

    public static boolean valueReverse(int d) {
        return (d < 0);
    }

    public static void stringsCount(String string, int e) {
        int count = 0;
        while (count < e) {
            System.out.println(string);
            count++;
        }
    }

    public static void leapYear(int year) {
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) {
            System.out.println(year + " is a leap year");
        } else
            System.out.println(year + " is not a leap year");
    }
}

