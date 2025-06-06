package shapes;

public class SquarePrism extends Prism {

    public SquarePrism(double height, double side) {
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
        return side * side;
    }

    @Override
    public double calVolume() {
        return calBaseArea() * height;
    }

    @Override
    public String toString() {
        return "SquarePrism " + height + " " + side;
    }
}
