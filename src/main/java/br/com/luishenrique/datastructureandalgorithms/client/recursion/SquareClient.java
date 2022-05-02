package br.com.luishenrique.datastructureandalgorithms.client.recursion;

import br.com.luishenrique.datastructureandalgorithms.recursion.Square;
import br.com.luishenrique.datastructureandalgorithms.utils.Print;

public class SquareClient {
    public static void main(String[] args) {
        Square square = new Square(4, 4);
        Print.newLine(square.getArea());
    }
}