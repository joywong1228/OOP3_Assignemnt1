package shapes;

public class OctagonalPrism extends Prism
{
    public OctagonalPrism(double height, double side) {
        super(height, side);
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double calVolume() {
        return calBaseArea() * getHeight();
    }

    @Override
    public double calBaseArea() {
        return 2*(1+Math.sqrt(2))*side*side;
    }
}
