package com.lmartino.openClosed.after;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by lore on 13/01/18.
 */
public class CircleTest {

    private Circle circle;

    @Before
    public void setUp() throws Exception {
        circle = new Circle(10);
    }

    @Test
    public void getRadius() throws Exception {
        assertThat(circle.getRadius(), is(10));
    }

    @Test
    public void area() throws Exception {
        assertThat(circle.calculateArea(), is(314.1592653589793));
    }
}