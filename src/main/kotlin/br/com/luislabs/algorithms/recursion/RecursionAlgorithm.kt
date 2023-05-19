package br.com.luislabs.algorithms.recursion

fun fibonacci(n: Int): Int {
    println(n)

    if (n <= 1)
        return n

    return fibonacci(n - 1) + fibonacci(n - 2)
}