package form;

public class Kreis extends Form{
    public Kreis(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    @Override
    public double umfang() {
        return 2* Math.PI * radius;
    }

    @Override
    public double flaeche() {
        return Math.PI * Math.pow(radius, 2);
    }
}
