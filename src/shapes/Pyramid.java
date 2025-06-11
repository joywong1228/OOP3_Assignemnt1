package shapes;

public class Pyramid extends Shape
{
    private double side;
    private double height;

    public Pyramid (double height, double side)
    {
        this.side = side;
        this.height = height;
    }

    @Override
    public double getHeight()
    {
        return height;
    }

    public double side()
    {
        return side;
    }

    @Override
    public double calBaseArea() {
        return side * side;
    }

    @Override
    public double calVolume() {
        return calBaseArea() * height /3;
    }

    @Override
    public String toString() {
        return "Pyramid " + height + " " + side;
    }
}
