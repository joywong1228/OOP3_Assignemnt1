package shapes;

public class TriangularPrism extends Prism {

    public TriangularPrism(double height, double side) {
        super(height, side);
    }

    @Override
    public double getHeight() {
        return height;
    }

    public double side() {
        return side;
    }

    @Override
    public double calBaseArea() {
        return (Math.sqrt(3) / 4.0) * side * side;
    }

    @Override
    public double calVolume() {
        return calBaseArea() * height;
    }

    @Override
    public String toString() {
        return "TriangularPrism " + height + " " + side;
    }
}
