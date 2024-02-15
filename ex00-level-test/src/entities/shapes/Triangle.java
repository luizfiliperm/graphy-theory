package entities.shapes;

public class Triangle implements Shape{
    private Double base;
    private Double height;

    private Double sizeA;

    private Double sizeB;

    public Triangle() {
    }

    public Triangle(Double base, Double height, Double sizeA, Double sizeB) {
        this.base = base;
        this.height = height;
        this.sizeA = sizeA;
        this.sizeB = sizeB;
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

    public Double getSizeA() {
        return sizeA;
    }

    public void setSizeA(Double sizeA) {
        this.sizeA = sizeA;
    }

    public Double getSizeB() {
        return sizeB;
    }

    public void setSizeB(Double sizeB) {
        this.sizeB = sizeB;
    }

    public Double calculateArea(){
        return (base * height) / 2;
    }

    public Double calculatePerimeter(){
        return base + sizeA + sizeB;
    }
}
