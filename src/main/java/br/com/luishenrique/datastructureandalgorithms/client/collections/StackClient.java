package br.com.luishenrique.datastructureandalgorithms.client.collections;

import br.com.luishenrique.datastructureandalgorithms.collections.Stack;
import br.com.luishenrique.datastructureandalgorithms.utils.Print;

public class StackClient {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("Pagina 1");
        stack.add("Pagina 2");
        stack.add("Pagina 3");
        stack.add("Pagina 4");
        stack.add("Pagina 5");
        Print.newLine(stack.toString());
        stack.remove();
        stack.remove();
        stack.remove();
        Print.newLine(stack.toString());
    }
}
