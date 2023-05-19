package br.com.luislabs.dataStructure.tree

data class Node<T>(
    val data: T,
    var left: Node<T>? = null,
    var right: Node<T>? = null
) {

    override fun toString(): String {
        return "$data"
    }
}