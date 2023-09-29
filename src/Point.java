public class Point {
    private int y;
    private int x;

    public  Point(int x, int y) {
        this.y = y;
        this.x = x;
    }

    public  Point(int number) {
        x = number;
        y = number;
    }

    public  Point() {
        x = 0;
        y = 0;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setY(int newY) {
        y = newY;
    }

    public void setX(int newX) {
        x = newX;
    }

    public String coordinate() {
        return "( " + x + ", " + y + ")";
    }

    public String quadrant() {
        String quadrant;
        if (x > 0 && y > 0) {
            quadrant = "I";
        } else if (x < 0 && y > 0) {
            quadrant = "II";
        } else if (x < 0 && y < 0) {
            quadrant = "III";
        } else if (x > 0 && y < 0) {
            quadrant = "IV";
        } else if (x == 0 && y == 0) {
            quadrant = "origin";
        } else {
            quadrant = "On axis";

        }
        return quadrant;
    }
}

