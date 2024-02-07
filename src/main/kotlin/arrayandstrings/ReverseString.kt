package org.example.arrayandstrings

/*
    Write a function that reverses a string. The input string is given as an array of characters s.
    You must do this by modifying the input array in-place with O(1) extra memory.
 */

fun reverseString(input: CharArray) {
    var left = 0
    var right = input.size-1

    while (left < right) {
        swap(left, right, input)
        left++
        right--
    }
}

private fun swap(first: Int, second: Int, input: CharArray) {
    val currentChar = input[first]
    input[first] = input[second]
    input[second] = currentChar
}