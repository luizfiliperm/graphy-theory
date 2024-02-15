package entities.shapes;

public class Rectangle implements Shape{

    private Double base;

    private Double height;

    public Rectangle() {
    }

    public Rectangle(Double base, Double height) {
        this.base = base;
        this.height = height;
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

    @Override
    public Double calculateArea() {
        return base * height;
    }

    @Override
    public Double calculatePerimeter() {
        return (base * 2) + (height * 2);
    }
}
