package entities.shapes;

public class Parallelogram implements Shape{

    private Double base;

    private Double height;

    private Double side;

    public Parallelogram() {
    }

    public Parallelogram(Double base, Double height, Double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public Double calculateArea() {
        return base * height;
    }

    @Override
    public Double calculatePerimeter() {
        return (side * 2) + (base * 2);
    }
}
