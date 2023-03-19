package br.com.luislabs.algorithms.search

fun <T> linearSearch(items: List<T>, target: T) : T {
    for (item in items) {
        if (item == target) {
            return target
        }
    }
    throw IndexOutOfBoundsException()
}

fun binarySearch(items: List<Int>, target: Int) : Int {
    var down = 0
    var height = items.size - 1
    var result = 0
    var middle = 0

    while (items[middle] != target) {
        middle = (height + down) / 2

        if (target == items[middle]) {
            result = items[middle]
            break
        }
        if (items[middle] > target) {
            height = middle - 1
            continue
        }
        if (items[middle] < target) {
            down = middle + 1
            continue
        }
    }

    return result
}
