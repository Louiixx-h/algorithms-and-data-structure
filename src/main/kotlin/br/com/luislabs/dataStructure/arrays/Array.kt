package br.com.luislabs.dataStructure.arrays

class Array(vararg items: Int) : AbstractList<Int>() {

    private val elements: List<Int> = items.toList()

    override val size: Int
        get() = elements.size

    override fun get(index: Int): Int {
        return elements[index]
    }

    override fun toString(): String {
        val stringBuilder = StringBuilder()
        stringBuilder.append("[")
        val list = elements.map { it.toString() }.reduceOrNull{ acc, element -> "$acc, $element" }
        stringBuilder.append(list)
        stringBuilder.append("]")
        return stringBuilder.toString()
    }
}