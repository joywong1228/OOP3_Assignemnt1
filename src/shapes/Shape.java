package shapes;

/**
 * Abstract base class for all 3D shapes.
 */
public abstract class Shape implements Comparable<Shape> {

    public abstract double getHeight();

    public abstract double calBaseArea();

    public abstract double calVolume();

    @Override
    public int compareTo(Shape other, String criteria) {
        int compare = 0;
        switch (criteria.toLowerCase()) {
            case "height":
                compare = Double.compare(this.getHeight(), other.getHeight());
                break;
            case "base area":
                compare = Double.compare(this.calBaseArea(), other.calBaseArea());
                break;
            case "volume":
                compare = Double.compare(this.calVolume(), other.calVolume());
                break;
        }
        return compare;
    }
}
