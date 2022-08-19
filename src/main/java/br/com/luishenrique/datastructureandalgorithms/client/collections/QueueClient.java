package br.com.luishenrique.datastructureandalgorithms.client.collections;

import br.com.luishenrique.datastructureandalgorithms.collections.Queue;
import br.com.luishenrique.datastructureandalgorithms.utils.Print;

public class QueueClient {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>(15);
        queue.add("Luffy");
        queue.add("Zoro");
        queue.add("Sanji");
        Print.newLine(queue);
        queue.remove();
        Print.newLine(queue);
        queue.add("Luffy");
        queue.add("Nami");
        queue.add("Chopper");
        queue.add("Nico Robin");
        queue.add("Usopp");
        queue.add("Franky");
        Print.newLine(queue);
        Print.newLine(queue.get(3));
        Print.newLine(queue.getFirst());
        Print.newLine(queue.getLast());
    }
}
