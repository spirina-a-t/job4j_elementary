package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void backEven() {
        int[] input = new int[] {4, 3, 2, 1};
        int[] result = Turn.back(input);
        int[] expect = new int[] {1, 2, 3, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void backNotEven() {
        int[] input = new int[] {7, 6, 5, 4, 3, 2, 1};
        int[] result = Turn.back(input);
        int[] expect = new int[] {1, 2, 3, 4, 5, 6, 7};
        assertThat(result, is(expect));
    }
}