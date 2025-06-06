package shapes;

public abstract class Prism extends Shape {
    public double height;
    public double side;

    public Prism(double height, double side) {
        this.height = height;
        this.side = side;
    }

    public abstract double getHeight();
    public abstract double calVolume();
    public abstract double calBaseArea();

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
