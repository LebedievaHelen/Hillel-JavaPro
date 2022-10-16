package geometric;

public class Triangle implements GeometricFigure {

    @Override
    public double figureArea() {
        double base = 5.4;
        double height = 2.5;
        return (base * height) / 2;
    }
}
