package br.com.luishenrique.datastructureandalgorithms.client.search;

import br.com.luishenrique.datastructureandalgorithms.search.BinarySearch;
import br.com.luishenrique.datastructureandalgorithms.utils.Print;

public class BinaryrSearchClient {
    
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] items = {1,2,2,2,4,4,67,100,200,300};
  
        int result = binarySearch.search(items, 300);

        Print.newLine("Resultado: "+ result);
    }
}
