package shapes;

/**
 * Abstract base class for all 3D shapes.
 */
public abstract class Shape implements Comparable<Shape> {

    public abstract double height();

    public abstract double calBaseArea();

    public abstract double calVolume();

    @Override
    public int compareTo(Shape other) {
        return Double.compare(this.height(), other.height());
    }
}
