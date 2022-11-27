package br.com.luishenrique.datastructureandalgorithms.recursion;

import java.util.List;

public class Array {
    public int sum(List<Integer> numbers) {
        if(numbers.isEmpty()) return 0;

        int num = numbers.get(0);
        numbers.remove(0);
        
        return num + sum(numbers);
    }
}
