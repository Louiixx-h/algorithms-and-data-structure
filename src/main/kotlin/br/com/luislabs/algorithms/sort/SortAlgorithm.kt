package br.com.luislabs.algorithms.sort

fun quickSort(arr: IntArray, left: Int = 0, right: Int = arr.size-1) {
    if(left < right) {
        val pivot = partition(arr, left, right)
        quickSort(arr, left, pivot-1)
        quickSort(arr, pivot+1, right)
    }
}

private fun partition(arr: IntArray, left: Int, right: Int): Int {
    val pivot = arr[right]
    var i = left

    for (j in left until right) {
        if(arr[j] <= pivot) {
            swapArray(arr, i, j)
            i++
        }
    }
    swapArray(arr, i, right)
    return i
}

fun swapArray(arr: IntArray, i: Int, j: Int) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}


fun selectionSort(arr: MutableList<Int>): List<Int> {
    val newArr = mutableListOf<Int>()

    for(i: Int in arr.indices) {
        var smallestItem = arr[0]
        var smallIndex = 0

        for (j: Int in arr.indices) {
            if(arr[j] < smallestItem) {
                smallestItem = arr[j]
                smallIndex = j
            }
        }

        newArr.add(arr.removeAt(smallIndex))
    }

    return newArr
}