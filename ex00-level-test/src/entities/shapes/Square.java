package entities.shapes;

public class Square implements Shape{
    private Double side;

    public Square() {
    }

    public Square(Double side) {
        this.side = side;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }


    @Override
    public Double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public Double calculatePerimeter() {
        return side * 4;
    }
}
