package br.com.luishenrique.datastructureandalgorithms.recursion;

public class Triangle {

    private final int width;

    public Triangle(int width) {
        this.width = width;
    }

    public int getArea() {
        if (width == 1) return 1;
        Triangle smallerTriangle = new Triangle(width-1);
        int area = smallerTriangle.getArea();
        return area + width;
    }
}
