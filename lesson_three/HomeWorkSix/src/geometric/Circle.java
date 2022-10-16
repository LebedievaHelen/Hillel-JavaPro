package geometric;

public class Circle implements GeometricFigure {

    @Override
    public double figureArea() {
        double radius = 2.0;
        return Math.PI * (radius * radius);
    }
}
