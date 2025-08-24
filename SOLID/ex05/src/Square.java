
public class Square implements Polygon {
    private int side;

    public Square() {
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}