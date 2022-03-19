package br.com.lhdesenvolvimentos.linkedlist;

public class Node {
    private String value;
    private Node nextNode;

    public Node(String value) {
        this.value = value;
    }

    public Node getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node node) {
        this.nextNode = node;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
