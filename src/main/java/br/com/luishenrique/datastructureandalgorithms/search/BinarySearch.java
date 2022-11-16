package br.com.luishenrique.datastructureandalgorithms.search;

/**
 * BinarySearch
 */
public class BinarySearch {

    public int search(int[] items, int target) {
        int down = 0;
        int hight = items.length -1; 
        int result = 0;
        int middle = 0;

        while (result != target) {
            
            middle = (hight + down) / 2;

            if(target == items[middle]) {
                result = items[middle];
                break;
            }

            if(items[middle] > target) {
                hight = middle-1;
                continue;
            }

            if(items[middle] < target) {
                down = middle+1;
                continue;
            }
        }

        return result;
    }
}