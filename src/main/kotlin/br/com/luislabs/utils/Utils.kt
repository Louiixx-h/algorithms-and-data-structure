package br.com.luislabs.utils

fun IntArray.printArray() {
    val lastIndex: Int = this.size - 1;
    for (i in 0..lastIndex) {
        val num = this[i]
        print("$num ")
    }
    println("")
}

fun <T> List<T>.printArray() {
    val lastIndex: Int = this.size - 1;
    for (i in 0..lastIndex) {
        val num = this[i]
        print("${num.toString()} ")
    }
    println("")
}

fun IntArray.printContent() {
    print(this.contentToString())
}