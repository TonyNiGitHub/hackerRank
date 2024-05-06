package com.hackerrank.test.day1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final ByteArrayInputStream inputStream = new ByteArrayInputStream("12\n4.0\nis the best place to learn and practice coding!\n".getBytes());

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
        System.setIn((inputStream));
    }
    @After
    public void restoreStreams() {
        System.setOut(System.out);
        System.setIn((System.in));
    }

    @Test
    public void testSolution() {
        com.hackerrank.day1.Solution.main(new String[]{});
        String expected = "16\r\n8.0\r\nHackerRank is the best place to learn and practice coding!";
        String actual = outputStream.toString().trim();
        assertEquals(expected, actual);
    }

}
