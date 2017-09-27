package ru.stqa.pft.sandbox;

public class Point {
    double x, y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p1, Point p2){

        return  Math.sqrt (Math.pow(p2.x-p1.x, 2)+ Math.pow(p1.y-p2.y, 2));
    }
}
