package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert240RblThen3Dollar() {
        int in = 240;
        int expected = 4;
        int outDol = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, outDol);
    }
}