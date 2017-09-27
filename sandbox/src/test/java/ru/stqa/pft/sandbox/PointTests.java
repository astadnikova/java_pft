package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test

    public void pointtests () {
        Point p1;
        Point p2;
        p1=new Point(2,3);
        p2=new Point (3, 4);

        System.out.println(p1.distance(p1,p2));

        Assert.assertEquals(p1.distance(p1,p2), 1.4142135623730951);
    }
}
