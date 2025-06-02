public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(5, 5);
        
        MyRectangle rect1 = new MyRectangle(p1, p2);
        System.out.println("Rectangle 1: " + rect1);
        
        MyRectangle rect2 = new MyRectangle(2, 2, 8, 8);
        System.out.println("Rectangle 2: " + rect2);
        
        System.out.println("\nTesting getters:");
        System.out.println("Top-left point of rect1: " + rect1.getTopLeft());
        System.out.println("Bottom-right point of rect1: " + rect1.getBottomRight());
        
        System.out.println("\nTesting setters:");
        rect1.setTopLeft(new MyPoint(0, 0));
        rect1.setBottomRight(new MyPoint(10, 10));
        System.out.println("After setting points: " + rect1);
        
        System.out.println("\nTesting computations:");
        System.out.println("Width of rect1: " + rect1.getWidth());
        System.out.println("Height of rect1: " + rect1.getHeight());
        System.out.println("Area of rect1: " + rect1.getArea());
        System.out.println("Perimeter of rect1: " + rect1.getPerimeter());
    }
}
