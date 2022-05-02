package br.com.luishenrique.datastructureandalgorithms.client.recursion;

import br.com.luishenrique.datastructureandalgorithms.recursion.Triangle;
import br.com.luishenrique.datastructureandalgorithms.utils.Print;

public class TriangleClient {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4);
        Print.newLine(triangle.getArea());
    }
}
