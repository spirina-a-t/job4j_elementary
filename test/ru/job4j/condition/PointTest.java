package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void pointPlaneWhen53To810Then7() {
        Point a = new Point(5, 3);
        Point b = new Point(8, 10);
        double expected = 7.61;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void pointPlaneWhen00To00Then0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        int expected = 0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void pointPlaneWhen13To49Then6() {
        Point a = new Point(-1, -3);
        Point b = new Point(-4, -9);
        double expected = 6.71;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void point3DWhen033To313Then5() {
        Point a = new Point(0, -3, 3);
        Point b = new Point(3, 1, 3);
        int expected = 5;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void point3DWhen000To000Then0() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 0);
        int expected = 0;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}