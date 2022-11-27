package br.com.luishenrique.datastructureandalgorithms.client.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.luishenrique.datastructureandalgorithms.recursion.Array;
import br.com.luishenrique.datastructureandalgorithms.utils.Print;

public class ArrayClient {
    public static void main(String[] args) {
        Array arr = new Array();
        List<Integer> numbers = new ArrayList(Arrays.asList(2, 4, 6));
        int sum = arr.sum(numbers);
        Print.newLine(sum);
    }
}
