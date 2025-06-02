public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);
        
        MyLine line1 = new MyLine(p1, p2);
        System.out.println("Line 1: " + line1);
        
        MyLine line2 = new MyLine(2, 3, 5, 7);
        System.out.println("Line 2: " + line2);
        
        System.out.println("\nTesting getters:");
        System.out.println("Begin point of line1: " + line1.getBegin());
        System.out.println("End point of line1: " + line1.getEnd());
        System.out.println("Begin X of line1: " + line1.getBeginX());
        System.out.println("Begin Y of line1: " + line1.getBeginY());
        System.out.println("End X of line1: " + line1.getEndX());
        System.out.println("End Y of line1: " + line1.getEndY());
        
        System.out.println("\nTesting setters:");
        line1.setBeginX(10);
        line1.setBeginY(11);
        line1.setEndX(20);
        line1.setEndY(21);
        System.out.println("After setting individual coordinates: " + line1);
        
        line1.setBeginXY(30, 31);
        line1.setEndXY(40, 41);
        System.out.println("After setting begin/end XY: " + line1);
        
        line1.setBegin(new MyPoint(50, 51));
        line1.setEnd(new MyPoint(60, 61));
        System.out.println("After setting begin/end points: " + line1);
        
        System.out.println("\nTesting computations:");
        System.out.println("Length of line1: " + line1.getLength());
        System.out.printf("Gradient of line1 (in radians): %.4f\n", line1.getGradient());
        System.out.printf("Gradient of line1 (in degrees): %.2f°\n", 
                          Math.toDegrees(line1.getGradient()));
    }
}
