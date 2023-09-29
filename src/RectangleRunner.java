public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(150, 200);
        Rectangle rectangle2 = new Rectangle(125);
        Rectangle rectangle3 = new Rectangle();


        rectangle1.setWidth(75);
        rectangle2.setLength(75);
        rectangle2.setWidth(75);
        rectangle3.setWidth(75);
        int x = rectangle1.calculateArea() + rectangle2.calculateArea() + rectangle3.calculateArea();
        System.out.println("these 3 plots of land requires " + x + " square feet of seed");
    }
}

