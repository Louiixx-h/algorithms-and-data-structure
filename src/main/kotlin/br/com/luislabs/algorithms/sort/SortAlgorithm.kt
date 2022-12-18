package br.com.luislabs.algorithms.sort

fun quickSort(item: List<Int>) {

}

fun selectedSort(items: ArrayList<Int>): List<Int> {
    val newList = mutableListOf<Int>()
    val i = 0

    while (items.isNotEmpty()) {
        var smallerNumber = items[i]
        var indexNumber = i

        for (j in items.iterator()) {
            if (items[j] < smallerNumber) {
                smallerNumber = items[j]
                indexNumber = j
            }
        }
        newList.add(smallerNumber)
        items.removeAt(indexNumber)
    }

    return newList
}

fun selectedSortMap(items: ArrayList<Int>) = items.mapIndexed { _, item ->
    var smallerNumber = item

    for (j in items.iterator()) {
        if (items[j] < smallerNumber) {
            smallerNumber = items[j]
        }
    }

    smallerNumber
}