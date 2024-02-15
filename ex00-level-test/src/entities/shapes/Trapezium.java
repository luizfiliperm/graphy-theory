package entities.shapes;

public class Trapezium implements Shape{

    private Double biggerBase;

    private Double smallerBase;

    private Double height;

    private Double sideA;

    private Double sideB;

    public Trapezium() {
    }

    public Trapezium(Double biggerBase, Double smallerBase, Double height, Double sideA, Double sideB) {
        this.biggerBase = biggerBase;
        this.smallerBase = smallerBase;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Double getBiggerBase() {
        return biggerBase;
    }

    public void setBiggerBase(Double biggerBase) {
        this.biggerBase = biggerBase;
    }

    public Double getSmallerBase() {
        return smallerBase;
    }

    public void setSmallerBase(Double smallerBase) {
        this.smallerBase = smallerBase;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getSideA() {
        return sideA;
    }

    public void setSideA(Double sideA) {
        this.sideA = sideA;
    }

    public Double getSideB() {
        return sideB;
    }

    public void setSideB(Double sideB) {
        this.sideB = sideB;
    }


    @Override
    public Double calculateArea() {
        return (biggerBase + smallerBase) / 2 * height;
    }

    @Override
    public Double calculatePerimeter() {
        return biggerBase + smallerBase + sideA + sideB;
    }
}
