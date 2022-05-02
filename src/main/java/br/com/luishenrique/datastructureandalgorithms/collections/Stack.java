package br.com.luishenrique.datastructureandalgorithms.collections;

import java.util.ArrayList;

public class Stack<T> {
    private final int maxElements = 5;
    private int size;
    private final ArrayList<T> elements = new ArrayList<>(maxElements);

    public void add(T element) {
        try {
            if (size == maxElements) {
                throw new Exception("A pilha já atingiu seu limite!");
            } else {
                elements.add(size, element);
                size++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove() {
        try {
            if (size == 0) {
                throw new Exception("Você tentou remover mas a pilha já estava vazia!");
            } else {
                size--;
                elements.remove(size);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stack[");
        int i = 0;
        while (i < size) {
            stringBuilder.append(elements.get(i));
            i++;
            if (i==size) stringBuilder.append("]");
            else stringBuilder.append(", ");
        }
        return stringBuilder.toString();
    }
}
