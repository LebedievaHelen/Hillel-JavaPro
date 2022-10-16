package geometric;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        GeometricFigure[] figures = {circle, square, triangle};

        double sumAria = sumAria(figures);
        System.out.println("Total area of figures = " + round(sumAria));
    }

    public static double sumAria(GeometricFigure[] figures) {
        double sumAria = 0;
        for (int i = 0; i < figures.length; i++) {
            sumAria = sumAria + figures[i].figureArea();
        }
        return sumAria;
    }

    public static String round(double value) {
        return String.format("%.2f", value);
    }
}
