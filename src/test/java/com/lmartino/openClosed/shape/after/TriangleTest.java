package com.lmartino.openClosed.shape.after;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by lore on 13/01/18.
 */
public class TriangleTest {

    private Triangle triangle;

    @Before
    public void setUp() throws Exception {
        triangle = new Triangle(10 ,20);
    }

    @Test
    public void getHeight() throws Exception {
        assertThat(triangle.getHeight(), is(10));
    }

    @Test
    public void getBase() throws Exception {
        assertThat(triangle.getBase(), is(20));
    }

    @Test
    public void area() throws Exception {
        assertThat(triangle.calculateArea(), is(100d));
    }
}