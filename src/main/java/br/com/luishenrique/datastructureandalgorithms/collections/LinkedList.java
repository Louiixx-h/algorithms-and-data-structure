package br.com.luishenrique.datastructureandalgorithms.collections;

public class LinkedList<T> {
    private Node<T> first;
    private Node<T> pointer;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void add(T newValue) {
        Node<T> node = new Node<T>(newValue);
        
        if (first == null) {
            this.first = node;
        } else {
            pointer.setNextNode(node);
        }
         
        pointer = node;
        size++;
    }

    public boolean remove(int index) {
        int i = 0;
        Node<T> pointer = first;

        if (index < 0) throw new IndexOutOfBoundsException();
        if (first == null) return false;

        while (i <= index) {
            if (i == index) {
                pointer.setNextNode(null);
                pointer.setValue(null);
                return true;
            }
            pointer = pointer.getNextNode();
            if (pointer == null) throw new IndexOutOfBoundsException();
            i++;
        }
        return false;
    }

    public T get(int index) {
        int i = 0;
        Node<T> pointer = first;
        T target = null;

        if (index == 0) return pointer.getValue();

        do {
            pointer = pointer.getNextNode();
            target = pointer.getValue();
            i++;
        }
        while (i != index);

        return target;
    }

    public Node<T> getFirst() {
        return this.first;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        Node<T> pointer = first;
        stringBuilder.append("LinkedList[");
        while (index < size) {
            stringBuilder.append("{value=")
                   .append(pointer.getValue())
                   .append(", next=");

            if (pointer.getNextNode() != null){
                stringBuilder.append(pointer.getNextNode().getValue());
            } else stringBuilder.append("null");

            if ((index+1) == size) stringBuilder.append("}");
            else stringBuilder.append("}, ");

            if (pointer.getNextNode() != null) pointer = pointer.getNextNode();
            index++;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

class Node <T> {
    private T value;
    private Node<T> nextNode;

    public Node(T value) {
        this.value = value;
        this.nextNode = null;
    }

    public Node(T value, Node<T> nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public Node<T> getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node<T> node) {
        this.nextNode = node;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
