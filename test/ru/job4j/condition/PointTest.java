package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when53to810then7() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 8;
        int y2 = 10;
        double expected = 7.61;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when50to00then5() {
        int x1 = 5;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when33to03then3() {
        int x1 = 3;
        int y1 = 3;
        int x2 = 0;
        int y2 = 3;
        int expected = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}