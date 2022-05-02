package br.com.luishenrique.datastructureandalgorithms.collections;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {

    int first = 0;
    int last = 0;
    int total = 0;
    int size;
    List<T> items;

    public Queue(int size) {
        this.size = size;
        this.items = new ArrayList<>();
    }

    public void add(T value) {
        if (isFull()) {
            items.remove(first);
            items.add(value);
            if (first == size-1) {
                first = 0;
                return;
            }
            first++;
            return;
        }
        items.add(value);
        total = items.size();
        last = total-1;
        if (total == 1) {
            first = 0;
        }
    }

    public void remove() {
        try {
            if (isEmpty()) {
                throw new Exception("A fila está vazia!");
            }

            items.remove(last);
            total = items.size();
            last = items.size()-1;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isFull() {
        return total == size;
    }

    public boolean isEmpty() {
        return total == 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Queue[");
        int i = 0;
        while (i <= total-1) {
            stringBuilder.append(items.get(i));
            i++;
            if (i==total) stringBuilder.append("]");
            else stringBuilder.append(", ");
        }
        return stringBuilder.toString();
    }
}
