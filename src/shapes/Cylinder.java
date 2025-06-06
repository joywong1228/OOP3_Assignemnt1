package shapes;

public class Cylinder extends Shape
{
    private double radius;
    private double height;

    public Cylinder (double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double height()
    {
        return height;
    }

    public double radius()
    {
        return radius;
    }

    @Override
    public double calBaseArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calVolume() {
        return calBaseArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder " + height + " " + radius;
    }
}
