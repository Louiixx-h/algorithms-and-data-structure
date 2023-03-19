package br.com.luislabs.algorithms.search

fun main() {
    // Linear Search
    val states = listOf("MA", "GO", "PA")
    val stateTarget = "MA"
    val stateResult = linearSearch(states, stateTarget)

    // Output Should be MA
    println(stateResult)

    // Binary Search
    val numbers = listOf(1, 9, 18, 33, 25, 77, 88, 99, 100)
    val numberTarget = 88
    val numberResult = binarySearch(numbers, numberTarget)

    // Output Should be 88
    print(numberResult)
}