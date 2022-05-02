package br.com.luishenrique.datastructureandalgorithms.client.collections;

import br.com.luishenrique.datastructureandalgorithms.collections.Queue;
import br.com.luishenrique.datastructureandalgorithms.utils.Print;

public class QueueClient {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>(4);
        queue.add("Naruto");
        queue.add("Madara");
        queue.add("Kakashi");
        queue.add("Obito");
        Print.newLine(queue);
        queue.remove();
        Print.newLine(queue);
        queue.add("Obito");
        queue.add("Sakura");
        queue.add("Hashirama");
        queue.add("Tobirama");
        queue.add("Sasuke");
        queue.add("Tsunade");
        //queue.remove();
        Print.newLine(queue);
    }
}
