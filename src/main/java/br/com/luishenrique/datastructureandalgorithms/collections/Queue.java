package br.com.luishenrique.datastructureandalgorithms.collections;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {

    T first;
    T last;
    int total;
    List<T> items;

    public Queue(int sizeMax) {
        this.total = sizeMax;
        this.items = new ArrayList<>();
    }

    public void add(T value) {
        try {
            if (isFull()) {
                throw new Exception("A fila já está no seu limite!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        if(isEmpty()) {
            items.add(value);
            first = value;
            last = value;
            return;
        }

        items.add(value);
        last = value;
    }

    public void remove() {
        try {
            if (isEmpty()) {
                throw new Exception("A fila está vazia!");
            }

            items.remove(first);
            first = items.get(0);

            if(items.size() == 1) {
                last = first;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public T get(int index) {
        T item = null;
        try {
            if(index > items.size()-1 || index < 0) {
                throw new Exception("Index fora do limite da lista!");
            }
            
            item = items.get(index);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return item;
    }

    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }

    public boolean isFull() {
        return total == items.size();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Queue[");
        int i = 0;

        while (i < items.size()) {
            stringBuilder.append(items.get(i));
            
            if (i==items.size()-1) stringBuilder.append("]");
            else stringBuilder.append(", ");
            i++;
        }
        return stringBuilder.toString();
    }
}
