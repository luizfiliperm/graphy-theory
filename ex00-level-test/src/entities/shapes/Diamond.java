package entities.shapes;

public class Diamond implements Shape{

    private Double side;

    private Double biggerDiagonal;

    private Double smallerDiagonal;

    public Diamond() {
    }

    public Diamond(Double side, Double biggerDiagonal, Double smallerDiagonal) {
        this.side = side;
        this.biggerDiagonal = biggerDiagonal;
        this.smallerDiagonal = smallerDiagonal;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    public Double getBiggerDiagonal() {
        return biggerDiagonal;
    }

    public void setBiggerDiagonal(Double biggerDiagonal) {
        this.biggerDiagonal = biggerDiagonal;
    }

    public Double getSmallerDiagonal() {
        return smallerDiagonal;
    }

    public void setSmallerDiagonal(Double smallerDiagonal) {
        this.smallerDiagonal = smallerDiagonal;
    }


    @Override
    public Double calculateArea() {
        return (biggerDiagonal * smallerDiagonal) / 2;
    }

    @Override
    public Double calculatePerimeter() {
        return side * 4;
    }
}
