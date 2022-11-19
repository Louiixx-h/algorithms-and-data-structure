package br.com.luishenrique.datastructureandalgorithms.recursion;

public class Square {

    private final int width;
    private final int height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        if (height == 1) return width;
        Square smallerSquare = new Square(width, height-1);
        int area = smallerSquare.getArea();
        return area + width;
    }
}
