package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {

        Point p1;
        Point p2;
        p1=new Point(2,3);
        p2=new Point (3, 4);
        System.out.println(distance(p1,p2));
        System.out.println(p1.distance(p1,p2));

    }

    public static double distance(Point p1, Point p2){

      return  Math.sqrt (Math.pow(p2.x-p1.x, 2)+ Math.pow(p1.y-p2.y, 2));
    }



}
