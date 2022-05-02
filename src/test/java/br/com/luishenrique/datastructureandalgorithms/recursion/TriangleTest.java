package br.com.luishenrique.datastructureandalgorithms.recursion;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void checkIfAreaReturn10() {
        Triangle triangle = new Triangle(4);
        Assert.assertEquals(10, triangle.getArea());
    }
}