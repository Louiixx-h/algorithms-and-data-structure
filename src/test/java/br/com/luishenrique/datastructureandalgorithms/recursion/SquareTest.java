package br.com.luishenrique.datastructureandalgorithms.recursion;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void checkIfAreaReturn16() {
        Square square = new Square(4, 4);
        Assert.assertEquals(16, square.getArea());
    }
}