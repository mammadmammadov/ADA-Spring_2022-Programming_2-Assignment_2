public class Sphere extends Shape {
    private double radius;

    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return 4 * Math.PI * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return "sphere:" + super.getName() + "-[" + this.radius + "]";
    }
}
