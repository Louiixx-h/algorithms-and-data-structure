package br.com.luishenrique.datastructureandalgorithms.client.collections;

import br.com.luishenrique.datastructureandalgorithms.collections.LinkedList;
import br.com.luishenrique.datastructureandalgorithms.utils.Print;

public class LinkedListClient {
    
    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("Acre");
        linkedList.add("Goiás");
        linkedList.add("Maranhão");

        Print.newLine(linkedList);

        linkedList.remove(1);

        Print.newLine(linkedList);

        Print.newLine(linkedList.get(2));
    }
}
