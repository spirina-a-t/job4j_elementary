package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        int expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when53to810then7() {
        Point a = new Point(5, 3);
        Point b = new Point(8, 10);
        double expected = 7.61;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when50to00then5() {
        Point a = new Point(5, 0);
        Point b = new Point(0, 0);
        int expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when33to03then3() {
        Point a = new Point(3, 3);
        Point b = new Point(0, 3);
        int expected = 3;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}