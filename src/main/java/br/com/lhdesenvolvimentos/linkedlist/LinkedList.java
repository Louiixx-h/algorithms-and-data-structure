package br.com.lhdesenvolvimentos.linkedlist;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void add(String newValue) {
        Node node = new Node(newValue);
        size++;
        if(first == null && last == null) {
            first = node;
            last = node;
            return;
        }
        last.setNextNode(node);
        last = node;
    }

    public void remove(String newValue) {
        
    }

    public Node getIndex(int position) {
        return null;
    }

    public Node getFirst() {
        return this.first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return this.last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getSize() {
        return this.size;
    }
}
