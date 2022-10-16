package geometric;

public class Square implements GeometricFigure {

    @Override
    public double figureArea() {
        double side = 3.5;
        return side * side;
    }
}
