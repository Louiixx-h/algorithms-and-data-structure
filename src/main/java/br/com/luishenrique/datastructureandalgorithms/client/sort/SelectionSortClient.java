package br.com.luishenrique.datastructureandalgorithms.client.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.luishenrique.datastructureandalgorithms.sort.SelectionSort;

public class SelectionSortClient {
    public static void main(String[] args) {
        SelectionSort SelectionSort = new SelectionSort();
        List<Integer> list = new ArrayList<>(
            Arrays.asList(
                1234,
                745,
                8,
                7,
                6,
                755,
                4,
                5,
                5,
                4
            )
        );

        System.out.println(list.toString());

        List<Integer> newList = SelectionSort.sort(list);

        System.out.println(newList.toString());
    }
}
