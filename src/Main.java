public class Main {
    public static void main(String[] args) {

//        Rectangle rectangle = new Rectangle(3,5);
//        Triangle triangle = new Triangle(3,3,3);
//        Square square = new Square(5);
//
//        System.out.println("Before");
//        System.out.println(rectangle.getArea());
//        System.out.println(square.getArea());
//        System.out.println(triangle.getArea());
//
//        System.out.println("After");
//
//
//        System.out.println(rectangle.resize(100));
//        System.out.println(square.resize(100));
//        System.out.println(triangle.resize(100));

        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(2,3);
        shapes[1] = new Square(2);
        shapes[2] = new Triangle(1,1,1);

//        for (Shape shape:shapes) {
//
//            if (shape instanceof Rectangle){
//                System.out.println("Original:  "+((Rectangle) shape).getArea());
//                System.out.println(((Rectangle) shape).resize(100));
//            }
//            else if (shape instanceof Triangle){
//                System.out.println("Original:  "+((Triangle) shape).getArea());
//                System.out.println(((Triangle) shape).resize(100));
//            }

//        }
        for (Shape shape:
             shapes) {
            System.out.println(((Resizeable)shape).resize(100));
        }
    }
}
