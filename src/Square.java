public class Square extends Rectangle{
    public Square() {
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled, size, size);
    }

    public Square(double size) {
        super(size, size);
    }

    public double getSize(){
        return getWidth();
    }

    public void setSize(double size){
        setLength(size);
        setWidth(size);
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public void setLength(double length) {
        setSize(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSize()
                + ", which is a subclass of "
                + super.toString();
    }
}
