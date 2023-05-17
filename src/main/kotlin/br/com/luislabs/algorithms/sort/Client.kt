package br.com.luislabs.algorithms.sort

import br.com.luislabs.utils.printArray
import br.com.luislabs.utils.printContent

fun main() {

    // Selection Sort
    val unorderedList = mutableListOf(-1, -9, 18, 33, -25, 77, 88, -99, 100)
    val sortedList = selectionSort(unorderedList)
    sortedList.printArray() // -99 -25 -9 -1 18 33 77 88 100

    // Quick Sort
    val arr = intArrayOf(5, 2, 9, 1, 5, 6)
    quickSort(arr)
    arr.printContent() // [1, 2, 5, 5, 6, 9]
}