package com.slethron.duplicateZeroes.test;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DuplicateZeroesTest {
    com.slethron.duplicateZeroes.DuplicateZeroes test;
    List<Integer> items;

    @Before
    public void init() {
        test = new com.slethron.duplicateZeroes.DuplicateZeroes();

        // create list [1, 2, 3, 0, 4, 0, 5] (length: 7)
        items = new ArrayList<Integer>() {{
            add(4);
            add(1);
            add(3);
            add(0);
            add(2);
            add(0);
            add(5);
        }};
    }

    @Test
    public void duplicateZeroes() {
        // create desiredOutcome list [4, 1, 3, 0, 0, 2, 0, 0, 5] (length: 9)
        List<Integer> desiredOutcome = new ArrayList<Integer>() {{
            add(4);
            add(1);
            add(3);
            add(0);
            add(0);
            add(2);
            add(0);
            add(0);
            add(5);
        }};

        assertEquals(desiredOutcome, test.duplicateZeroes(items));
    }

    @Test
    public void duplicateZeroesInPlace() {
        // create desiredOutcome list [1, 2, 3, 0, 0, 4, 0, 0, 5] (length: 9)
        List<Integer> desiredOutcome = new ArrayList<Integer>() {{
            add(4);
            add(1);
            add(3);
            add(0);
            add(0);
            add(2);
            add(0);
        }};

        assertEquals(desiredOutcome, test.duplicateZeroesInPlace(items));
    }
}
