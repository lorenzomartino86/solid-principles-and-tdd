package com.lmartino.openClosed.shape.after;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by lore on 13/01/18.
 */
public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(10, 20);
    }

    @Test
    public void getHeight() throws Exception {
        assertThat(rectangle.getHeight(), is(10));
    }

    @Test
    public void getWidth() throws Exception {
        assertThat(rectangle.getWidth(), is(20));
    }

    @Test
    public void area() throws Exception {
        assertThat(rectangle.calculateArea(), is(200d));
    }
}