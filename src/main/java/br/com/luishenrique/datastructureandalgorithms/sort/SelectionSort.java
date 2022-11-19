package br.com.luishenrique.datastructureandalgorithms.sort;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    
    public List<Integer> sort(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        int i = 0;

        while(!list.isEmpty()) {
            int smallerNumber = list.get(i);

            for (int j = 0; j < list.size(); j++) {
                if(list.get(j) < smallerNumber) {
                    smallerNumber = list.get(j);
                }
            }

            newList.add(smallerNumber);
            list.remove((Object) smallerNumber);
        }

        return newList;
    }
}
