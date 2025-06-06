package shapes;

public class SquarePrism extends Prism {
    private double height;
    private double edge;

    public SquarePrism(double height, double side) {
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
        return edge * edge;
    }

    @Override
    public double calVolume() {
        return calBaseArea() * height;
    }

    @Override
    public String toString() {
        return "SquarePrism " + height + " " + edge;
    }
}
