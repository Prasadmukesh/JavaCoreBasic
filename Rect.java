abstract class Shape {
    abstract void Area();
}

class Rect {
    public static void main(String[] args) {
        // Creating an anonymous class that extends Shape
        double l=100;
        double b=45;
        
        Shape s1 = new Shape() {
            @Override
            void Area() {
                System.out.println("Area of Rectangle is "+(l*b));
            }
        };

        s1.Area();
    }
}
