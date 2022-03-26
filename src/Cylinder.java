public class Cylinder extends Circle{
    private double height = 1;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return Math.PI * Math.pow(super.getRadius(),2)*this.height;

    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(3);
        cylinder.setHeight(6);
        System.out.println(cylinder.getVolume());
    }
}
