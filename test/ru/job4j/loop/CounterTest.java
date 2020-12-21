package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CounterTest {
    /*Тесты для метода sum*/

    @Test
    public void whenSumNumbersFromThreeToEightThenThirtyThree() {
        int rsl = Counter.sum(3, 8);
        int expected = 33;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumNumbersFromOneToTenThenFiftyFive() {
        int rsl = Counter.sum(1, 10);
        int expected = 55;
        assertThat(rsl, is(expected));
    }

    /*Тесты для метода sumByEven */

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToSevenThenTwelve() {
        int rsl = Counter.sumByEven(1, 7);
        int expected = 12;
        assertThat(rsl, is(expected));
    }
}