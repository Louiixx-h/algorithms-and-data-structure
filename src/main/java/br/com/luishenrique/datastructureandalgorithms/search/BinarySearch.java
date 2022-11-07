package br.com.luishenrique.datastructureandalgorithms.search;

import br.com.luishenrique.datastructureandalgorithms.utils.Print;

/**
 * BinarySearch
 */
public class BinarySearch {

    public int search(int[] items, int target) {
        int down = 0;
        int hight = items.length -1; 
        int result = 0;
        int middle = (hight - down) / 2;

        do {
            if(items[middle] < target) {
                Print.newLine("Menor!");
                down = middle;
                middle = ((hight - down) / 2) + middle;
            }

            if(items[middle] > target) {
                Print.newLine("Maior!");
                hight = middle;
                middle = middle - ((hight - down) / 2);
            }

            if(items[middle] == target) {
                Print.newLine(items[middle] + " é o número que vocês estava procurando?");
                result = items[middle];
                break;
            }
        } while(items[middle] != target);

        return result;
    }
}