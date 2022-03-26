public class Shape {
    private String color = "greeen";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + this.color + " and " + ((isFilled()) ? "filled" : "notFilled");
    }

    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);

//        Circle circle = new Circle("indigo", false, 3.5);
//        System.out.println(circle);

        Rectangle rectangle = new Rectangle("blue",true,2.5,5.5);
        System.out.println(rectangle);
    }
}
