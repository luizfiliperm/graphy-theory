package services;

import entities.distance.Point;

public class DistanceCalculatorService {
    private Point pointA;

    private Point pointB;

    public DistanceCalculatorService() {
    }

    public DistanceCalculatorService(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Float calculateDistance(){
        return (float) Math.sqrt(Math.pow(pointB.getX() - pointA.getX(), 2) + Math.pow(pointB.getY() - pointA.getY(), 2));
    }
}
