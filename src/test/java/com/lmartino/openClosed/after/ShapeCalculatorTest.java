package com.lmartino.openClosed.after;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by lore on 13/01/18.
 */
public class ShapeCalculatorTest {

    private ShapeCalculator calculator = new ShapeCalculator();

    @Test
    public void triangleArea() throws Exception {
        Shape triangle = new Triangle(10, 20);
        final double area = calculator.calculateArea(triangle);
        assertThat(area, is(100d));
    }

    @Test
    public void circleArea() throws Exception {
        Shape circle = new Circle(10);
        final double area = calculator.calculateArea(circle);
        assertThat(area, is(314.1592653589793));
    }

    @Test
    public void rectangleArea() throws Exception {
        Shape rectangle = new Rectangle(10, 20);
        final double area = calculator.calculateArea(rectangle);
        assertThat(area, is(200d));
    }
}