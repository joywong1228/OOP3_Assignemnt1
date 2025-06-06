package shapes;

public class TriangularPrism extends Prism {
    private double height;
    private double side;

    public TriangularPrism(double height, double side) {
        this.height = height;
        this.side = side;
    }

    @Override
    public double height() {
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
