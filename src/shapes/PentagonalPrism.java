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
        return side*side*5/4*Math.tan(54/180*Math.PI);
    }

    @Override
    public double calVolume() {
        return getHeight()*calBaseArea();
    }
}
