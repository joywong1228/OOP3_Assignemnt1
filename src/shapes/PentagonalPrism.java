package shapes;

public class PentagonalPrism extends Prism
{
    public PentagonalPrism(double height, double side) {
        super(height, side);
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double calBaseArea() {
        return side * side * Math.tan(Math.PI * 54 / 180) * 5 / 4;
    }

    @Override
    public double calVolume() {
        return getHeight()*calBaseArea();
    }

    @Override
    public String toString() {
        return "PentagonalPrism " + height + " " + side;
    }
}
